package Day08_StringBuilder_StringFormatting_ClassObject_MethodToString;

public class Task01 {
    public static void main(String[] args) {

        Task01 st1 = new Task01();
        long startTime1 = System.nanoTime();
        st1.st1();
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        System.out.println(duration1 / 1000000);

        Task01 st2 = new Task01();
        long startTime2 = System.nanoTime();
        st2.st2();
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        System.out.println(duration2 / 1000000);

        long startTime3 = System.nanoTime();
        String s2 = "";
        for (int counter = 0; counter < 20000; counter++) {
            s2 += (counter + " ");
        }
        System.out.print(s2 + "\n");
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 - startTime3);
        System.out.println(duration3 / 1000000);
    }

    public void st1() {
        String s = "";
        for (int counter = 0; counter <= 20000; counter++) {
            s += (counter + " ");
        }
        System.out.print(s + "\n");
    }

    public void st2() {
        StringBuilder sb = new StringBuilder();
        for (int counter = 0; counter <= 20000; counter++) {
            sb.append(counter).append(" ");
        }
        System.out.print(sb + "\n");
    }
}