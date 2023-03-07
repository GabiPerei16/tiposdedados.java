import java.util.Scanner;
public class Tarefa_03GabrielaPereira {
    

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int metros, centimetros;

        System.out.println("Informe o valor em metros: ");
        metros = input.nextInt();

        centimetros = metros * 100;

        {
            System.out.print("Você converteu para centimetros " + centimetros + "\n"); 
        } 


     }

}
