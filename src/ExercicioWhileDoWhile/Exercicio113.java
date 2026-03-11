/**
 * OBJETIVO:Crie um algoritmo que peça o nome, a altura e o peso de duas pessoas e
 * apresente o nome e peso da mais pesada e o nome e altura da mais alta.
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    double maisAlto = 0;
    double maisPesada = 0;
    String nomeAlto = "";
    String nomePeso = "";
    while (contador != 2){
        System.out.println("Qual seu nome? ");
        String nome = sc.next();
        System.out.println("Qual sua altura? ");
        double altura = sc.nextDouble();
        if (altura > maisAlto){
            maisAlto = altura;
            nomeAlto = nome;
        }
        System.out.println("Qual seu peso? ");
        double peso = sc.nextDouble();
        if (peso > maisPesada){
            maisPesada = peso;
            nomePeso = nome;
        }
        contador++;
    }
    System.out.println("Nome mais pesada: " + nomePeso + "\n" + maisPesada);
    System.out.println("Nome mais alto: " + nomeAlto + "\n" + maisAlto);
}