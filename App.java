public class App {
    public static void main(String[] args) {
        int n = 10; // تعداد اعضا
        for (int i = 0; i < n; i++) {
            System.out.print(fibonachi(i) + " ");
        }
    }

    public static int fibonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}

      
        

