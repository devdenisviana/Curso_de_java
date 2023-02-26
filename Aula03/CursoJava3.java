public class CursoJava3{
    public static void main(String[] args) {

        int nota=85;
        int faltas=10;
        int maxFaltas=5;
        int media=60;
        String res;

        res=(nota >= media ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);

        if(nota >= media && faltas <= maxFaltas){
        System.out.println("Aprovado");
       }else{
        System.out.println("Reprovado");
       }
       System.out.print("Fim do programa");
    }
}