package ListaJava;

import java.util.Scanner;

public class CreditoFuncionarios05 {

    public static void main(String[] args) {

        var salario = 0;
        var valorPrestacao = 0;
        var valorMaxPrest = 0;

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        salario = leitor1.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Qual valor de parcela você gostaria? ");
        valorPrestacao = leitor2.nextInt();


        valorMaxPrest = ( 30 * salario) / 100;

        if(valorPrestacao < valorMaxPrest) {
            System.out.println("Parabéns! Seu empréstimo foi aceito.");
        } else {
            System.out.println("Infelizmente seu crédito não foi aprovado.");
        }

    }
}
