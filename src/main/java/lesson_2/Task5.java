package lesson_2;

public class Task5 {
    public static void ArrayConverter(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i]==0){
                array[i]=1;
            }
            else{
                array[i]=0;
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }

    }
}
