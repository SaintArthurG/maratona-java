package godoy.arthur.maratonajava.Lclassesabstratas.domain;

public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
