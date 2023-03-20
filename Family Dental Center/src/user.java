package family_dental_center;

 class user
{
    protected final int userID;
    protected final String name;
    protected final String address;
    protected final String telephoneNumber;
    protected String workExperinceYears;

//    @constructor
    public user(int userID, String name, String address, String telephoneNumber)
     {
        this.userID = userID;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
