/**
 * OBJETIVO:Construa um Algoritmo que, para um grupo de 50 valores inteiros, determine:
 * a) A soma dos números positivos;
 * b) A quantidade de valores negativos;
 * ENTRADA:50 valores
 * SAÍDA:
 * a) A soma dos números positivos;
 *  * b) A quantidade de valores negativos;
 */
void main() {
    Scanner sc = new Scanner(System.in);
    double soma = 0;
    double quantidadeNegativo = 0;
    for (int i = 1; i <= 5; i++) {
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        if (valor > 0){
            soma += valor;
        }else if (valor < 0){
            quantidadeNegativo += 1;
        }
    }
    System.out.println("SOMA: "+ soma);
    System.out.println("Quantidade negativos: "+ quantidadeNegativo);
}