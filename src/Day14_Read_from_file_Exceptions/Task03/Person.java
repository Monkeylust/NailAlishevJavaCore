package Day14_Read_from_file_Exceptions.Task03;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    public String toString(){
//        return "%s, %d" .formatted(name, age); //Помню, помню твои учения)
//    }
}