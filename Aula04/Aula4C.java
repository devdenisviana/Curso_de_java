import java.util.Scanner;

public class Aula4C{
    public static void main(String[] args) {
        //criação de um objeto da classe scanner e informando que ele irá receber dados do teclado
        Scanner scan = new Scanner(System.in);

        //criação e inicialização de variáveis
        int n1=0,n2=0,n3=0,n4=0,soma=0;
        //Declarando uma constante usando a palavra final
        final int MEDIA=60;
        String nome="", res="";

        System.out.print("Digite o nome do aluno: ");
        nome=scan.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1=scan.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2=scan.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3=scan.nextInt();
        System.out.print("Digite a quarta nota: ");
        n4=scan.nextInt();
        soma=n1+n2+n3+n4;
        if(soma >= MEDIA){
            res="aprovado";
        }else if(soma >=40){
            res="recuperacao";
        }else{
            res="reprovado";
        }
        System.out.printf("Aluno %s foi %s, com nota %d",nome,res,soma);
    }
}