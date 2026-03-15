/**
 * OBJETIVO:
 * Faça um algoritmo que leia o número de andares de um prédio e, a seguir, para
 * cada andar do prédio, leia o número de pessoas que entraram e saíram do
 * elevador.
 * Considere que o elevador está vazio e está subindo, os dados se referem a
 * apenas uma “subida” do elevador e que o número de pessoas dentro do
 * elevador sempre será maior ou igual a 0.
 * Se o número de pessoas, após a entrada e saída for maior que 15, deve ser
 * mostrada a mensagem “EXCESSO DE PASSAGEIROS . DEVEM SAIR" em
 * seguida, o número de pessoas que devem sair do elevador, de modo que seja
 * obedecido o limite de 15 passageiros.
 * Após a entrada de pessoas no último andar o algoritmo deve mostrar quantas
 * pessoas irão descer.
 * ENTRADA:NUMERO DE ANDARES, numero que entrou e saiu do elevador
 * SAÍDA:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    int totalpessoas = 0;
    int contSair = 0;
    System.out.println("Qual número de andares do prédio? ");
    int totalAndar = sc.nextInt();
    while (true){
        contador++;
        System.out.println("Andar " + contador + ": ");

        System.out.println("Quantas pessoas entraram?");
        int entraram = sc.nextInt();
        System.out.println("Quantas pessoas sairam?");
        int sairam = sc.nextInt();
        entraram -= sairam;
        totalpessoas += entraram;
        if (totalpessoas < 0){
            totalpessoas = 0;
        }
        if (totalpessoas > 15){
            for (int i = 16; i <= totalpessoas ; i++) {
                contSair++;
            }
            System.out.println("EXCESSO DE PASSAGEIROS\n"+
                    contSair + " passageiros devem sair");
        }
        if (contador == totalAndar){
            System.out.println("Vão descer: " + sairam);
            break;
        }
    }
    System.out.println("Total de pessoas: " + totalpessoas);
}