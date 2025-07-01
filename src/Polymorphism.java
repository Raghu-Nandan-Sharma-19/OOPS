import java.util.Scanner;

class ShapeCalculator {
    public void area(int radius) {
        double ans = ((3.14) * (radius * radius));
        System.out.println("Area of Circle : " + (int) (ans));
    }

    public void area(int length, int width) {
        int ans = (length * width);
        System.out.println("Area of Rectangle : " + ans);
    }

    public void area(int base1, int base2, int height) {
        double ans =  (((base1 + base2) * height) / 2);
        System.out.println("Area of Trapezoid : " + (int) (ans));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of Circle : ");
        int radius = scanner.nextInt();

        System.out.print("Enter length of Rectangle : ");
        int length = scanner.nextInt();
        System.out.print("Enter width of Rectangle : ");
        int width = scanner.nextInt();

        System.out.print("Enter base 1 of Trapezoid : ");
        int base1 = scanner.nextInt();
        System.out.print("Enter base 2 of Trapezoid : ");
        int base2 = scanner.nextInt();
        System.out.print("Enter height of Trapezoid : ");
        int height = scanner.nextInt();

        System.out.println();
        System.out.println("Areas of shapes : ");
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        shapeCalculator.area(radius);
        shapeCalculator.area(length, width);
        shapeCalculator.area(base1, base2, height);

        scanner.close();
    }
}
