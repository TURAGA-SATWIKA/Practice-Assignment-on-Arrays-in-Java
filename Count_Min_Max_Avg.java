import java.util.*;

class Count_Min_Max_Avg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("The element with the Minimum value: " + arr[0]);
        System.out.println("The element with the Maximum value: " + arr[n - 1]);
        System.out.println("Average of all array elements: " + (sum / n));
        System.out.println("Total number of array elements: " + arr.length);
    }
}