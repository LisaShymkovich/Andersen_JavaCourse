package lesson_2;

public class Task8 {
    public static void fillDiagonal (int array[][]){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            array[i][array.length-i-1] = 1;
        }
    }
}
