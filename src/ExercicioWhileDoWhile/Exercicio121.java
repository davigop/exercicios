/**
 * OBJETIVO:Faça um algoritmo que leia um número inteiro N, calcule e mostre o maior
 * quadrado menor ou igual a N.
 * Por exemplo, se N for igual a 38, o Menor quadrado é 36 (quadrado de 6).
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    int contador = 1;
    int fatorial = 0;
    System.out.println("Digite o valor de N: ");
    int valorN = new Scanner(System.in).nextInt();
    while (fatorial <= valorN){
        fatorial = contador * contador;
        System.out.println("While : " + fatorial);
        System.out.println(contador);
        contador++;
    }
    System.out.println("Maior quadrado: " + fatorial);
    System.out.println("Quadrado de: " + (contador - 1));

}