package godoy.arthur.maratonajava.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }
}
