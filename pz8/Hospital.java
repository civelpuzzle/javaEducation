package pz8;

import java.util.ArrayList;

public class Hospital {

    private ArrayList<String> medicine;
    private ArrayList<Appointment> appointments;
    private Appointment appointment;

    public Hospital(){
        medicine = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addMedicine(String element){
        medicine.add(element);
    }

    public void creeteAppointment (String userDate, int userId, Patient patient, Doctor doctor){
        Appointment userAppointment = new Appointment(userDate, userId, patient.getFullName(), doctor.getFullName());
        this.appointment = userAppointment;
    }

    public void giftMedicine(Patient patient, int choice){
        System.out.println(
                "=== Запись на приём ===\n" + appointment.toString() +
                ";\nЖалоба пациента: " + patient.getProblem() +
                ";\nВыдача рецепта для лекарства: " + medicine.get(choice - 1)
        );
    }

    public void addAppointments () {appointments.add(appointment);}

    public void printInfo() {
        for (Appointment a: appointments) {
            System.out.println(a.toString());
        }
    }
}
