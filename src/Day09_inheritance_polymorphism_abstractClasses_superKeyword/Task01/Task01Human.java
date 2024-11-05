package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task01;

public class Task01Human {
    private String name;

    public Task01Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printInfo(String name) {
        return ("Этот человек с именем %s".formatted(name));
    }
}