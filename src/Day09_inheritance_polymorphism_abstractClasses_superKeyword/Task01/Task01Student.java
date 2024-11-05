package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task01;

public class Task01Student extends Task01Human {
    private String groupName;

    public Task01Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String printInfo(String name) {
        //return super.printInfo(name) + ("\nЭтот студент с именем %s".formatted(name)); Моё через конкатенацию
        return "%s\nЭтот студент с именем %s".formatted(super.printInfo(name), name); // Сереги без конкатенации
    }
}