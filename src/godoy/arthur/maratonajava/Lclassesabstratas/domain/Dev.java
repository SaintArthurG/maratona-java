package godoy.arthur.maratonajava.Lclassesabstratas.domain;

public class Dev extends Funcionario {
    public Dev(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
