package godoy.arthur.maratonajava.Herança.domain;

import javax.management.remote.SubjectDelegationPermission;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime2(){

        System.out.println(this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
