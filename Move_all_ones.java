import java.util.*;

public class Move_all_ones {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length) {
            arr[count] = 1;
            count++;
        }

        System.out.print("Array elements after moving Ones to end: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
