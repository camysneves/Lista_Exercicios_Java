package ListaJava;

import java.util.Scanner;

public class EstruturaSequencial04 {

    public static void main(String[] args) {

        int litroGasolina = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos litros foram abastecidos: ");
        litroGasolina = leitor.nextInt();


        var valorGasolina = litroGasolina * 2.5;
        var valorRefrigerante = 6;

        var valorTotal = valorGasolina + valorRefrigerante;

        System.out.println("O valor foi R$:" + valorTotal);

    }
}
