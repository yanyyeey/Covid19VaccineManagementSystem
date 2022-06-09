package Classes;

import Classes.Registration;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import HelperClasses.FileHandler;
import HelperClasses.FileMethods;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class PersonnelAccRegistration extends Registration implements FileMethods{
    
    private String personnelId, name, ic;
    
    public PersonnelAccRegistration(String personnelId, String name, String ic, String email, String password) {
        super(email, password);
        this.personnelId = personnelId;
        this.name = name;
        this.ic = ic;
    }

    public String getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }
    
    //Generate random combination of number and alphabet for personnel Id
    public static String generatePersonnelId(){
        String personnelId = "PNL" + UUID.randomUUID().toString();
        return personnelId;
    }
    
    //Retrieve all personnels account
    public static ArrayList<PersonnelAccRegistration> getAllPersonnelAccounts() {
        //Retrive from folder
        File personnelFolder = FileHandler.retrievePath("Personnel", "null");
        File[] personnelFiles = personnelFolder.listFiles();
        ArrayList<PersonnelAccRegistration> allPersonnels = new ArrayList<>();
        for (File personnelFile : personnelFiles) {
            try ( Scanner readFile = new Scanner(personnelFile)) {
                while (readFile.hasNext()) {
                    allPersonnels.add(new PersonnelAccRegistration(
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
        return allPersonnels;
    }
    
    //Save New Registration into File
    public static void savePersonnelRegistration(PersonnelAccRegistration personnelRegistration, String type) {
        
        String fileName = personnelRegistration.setFileName() + ".txt";

        File myFile = FileHandler.createFilePath("Personnel", fileName);
        try ( FileWriter fw = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(personnelRegistration.getPersonnelId());
            bw.newLine();
            bw.write(personnelRegistration.getName());
            bw.newLine();
            bw.write(personnelRegistration.getIc());
            bw.newLine();
            bw.write(personnelRegistration.getEmail());
            bw.newLine();
            bw.write(personnelRegistration.getPassword().toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Register Personnel Account Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        if(type.equals("save")){
            JOptionPane.showMessageDialog(null, "Personnel Registration successfully saved.", "Register Personnel Account Success!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Personnel Account successfully saved.", "Update Personnel Account Success!", JOptionPane.INFORMATION_MESSAGE);
        }   
    }

    @Override
    public String setFileName() {
        return personnelId;
    }

    @Override
    public String getFileName() {
        return "Personnel/" + personnelId + ".txt";
    }
}