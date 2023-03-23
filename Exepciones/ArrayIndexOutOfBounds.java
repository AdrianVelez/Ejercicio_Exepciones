package Exepciones;

public class ArrayIndexOutOfBounds {

    int array[] = {1,2,3,4,5,6};

   public void recorreArray() {
       try{
           for (int i = 0; i < 9; i++) {
               System.out.println("Array: "+ array[i]);
           }
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("El valor noveno esta fuera de los limites del arreglo: " + e.getMessage());
           e.printStackTrace();
       }

    }
}
