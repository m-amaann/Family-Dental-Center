package family_dental_center;

public class room_Scan extends rooms {
    private String oparator;
    private String machine_details;

    public room_Scan(String oparator, String machine_details, int roomID, String name, String allocate_patient, int available_or_no) {
        super(roomID, name, allocate_patient, available_or_no);
        this.oparator = oparator;
        this.machine_details = machine_details;
    }

    public String getOparator() {
        return oparator;
    }

    public void setOparator(String oparator) {
        this.oparator = oparator;
    }

    public String getMachine_details() {
        return machine_details;
    }

    public void setMachine_details(String machine_details) {
        this.machine_details = machine_details;
    }
}
