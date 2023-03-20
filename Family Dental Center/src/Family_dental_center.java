package family_dental_center;

import java.util.Random;
import java.util.Scanner;

public class Family_dental_center {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("WELCOME TO FAMILY DENTAL CARE.");
        System.out.println("------------------------------");
        System.out.println("System Admin Panel.");
        System.out.println("\t1. Insert and View Doctors' Details.");
        System.out.println("\t2. Insert and View Patients' Details.");
        System.out.println("\t3. Insert and View Dental Treatments' Details.");
        System.out.println("\t4. Insert and View Manager.");
        System.out.println("\t5. Create an appointment.");
        System.out.println("\t6. Generate  Medical Report.");
        System.out.println("\t7. Payment Slip.");
        System.out.println("\t8. Insert and View Consultant's Profile.");
        System.out.println("\t9. Exit.");
        
        //add receptionist
        receptionist rec =  new receptionist("" , 0 , 1923 , 1 , "Namal" , "Colombo" , "0119019878");
        
        //add patient
        patient patient_new1 = new patient("789209878v", "1978/10/18", "45", "Female", 1, "Lal Kumala", "Horana", "071189909", 1200.00);
        patient patient_new2 = new patient("789209878v", "1978/10/18", "45", "Female", 2, "Lal Kumala", "Horana", "071189909", 1200.00);
            
        //add dental treatment
        dental_treatment dt1 = new dental_treatment("DT1" , "Nerve Filling");
        dental_treatment dt2 = new dental_treatment("DT2" , "Maxillofacial Treatment");
        dental_treatment dt3 = new dental_treatment("DT3" , "Extraction");


        //consultant class object
        consultant consultant_new;

        boolean askForAnother = true;
        while(askForAnother) {
            System.out.print("\nSelect an option : ");
            int option = sc.nextInt();
            switch(option)
            {
                case 1 -> {

                    doctorFunctions(sc ,rec);
                }

                case 2 -> {
                    rec.PatientAddToList(patient_new1);
                    rec.PatientAddToList(patient_new2);

                    rec.printAllPatient();
                    System.out.println("");

                }

                case 3 -> {
                    dt1.dental_treatmentAddToList(dt1);
                    dt1.dental_treatmentAddToList(dt2);
                    dt3.dental_treatmentAddToList(dt3);

                    dt1.printAllTreatment();
                    System.out.println("");
                }


                case 4 ->
                {
                    //add manager
                    rec.addNewManager("Colombo University", "BSC ", "5", 1, "Mr.Namal", "Colombo", "0711022098");
                }

                case 5 -> {

                     System.out.print("Enter Appointment Date : ");
                     String appoiment_date = sc.next();

                     System.out.print("Enter Time Slot : ");
                     String time_slot = sc.next();

                     System.out.print("Enter Doctor : ");
                     String doctor = sc.next();

                     System.out.print("Enter Patient : ");
                     String Patient = sc.next();

                     //appoinment_id_generate
                     Random rand = new Random(); 
                     int upperbound = 25000;
                     int appoinment_id = rand.nextInt(upperbound); 
                     appoiment appoiment_ob = new appoiment(String.valueOf(appoinment_id), appoiment_date, time_slot, "3000", doctor, Patient);

                     System.out.print("\nYour appointment id is "+appoinment_id);
                }

                case 6 -> {
                    medical_report mr1;
                    mr1= medical_report.getInstance();
                    mr1.getReportData("Blood Sugar Report", 011, "Mr. Lal", "High Blood Sugar");
                    mr1.printReport();
                }

                case 7 -> {
                    payment pay = new payment();
                    pay.paymentCalcute();
                }
                case 8 -> {
                    consultant_new = new consultant("5 Years", "Colombo university", 1, "Nadun Snadeepa", "45/ Halummahara", "0711044098");
                    consultant_new.consultantProfile();
                }
                case 9 -> {
                   askForAnother = false;
                }
                default -> System.out.println("Invalid Option.");
            }
        } 
    }

    private static void doctorFunctions(Scanner sc, receptionist rec)
    {
        System.out.println("Select Option.");
        System.out.println("\t1. Insert Doctors' Details.");
        System.out.println("\t2. View Doctors' Details.");
        System.out.println("\t3. Update Doctors' Details.");
        System.out.println("\t4. Exit.");
        
        
        boolean askForAnother = true;
        while(askForAnother) {
            System.out.print("\nSelect a option  : ");
            int doctorOption = sc.nextInt();
            switch (doctorOption) {
                case 1 -> {
                    System.out.print("\n ------ Create Doctor Profile ------ \n ");
                    System.out.print("Enter Full Name : ");
                    String name = sc.next();
                    
                    System.out.print(" Enter Address : ");
                    String Address = sc.next();
                    
                    System.out.print(" Enter Telephone Number : ");
                    String tel = sc.next();
                    
                    System.out.print(" Enter NIC : ");
                    String nic = sc.next();

                    System.out.print(" Enter BOD : ");
                    String bod = sc.next();

                    System.out.print(" Enter Working Qualifications : ");
                    String Qualifications = sc.next();

                    System.out.print("Enter Education Qualifications : ");
                    String eduQualifications = sc.next();
                    
                    System.out.print("Special For : ");
                    String specialFor = sc.next();
                    
                    Random rand = new Random(); 
                    int upperbound = 25000;
                    int d_id = rand.nextInt(upperbound); 
                 
                    doctor doctor_new1 = new doctor(nic, bod, Qualifications, eduQualifications, specialFor, d_id, name, Address, tel);
                    rec.doctorAddToList(doctor_new1);
                }
                case 2 -> {
                    rec.printAllDoctors();
                    System.out.println("");
                }
                case 3 -> {
                    rec.updateDoctor();
                }
                default -> {
                    askForAnother = false;
                }
            }
        }
    }
    
}
