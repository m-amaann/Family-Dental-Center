package family_dental_center;

public class room_surgery extends rooms
{
   private String current_doctor;
   private String current_oparation;
   private String current_oparation_duration;

    public room_surgery(String current_doctor, String current_oparation, String current_oparation_duration, int roomID, String name, String allocate_patient, int available_or_no)
    {
        super(roomID, name, allocate_patient, available_or_no);
        this.current_doctor = current_doctor;
        this.current_oparation = current_oparation;
        this.current_oparation_duration = current_oparation_duration;
    }

    public String getCurrent_doctor()
    {
        return current_doctor;
    }

    public void setCurrent_doctor(String current_doctor)
    {
        this.current_doctor = current_doctor;
    }

    public String getCurrent_oparation()
    {
        return current_oparation;
    }

    public void setCurrent_oparation(String current_oparation)
    {
        this.current_oparation = current_oparation;
    }

    public String getCurrent_oparation_duration()
    {
        return current_oparation_duration;
    }

    public void setCurrent_oparation_duration(String current_oparation_duration)
    {
        this.current_oparation_duration = current_oparation_duration;
    }
}
