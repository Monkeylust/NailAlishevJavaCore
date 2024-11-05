package Day11_interfaces;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse2 warehouse2 = new Warehouse2();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        while (warehouse.getCountOrder() < 1505) {
            picker.doWork();
            picker.bonus();
            System.out.println(picker.getSalary());
            System.out.println(warehouse);
        }

        while (warehouse.getBalance() < 1000005) {
            courier.doWork();
            courier.bonus();
            System.out.println(courier.getSalary());
            System.out.println(warehouse);
        }

        picker.doWork();
        picker.bonus();
        System.out.println(picker.getSalary());
        System.out.println(warehouse2);
    }
}