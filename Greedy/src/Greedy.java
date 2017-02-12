/**
 * Created by naurion on 05.02.17.
 */
import java.util.Scanner;

public class Greedy {
    public static void main(String[] args){
        int coin25 = 0;
        int coin10 = 0;
        int coin5 = 0;
        int coin1 = 0;
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        n *=100.00;
        int i = (int) n;
        while (i>=25){
            i = i-25;
            coin25++;
            }
        while (i>=10){
            i = i-10;
            coin10++;
        }
        while (i>=5){
            i = i-5;
            coin5++;
        }
        while (i>=1){
            i = i-1;
            coin1++;
        }
       System.out.println(coin25 +" "+ coin10+" "+ coin5 + " "+ coin1);
    }
}
