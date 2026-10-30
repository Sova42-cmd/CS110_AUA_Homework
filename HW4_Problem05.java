import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int bit = 1; bit != 0; bit <<= 1) {
            if ((n & bit) != 0) {
                System.out.println(bit);
            }
        }
    }
}