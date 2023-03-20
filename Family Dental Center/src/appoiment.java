package family_dental_center;

 public class appoiment {
    private String appoinment;
    private String appoinmentDate;
    private String timeSlote;
    private String charge;
    private String doctor;
    private String patient;

    //constructor
     public appoiment(String appoinment, String appoinmentDate, String timeSlote, String charge, String doctor, String patient)
     {
        this.appoinment = appoinment;
        this.appoinmentDate = appoinmentDate;
        this.timeSlote = timeSlote;
        this.charge = charge;
        this.doctor = doctor;
        this.patient = patient;
    }

    appoiment() {
        super();
    }

    public String getAppoinment() {
        return appoinment;
    }

    public void setAppoinment(String appoinment) {
        this.appoinment = appoinment;
    }

    public String getAppoinmentDate() {
        return appoinmentDate;
    }

    public void setAppoinmentDate(String appoinmentDate) {
        this.appoinmentDate = appoinmentDate;
    }

    public String getTimeSlote() {
        return timeSlote;
    }

    public void setTimeSlote(String timeSlote) {
        this.timeSlote = timeSlote;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }
}
