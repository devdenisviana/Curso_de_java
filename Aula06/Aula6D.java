import java.util.Scanner;
public class Aula6D{
    public static void main(String[] args) {
        //criação do array - local de memoria onde são armazenadas diversas variaveis do msm tipo.

       final int tam=5;

       char[] gabarito={'a','a','d','b','c'};
       char[] respostas=new char[tam];
       int nota=0;

       respostas[0]='a';respostas[1]='b';respostas[2]='c';respostas[3]='b';respostas[4]='c';

       for(int i=0;i<tam;i++){
        if(respostas[i]==gabarito[i]){
            nota++;
        }
       }
       System.out.printf("Nota do aluno:%d ",nota);
    }
}