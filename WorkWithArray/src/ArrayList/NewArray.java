package ArrayList;

public class NewArray {
    public static void main(String[] args) {
        int [] array = {23,45,87,4,7,87,55,34,123,15,6};
        int [] array2 = {77,95,7,4,34,66,3,38,41,66,9,16,5,2,86};
        array[0] = 1;
        System.out.println(array[0]);
        System.out.println(array.length);
        System.out.println(array2.length);
        printMaximumElement(array);
        printMaximumElement(array2);
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
