public class Savings extends Account implements maintananceCharge{
    public Savings(String accountNumber,String customerName,double balance){
        super(accountNumber, customerName, balance);
    }
    public float calculateMaintenanceCharge(float noOfYears){
        int m=100;
        int n= (int) noOfYears;
        return(m*n) +50;
    }
}
