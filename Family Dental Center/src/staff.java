package family_dental_center;

abstract class staff extends user
{
    private String qualification;
    private int telephoneCode;
    private int etfNum;

    //Constructor
    public staff(String qualification, int telephoneCode, int etfNum, int userID, String name, String address, String telephoneNumber)
    {
        super(userID, name, address, telephoneNumber);
        this.qualification = qualification;
        this.telephoneCode = telephoneCode;
        this.etfNum = etfNum;
    }
}
