//biblioteca para poder utilizar o arrays.sort
import java.util.Arrays;

public class Aula7C{
    public static void main(String[] args) {

        //declarando uma constante
        final int tam=10;

        //declarando a variavel tam
        int[] numeros=new int[tam];

        //declarando o array do tipo inteiro com 5 posições
        int[] num={9,2,7,1,8,5,3,4,0,6};

        //origem, inicio da origem, destino, inicio destino e quantos elementos serão copiados de um array para outro.
        System.arraycopy(num, 0, numeros, 0, tam);

        //forma mais simples de usar o for com array (usado para ler elementos de um array)
        //você associa a variavel int com "n" e esse valor vai ficar no lugar de NUM
        for(int n:numeros){
            System.out.printf("%d - ", n);
        }
    }
}