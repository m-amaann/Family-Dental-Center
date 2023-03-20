package family_dental_center;


public class medical_report
{
   private static medical_report reportObject;
   private String report_title = "";
   private int report_id = 0;
   private String patient = "";
   private String description = "";
   
   private medical_report()
   {
       super();
   }
   
   public void getReportData(String report_title , int report_id ,  String patient , String description )
   {
       this.report_title = report_title;
       this.report_id = report_id;
       this.patient = patient;
       this.description = description;
   }
   
   

   public static medical_report getInstance()
   {

      if(reportObject == null)
      {
         reportObject = new medical_report();
      }

       return reportObject;
   }

   
   
   public void printReport() {
       System.out.print("\n\n----- "+patient+"'s "+report_title+" ----- ");
       System.out.println("\nReport id : "+report_id);
       System.out.println("Patient : "+patient);
       System.out.println("description : \n"+description);
   }
}
