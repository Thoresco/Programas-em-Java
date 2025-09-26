package ProgramasExtra;
    import java.util.Scanner;

public class CalculadorIMC {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é de: "+imc);

        double pesoIdeal = 24.9 * (altura * altura);
        System.out.println("Seu peso ideal seria aproximadamente: "+ pesoIdeal);

        if (imc < 18.5) {
            System.out.println("Você esta abaixo do peso!");
        }else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você esta com peso ideal!");
        }else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você esta com sobrepeso!");
        }else {
            System.out.println("Atualmente você esta classificado como obesidade!");
            
        }
        scanner.close();
        }


        
    }

