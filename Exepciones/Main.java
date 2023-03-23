package Exepciones;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ExcepcionAritmetica aritmetica = new ExcepcionAritmetica();
        System.out.println(aritmetica.calculaOperacion(7, 0));


        ArrayIndexOutOfBounds array = new ArrayIndexOutOfBounds();
        array.recorreArray();

        FicheroNoEncontrado fichero = new FicheroNoEncontrado();
        fichero.abreArchivo();
    }
}