void main() {
    int mes = 2;
    switch (mes){
        case 1:{
            System.out.println("Janeiro");
        } break;
        case 2: {
            System.out.println("Fevereiro");
        } break;
        case 3: {
            System.out.println("Março");
        }break;
        case 10:{
            System.out.println("Outubro");
        }break;
        default: {
            System.out.println("Nao passei por nenhum case");
        }
    }
    System.out.println("Continuei depois do switch");
}
