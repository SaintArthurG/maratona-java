package projetinn;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numero 1:");
        int num1 = scanner.nextInt();
        System.out.print("numero 2:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        double div = num1 / num2;
        int sub = num1 - num2;
        int mut = num1 * num2;
        System.out.println("Você deseja somar (+), subtrair (-), dividir (/) ou multiplicar (*)?");
        String resp = scanner.next();
        switch (resp) {
            case "+":
                System.out.println(sum);
                break;
            case "-":
                System.out.println(sub);
                break;
            case "/":
                System.out.println(div);
                break;
            case "*":
                System.out.println(mut);
                break;
            default:
                System.out.println("buguei");
        }
        System.out.println("soma:" + sum);
        System.out.println("subtração:" + sub);
        System.out.println("divisão:" + div);
        System.out.println("multiplicação:" + mut);
        for (int i = 1; i <= 100; i++){
            System.out.println(num1 + "*" + i + " = " + (num1 * i));
        }

    }
    private static int nome;


}
