public class Aula7{
    public static void main(String[] args) {
        //declarando o array do tipo inteiro com 5 posições
        int[] num={10,20,30,40,50};

        //criando o for iniciando com o contador, depois colocando a condição e depois incrementando
        for(int i=0;i<num.length;i++){

        //fazendo a impressão do resultado
        System.out.printf("%d - ",num[i]);
        }

        //forma mais simples de usar o for com array (usado para ler elementos de um array)
        //você associa a variavel int com "n" e esse valor vai ficar no lugar de NUM
        for(int n:num){
            System.out.printf("%n%d - ", n);
        }
    }
}