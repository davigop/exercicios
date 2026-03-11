/**
 * OBJETIVO:Construa um algoritmo que, para a progressão geométrica 3; 9; 27; 81; ...;
 * 6561, determine a soma de seus termos. Construa o algoritmo de maneira a não
 * utilizar a fórmula de soma dos termos. Faça com que o computador gere cada
 * um dos termos a ser somado.
 * Ex.: 3; 9; 27; 81; 243; 729; 2187; 6561 => 9840
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    int termo = 3;
    int soma = 0;
    while (termo <= 6561){
        soma += termo;
        termo *= 3;
    }
    System.out.println("Soma: " + soma);
}