package godoy.arthur.maratonajava.dominio;

public class Testando {
    private String nome;
    private int idade;
    private double[] salarios;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }

    public void setSalarios(double [] salarios) {
        this.salarios = salarios;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade + " Anos de idade.");
        if (salarios == null){
            return;
        }
        for (double salarios : salarios){
            System.out.println(salarios);
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }
}



