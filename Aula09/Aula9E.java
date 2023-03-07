public class Aula9E{
    public static void main(String[] args){
        
       msg("Denis Viana Cursos",1);
       System.out.println(soma2(10,20));
       System.out.println(soma(1,5,10,3));
       System.out.println(soma(1.5,10.4,3));
}

    public static int soma(int... numeros){
        int res=0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }

    public static double soma(double... numeros){
        double res=0.0;
        for(double n:numeros){
            res+=n;
        }
        return res;
    }

    public static int soma2(int n1, int n2){
        int res=n1+n2;
        return res;
    }

    public static void msg(String m, int l){
        for(int i=0;i<l;i++){
            System.out.println(m);
        }
    }
}