/**
 * OBJETIVO:Para uma turma de 45 alunos, construa um algoritmo que determine:
 * a) A idade média dos alunos com menos de 1,70m de altura;
 * b) A altura média dos alunos com mais de 20 anos.
 * EMTRADA;IDADE E ALTURA
 * SAÍDA: a) A idade média dos alunos com menos de 1,70m de altura;
 *  *     b) A altura média dos alunos com mais de 20 anos.
 */
void main() {
    Scanner sc = new Scanner(System.in);
  double totalAltura = 0;
  double quantidadeAltura = 0;
  double totalIdade = 0;
  double quantidadeIdade = 0;
  for (int i = 1; i <= 3; i++) {

    System.out.println("Qual altura?");
    double altura = sc.nextDouble();
    System.out.println("Qual idade?");
    double idade = sc.nextDouble();
    if (altura < 1.70){
      totalIdade += idade;
      quantidadeIdade += 1;
    }
    if (idade > 20){
      totalAltura += altura;
      quantidadeAltura += 1;
    }
  }
  double mediaAltura = totalAltura / quantidadeAltura;
  double mediaIdade = totalIdade / quantidadeIdade;
  System.out.println("Média idade: " + mediaIdade);
  System.out.println("Média altura: " + mediaAltura);
}