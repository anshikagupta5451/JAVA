import java.util.*;

public class hello {
    String name;
    double weight;
    double height;

    hello() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.nextLine();

        System.out.println("Enter your weight: ");
        weight = in.nextDouble();

        System.out.println("Enter your height: ");
        height = in.nextDouble();
    }

    void BMI() {
        double bmi;
        bmi = (weight / (height * height)) * 703;
        System.out.println("You entered string " + name);
        System.out.println("Your weight is " + weight);
        System.out.println("Your height is " + height);
        System.out.println("Your bmi is " + bmi);

    }
}
class Main{

    public static void main(String[] args) {

        hello obj = new hello();
        obj.BMI();
    }
}
