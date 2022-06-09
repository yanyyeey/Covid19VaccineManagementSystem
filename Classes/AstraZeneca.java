package Classes;

import java.util.UUID;

public class AstraZeneca extends Vaccine{
    
    public AstraZeneca(String supplyDate, String quantity){
        this.vaccineBatchNumber = "AZ" + UUID.randomUUID().toString();
        this.vaccineName = "AstraZeneca";
        this.originCountry = "United Kingdom";
        this.dosRequired = "2";
        this.requiredWaitTime = "6";
        this.supplyDate = supplyDate;
        this.quantity = quantity;
    }
}
