/**
 * OBJETIVO:Considere que, para cada um dos hotéis fazenda da região, se tenha registrado
 * o nome do hotel, a sua distância do centro da cidade, o número médio de
 * visitantes no último feriado e o tipo de acesso ao hotel (0 – acesso não asfaltado;
 * 1 – acesso asfaltado). Construa um algoritmo que forneça:
 * a) O número de hoteis que distam mais de 15km do centro;
 * b) A quantidade média de visitantes no último feriado, nos hoteis com acesso
 * não asfaltado;
 * c) O nome e a distância do centro em Km, de todos os hoteis de acesso
 * asfaltado que tiveram menos de 1.000 visitantes.
 * Ex.: HA, DA=10, V=100, AC=0
 * HB, DA=20, V=50, AC=1
 * ENTRADA:nome do hotel (HA,HB,...);Distância; acesso  (0 – acesso não asfaltado; 1 – acesso asfaltado)
 * SAÍDA:hoteis a mais de 15km;média de visitantes no acesso 0; nome e a distância do centro em km,
 * de todos os hoteis de acesso 1 se tiver menos de 1000 visitantes;
 */
void main() {
    Scanner sc = new Scanner(System.in);
    //testar com 3 hoteis
    int contador = 0;
    int contadorSemAsfalto = 0;
    int contDistancia = 0;
    int totalVisitante = 0;
    while (contador != 3){
        System.out.println("Nome Hotel: ");
        String nome = sc.next();
        System.out.println("Qual a distância do hotel?(em KM)");
        double distanciaHotel = sc.nextDouble();
        System.out.println("Quantos visitantes tiveram? ");
        int visitantes = sc.nextInt();
        System.out.println("Qual tipo de acesso?(0 – acesso não asfaltado; 1 – acesso asfaltado) ");
        int acesso = sc.nextInt();
        sc.nextLine();
        //Resolver letra A
        if (distanciaHotel > 15){
            contDistancia += 1;
        }
        //Resolver letra B
        if (acesso == 0){
            totalVisitante += visitantes;
            contadorSemAsfalto += 1;
        }
        //Resolver letra C
        if (acesso == 1 && visitantes < 1000){
            System.out.println(nome + " :\n" + "Distância: " + distanciaHotel);
        }
        contador++;
    }
    System.out.println("Hoteis a mais de 15km: " + contDistancia);
    System.out.println("Média de visitantes no acesso 0: " + totalVisitante/ contadorSemAsfalto );
}