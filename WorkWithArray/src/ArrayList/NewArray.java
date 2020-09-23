package ArrayList;

public class NewArray {
   private static int[] array = {23, 45, 87, 4, 7, 87, 55, 34, 123, 15, 6};
    public static void main(String[] args) {

        array[0] = 1;
        System.out.println(array[0]);
        System.out.println(array.length);
        printMaximumElement(array);
    }

    static void printMaximumElement(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
                replacements++;

            }
            comparisons++;
        }


        System.out.println("Max element: " + max);
        System.out.println("Max element index : " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);

    }
}



