import java.util.Scanner;
public class NumeroInteiro {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Informe o valor do numero : ");
        numero = input.nextInt();

       

        if (numero > 0 )
        {
            System.out.print("o numero é positivo \n");

        } else if (numero < 0) {
            System.out.print("O numero é negativo \n");

        } else if (numero == 0) {
            System.out.print("O numero é 0 \n");

       }
    }
}
