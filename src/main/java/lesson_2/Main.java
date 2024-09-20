package lesson_2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание1:"+ Task1.checkSum(10,2));
        System.out.print("Задание2:" );
        Task2.printPosOrNeg(10);
        System.out.println("Задание3:"+ Task3.NegativeChecker(-9));
        System.out.println("Задание4:" );
        Task4.StringPrinter("Lisa",4);
        System.out.print("Задание5:" );
        int array[] = {0,1,0,1,0,0};
        Task5.ArrayConverter(array);
        System.out.println();
        System.out.print("Задание6:" );
        int[] array100 = new int[100];
        Task6.fillArray(array100);
        for (int i = 0; i < array100.length; i++) {
            System.out.print(array100[i] + " ");
        }
        System.out.println();
        System.out.print("Задание7:" );
        int array2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Task7.UpdateArray(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.print("Задание8:" );
        int[][] diagonalArray = new int[5][5];
        Task8.fillDiagonal(diagonalArray);
        System.out.println("Массив с диагональными единицами: ");
        for (int i = 0; i < diagonalArray.length; i++) {
            for (int j = 0; j < diagonalArray[i].length; j++) {
                System.out.print(diagonalArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}