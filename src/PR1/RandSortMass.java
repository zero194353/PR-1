package PR1;

import java.util.Arrays;
import java.util.Random;

public class RandSortMass {
    public static void main(String[] args) {
        int a = 1;
        int b = 1000;

        int [] arr = new int[10];
        int i=0;

        while (i < 5){
            arr[i] = a + (int) (Math.random() * b);
            i++;
        }

        Random r  = new Random();

        while (i < 10){
            arr[i] = r.nextInt();
            i++;
        }

        System.out.print("Random mass:");

        for (int j=0; j < 10; j++){
            System.out.print(" " + arr[j]);
        }

        Arrays.sort(arr);

        System.out.print("\nSort mass:");
        for (int j=0; j < 10; j++){
            System.out.print(" " + arr[j]);
        }
    }
}
