import java.util.Scanner;
public class Aula6F{
    public static void main(String[] args) {
       int x=10;
       int y=10;
       int z=10;

       if(x<10){
        x++;
        if(y<10)
        x++;
        else{
            x--;
            if(z<10)
            x--;
        }
        System.out.printf("%d %d %d",x,y,z);
       }
    }
}