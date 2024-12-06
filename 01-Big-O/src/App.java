public class App {
    public static void main(String[] args) throws Exception {
        reverseArray(new int[]{1,2,3,4,5,6,7});
        printUnorderedPairs(new int[]{1,2,3,4,5,6,7});
    }


    /**
     * Complejidad Temporal O(N)
     */
    static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int reversePosition = array.length - 1 - i;
            int tmpVal = array[i];
            array[i] = array[reversePosition];
            array[reversePosition] = tmpVal;
        }
    }

    /**
     * Complejidad cuadrática O(N^2)
     */
    static void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(i + " " + j);
            }
        }
    }


    /**
     * Complejidad temporal lineal O(b)
     */
    static int product(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result+=a;
        }

        return result;
    }

    /**
     * Complejidad cuadrática O(N^2)
     */
    static int[] copyArray(int[] array) {
        int[] copy = new int[0];
        for (int val : array) {
            copy = appendToNew(copy, val);
        }

        return copy;
    }

    private static  int[] appendToNew(int[] array, int val) {
        int[] bigger = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];
        }

        bigger[bigger.length - 1] = val;
        return bigger;
    }

    /**
     * Complejidad O(A * B)
     */
    static void printPairsTwoArrays(int[] arrayA, int[] arrayB) {
        for (int valA : arrayA) {
            for (int valB : arrayB) {
                System.out.println(valA + " " + valB);
            }
        }
    }

    /**
     * Complejidad Logarítmica O(log val)
     */
    int intPowerOfTwo(int val) {
        int result = 0;

        while (val > 1) {
            result++;
            val /= 2;
        }

        return result;
    }
}