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
import java.util.UUID;
import javax.swing.JOptionPane;

public class VaccinationCenter implements FileMethods{
    protected String vaccinationCenterId, vaccinationCenterName, vaccinationCenterStartTime, vaccinationCenterEndTime, state, address, VaccineType, vaccineSupplyQuantity;
    
    public VaccinationCenter(String vaccinationCenterId, String vaccinationCenterName, String vaccinationCenterStartTime, String vaccinationCenterEndTime, String state, String address, String VaccineType, String vaccineSupplyQuantity){
        this.vaccinationCenterId = vaccinationCenterId;
        this.vaccinationCenterName = vaccinationCenterName;
        this.vaccinationCenterStartTime = vaccinationCenterStartTime;
        this.vaccinationCenterEndTime = vaccinationCenterEndTime;
        this.state = state;
        this.address = address;
        this.VaccineType = VaccineType;
        this.vaccineSupplyQuantity = vaccineSupplyQuantity;
    }
    
    public VaccinationCenter(){
        
    }

    public String getVaccinationCenterId() {
        return vaccinationCenterId;
    }

    public void setVaccinationCenterId(String vaccinationCenterId) {
        this.vaccinationCenterId = vaccinationCenterId;
    }

    public String getVaccinationCenterName() {
        return vaccinationCenterName;
    }

    public void setVaccinationCenterName(String vaccinationCenterName) {
        this.vaccinationCenterName = vaccinationCenterName;
    }

    public String getVaccinationCenterStartTime() {
        return vaccinationCenterStartTime;
    }

    public void setVaccinationCenterStartTime(String vaccinationCenterStartTime) {
        this.vaccinationCenterStartTime = vaccinationCenterStartTime;
    }

    public String getVaccinationCenterEndTime() {
        return vaccinationCenterEndTime;
    }

    public void setVaccinationCenterEndTime(String vaccinationCenterEndTime) {
        this.vaccinationCenterEndTime = vaccinationCenterEndTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVaccineType() {
        return VaccineType;
    }

    public void setVaccineType(String VaccineType) {
        this.VaccineType = VaccineType;
    }

    public String getVaccineSupplyQuantity() {
        return vaccineSupplyQuantity;
    }

    public void setVaccineSupplyQuantity(String vaccineSupplyQuantity) {
        this.vaccineSupplyQuantity = vaccineSupplyQuantity;
    }
    
    //Generate random vaccination center id
    public static String generateVaccinationId(){
        String vaccinationCenterId = "VC" + UUID.randomUUID().toString();
        return vaccinationCenterId;
    }
    
    //Retrieve all vaccination center created
    public static ArrayList<VaccinationCenter> getAllVaccinationCentersForTable() { 
        String[] stateList = {"Johor", "Negeri Sembilan", "Malacca", "Selangor", "Kuala Lumpur", 
            "Labuan", "Putrajaya", "Perak", "Penang", "Kedah", "Perlis", "Terengganu", "Kelantan",
            "Pahang", "Sabah", "Sarawak"};
        ArrayList<VaccinationCenter> allVaccinationCenters = new ArrayList<>();
        
        for (String state : stateList) {
            String folderDirectory = State.getStateFileDirectory(state, "VaccinationCenter");
            //Retrive from folder
            File vaccinationCenterFolder = FileHandler.retrievePath(folderDirectory, "null");
            File[] vaccinationCenterFiles = vaccinationCenterFolder.listFiles();
            for (File vaccinationCenterFile : vaccinationCenterFiles) {
                try ( Scanner readFile = new Scanner(vaccinationCenterFile)) {
                    while (readFile.hasNext()) {
                        allVaccinationCenters.add(new VaccinationCenter(
                                readFile.nextLine(),
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
        return allVaccinationCenters;
    }
    
    //Retrieve all vaccination center created
    public static ArrayList<VaccinationCenter> getAllVaccinationCenters(String filePath) {  
        //Retrive from folder
        File vaccinationCenterFolder = FileHandler.retrievePath(filePath, "null");
        File[] vaccinationCenterFiles = vaccinationCenterFolder.listFiles();
        ArrayList<VaccinationCenter> allVaccinationCenters = new ArrayList<>();
        for (File vaccinationCenterFile : vaccinationCenterFiles) {
            try ( Scanner readFile = new Scanner(vaccinationCenterFile)) {
                while (readFile.hasNext()) {
                    allVaccinationCenters.add(new VaccinationCenter(
                            readFile.nextLine(),
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
        return allVaccinationCenters;
    }
    
    //Retrieve specific vaccination
    public static VaccinationCenter getVaccinationCenter(String fileName) {
        //Retrieve from folder
        File vaccinationCenterFile = FileHandler.retrievePath("VaccinationCenter", fileName);
       
        try ( Scanner readFile = new Scanner(vaccinationCenterFile)) {
            while (readFile.hasNext()) {
                VaccinationCenter center = new VaccinationCenter(
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine(),
                            readFile.nextLine()
                );
                return center;
            }

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        return null;
    }

    //Save Vaccination Center
    public static void saveVaccinationCenter(VaccinationCenter center, String type) {
        String fileName = center.setFileName() + ".txt";
        String vaccinationCenterState = center.getState();
        String folderDirectory = State.setStateFileDirectory(vaccinationCenterState, "VaccinationCenter");
        
        File myFile = FileHandler.createFilePath(folderDirectory, fileName);
        try ( FileWriter fw = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(center.getVaccinationCenterId());
            bw.newLine();
            bw.write(center.getVaccinationCenterName());
            bw.newLine();
            bw.write(center.getVaccinationCenterStartTime());
            bw.newLine();
            bw.write(center.getVaccinationCenterEndTime());
            bw.newLine();
            bw.write(center.getState());
            bw.newLine();
            bw.write(center.getAddress());
            bw.newLine();
            bw.write(center.getVaccineType());
            bw.newLine();
            bw.write(center.getVaccineSupplyQuantity());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save vaccination center. Please try again.", "Register Vaccination Center Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        if(type == "save"){
            JOptionPane.showMessageDialog(null, "Vaccination Center successfully saved.", "Register Vaccination Center Success!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Vaccination Center successfully saved.", "Update Vaccination Center Success!", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    @Override
    public String setFileName() {
        return vaccinationCenterId;
    }

    @Override
    public String getFileName() {
        return null;
    }
}
