import java.util.Scanner;
public class NomeIdade {
    

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int idade;
        String Nome;

        System.out.println("Informe um nome");
        Nome = input.next();


        System.out.println("Informe uma idade ");
        idade = input.nextInt();

        if (idade >= 0 && idade<= 12)
        {
                System.out.print("A faixa etaria da criança se encontra entre 0 e 12 anos \n");
    
        } else if (idade >= 13 && idade<= 17) {
            System.out.print("A faixa etaria da criança se encontra entre 13 e 17 anos \n");
        

        } else if (idade >= 13 && idade<= 17) {
            System.out.print("A faixa etaria do adolescente se encontra entre 13 e 17 anos \n");

        }  else if (idade >= 18 && idade<= 59) {
            System.out.print("A faixa etaria do adulto se encontra entre 18 e 59 anos \n"); 

        } else if (idade >=60) {
            System.out.print("60 anos ou mais \n"); 

        }
    }
}
