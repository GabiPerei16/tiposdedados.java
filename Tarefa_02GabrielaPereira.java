import java.util.Scanner;
public class Tarefa_02GabrielaPereira {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Double peso, altura, imc;

        System.out.println("Informe seu peso");
        peso = input.nextDouble();

        System.out.println("Informe sua altura");
        altura = input.nextDouble();

        imc = peso / (altura * altura );

        if ( imc <= 18.5)
        {
            System.out.print(" Você está abaixo do peso " + "\n");
        }
        else if ( peso >= 18.5 && peso <= 24.9)
        {

        }



   }
}
