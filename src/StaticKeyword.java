import java.util.Scanner;

class Counter {
    private static int count;

    Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        while (count-- > 0) {
            Counter obj = new Counter();
        }

        System.out.println("Number of objects created : " + Counter.getCount());

        sc.close();
    }
}
