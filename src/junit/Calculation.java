package junit;

public class Calculation {

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];

        }
        return max;

    }
}
