package godoy.arthur.maratonajava.Npolimorfismo.test;

import godoy.arthur.maratonajava.Npolimorfismo.domain.Computador;
import godoy.arthur.maratonajava.Npolimorfismo.domain.Tomate;
import godoy.arthur.maratonajava.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Inglês", 7);
        CalculadoraImposto.calcularImpostoTomate(tomate);
        CalculadoraImposto.calcularImpostoComputador(computador);
    }
}
