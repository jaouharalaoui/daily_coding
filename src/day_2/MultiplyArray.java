package day_2;

public class MultiplyArray {
    private static int[] multiplyArray(int[] input) {
        int length = input.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int output[] = new int[length];
        int temp = 1;
        for (int i = 0; i < length; i++) {
            left[i] = temp;
            temp *= input[i];
        }

        temp = 1;
        for (int i = length - 1; i >= 0; i--) {
            right[i] = temp;
            temp *= input[i];
        }

        for (int i = 0; i < length; i++) {
            output[i] = right[i] * left[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int test[] = new int[]{1, 2, 3, 4, 5};

        test = multiplyArray(test);

        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }
}
