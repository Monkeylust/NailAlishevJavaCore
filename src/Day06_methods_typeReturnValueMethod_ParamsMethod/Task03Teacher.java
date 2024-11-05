package Day06_methods_typeReturnValueMethod_ParamsMethod;

import java.util.Random;

public class Task03Teacher {
    private String name;
    private String discipline;

    public Task03Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public void evaluate(Task03Student student) {
        Random random = new Random();
        int number = random.nextInt(2, 6);
        String grade = "";
        switch (number) {
            case 2: grade = "неудовлетворительно";
                break;
            case 3: grade = "удовлетворительно";
                break;
            case 4: grade = "хорошо";
                break;
            case 5: grade = "отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s\n", name, student.getName(), discipline, grade);
    }
}