
package family_dental_center;

import java.util.ArrayList;
import java.util.List;

public class doctor extends user{
   
    private String nic;
    private String bod;
    private String qualification;
    private String educationLevel;
    private String specialFor;
    
    public doctor(int userID, String name , String address, String telephoneNumber) {
        super(userID, name,address, telephoneNumber);
    }

    public doctor(String nic, String bod, String qualification, String educationLevel, String specialFor, int userID, String name, String address, String telephoneNumber) {
        super(userID, name, address, telephoneNumber);
        this.nic = nic;
        this.bod = bod;
        this.qualification = qualification;
        this.educationLevel = educationLevel;
        this.specialFor = specialFor;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getSpecialFor() {
        return specialFor;
    }

    public void setSpecialFor(String specialFor) {
        this.specialFor = specialFor;
    }
}
