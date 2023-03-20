
package family_dental_center;


abstract class rooms {
    protected final int roomID;
    protected final String name;
    protected final String allocate_patient;
    protected final int available_or_no;

    public rooms(int roomID, String name, String allocate_patient, int available_or_no) {
        this.roomID = roomID;
        this.name = name;
        this.allocate_patient = allocate_patient;
        this.available_or_no = available_or_no;
    }
}
