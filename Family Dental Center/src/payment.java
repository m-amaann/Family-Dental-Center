package family_dental_center;

import java.util.Scanner;

public class payment
{
    private int pay_id;
    private double amount;
    private String pay_date;
    private int appoinmentId;
    private int patient_id;
    private String pay_method;


    //Constructor assign
    public payment(int pay_id, double amount, String pay_date, int appoinmentId, int patient_id, String pay_method)
    {
        this.pay_id = pay_id;
        this.amount = amount;
        this.pay_date = pay_date;
        this.appoinmentId = appoinmentId;
        this.patient_id = patient_id;
        this.pay_method = pay_method;
    }

    payment() {
        super();
    }

    public int getPay_id()
    {
        return pay_id;
    }

    public void setPay_id(int pay_id)
    {
        this.pay_id = pay_id;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public String getPay_date()
    {
        return pay_date;
    }

    public void setPay_date(String pay_date)
    {
        this.pay_date = pay_date;
    }

    public int getAppoinmentId() {
        return appoinmentId;
    }

    public void setAppoinmentId(int appoinmentId)
    {
        this.appoinmentId = appoinmentId;
    }

    public int getPatient_id()
    {
        return patient_id;
    }

    public void setPatient_id(int patient_id)
    {
        this.patient_id = patient_id;
    }

    public String getPay_method()
    {
        return pay_method;
    }

    public void setPay_method(String pay_method)
    {
        this.pay_method = pay_method;
    }
    
    public void paymentCalcute()
    {
        Scanner sc = new Scanner(System.in);
        double basePayment = 3000.00;
        double room_Charge_per_day = 3000.00;
        double payment_for_service = 0.00;
        double tax = 0.03;
        double damage_charges = 0;
        double extra_charges = 0;
        double discount = 0;
        
        System.out.print("\n\n----- Generate Payment Slip ----- ");
        
        System.out.print("\n\nHow many nights stay : ");
        int night_count = sc.nextInt();
        
        System.out.print("Payment For Service : ");
        payment_for_service = sc.nextDouble();
        
        System.out.print("Payment For Damages : ");
        damage_charges = sc.nextDouble();
        
        System.out.print("Extra Payment : ");
        extra_charges = sc.nextDouble();
        
        System.out.print("Discount : ");
        discount = sc.nextDouble();
        
        double tCharge = basePayment + (night_count * room_Charge_per_day)+payment_for_service+damage_charges+extra_charges;
        double discount_amount =  tCharge - discount;
        double want_to_pay = discount_amount + (discount_amount*tax);
        
        
        System.out.print("\nTotal Charge : RS.");
        System.out.print(want_to_pay);
    }
}
