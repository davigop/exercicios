/**
 * Objetivo:Crie um algoritmo para ler uma letra do alfabeto e mostrar uma mensagem: se é
 * vogal ou consoante.
 * ENTRADA:Letra
 * SAÍDA:vogal ou consoante?
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a letra?");
    char letra = sc.next().toUpperCase().charAt(0);
    //switch
    switch (letra){
        case 'A','E','I','O','U':
            System.out.println("Vogal");
            break;
        default:
            System.out.println("Consoante");


    }
}