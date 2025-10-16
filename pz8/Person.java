package pz8;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String gender;

    public Person (
            String firstName, String lastName, String middleName, int age,
            String gender
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getMiddleName() {return middleName;}
    public String getFullName() {return lastName + " " + firstName + " " + middleName;}
    public int getAge() {return age;}
    public String getGender() {return gender;}

    public String toString() {
        return getFullName() + " Возраст: " + age + " Пол: " + gender;
    }
}