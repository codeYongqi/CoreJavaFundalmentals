package Chapter5._5_1_4;

public class Student extends Person {
    private String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}