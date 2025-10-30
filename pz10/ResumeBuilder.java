package pz10;

import java.util.ArrayList;

public class ResumeBuilder implements Builder{

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private int age;
    private String phone;
    private ArrayList<String> skills;
    private ArrayList<String> experience;
    private ArrayList<String> education;

    public ResumeBuilder(
            String firstName, String lastName, String middleName,
            String email, int age, String phone,
            ArrayList<String> skills, ArrayList<String> experience,
            ArrayList<String> education
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.skills = skills;
        this.experience = experience;
        this.education = education;
    }

    @Override
    public String setPersonalData(){
        return "ФИО: " + lastName + " " + firstName + " " + middleName +
                "\nEmail: " + email +
                "\nВозраст: " + age +
                "\nНомер телефона: " + phone;
    }

    @Override String setSkills() {

    }
}
