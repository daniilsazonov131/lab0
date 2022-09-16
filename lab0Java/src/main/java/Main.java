



//Определить какое из трех, введенных пользователем, чисел максимальное и
//вывести его на экран.




import java.awt.desktop.SystemEventListener;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = in.nextInt();
        System.out.print("Введите первое число: ");
        int secondNumber = in.nextInt();
        System.out.print("Введите первое число: ");
        int thirdNumber = in.nextInt();
        int maxNumber = firstNumber;
        if (maxNumber < secondNumber) maxNumber = secondNumber;
        if (maxNumber < thirdNumber) maxNumber = thirdNumber;
        System.out.print("Максимальное число: " + maxNumber);
    }
}

