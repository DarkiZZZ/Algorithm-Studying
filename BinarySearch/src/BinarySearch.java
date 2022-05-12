import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> exampleList = new ArrayList<>(100);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        for (int i = 0; i < 100; i++) {
            Integer r = random.nextInt() % 256;
            exampleList.add(r);
        }
        Collections.sort(exampleList);
        System.out.println(exampleList);

        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        System.out.println(binarySearch(item, exampleList));
    }

    //returns index of item in collection
    public static int binarySearch(int item, ArrayList<Integer> list){
        int low = 0;
        int high = list.size() - 1;

        while (low <= high){
            int middle = (low + high)/2;
            int answer = list.get(middle);
            if (answer == item){
                return middle;
            }
            else if (answer > item){
                high = middle -1;
            }
            else{
                low = middle + 1;
            }
        }
        return -1; // <--- Returns -1, if element(item) not found
    }
}
