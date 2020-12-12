package PR1;

public class Harmonic {
    public static void main(String[] args) {
        System.out.print("    ");
        for (int i=0; i < 5; i ++){
            System.out.print("1   "); // Вывод первого слагаемого,а так же численной части дроби
        }

        System.out.println("");
        System.out.print("1");
        for (int i=0; i < 5; i++){
            System.out.print(" + -"); // Вывод суммы,а так же дробного разделителя
        }

        System.out.println("-"); // Вывод дробного разделителя ещё раз*,для корректного отображения

        System.out.print("    ");
        for (int i=2; i < 7; i++){
            System.out.print(i + "   ");
        }
    }
}

/*
for (int i = 1; i < 11; i++) {
        System.out.println(1./i);
}
 */
