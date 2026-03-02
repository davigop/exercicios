/**
 * OBJETIVO:Faça um algoritmo que leia um conjunto de números (X) e imprima sua soma
 * (Soma) e sua média (Media). Admita que o valor 9999 é utilizado como sentinela
 * para fim de leitura.
 * Ex.: 1, 2, 3 => Soma=6 Media=2
 * ENTRADA:numero
 * SAÍDA:soma e média;
 */
void main() {
    double soma = 0;
    double contador = 0;
    System.out.println("Digite o número: (use o número 9999 ou acima de 9999 para parar.)");
    double numero = new Scanner(System.in).nextDouble();
    while (numero != 9999){
        soma += numero;
        contador++;
        numero = new Scanner(System.in).nextDouble();
    }
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + soma / contador);

}