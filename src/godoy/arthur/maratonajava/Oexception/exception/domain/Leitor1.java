package godoy.arthur.maratonajava.Oexception.exception.domain;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;

public class Leitor1 implements Closeable {


    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
    }

}
