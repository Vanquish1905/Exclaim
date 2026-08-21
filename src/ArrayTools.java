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
        int[] arrays = new int[end-start];
        if (start<end && end<=array.length){
            for(int i=start; i<end;i++){
                arrays[i-start] = array[i];
            }
        }
        return arrays;
    }
    public static int[] addSlot(int[] array){
        int[] arrays = new int[array.length+1];
        for(int i=0; i<array.length;i++){
            arrays[i] = array[i];
        }
        return arrays;

    }
    public static int[] addSlots(int[] array, int amount){
        int[] arrays = new int[array.length+amount];
        for(int i=0; i<array.length;i++){
            arrays[i] = array[i];
        }
        return arrays;
    }
    public static int[] append(int[] array, int value){
        int[] arrays = new int[array.length+1];
        for(int i=0; i<array.length;i++){
            arrays[i] = array[i];
        }
        arrays[arrays.length-1]=value;
        return arrays;
    }
    public static int[] addToAll(int[] array, int value){
        for(int i=0; i<array.length;i++){
            array[i] = array[i] + value;
        }
        System.out.println(arrayToString(array));
        return array;
    }
    public static float[] swap(float[] array, int i, int j){
        float temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    public static char[] leftShift(char[] array){
        if (array.length>0){
            char index0 = array[0];
            for(int i=0; i<array.length-1;i++){
                char temp = array[i+1];
                array[i] = temp;
            }
            array[array.length-1] = index0;
        }
        return array;
    }


}
