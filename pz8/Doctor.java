package pz8;

public class Doctor extends Person {

    private String education;
    private int experience;

    public Doctor(
            String firstName, String lastName, String middleName, int age,
            String gender, String education, int experience
    ){
        super(firstName, lastName, middleName, age, gender);

        this.education = education;
        this.experience = experience;
    }

    public String getEducation() {return education;}
    public int getExperience() {return experience;}

    @Override
    public String toString(){
        return "ФИО: " + getFullName() + ";\nВозраст: " + getAge() + ";\nПол: " + getGender() + ";\nОбразование: " + education
                + ";\nСтаж работы: " + experience;
    }
}
