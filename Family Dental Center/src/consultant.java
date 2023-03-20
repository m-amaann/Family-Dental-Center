package family_dental_center;

public class consultant extends user{
    private String workExperinceYears;
    private String univeisty;


    public consultant(int userID, String name , String address, String telephoneNumber)
    {
        super(userID, name,address, telephoneNumber);
    }
    
    public consultant(String workExperinceYears, String univeisty, int userID, String name, String address, String telephoneNumber)
    {
        super(userID, name, address, telephoneNumber);
        this.workExperinceYears = workExperinceYears;
        this.univeisty = univeisty;
    }

    public String getWorkExperinceYears() {
        return workExperinceYears;
    }

    public void setWorkExperinceYears(String workExperinceYears) {
        this.workExperinceYears = workExperinceYears;
    }

    public String getUniveisty() {
        return univeisty;
    }

    public void setUniveisty(String univeisty) {
        this.univeisty = univeisty;
    }
    
    public void consultantProfile(){
        System.out.print("\n\n ---- Manager's Profile ----");
        System.out.print("\n Name : "+name);
        System.out.print("\n Address : "+address);
        System.out.print("\n Telephone Number : "+telephoneNumber);
        System.out.print("\n Univeisty : "+univeisty);
        System.out.print("\n Work Experince Years : "+workExperinceYears);
    }
}
