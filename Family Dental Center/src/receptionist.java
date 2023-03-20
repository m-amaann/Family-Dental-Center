package family_dental_center;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class receptionist extends staff
{
    List<String> patientList = new ArrayList<>();
    List<String> doctorList = new ArrayList<>();
    
    public receptionist(String qualification, int telephoneCode, int etfNum, int userID, String name, String address, String telephoneNumber)
    {
        super(qualification, telephoneCode, etfNum, userID, name, address, telephoneNumber);
    }
    
    public void doctorAddToList(doctor d)
    {
            doctorList.add(d.getUserID()+","+d.getName()+","+d.getAddress()+","+d.getTelephoneNumber()+","+d.getBod()+","+d.getSpecialFor()+"," +
                    ""+d.getNic()+","+d.getEducationLevel()+","+d.getQualification());
    }
    
    public void printAllDoctors()
    {
         String reteurn = "\n\n --- Our Doctor List --- \n";
         reteurn += "Name\t\tSpecial For\tDoctor ID\tMobile Number\tAddress";
         for(int i=0; i< doctorList.size(); i++){
             String[] arrOfpatientDetails = (doctorList.get(i)).split(",", 9);
             reteurn += "\n"+arrOfpatientDetails[1]+"\t"+arrOfpatientDetails[5]+"\t"+arrOfpatientDetails[0]+"\t"+arrOfpatientDetails[3]+"\t"+arrOfpatientDetails[2];
         }
         System.out.print(reteurn);
    }
    
    public void updateDoctor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Search Doctor Using Doctor Id :");
        int searchDID = sc.nextInt();
        
        int d_array_elemnt = 0;
        String reteurn = "";
        for(int i=0; i< doctorList.size(); i++){
             String[] arrOfpatientDetails = (doctorList.get(i)).split(",", 9);
             if(Integer.parseInt(arrOfpatientDetails[0]) == searchDID){
                d_array_elemnt = i;
                reteurn += "\n Name :"+arrOfpatientDetails[1]+"\n Special For : "+arrOfpatientDetails[5]+"\n Doctor Id : "+arrOfpatientDetails[0]+"\n Movile Number : " +
                        ""+arrOfpatientDetails[3]+"\n Address : "+arrOfpatientDetails[2]+"\n";
             }
        }

        System.out.print(reteurn+"\n");
        System.out.print("\n\n ------ Update Doctor Profile ------ \n ");
        System.out.print("Enter Full Name : ");
        String name = sc.next();


        System.out.print("Enter Address : ");
        String Address = sc.next();


        System.out.print("Enter Telephone Number : ");
        String tel = sc.next();


        System.out.print("Enter NIC : ");
        String nic = sc.next();


        System.out.print("Enter BOD : ");
        String bod = sc.next();


        System.out.print("Enter Working Qualifications : ");
        String Qualifications = sc.next();


        System.out.print("Enter Education Qualifications : ");
        String eduQualifications = sc.next();

        System.out.print("Special For : ");
        String specialFor = sc.next();
        
        
        doctorList.set(d_array_elemnt, (searchDID+","+name+","+Address+","+tel+","+bod+","+specialFor+","+nic+","+eduQualifications+","+Qualifications));
        
    }
    
    public void  PatientAddToList(patient p)
    {
            patientList.add(p.getNic()+","+p.getBod()+","+p.getAge()+","+p.getGender()+","+p.getUserID()+","+p.getName()+","+p.getAddress()+","+p.getTelephoneNumber()+","+p.getRegCharge());   
    }
    
    
    public void printAllPatient()
    {
         String reteurn = "\n\n --- Our Patient List --- \n";
         reteurn += "Name\t\tNIC\tPateint ID\tMobile Number\tAddress";
         for(int i=0; i< patientList.size(); i++)
         {
             String[] arrOfpatientDetails = (patientList.get(i)).split(",", 9);
             reteurn += "\n"+arrOfpatientDetails[5]+"\t"+arrOfpatientDetails[0]+"\t"+arrOfpatientDetails[4]+"\t"+arrOfpatientDetails[7]+"\t"+arrOfpatientDetails[6];
         }
         System.out.print(reteurn);
    }
    
    public void addNewManager(String university, String degrees, String work_experince_years, int userID, String name, String address, String telephoneNumber)
    {
           manager manager_new =  new manager(university , degrees , work_experince_years , userID , name , address , telephoneNumber);
           manager_new.managerProfile();
    }
}
