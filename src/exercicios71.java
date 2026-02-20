
    /**
     * OBJETIVO:Crie um algoritmo que peça o nome, a altura e o peso de duas pessoas e
     * apresente o nome da mais pesada e o nome da mais alta.
     * ENTRADA:nome,altura, peso
     * SAÍDA:nome + pesada e nome + alta
     */
    void main ()  {
        String nome;
        String nomeMaisAlto = "";
        String nomeMaisPesado ="";
        double altura = 0;
        double peso = 0;
        double maiorAltura = 0;
        double maiorPeso = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Pessoa" + i);
            System.out.println("Qual seu nome?");
            nome = new Scanner(System.in).nextLine();
            System.out.println("Qual sua altura?");
            altura = new Scanner(System.in).nextDouble();
            System.out.println("qual seu peso?");
            peso = new Scanner(System.in).nextDouble();
            //calcular mais pesada
            if (altura > maiorAltura){
                maiorAltura = altura;
                nomeMaisAlto = nome;
            }
            if (peso > maiorPeso){
                maiorPeso = peso;
                nomeMaisPesado = nome;
            }

        }
        System.out.println("Pessoa mais pesada "+ nomeMaisPesado);
        System.out.println("Pessoa mais alta "+ nomeMaisAlto);
        //adicionei uma linha aqui
    }//estou aprendendo git
