/**
 * OBJETIVO:Faça um algoritmo que leia dois números inteiros positivos (Num1 e Num2) e
 * imprima o quociente (Quoc) e o resto (Resto) da divisão de Num1 por Num2,
 * utilizando apenas as operações de adição e subtração.
 * Ex.: N1=10; N2=2 => Q=5 R=0
 * ENTRADA:numero1,2. quociente(divisor) e resto;
 * SAÍDA:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int quociente = 0;
    System.out.println("Digite o número A: ");
    int valorA = sc.nextInt();
    System.out.println("Digite o número B: ");
    int valorB = sc.nextInt();
    while (valorA >= valorB){
        valorA -= valorB;
        quociente++;
    }
    System.out.println(quociente);
    System.out.println(valorA);
}