/**
 * OBJETIVO:Faça um algoritmo para o jogo “pedra-papel-tesoura”. O jogo deve imprimir
 * vitória, empate ou derrota conforme a opção que o jogador escolher e a opção
 * que for sorteada aleatoriamente pelo computador. Obs.: pedra ganha de tesoura;
 * que ganha de papel; que ganha de pedra.
 * ENTRADA:Opcao do jogador
 * SAÍDA:resultado
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int pedra = 1;
    int papel = 2;
    int tesoura = 3;
    int numeroAleatorio = (int)(Math.random() * 3) + 1;
    System.out.println("Escolha sua opção:\n"+
            "1-Pedra\n"+
            "2-Papel\n"+
            "3-Tesoura\n");
    int jogador = sc.nextInt();
    System.out.println(numeroAleatorio);
    //switch
    switch (jogador){
        case 1:
            if (jogador == numeroAleatorio){
                System.out.println("Empate");
            }else {
                if (jogador == jogador && numeroAleatorio == 3){
                    System.out.println("Venceu");
                }
            }
            if (jogador == jogador && numeroAleatorio == 2){
            System.out.println("Perdeu");
        }break;
        case 2:
            if (jogador == numeroAleatorio){
                System.out.println("Empate");
            }else {
                if (jogador == jogador && numeroAleatorio == 1){
                    System.out.println("Venceu");
                }
            }
            if (jogador == jogador && numeroAleatorio == 3){
                System.out.println("Perdeu");
            }break;
        case 3:
            if (jogador == numeroAleatorio){
            System.out.println("Empate");
        }else {
                if (jogador == jogador && numeroAleatorio == 2){
                    System.out.println("Venceu");
                }
            }
            if (jogador == jogador && numeroAleatorio == 1){
                System.out.println("Perdeu");
            }break;
        default:
            System.out.println("Opção inválida");
    }

}