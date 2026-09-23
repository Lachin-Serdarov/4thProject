import java.util.Scanner;

public class FourthProject {
    public static void main(String[] args) {

        // Dərs 1

        int a = 0;

        for (int i = 1; i <= 100; i++) {
            a += i;
        }

        System.out.println("1-dən 100-ə qədər ədədlərin cəmi: " + a);



    // Dərs 2

    for (int i = 2; i <= 50; i += 2) {
        System.out.println(i);
    }

    // Dərs 3

        Scanner scr = new Scanner(System.in);

        double number;
        double total = 0;
        int nmb = 0;

        do {
            System.out.println("Ədəd daxil edin (Dayandırmaq üçün 0 yazın: ");
            number = scr.nextDouble();

            if (number !=0) {
                total += number;
                nmb++;
            }
        } while (number != 0);

        if (nmb > 0) {
            double avarage = total / nmb;
            System.out.println("Daxil edilən ədədlərin ortalaması: " + avarage);
        } else {
            System.out.println("Heç bir ədəd daxil edilməyib: ");
        }

        // Dərs 4

        for (int i = 0; i < 5; i++) {
            System.out.println("\n Salam");
        }

        // Dərs 5

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Dərs 6

        Scanner scr2 = new Scanner(System.in);

        System.out.println("Bir ədəd daxil edin: ");

        int number2 = scr2.nextInt();

        System.out.println("0-dan " + number2 + " ədədinə qədər olan ədədlər:");
        for (int i = 0; i <= number2; i++) {
            System.out.println(i + " ");
        }

        // Dərs 7

        Scanner scr3 = new Scanner(System.in);

        System.out.println("Bir Ədəd daxil edin: ");

        int number3 = scr3.nextInt();

        if (number3 < 0) {
            System.out.println("Mənfi ədədlərin faktorialı hesablanmır.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number3; i++) {
                factorial *= i;
            }
            System.out.println(number3 + "! =" + factorial);
        }


    }


}
