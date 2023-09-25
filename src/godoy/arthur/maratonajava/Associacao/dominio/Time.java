package godoy.arthur.maratonajava.Associacao.dominio;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade abaixo: ");
        int idade = teclado.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = teclado.next().charAt(0);
        System.out.println("---");
        System.out.println("Nome: " + nome + "%nIdade: " + idade +  "%nSexo: " + sexo);

    }
}
