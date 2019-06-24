import java.util.Arrays;
import java.util.Scanner;

class ArrayChallenge {
    private Scanner scanner = new Scanner(System.in);

    void run(int capacity) {
        int[] array = getIntegers(capacity);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }

    private int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values:\r");
        int[] array = new int[capacity];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    // solution (copy array) checks if next number > current & changes order
    private int[] sortIntegers(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < copiedArray.length - 1; i++) {
                if (copiedArray[i] < copiedArray[i + 1]) {
                    temp = copiedArray[i];
                    copiedArray[i] = copiedArray[i + 1];
                    copiedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return copiedArray;
    }

    // solution (same array) multiply by -1, sort & again multiply by -1
    private int[] sortInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + - 1;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + - 1;
        }
        return array;
    }
}
