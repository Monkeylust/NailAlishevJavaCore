package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task01;

public class Task01Teacher extends Task01Human {
    private String discipline;

    public Task01Teacher(String name, String discipline) {
        super(name);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String printInfo(String name) {
        return "%s\nЭтот преподаватель с именем %s".formatted(super.printInfo(name), name);
    }
}