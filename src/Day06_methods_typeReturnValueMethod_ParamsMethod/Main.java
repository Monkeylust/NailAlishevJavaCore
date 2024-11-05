package Day06_methods_typeReturnValueMethod_ParamsMethod;

public class Main {
    public static void main(String[] args) {
        Task01Car car = new Task01Car();
        car.info();
        car.setYearOfRelease(1992);
        System.out.println(car.yearDifference(2024));

        Task01Motorbike motorbike = new Task01Motorbike(2020, "Yellow", "Java");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2024));

        Task02Airplane airplaneSu = new Task02Airplane("Su", 1992, 8, 3);
        System.out.println(airplaneSu.info());
        airplaneSu.fillUp(100);
        System.out.println(airplaneSu.getFuel());

        Task02Airplane airplaneTu = new Task02Airplane("Tu", 1980, 30, 10);
        System.out.println(airplaneTu.info());
        airplaneTu.setYear(1985);
        airplaneTu.setLength(33);
        airplaneTu.fillUp(30);
        airplaneTu.fillUp(35);
        System.out.println(airplaneTu.info());

        Task03Teacher teacher = new Task03Teacher("Надя", "Алгебра");
        Task03Student student = new Task03Student("Паша");

        teacher.evaluate(student);
    }
}