package ListaJava;

import java.util.Scanner;

public class Pousada07 {

    public static void main(String[] args) {

        var i = 0;
        var diaria = 40;
        var dias = 0;
        var valorDiaria = 0;
        var contaCliente = 0;
        var nomeCliente = " ";
        var totalArrecadado= 0;

        while (i < 5) {
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Informe seu nome: ");
            nomeCliente = leitor1.nextLine();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Informe quantos dias você irá ficar hospedado(a): ");
            dias = leitor2.nextInt();

            if (dias < 10) {
                valorDiaria = dias * 15;
            } else if (dias >= 10) {
                valorDiaria = dias * 8;
            }

            contaCliente = diaria + valorDiaria;
            totalArrecadado += contaCliente;
            System.out.println("A conta do(a) " + nomeCliente + " ficou no valor de: " + contaCliente);
            i++;
        }

        System.out.println("O valor total arrecadado foi: " + totalArrecadado);
    }


}
