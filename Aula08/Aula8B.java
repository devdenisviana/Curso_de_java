// uso de matrizes
import java.security.SecureRandom;
public class Aula8B{
    public static void main(String[] args){
        
        final int linhas=3;
        final int colunas=5;
        int[][] numeros=new int[linhas][colunas];

        for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                numeros[l][c]=new SecureRandom().nextInt(100);
            }
        }
//usando for para arrays
        for(int[] n:numeros)        {
            for(int v:n){
                System.out.printf("%2d | ",v);
            }
            System.out.printf("%n");
        }
    }
}