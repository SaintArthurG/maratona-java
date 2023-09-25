package academy.devdojo.maratonajava.introducao;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LegendZelda {
    public static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoador = "Ainda nao tenho condiçoes, mas vou ter";
        String resultado;
        if(salario > 5000){
            resultado = mensagemDoar;
        } else{
            resultado = mensagemNaoDoador;
        }
        System.out.println(resultado);
        Scanner input = new Scanner(System.in);
        int number1,
            number2,
            sum;
        System.out.println("Primeiro numero");
        number1 = input.nextInt();
        System.out.print("Coloque o segundo numero");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.println(sum);


    }
}


