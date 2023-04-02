import java.util.*;

public class FrequencyCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the size of the super set array from the user
        System.out.print("Enter the size of the super set array: ");
        int sizeSuperSet = input.nextInt();

        // Create the super set array
        int[] arrSuperSet = new int[sizeSuperSet];

        // Get the elements of the super set array from the user
        System.out.println("Enter the elements of the super set array:");
        for (int i = 0; i < sizeSuperSet; i++) {
            arrSuperSet[i] = input.nextInt();
        }

        // Get the size of the subset array from the user
        System.out.print("Enter the size of the subset array: ");
        int sizeSubSet = input.nextInt();

        // Create the subset array
        int[] arrSubSet = new int[sizeSubSet];

        // Get the elements of the subset array from the user
        System.out.println("Enter the elements of the subset array:");
        for (int i = 0; i < sizeSubSet; i++) {
            arrSubSet[i] = input.nextInt();
        }

        // Create a map to store the frequency of each element in the super set array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arrSuperSet.length; i++) {
            int element = arrSuperSet[i];
            if (frequencyMap.containsKey(element)) {
                int frequency = frequencyMap.get(element);
                frequencyMap.put(element, frequency + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        // Print out the frequency of each element in the subset array
        for (int i = 0; i < arrSubSet.length; i++) {
            int frequency = frequencyMap.getOrDefault(arrSubSet[i], 0);
            System.out.println("Frequency of " + arrSubSet[i] + ": " + frequency);
        }

        input.close();
    }
}
