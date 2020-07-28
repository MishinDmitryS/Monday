package company;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        double a, b;

        a = in.nextDouble();
        b = in.nextDouble();

        a = a/b;

        System.out.println(a);
    }
}