package godoy.arthur.maratonajava.Herança.Test;

import godoy.arthur.maratonajava.Herança.domain.Endereco;
import godoy.arthur.maratonajava.Herança.domain.Funcionario;
import godoy.arthur.maratonajava.Herança.domain.Pessoa;

public class HerencaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("722000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Arthur");
        pessoa.setCpf("05777535178");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriel");
        funcionario.setCpf("05777535178");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);
        funcionario.imprime();
        System.out.println("__________________");
        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2, 3);
        String h = cde.substring(1, 2);
        System.out.println();


    }
}
