package godoy.arthur.maratonajava.ZCalculadora.domain;

import java.util.Scanner;

public class Calculadora {
    Scanner input = new Scanner(System.in);
    public double number1, number2;
    double soma = number1 + number2;
    double subtração = number1 - number2;
    double divisao = number1 / number2;
    double multiplicação = number1 * number2;

    public double getSoma() {
        return soma;
    }

    public double getSubtração() {
        return subtração;
    }

    public double getDivisao() {
        return divisao;
    }

    public double getMultiplicação() {
        return multiplicação;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }
}
