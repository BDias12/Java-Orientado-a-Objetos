import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);



        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        OperacoesMatematicas objetoCalcula = new OperacoesMatematicas(num1, num2, num3);

        double soma = objetoCalcula.soma(num1, num2, num3);

        System.out.println("A soma e " + soma);

        double media = objetoCalcula.media(num1, num2,num3);

        System.out.println("A media e " + media);

        double subtracao = objetoCalcula.subtrai(num1, num2, num3);

        System.out.println("A subtracao e " + subtracao);

        double multiplicacao = objetoCalcula.multiplica(num1, num2, num3);

        System.out.println("A multiplicacao e " + multiplicacao);

        double maiorNumero = objetoCalcula.maior(num1, num2, num3);

        System.out.println("O maior numero e: " + maiorNumero);
    }
}