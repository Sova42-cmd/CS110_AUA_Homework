import java.util.Scanner;

public class Problem04{
    public static void main(String[] args){
        //int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

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

            for (int i = 0; i < n - row; i++) {
                System.out.print(' ');
            }

            for (int i = 0; i < row; i++) {
                System.out.print('#');
            }
            System.out.print(' ');


            // Right half ↓↓↓


            int mirror = n - row + 1;   // 5 on the top row, 1 on the bottom row

            // the same four loops as the left half, with mirrored value instead of row
            for (int i = 0; i < mirror; i++) {
                System.out.print('#');
            }
            for (int i = 0; i < n - mirror; i++) {
                System.out.print(' ');
            }

            System.out.print(' '); // for the row with 5 #'s

            for (int i = 0; i < n - mirror; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i < mirror; i++) {
                System.out.print('#');
            }
            System.out.println();

        }
    }
}