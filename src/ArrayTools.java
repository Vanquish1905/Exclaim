public class ArrayTools {

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




}
