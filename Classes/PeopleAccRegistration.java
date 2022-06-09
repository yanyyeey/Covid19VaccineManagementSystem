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

public class PeopleAccRegistration extends Registration implements FileMethods{
    
   private String peopleId, citizen, name, icOrPassport, contact, address, dob;
    
    public PeopleAccRegistration(String peopleId, String name, String icOrPassport, String dob, String contact, String address, String citizen, String email, String password) {
        super(email, password);
        this.peopleId = peopleId;
        this.citizen = citizen;
        this.name = name;
        this.icOrPassport = icOrPassport;
        this.contact = contact;
        this.address = address;
        this.dob = dob;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcOrPassport() {
        return icOrPassport;
    }

    public void setIcOrPassport(String icOrPassport) {
        this.icOrPassport = icOrPassport;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    //Generate random combination of number and alphabet for personnel Id
    public static String generatePeopleId(){
        String peopleId = "PLP" + UUID.randomUUID().toString();
        return peopleId;
    }
    
    //Retrieve all people account
    public static ArrayList<PeopleAccRegistration> getAllPeopleAccounts() {
        //Retrive from folder
        File peopleFolder = FileHandler.retrievePath("People", "null");
        File[] peopleFiles = peopleFolder.listFiles();
        ArrayList<PeopleAccRegistration> allPeoples = new ArrayList<>();
        for (File peopleFile : peopleFiles) {
            try ( Scanner readFile = new Scanner(peopleFile)) {
                while (readFile.hasNext()) {
                    allPeoples.add(new PeopleAccRegistration(
                            readFile.nextLine(),
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
        return allPeoples;
    }

    //Save New Registration into File
    public static void saveRegistration(PeopleAccRegistration peopleRegistration, String type) {
        String fileName = peopleRegistration.setFileName() + ".txt";

        File myFile = FileHandler.createFilePath("People", fileName);
        try ( FileWriter fw = new FileWriter(myFile);  BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(peopleRegistration.getPeopleId());
            bw.newLine();
            bw.write(peopleRegistration.getName());
            bw.newLine();
            bw.write(peopleRegistration.getIcOrPassport());
            bw.newLine();
            bw.write(peopleRegistration.getDob());
            bw.newLine();
            bw.write(peopleRegistration.getContact());
            bw.newLine();
            bw.write(peopleRegistration.getAddress());
            bw.newLine();
            bw.write(peopleRegistration.getCitizen());
            bw.newLine();
            bw.write(peopleRegistration.getEmail());
            bw.newLine();
            bw.write(peopleRegistration.getPassword());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Register People Account Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        if(type.equals("save")){
            JOptionPane.showMessageDialog(null, "People Registration successfully saved.", "Register People Account Success!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "People Account successfully saved.", "Update People Account Success!", JOptionPane.INFORMATION_MESSAGE);
        }  
    }

    @Override
    public String setFileName() {
        return peopleId;
    }

    @Override
    public String getFileName() {
        return "People/" + peopleId + ".txt";
    }
}
