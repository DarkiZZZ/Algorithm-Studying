import java.util.ArrayList;
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

        //=================================================

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter size of ArrayList:");
        int size = scanner.nextInt();
        for (int i = 1; i < size; i++){
            list.add(i);
        }
        System.out.println(recursiveSum(list));
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

    //returns factorial of number
    public static int factorialRecursion(int x){
        if (x == 1){
            return 1;
        }
        else {
            return x * factorialRecursion(x - 1);
        }
    }

    //returns sum of all elements in ArrayList
    public static int recursiveSum(ArrayList<Integer> list) {
        if (list.isEmpty()){
            return 0;
        }
        else {
            int sum = 0;
             sum += list.get(0);
            list.remove(0);
            return sum + recursiveSum(list);
        }
    }
}

