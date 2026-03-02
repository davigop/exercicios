/**
 * OBJETIVO:Faça um algoritmo que leia um conjunto de dados numéricos (X) e imprima o
 * maior (Maximo) dentre eles. Admita que o valor 9999 é utilizado como sentinela.
 * Ex.: 1, 2, 3 => Maior=3
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    double maior = 0;
    System.out.println("Digite o número:(use 9999 para parar)");
    double numero = sc.nextDouble();
    while (numero != 9999){
        if (numero > maior){
            maior = numero;
        }
        numero = sc.nextDouble();
    }
    System.out.println(maior);
}