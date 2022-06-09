package Classes;

import HelperClasses.FileHandler;
import HelperClasses.FileMethods;
import HelperClasses.State;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Vaccine implements FileMethods {

    protected String vaccineBatchNumber, vaccineName, originCountry, supplyDate, dosRequired, quantity, requiredWaitTime;
    
    public Vaccine(){}
    
    public Vaccine(String vaccineName, String supplyDate, String quantity){
        this.vaccineName = vaccineName;
        this.supplyDate = supplyDate;
        this.quantity = quantity;
    }
    
    public Vaccine(String vaccineBatchNumber, String vaccineName, String originCountry, String supplyDate, String dosRequired, String requiredWaitTime, String quantity){
        this.vaccineBatchNumber = vaccineBatchNumber;
        this.vaccineName = vaccineName;
        this.originCountry = originCountry;
        this.supplyDate = supplyDate;
        this.dosRequired = dosRequired;
        this.requiredWaitTime = requiredWaitTime;
        this.quantity = quantity;
    }
    
    public String getvaccineBatchNumber() {
        return vaccineBatchNumber;
    }

    public void setvaccineBatchNumber(String vaccineBatchNumber) {
        this.vaccineBatchNumber = vaccineBatchNumber;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(String supplyDate) {
        this.supplyDate = supplyDate;
    }

    public String getDosRequired() {
        return dosRequired;
    }

    public void setDosRequired(String dosRequired) {
        this.dosRequired = dosRequired;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRequiredWaitTime() {
        return requiredWaitTime;
    }

    public void setRequiredWaitTime(String requiredWaitTime) {
        this.requiredWaitTime = requiredWaitTime;
    }
    
    //Retrieve all vaccination center created
    public static ArrayList<Vaccine> getAllVaccinesForTable() { 
        String[] vaccineList = {"AstraZeneca", "Pfizer-BioNTech", "Sinovac"};
        ArrayList<Vaccine> allVaccine = new ArrayList<>();
        
        for (String vaccine : vaccineList) {
            String folderDirectory = "Vaccine/" + vaccine;
            //Retrive from folder
            File vaccineFolder = FileHandler.retrievePath(folderDirectory, "null");
            File[] vaccineFiles = vaccineFolder.listFiles();
            for (File vaccineFile : vaccineFiles) {
                try ( Scanner readFile = new Scanner(vaccineFile)) {
                    while (readFile.hasNext()) {
                        allVaccine.add(new Vaccine(
                                readFile.nextLine(),
                                readFile.nextLine(),
                                readFile.nextLine(),
                                readFile.nextLine(),
                                readFile.nextLine(),
                                readFile.nextLine(),
                                readFile.nextLine()
                        ));
                    }
                } catch (FileNotFoundException e) {
                    System.err.println(e);
                }
            }
        } 
        return allVaccine;
    }
    
    //Retrieve all vaccine created
    public static ArrayList<Vaccine> getAllVaccines(String folderName) {  
        String folderDirectory = "Vaccine/" + folderName;
        //Retrive from folder
        File vaccineFolder = FileHandler.retrievePath(folderDirectory, "null");
        File[] vaccineFiles = vaccineFolder.listFiles();
        ArrayList<Vaccine> allVaccines = new ArrayList<>();
        for (File vaccineFile : vaccineFiles) {
            try ( Scanner readFile = new Scanner(vaccineFile)) {
                while (readFile.hasNext()) {
                    allVaccines.add(new Vaccine(
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine()
                    ));
                }
            } catch (FileNotFoundException e) {
                System.err.println(e);
            }
        }
        return allVaccines;
    }

    //Save vaccine
    public static void saveVaccine(Vaccine vaccine) {
        String vaccineName = vaccine.getVaccineName();
        String supplyDate = vaccine.getSupplyDate();
        String quantity = vaccine.getQuantity();
        
        String fileName = null;
        String folderName = null;
        
        if(vaccineName == "AstraZeneca"){
            vaccine = new AstraZeneca(supplyDate, quantity);
            folderName = vaccine.getVaccineName();
            fileName = vaccine.getvaccineBatchNumber() + ".txt"; 
        }else if(vaccineName.equals("Sinovac")){
            vaccine = new Sinovac(supplyDate, quantity);
            folderName = vaccine.getVaccineName();
            fileName = vaccine.getvaccineBatchNumber() + ".txt"; 
        }else if(vaccineName.equals("Pfizer-BioNTech")){
            vaccine = new Pfizer(supplyDate, quantity);
            folderName = vaccine.getVaccineName();
            fileName = vaccine.getvaccineBatchNumber() + ".txt"; 
        }else{
            JOptionPane.showMessageDialog(null, "Please select the correct vaccine.", "Register Vaccine Failed!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //String folderDirectory = vaccine.setStateFileDirectory(folderName, "Vaccine");
        File myFile = FileHandler.createFilePath("Vaccine/" + folderName, fileName);
        try ( FileWriter fw   = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(vaccine.getvaccineBatchNumber());
            bw.newLine();
            bw.write(vaccine.getVaccineName());
            bw.newLine();
            bw.write(vaccine.getOriginCountry());
            bw.newLine();
            bw.write(vaccine.getSupplyDate());
            bw.newLine();
            bw.write(vaccine.getDosRequired());
            bw.newLine();
            bw.write(vaccine.getRequiredWaitTime());
            bw.newLine();
            bw.write(vaccine.getQuantity());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save vaccine. Please try again.", "Register Vaccine Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        JOptionPane.showMessageDialog(null, "Vaccine successfully saved.", "Vaccine Success!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Update vaccine
    public static void updateVaccine(Vaccine vaccine, String vaccineName, String fileName) {
        String folderName = "Vaccine/" + vaccineName;
        
        File myFile = FileHandler.createFilePath(folderName, fileName);
        try ( FileWriter fw   = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(vaccine.getvaccineBatchNumber());
            bw.newLine();
            bw.write(vaccine.getVaccineName());
            bw.newLine();
            bw.write(vaccine.getOriginCountry());
            bw.newLine();
            bw.write(vaccine.getSupplyDate());
            bw.newLine();
            bw.write(vaccine.getDosRequired());
            bw.newLine();
            bw.write(vaccine.getRequiredWaitTime());
            bw.newLine();
            bw.write(vaccine.getQuantity());
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "Failed to save vaccine. Please try again.", "Register Vaccine Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        //JOptionPane.showMessageDialog(null, "Vaccine successfully saved.", "Vaccine Success!", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String setFileName() {
        return vaccineBatchNumber;
    }

    @Override
    public String getFileName() {
        return null;
    }
}
