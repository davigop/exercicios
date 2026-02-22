/**
 * OBJETIVO:Elaborar um algoritmo para imprimir o número de dias de um dado mês e ano.
 * Anos bissextos deverão ser tratados convenientemente.
 * Dica: Anos bissextos são múltiplos de 4 e não são múltiplos de 100, exceto os
 * anos múltiplos de 400, que também são bissextos.
 * ENTRADA:mes e ano
 * SAÍDA:dias totais
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual mês e ano?(MM/AAAA)");
    int data = sc.nextInt();
    int mes = data /10000;
    int ano = data % 10000;
    //switch
    switch (mes){
        case 1,3,5,7,8,10,12:
            System.out.println("31 dias");
            break;
        case 4,6,9,11:
            System.out.println("30 dias");
            break;
        case 2:
            if ((ano % 4 ==0 && ano % 100 != 0)|| ano % 400 == 0){
                System.out.println("29 dias");
            }else{
                    System.out.println("28 dias");
                }
         break;
            default:
            System.out.println("Mês não existente");
            break;
    }
}
