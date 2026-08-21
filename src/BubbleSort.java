public class BubbleSort {

    public static String arrayToString(int[] array){
        String arrays = "[";
        for (int number : array){
            arrays = arrays + number +", ";
        }
        arrays = arrays +"]";
        return arrays;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int[] runOneCycle(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
            }
        }
        return array;
    }
    public static int[] runNCycles(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            runOneCycle(array);
        }
        return array;
    }
    public static boolean isSorted(int[] array){
        boolean sorted=true;
        for(int i=0; i < array.length-1; i++){
            if (array[i]<array[i+1] || array[i]==array[i+1]){
                sorted=true;
            }else {
                return false;
            }
        }
        if (sorted){
            return true;
        }
        return false;
    }
    public static int[] sort(int[] array){
        while (!isSorted(array)){
            runOneCycle(array);
        }
        return array;
    }
}
