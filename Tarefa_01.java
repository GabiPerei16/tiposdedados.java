import java.util.Scanner;
public class Tarefa_01 {
    
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    double SalarioAtual, NovoSalario;

    System.out.println("Informe um salario ");
    SalarioAtual = input.nextDouble();


    if (SalarioAtual >= 1.000 && SalarioAtual<= 2.000);
    {
        NovoSalario = SalarioAtual * 1.15;
        System.out.print("Aqui esta seu novo salario:"  + "\n");
    }
        else if (SalarioAtual >= 2.000 && SalarioAtual<= 3.000){

        NovoSalario = SalarioAtual * 1.10;
        System.out.print("Aqui esta seu novo salario:"  \n");
    }


}
