/**
 * OBJETIVO:Faça um algoritmo que leia um conjunto de números (X) e imprima a
 * quantidade de números pares (QPares) e a quantidade de números impares
 * (QImpares) lidos. Admita que o valor 9999 é utilizado como sentinela para fim de
 * leitura.
 * Ex.: 1,2,3,4,5 => Pares=2 Impares=3
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    double par = 0;
    double impar = 0;
    System.out.println("Digite o valor:(use 9999 para parar)");
    double numero = new Scanner(System.in).nextDouble();
    while ( numero != 9999){
        if (numero % 2 == 0){
            par++;
        }else {
            if (numero % 2 != 0){
                impar++;
            }
        }
        numero = new Scanner(System.in).nextDouble();
    }
    System.out.println("Par: " + (int)par);
    System.out.println("Ímpar: " + (int)impar);

}