/**
 * OBJETIVO:Faça um algoritmo que leia um número FN, calcule e mostre os N primeiros
 * termos da sequência de Fibonnaci (0, 1, 1, 2 , 3, 5, 8, ...). O valor lido para N
 * sempre será maior ou igual a 2.
 * ENTRADA:valor Fn
 * SAÍDA:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    double soma = 0;
    System.out.println("Qual o valor de FN?");
    double valorFn = sc.nextDouble();
    System.out.println("Qual a quantidade de termos?");
    int quantidadeTermos = sc.nextInt();
    while (contador <= quantidadeTermos){
        valorFn += soma;
        soma += valorFn;
        System.out.println(valorFn);
        System.out.println(soma);
        contador++;
    }
}