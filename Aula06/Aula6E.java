import java.util.Scanner;
public class Aula6E{
    public static void main(String[] args) {
        //criação do array - local de memoria onde são armazenadas diversas variaveis do msm tipo.

       final int tam=5;

       char[] gabarito={'a','a','d','b','c'};
       char[] respostas=new char[tam];
       int nota=0;
       Scanner scan=new Scanner(System.in);

      
       for(int i=0;i<tam;i++){
            System.out.printf("Informe a resposta %d: ",i);
            respostas[i]=scan.nextLine().charAt(0);
       }
       for(int i=0;i<tam;i++){
        if(respostas[i]==gabarito[i]){
            nota++;
        }
       }
       System.out.printf("%nNota do aluno:%d ",nota);
    }
}