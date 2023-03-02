//biblioteca para poder utilizar o arrays.sort
import java.util.Arrays;

public class Aula7B{
    public static void main(String[] args) {

        //declarando uma constante
        final int tam=10;

        //declarando a variavel tam
        int[] numeros=new int[tam];

        //arrays que vai definir quantas posições do array serão mostradas
        Arrays.fill(numeros,10);

        //declarando o array do tipo inteiro com 5 posições
        int[] num={9,2,7,1,8,5,3,4,0,6};

        //metodo para ordenar o array
        Arrays.sort(num);

        //forma mais simples de usar o for com array (usado para ler elementos de um array)
        //você associa a variavel int com "n" e esse valor vai ficar no lugar de NUM
        for(int n:numeros){
            System.out.printf("%d - ", n);
        }
    }
}