/**
 * OBJETIVO:Escreva um algoritmo que leia um número n (número de termos de uma
 * progressão aritmética), a1 (o primeiro termo da progressão) e r (a razão da
 * progressão) e escreva os n termos desta progressão, bem como a soma dos
 * elementos.
 * ENTRADA:valorN, a1 e razao
 * SAÍDA:termos da progressão e soma
 */
void main() {
    Scanner sc = new Scanner(System.in);
    double soma = 0;
    int contador = 0;
    double termos = 0;
        System.out.println("Qual o número de termos da progressão?");
        double valorN = sc.nextDouble();
        System.out.println("Qual é o primeiro termo?");
        double termoUm = sc.nextDouble();
        System.out.println("Qual a razão?");
        double razao = sc.nextDouble();
        while (contador <= valorN){
            System.out.println(contador + " Termo: " + termoUm);
            soma += termoUm;
            termoUm += razao;
            contador++;
        }
    System.out.println("Soma: " + soma);
}