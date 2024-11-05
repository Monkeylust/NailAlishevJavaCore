package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task01;

public class  _Task01Main {
    public static void main(String[] args) {

        Task01Student student = new Task01Student("Коля", "2");
        Task01Teacher teacher = new Task01Teacher("Гриша", "Информатика");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getDiscipline());

        System.out.println(student.printInfo(student.getName()));
        System.out.println(teacher.printInfo(teacher.getName()));
    }
}