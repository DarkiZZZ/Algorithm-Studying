import java.util.Scanner;

public class BasicRecursion {

    public static void main(String[] args) {
        System.out.print("Enter the start of countdown: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        recursion(number);
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
}
