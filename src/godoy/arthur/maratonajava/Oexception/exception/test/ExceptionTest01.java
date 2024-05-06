package godoy.arthur.maratonajava.Oexception.exception.test;

import godoy.arthur.maratonajava.Oexception.exception.domain.Leitor1;
import godoy.arthur.maratonajava.Oexception.exception.domain.Leitor2;

import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        readFiles();
    }

    public static void readFiles(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){


        } catch (IOException e){

        }
    }

}
