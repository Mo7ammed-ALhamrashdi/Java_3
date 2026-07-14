public class FibonacciSequence {
    public static void main(String[] args) {
        int First = 0;
        int second = 1;
        int therd;
        int count = 15;
        System.out.print(First + " " + second + " ");
        for (int i = 3; i <= count; i++) {
            therd = First + second;
            System.out.print( therd + " ");
            First = second;
            second = therd;

        }
    }
}
