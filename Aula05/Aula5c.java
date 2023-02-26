//biblioteca para entrada de dados via teclado.
import java.util.Scanner;

public class Aula5c{
    public static void main(String[] args) {
        //definindo a entrada pelo teclado.
        Scanner scan=new Scanner(System.in);

        //do While

        int cont=0;
        do{
            System.out.println(cont + " Denis Viana cursos");
            cont++;
        }

        while(cont <= 0);
    }
}