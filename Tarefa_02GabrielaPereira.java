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
        else if ( imc >= 18.5 && imc <= 24.9)
        {
            System.out.print("Peso Normal" + "\n");
        }
        else if ( imc >= 25.0 && imc <= 29.9)
        {
            System.out.print("Sobrepeso" + "\n");
        }
        else if ( imc >= 30.0 && imc <= 34.9)
        {
            System.out.print("Você está em obesidade grau 1 !!!" + "\n");
        }
        else if ( imc >= 35.0 && imc <= 39.9)
        {
            System.out.print("Você está em obesidade grau 2 !!!" + "\n");  
        }
        else if ( imc > 40.0)
        {
            System.out.print("Você está em obesidade grau 3!!!" + "\n"); 
        }




   }
}
