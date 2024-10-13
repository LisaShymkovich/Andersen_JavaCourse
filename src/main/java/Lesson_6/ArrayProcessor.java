package Lesson_6;

public class ArrayProcessor {
    public static void checkArraySize(String [][]array) throws MyArraySizeException {
    if (array.length!=4){
            throw new MyArraySizeException("Wrong array size");
        }
    else if(array[0].length!=4){
        throw new MyArraySizeException("Wrong array size");
    }
    else{
        System.out.println("Good array size");
    }
    }

    public static void sumElements(String [][]array) throws MyArrayDataException{
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в данных: не удалось преобразовать элемент в строке " + i + ", столбце " + j);
                }
            }
        }
        System.out.println(sum);
    }
}
