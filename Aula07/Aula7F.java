import java.util.Arrays;

public class Aula7F{
    public static void main(String[] args) {

        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros=new int[tam];
        int p=3;
        int pos;
        
        Arrays.sort(num);
        pos=Arrays.binarySearch(num, p);
           System.out.printf("O elemento %d esta no array? %s",p, pos > 0 ? "Sim" : "Nao");
        }
    }
