package PR1;

public class Factorial {
    static long fac(int n){
        long l = 1;
        for (int i=2; i <= n; i++){
            l *= i;
        }
        return l;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fac(n));
    }
}
