/**
 * OBJETIVO:
 * Foi realizada uma pesquisa de algumas características físicas da população de
 * uma certa região, a qual coletaram os seguintes dados referentes a cada
 * habitante para serem analisados:
 * - sexo (masculino e feminino)
 * - cor dos olhos (azuis, verdes ou castanhos)
 * - cor dos cabelos (louros, castanhos, pretos)
 * - idade
 * Faça um algoritmo que determine e escreva:
 * a) a maior idade dos habitantes;
 * b) a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e
 * 35 anos, inclusive;
 * c) a quantidade de indivíduos que tenham olhos verdes e cabelos louros;
 * O final do conjunto de habitantes é reconhecido pelo valor -1 informado como
 * idade.
 * ENTRADA:SEXO, COR OLHOS,COR CABELO,idade
 * SAÍDA:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int maiorIdade = 0;
    int contador = 0;
    int contFem18 = 0;
    int contOlhosCabelos = 0;
    do {
        System.out.println("Qual a idade? ");
        int idade = sc.nextInt();
        //para de rodar o programa
        if (idade < 0){
            break;
        }
        //letra A
        if (contador == 0){
            maiorIdade = idade;
        }
        if (idade > maiorIdade){
            maiorIdade = idade;
        }
        //letra B
        System.out.println("Qual o sexo?(M ou F)");
        String sexo = sc.next();
        if (idade >= 18 && idade <= 35 && sexo.equalsIgnoreCase("F")){
            contFem18 += 1;
        }
        // letraC
        System.out.println("Qual a cor do cabelo? (1- loiro, 2- castanho, 3- preto)");
        int cabelo = sc.nextInt();
        System.out.println("Qual a cor dos olhos? (1- azuis, 2- verdes ou 3- castanhos) ");
        int olhos = sc.nextInt();
        if (olhos == 2 && cabelo == 1){
            contOlhosCabelos += 1;
        }

        contador++;
    }while (true);
    System.out.println("Maior idade: " + maiorIdade);
    System.out.println("Qtd Feminino entre 18 e 35 anos: " + contFem18);
    System.out.println("Qtd cabelo loiro e olhos verdes: " + contOlhosCabelos);
}