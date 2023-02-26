import java.util.Scanner;

public class Aula4B{
    public static void main(String[] args) {
        //criação de um objeto da classe scanner e informando que ele irá receber dados do teclado
        Scanner scan = new Scanner(System.in);

        //criação e inicialização de variáveis
        int n1=0,n2=0,res=0;
        String nome="";

        System.out.println("Digite seu nome: ");
        nome=scan.nextLine();

        System.out.println("Digite um numeral: ");
        n1=scan.nextInt();

        System.out.println("Digite outro numeral: ");
        n2=scan.nextInt();
        
        res=n1+n2;

        System.out.printf("%s a soma de %d com %d e igual a %d",nome,n1,n2,res);

    }
}