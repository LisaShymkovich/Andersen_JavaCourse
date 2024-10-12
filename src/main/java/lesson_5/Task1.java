package lesson_5;

public class Task1 {
    public static <T> void arraySwapper(T[] array, int index1, int index2){
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices or array is null.");
        }
        else{
            T temp=array[index2];
            array[index2] = array[index1];
            array[index1] = temp;
        }

    }
}
