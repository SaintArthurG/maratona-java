package godoy.arthur.maratonajava.Associacao.Test;

import godoy.arthur.maratonajava.Associacao.dominio.Escola;
import godoy.arthur.maratonajava.Associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main (String[] args){
        Professor professor1 = new Professor("Jiraya  S");
        Professor professor2 = new Professor("Kakashi S");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));

    }
}
