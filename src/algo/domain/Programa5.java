package algo.domain;

public class Programa5 {
    public static void main(String[] args) {
        char sexo = 'M';
        double salario = 2999.00;
        boolean maiorDe20 = true;
        int anoNascimento = 2001;
        System.out.println("\nSexo: " + sexo + "\nSalario: " + salario + "\nMaior de 20 anos?: " + maiorDe20 + "\nAno de nasicmento: " + anoNascimento);
        // interrogação ? = TRUE
        // dois pontos : = FALSE
        System.out.println(salario >= 3000.00 ? "rico" : "pobre");
        int mes = 4;
        int diasMes = mes == 12 ? 31 : 30;
        System.out.println(diasMes);
        int numero = 13;
        System.out.println(numero % 2 == 0 ? "par" : "impar");
        int horas = 19;
        System.out.println(horas <= 12 ? "bom dia" : horas <= 18 ? "boa tarde" : "boa noite");
        switch (mes) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("fev");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("abr");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("jun");
                break;
            default:
                System.out.println("mês invalido");

        }

    }
}
