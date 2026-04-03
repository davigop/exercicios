/**
 * Escrever um algoritmo que lê um vetor G(13) que é o gabarito de um teste de
 * loteria esportiva, contendo os valores 1 (coluna 1), 2 (coluna 2) e 3 (coluna do
 * meio). Ler, a seguir, para cada apostador, o número de seu cartão e um vetor
 * Resposta R (13). Verificar para cada apostador o número de acertos e escrever o
 * número do apostador e seu número de acertos. Se tiver 13 acertos, acrescentar
 * a mensagem: "GANHADOR, PARABENS".
 * OBJETIVO:receber um gabarito com 13 itens. para cada apostador ler o número de acertos, se acertos for igual a 13
 * colocar mensagem de ganhador.
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int[] gabarito = new int[13];
    int[] resposta = new int[13];
    //criando o gabarito loteria
    System.out.println("Gabarito Loteria Esportiva");
    for (int i = 0; i < gabarito.length; i++){
        System.out.println("Resultado jogo " + (i + 1) + ": ");
        gabarito[i] = sc.nextInt();
    }
    //parte do apostador. verificação de respostas
    while (true){
        //recebendo número do cartão
        System.out.println("Número do cartão de aposta (digite 0 para sair");
        int numCartao = sc.nextInt();
        if (numCartao == 0) break;
        // criando variavel para acertos
        int acertos = 0;
        //recebendo as respostas do apostador
        System.out.println("Digite as respostas do apostador:");
        for (int i = 0; i < gabarito.length ; i++) {
            resposta[i] = sc.nextInt();
            //verificando se as respostas estão corretas
            if (resposta[i] == gabarito[i]){
                acertos++;
            }
        }
        //imprimindo número de cartão e número de acertos
        System.out.println("Número de cartão apostador: " + numCartao);
        System.out.println("Número de acertos: " + acertos);
        //se acertos forem iguais ao total, então a mensagem de parabéns
        if (acertos == 13){
            System.out.println("Parabéns, você ganhou o prêmio máximo!!");
        }
    }
}