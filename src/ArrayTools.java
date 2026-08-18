public class ArrayTools {
    private static float[] arg = {3.544f, 5.544f, 6.544f, 6.544f};
    private static int[] argi = {3, 5, 6, 6};
    private static String[] args = {"a","b","c","d"};
    public static int head(int[] array){
        return array[0];
    }
    public static int last(int[] array){
        return array[array.length-1];
    }
    public static String arrayToString(int[] array){
        String arrays = "[";
        for (int number : array){
            arrays = arrays + number +", ";
        }
        arrays = arrays +"]";
        return arrays;
    }
    public static String arrayToString(char[] array){
        String arrays = "[";
        for (char number : array){
            arrays = arrays + number +", ";
        }
        arrays = arrays +"]";
        return arrays;
    }
    public static String arrayToString(float[] array){
        String arrays = "[";
        for (float number : array){
            arrays = arrays + number +", ";
        }
        arrays = arrays +"]";
        System.out.println(arrays);
        return arrays;
    }
    public static int[] copy(int[] array){
        int[] arrays = new int[array.length];
        for(int i=0; i<array.length;i++){
            arrays[i] = array[i];
        }
        return arrays;
    }
    public static int[] copy(int[] array, int start, int end){
        int[] arrays = new int[end];
        for(int i=start; i<end;i++){
            arrays[i] = array[i];
        }
        System.out.println(arrayToString(arrays));
        return arrays;
    }


    public static void main(String[] args) {
        copy(argi,1,4);
    }


}
