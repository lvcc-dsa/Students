import java.util.Random;
import java.util.Scanner;
public class FindMinMax {

    public static void main(String[] args) {
        int[] numbers = {34,23,12,45,67,324};
        Scanner Jerome = new Scanner(System.in);
        Random jerome = new Random();
        System.out.print("Enter Array Size? ");
        int Jer = Jerome.nextInt();
        int Laman[]= new int[Jer];
    for (int j = 0; j < Laman.length; j++) {
        Laman[j] = jerome.nextInt(100)+1;
        System.out.println("Random Number: "+Laman[j]);
        }
    int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Laman.length; i++) {
            if ( min > Laman[i])
                min = Laman[i];
            if ( Laman[i] > max)
                max = numbers[i];
      
    }
      System.out.println("Smallest number is "+min);
        System.out.println("LArgest number is "+max);
    }}
