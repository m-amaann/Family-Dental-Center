package family_dental_center;


public class nurse extends staff
{
    private String training_School;
    private String level;
    private String marrage_status;
    private String nursing_licence_id;

    public nurse(String training_School, String level, String marrage_status, String nursing_licence_id, String qualification, int telephoneCode, int etfNum,
                 int userID, String name, String address, String telephoneNumber)
    {
        super(qualification, telephoneCode, etfNum, userID, name, address, telephoneNumber);
        this.training_School = training_School;
        this.level = level;
        this.marrage_status = marrage_status;
        this.nursing_licence_id = nursing_licence_id;
    }

    public String getTraining_School() {
        return training_School;
    }

    public void setTraining_School(String training_School) {
        this.training_School = training_School;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMarrage_status() {
        return marrage_status;
    }

    public void setMarrage_status(String marrage_status) {
        this.marrage_status = marrage_status;
    }

    public String getNursing_licence_id() {
        return nursing_licence_id;
    }

    public void setNursing_licence_id(String nursing_licence_id) {
        this.nursing_licence_id = nursing_licence_id;
    }
}
