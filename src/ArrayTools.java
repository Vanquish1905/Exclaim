public class ArrayTools {
    static int[] ar = {1,5,1,20,140};

    public static int head(int[] array){
        return array[0];
    }
    public static int last(int[] array){
        return array[array.length-1];
    }
    public static String arrayToString(int[] array){
        String arrays = "";
        for (int number : array){
            arrays = arrays + number +", ";
        }

        System.out.println(arrays);
        return null;
    }

    public static void main(String[] args) {
        arrayToString(ar);
    }




}
