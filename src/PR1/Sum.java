package PR1;

import java.util.Scanner;


public class Sum {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int [] a = new int[]{1,2,3,4,5}; // Непосредственно массив элементов Сумма = 15
            int sum = 0;

            for (int i=0; i < 5; i++){  // Сумма через for
                sum += a[i];
            }
            System.out.println("Sum(for):" + sum);

            sum =0;
            int i=0;
            while (i < 5){  // Сумма через while
                sum += a[i];
                i++;
            }
            System.out.println("Sum(while):" + sum);

            sum =0;
            i=0;
            do{  // Сумма через do while
                sum += a[i];
                i++;
            }while(i < 5);
            System.out.println("Sum(do while):" + sum);

        }
}

