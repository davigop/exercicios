/**
 * Objetivo:Foi feita uma pesquisa com um grupo de alunos de uma universidade, na qual
 * se perguntou para cada aluno o número de vezes que utilizou o restaurante da
 * universidade no último mês. Construa um algoritmo que determine:
 * a) O percentual de alunos que utilizaram menos que 10 vezes o restaurante;
 * b) O percentual de alunos que utilizaram entre 10 e 15 vezes;
 * c) O percentual de alunos que utilizaram o restaurante acima de 15 vezes.
 * Ex.: 2, 3, 11, 12, 21, 22, 23 = a) 28%; b) 28%; c) 42%
 * entrada:
 * saída:
 */
void main() {
    int contador = 0;
    double poucoUsado = 0;
    double medioUsado = 0;
    double altoUsado = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantas vezes usou o restaurante no último mês?(use 9999 para parar)");
    int numero = sc.nextInt();
    while (numero != 9999){
        if (numero < 10){
            poucoUsado += 1;
        }else {
            if (numero >= 10 && numero <=15){
                medioUsado += 1;
            }else {
                altoUsado += 1;
            }
        }
        contador++;
        numero = sc.nextInt();
    }
    System.out.println("Menos de 10 vezes: " + (double)(poucoUsado/contador) * 100 + "%");
    System.out.println("Entre 10 e 15 vezes: " + (double)(medioUsado/contador) * 100 + "%");
    System.out.println("Mais de 15 vezes: " + (double)(altoUsado/contador) * 100 + "%");
}