package pz8;

public class Appointment {

    private String date;
    private int id;
    private String patient;
    private String doctor;

    public Appointment(String date, int id, String patient, String doctor){
        this.date = date;
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
    }

    public String getDate() {return date;}
    public int getId() {return id;}
    public String getPatient() {return patient;}
    public String getDoctor() {return doctor;}

    @Override
    public String toString(){
        return "ID: " + id + ";\nДата записи: " + date + ";\nПациент: " + patient + ";\nЛечащий врач: " + doctor;
    }
}
