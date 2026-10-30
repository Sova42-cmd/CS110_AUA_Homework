public class Problem04{
    public static void main(String[] args){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // 1. prints out a shitton of #'s
            for (int i = 0; i < row; i++) {
                System.out.print('#');
            }
            // 2. prints out spaces, 5-1 = 4 spaces for the first row, 5-2 = 3 spaces for the seconf row etc.
            for (int i = 0; i < n - row; i++) {
                System.out.print(' ');
            }

            System.out.print(' '); // for that one extra space for final row 5

            // creates the mirror-ish effect
            for (int i = 0; i < n - row; i++) {
                System.out.print(' ');
            }

            for (int i = 0; i < row; i++) {
                System.out.print('#');
            }
            System.out.print(' ');

            System.out.println();
        }
    }
}