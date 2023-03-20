package family_dental_center;

public class manager extends user{
    private String university;
    private String degrees;
    private String work_experince_years;


    public manager(String university, String degrees, String work_experince_years, int userID, String name, String address, String telephoneNumber)
    {
        super(userID, name, address, telephoneNumber);
        this.university = university;
        this.degrees = degrees;
        this.work_experince_years = work_experince_years;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

    public String getWork_experince_years() {
        return work_experince_years;
    }

    public void setWork_experince_years(String work_experince_years) {
        this.work_experince_years = work_experince_years;
    }

    //Display menthod
    public void managerProfile()
    {
        System.out.print("\n\n ---- Manager's Profile ----");
        System.out.print("\n Name : "+name);
        System.out.print("\n Address : "+address);
        System.out.print("\n Telephone Number : "+telephoneNumber);
        System.out.print("\n Work Experince Years : "+work_experince_years);
        System.out.print("\n Degrees : "+degrees);
        System.out.print("\n University : "+university);
    } 
   
}
