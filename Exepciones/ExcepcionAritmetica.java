package Exepciones;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class ExcepcionAritmetica {

    public int calculaOperacion(int numero,int numero2) throws ArithmeticException, IOException {
        try {
            int resultado=numero/numero2;
            return resultado;
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero..."+e.getMessage());
            e.printStackTrace();
//            OutputStream outputStream = new OutputStream() {
//                @Override
//                public void write(int b) throws IOException {
//                    System.out.println(b);
//                }
//            };
//            outputStream.write(5);
//            PrintStream print = new PrintStream(outputStream);

        }
        return 0;
    }
}
