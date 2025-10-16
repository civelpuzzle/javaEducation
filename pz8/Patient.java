package pz8;

public class Patient extends Person{

    private int height;
    private int weight;
    private String problem;

    public Patient (
            String firstName, String lastName, String middleName, int age,
            String gender, int height, int weight, String problem
    ){
        super(firstName, lastName, middleName, age, gender);

        this.height = height;
        this.weight = weight;
        this.problem = problem;
    }

    public int getHeight() {return height;}
    public int getWeight() {return weight;}
    public String getProblem() {return problem;}

    @Override
    public String toString(){
        return  "ФИО: " + getFullName() +
                ";\nВозраст: " + getAge() +
                ";\nПол: " + getGender() +
                ";\nРост: " + height +
                ";\nВес: " + weight +
                ";\nНа что жалуемся: " + problem;
    }
}
