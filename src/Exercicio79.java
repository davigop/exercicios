/**
 * OBJETIVO:Faça um algoritmo que leia a primeira letra do estado civil de uma pessoa e
 * mostre uma mensagem com a sua descrição (Solteiro, Casado, Viúvo,
 * Divorciado, Desquitado). Mostre uma mensagem de erro, se necessário.
 * ENTRADA:Estado Civil
 * SAÍDA:descrição
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a primeira letra do seu estado civil");
    char estado = sc.next().toUpperCase().charAt(0);
    //switch
    switch (estado) {
        case 'S':
            System.out.println("Solteiro");
            break;
        case 'C':
            System.out.println("Casado");
            break;
        case 'V':
            System.out.println("Viúvo");
            break;
        case 'D':
            System.out.println("Divorciado");
            break;
        default:
            System.out.println("Opção inválida");
            break;
    }
}

