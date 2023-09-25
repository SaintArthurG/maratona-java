package godoy.arthur.maratonajava.Lclassesabstratas.test;

import godoy.arthur.maratonajava.Lclassesabstratas.domain.Dev;
import godoy.arthur.maratonajava.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 30, 4000);
        Dev dev = new Dev("Arthur", 21, 4500);
        System.out.println(gerente);
        System.out.println(dev);
    }
}
