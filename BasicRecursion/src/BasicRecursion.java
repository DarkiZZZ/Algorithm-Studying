import java.util.Scanner;

public class BasicRecursion {

    public static void main(String[] args) {
        System.out.println("Enter the start of countdown: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        recursion(number);

        //=================================================

        System.out.println("Enter number to count its factorial");
        int x = scanner.nextInt();
        System.out.println(factorialRecursion(x));
    }

    // print countdown to console from integer "start" to 1
    public static void recursion(int start){
        System.out.print(start + " ");
        if (start <= 1){
            return;
        }
        else {
            recursion(start - 1);
        }
    }

    public static int factorialRecursion(int x){
        if (x == 1){
            return 1;
        }
        else {
            return x * factorialRecursion(x - 1);
        }
    }
}
