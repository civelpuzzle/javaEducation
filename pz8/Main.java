package pz8;

public class Main {
    public static void main(String[] args){

        Doctor d1 = new Doctor("Иван", "Иванов", "Сидорович", 31, "Мужской",
                "Теропевт", 6);
        Doctor d2 = new Doctor("Ольга", "Вячеславна", "Дмитриевна", 28, "Женский",
                "Психолог", 4);

        Patient p1 = new Patient("Пётр", "Легов", "Олегович", 45, "Мужской",
                175, 70, "Жалоба на работу кишечника");
        Patient p2 = new Patient("Ирина", "Сверякина", "Викторовна", 23, "Женский",
                170, 59, "Жалоба на зуд в области лопаток");

        Hospital hospital = new Hospital();

        for (int i = 0; i < 3; ++i){
            hospital.addMedicine("Лекарство №" + (i + 1));
        }

        hospital.creeteAppointment("5 октября", 1, p1, d2);
        hospital.addAppointments();
        hospital.creeteAppointment("8 ноября", 2, p2, d1);
        hospital.addAppointments();

        hospital.giftMedicine(p1, 1);

        hospital.printInfo();
    }
}