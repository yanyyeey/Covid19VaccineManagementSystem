package Classes;

import java.util.UUID;

public class Pfizer extends Vaccine{
    
    public Pfizer(String supplyDate, String quantity){
        this.vaccineBatchNumber = "PF" + UUID.randomUUID().toString();
        this.vaccineName = "Pfizer";
        this.originCountry = "United States";
        this.dosRequired = "2";
        this.requiredWaitTime = "3";
        this.supplyDate = supplyDate;
        this.quantity = quantity;
    }
}
