/**
 * OBJETIVO:Crie um programa que peça 10 números inteiros e apresente: a média, o maior
 * e o menor.
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    System.out.println("Digite 10 números: (um por vez)");
    double total = 0;
    double maior =0;
    double menor= 0;
    for (int i = 1; i <= 10 ; i++) {
        System.out.println("Número " + i + ": ");
        double numero = new Scanner(System.in).nextDouble();
        total += numero;
        if (i == 1){
            maior = numero;
            menor = numero;
        }else {
            if (numero < menor){
                menor = numero;
            }
            if (numero > maior){
                maior = numero;
            }
        }
    }
    System.out.println("Média: " + (total/10));
    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
}