package lesson_2;

public class Task7 {
    public static void UpdateArray(int array[]){
        for(int i=0; i<array.length; i++){
            if(array[i]<6){
                array[i]=array[i]*2;
            }
        }
    }
}
