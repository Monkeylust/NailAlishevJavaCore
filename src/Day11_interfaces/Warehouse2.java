package Day11_interfaces;

public class Warehouse2 {
    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return this.countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return "%s %s".formatted(countOrder, balance);
    }
}