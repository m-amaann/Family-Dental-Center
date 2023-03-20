package family_dental_center;

import java.util.ArrayList;
import java.util.List;

public class dental_treatment
{
    private String t_id;
    private String name;


    List<String> dental_treatmentList = new ArrayList<>();
    public dental_treatment(String t_id, String name)
    {
        this.t_id = t_id;
        this.name = name;
    }

    dental_treatment() {
        super();
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void dental_treatmentAddToList(dental_treatment d) {
            dental_treatmentList.add(d.getName()+","+d.getT_id());   
    }
    
    public void printAllTreatment() {
         String reteurn = "\n\nOur Dental Treatment List\n";
         for(int i=0; i< dental_treatmentList.size(); i++)
         {
             String[] arrOfpatientDetails = (dental_treatmentList.get(i)).split(",", 9);
             reteurn += "\n "+arrOfpatientDetails[1]+" - "+arrOfpatientDetails[0];
         }
         System.out.print(reteurn);
    }
}
