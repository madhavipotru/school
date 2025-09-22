public class Dog {

    private String name;
    private String bread;
    private Integer age;


    public static void main(String[] args){
        Dog hutch =new Dog();
        hutch.age=12;
        hutch.bread="street";
        hutch.name="Hutch";
    }

    @Override
    public String toString() {
        return "Dog Name:"+this.name+"Dog Age:"+this.age;
    }
    
}
