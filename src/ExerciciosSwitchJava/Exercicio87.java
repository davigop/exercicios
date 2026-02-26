/**
 * OBJETIVO:Crie um algoritmo que solicita ao usuário para digitar um número e mostra-o por
 * extenso. Este número deve variar entre 1 e 10. Se o usuário introduzir um
 * número que não está neste intervalo, mostre: "Número inválido".
 * ENTRADA:numero entre de 1 a 10
 * SAÍDA:numero por extenso
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número");
    int numero = sc.nextInt();
    switch (numero){
        case 1:
            System.out.println("Um");
            break;
        case 2:
            System.out.println("Dois");
            break;
        case 3:
            System.out.println("Três");
            break;
        case 4:
            System.out.println("Quatro");
            break;
        case 5:
            System.out.println("Cinco");
            break;
        case 6:
            System.out.println("Seis");
            break;
        case 7:
            System.out.println("Sete");
            break;
        case 8:
            System.out.println("Oito");
            break;
        case 9:
            System.out.println("Nove");
            break;
        case 10:
            System.out.println("Dez");
            break;
        default:
            System.out.println("Número inválido");
            break;
    }
}