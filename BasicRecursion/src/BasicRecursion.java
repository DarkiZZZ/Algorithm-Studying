public class BasicRecursion {

    public static void main(String[] args) {
        recursion(20);
    }

    // print countdown to console from integer "start" to 1
    public static void recursion(int start){
        System.out.println(start);
        if (start <= 1){
            return;
        }
        else {
            recursion(start - 1);
        }
    }
}
