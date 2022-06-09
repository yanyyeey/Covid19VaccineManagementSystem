package Classes;

import java.util.UUID;

public class Sinovac extends Vaccine{
    
    public Sinovac(String supplyDate, String quantity){
        this.vaccineBatchNumber = "SV" + UUID.randomUUID().toString();
        this.vaccineName = "Sinovac";
        this.originCountry = "China";
        this.dosRequired = "2";
        this.requiredWaitTime = "3";
        this.supplyDate = supplyDate;
        this.quantity = quantity;
    }
}
