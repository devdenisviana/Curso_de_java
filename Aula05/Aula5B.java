//biblioteca para entrada de dados via teclado.
import java.util.Scanner;

public class Aula5B{
    public static void main(String[] args) {
        //definindo a entrada pelo teclado.
        Scanner scan=new Scanner(System.in);

        //While

        int cont=0;

        while(cont < 5){
            System.out.println(cont +" Denis Viana Cursos");
            cont++;
        }
        System.out.println("Fim do programa");
    }
}