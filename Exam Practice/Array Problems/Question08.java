/*
Remove Duplicate Elements
Without using HashSet.
Store only unique values.
*/

public class Question08 {
    public static void main(String[]args){
        int[] arr = {4, 2, 4, 7, 2, 9, 9};
        int[] unique = new int[arr.length];
        int uniqueCount = 0;

        // Traverse the original array
        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // Check if the current element already exists in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the unique array
            if (!isDuplicate) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        // Display unique elements
        System.out.println("Unique elements:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
