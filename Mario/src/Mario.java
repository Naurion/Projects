/**
 * Created by naurion on 04.02.17.
 */
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        //Ввод высоты башни Марио.
        Scanner scanner = new Scanner(System.in);
        int n=0;
        System.out.println("Введите высоту башни Марио");
        //Проверка правильности ввода.
        while (!scanner.hasNextInt()) {
            System.out.println("Введите целое положительное число...");
            scanner.next();
        }
        n = scanner.nextInt();
        scanner.close();

        //Вывод в консоль.
        for (int i=n; i>=1; i--) {

            for (int j=i; j>=2; j--) {
                System.out.print(" ");
            }

            for (int k=i-n; k<2; k++) {
                System.out.print("#");
            }

            if (i>=2)
            System.out.println();
        }
    }
}
