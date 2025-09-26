package ProgramasExtra;

import java.util.Scanner;

public class ContaAguaSabesp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a leitura anterior do hidrômetro (m³): ");
        int leituraAnterior = sc.nextInt();

        System.out.print("Digite a leitura atual do hidrômetro (m³): ");
        int leituraAtual = sc.nextInt();

        int consumo = leituraAtual - leituraAnterior;
        double valorConta = 0.0;

        if (consumo <= 0) {
            System.out.println("Erro: a leitura atual deve ser maior que a anterior.");
        } else {
            if (consumo <= 10) {
                valorConta = 51.901; // tarifa mínima
            } else if (consumo <= 20) {
                valorConta = 51.901 + (consumo - 10) * 7.114; //11 a 20 m³ → cada m³ extra custa 7,114.
            } else if (consumo <= 50) {
                valorConta = 51.901 + (10 * 7.114) + (consumo - 20) * 11.934; //21 a 50 m³ → cada m³ extra custa 11,934.
            } else {
                valorConta = 51.901 + (10 * 7.114) + (30 * 11.934) + (consumo - 50) * 19.529; //Acima de 50 m³ → cada m³ extra custa 19,529.
            }

            // Saída
            System.out.println("\n---- Conta de Água SABESP ----");
            System.out.println("Consumo: " + consumo + " m³");
            System.out.printf("Valor a pagar: R$ %.2f\n", valorConta);
        }

        sc.close();
    }
}

