package lesson_7;

public class Main {
    public static void main(String[] args) {

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };
        
        AppData appData = new AppData(header, data);
        
        appData.save("data.csv");

        AppData loadedData = AppData.load("data.csv");

        if (loadedData != null) {
            loadedData.print();
        }
    }
}