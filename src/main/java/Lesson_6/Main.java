package Lesson_6;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "lisa", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println("Проверка на валидность размера двумерного массива: ");
            ArrayProcessor.checkArraySize(validArray);
        } catch (MyArraySizeException e) {
            System.err.println(e.getMessage());
        }



        try {
            System.out.println("\nПроверка на валидность размера двумерного массива: ");
            ArrayProcessor.checkArraySize(invalidSizeArray);
        } catch (MyArraySizeException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("\nСуммирование элементов матрицы: ");
            ArrayProcessor.sumElements(validArray);
        }
        catch (MyArrayDataException e){
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("\nСуммирование элементов матрицы: ");
            ArrayProcessor.sumElements(invalidDataArray);
        }
        catch (MyArrayDataException e){
            System.err.println(e.getMessage());
        }
    }
}