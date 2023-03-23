package Exepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FicheroNoEncontrado {
    File file = new File("C:\\Users\\adria\\IdeaProjects\\EjercicioDeExepciones\\src\\Exepciones\\HelloWorld.txt");

    public void abreArchivo(){
        FileInputStream fileInputStream;

        try {
          fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo: "+ e.getMessage());
            e.printStackTrace();
        }
    }







}
