/**
 * OBJETIVO:Construa um algoritmo que leia um número inteiro de 1 a 7 e informe o dia da
 * semana correspondente, sendo domingo o dia de número 1. Se o número não
 * corresponder a um dia da semana, mostre uma mensagem de erro.
 * ENTRADA:número da semana
 * SAÍDA:dia da semana
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o número?(1 a 7)");
    int dia = sc.nextInt();
    switch (dia){
        case 1:
            System.out.println("Segunda-Feira");
            break;
        case 2:
            System.out.println("Terça-Feira");
            break;
        case 3:
            System.out.println("Quarta-Feira");
            break;
        case 4:
            System.out.println("Quinta-Feira");
            break;
        case 5:
            System.out.println("Sexta-Feira");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Erro!");
            break;
    }
}