package JavaQuestions.Array;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 4, 4, 5};

        int n = array.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (array[i] == array[j]) {

                    for (int k = j; k < n - 1; k++) {
                        array[k] = array[k + 1];
                    }

                    // n--;
                    // j--;
                }
            }
        }

        System.out.println("After removing duplicates:");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}