/**
 *OBJETIVO:Um determinado clube de futebol pretende classificar seus atletas em categorias
 * e para isto ele contratou um programador para criar um programa que
 * executasse esta tarefa. Para isso o clube criou uma tabela que continha a faixa
 * etária do atleta e sua categoria. A tabela está demonstrada abaixo:
 * IDADE CATEGORIA
 * De 05 a 10 Infantil
 * De 11 a 15 Juvenil
 * De 16 a 20 Junior
 * De 21 a 25 Profissional
 * Construa um programa que solicite o nome e a idade de um atleta e imprima a
 * sua categoria.
 * ENTRADA:NOME,IDADE
 * SAÍDA:categoria
 */


void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual seu nome? ");
    String nome = sc.nextLine();
    System.out.println("Qual sua idade? ");
    int idade = sc.nextInt();
    //escolher categoria
    System.out.println("Nome: "+ nome);
    if (idade <=10){
        System.out.println("Infantil");
    }else{
        if (idade <=15){
            System.out.println("Juvenil");
        }else{
            if (idade <= 20) {
                System.out.println("Junior");
            }else{
                if (idade <= 25) {
                    System.out.println("Profissional");
                }
            }
        }
    }
}


