package Chapter5._5_1_4;

/**
 * @author zhuyongqi
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
