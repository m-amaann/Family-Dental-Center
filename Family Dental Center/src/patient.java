package family_dental_center;

import java.util.ArrayList;
import java.util.List;

public class patient extends user{
    private String nic;
    private String bod;
    private String age;
    private String gender;
    private double regCharge;
    

    public patient(int userID, String name , String address, String telephoneNumber)
    {
        super(userID, name,address, telephoneNumber);
    }

    public patient(String nic, String bod, String age, String gender, int userID, String name, String address, String telephoneNumber, double regCharge)
    {
        super(userID, name, address, telephoneNumber);
        this.nic = nic;
        this.bod = bod;
        this.age = age;
        this.gender = gender;
        this.regCharge = regCharge;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getRegCharge() {
        return regCharge;
    }

    public void setRegCharge(double regCharge) {
        this.regCharge = regCharge;
    }
}
