package company;
import java.util.Scanner;
import java.io.IOException;

public class A3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean weekday, vocation;
        String w, v;
        System.out.println("Сегодня выходной? Введите Y, если да, N в обратном случае");
        weekday = true;

        for(;;) {
            w = in.nextLine();
            if(w.equals("N"))
            {
                weekday = false;
                break;
            }
            if(w.equals("Y"))
            {
                weekday = true;
                break;
            }
            break;
        }

        System.out.println("Отпуск? Введите Y, если да, N в обратном случае");


        for(;;)
        {
            v = in.nextLine();
            if(v.equals("N"))
            {
                vocation = false;
                break;
            }

            if(v.equals("Y"))
            {
                vocation = true;
                break;
            }
        }

        if((vocation) || (weekday)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}