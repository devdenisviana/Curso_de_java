import java.util.Scanner;
public class Aula6B{
    public static void main(String[] args) {
        //criação do array - local de memoria onde são armazenadas diversas variaveis do msm tipo.

        int[] num=new int[5];
        int[] numeros={10,20,30,40,50};

        num[0]=10;
        num[1]=5;
        num[2]=15;
        num[3]=0;
        num[4]=8;

        for(int i=0; i<5; i++){
            System.out.printf("%d - ",numeros[i]);
            
            System.out.printf("%d - ",num[i]);
        }

    }
}