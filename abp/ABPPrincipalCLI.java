import java.util.Scanner;

public class ABPPrincipalCLI {
    public static void main(String args[]) {
        //Testar entrada nesta ordem: 4 2 6 1 3 5 7
        //Pre Ordem: [4,2,1,3,6,5,7] 
        //Em Ordem:  [1,2,3,4,5,6,7]
        //Pos Ordem: [1,3,2,5,7,6,4]
        Scanner scanner = new Scanner(System.in);
        int opcao, valor;
        ABP<Integer> arvore = new ABP<>();
        do {
            exibirMenu();
            System.out.print("Escolha uma opcao (0-5): ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo da ABP. Ate mais!");
                    break;                
                case 1:
                    System.out.print("Digite o valor : ");
                    valor = scanner.nextInt();
                    arvore.inserir(valor);
                    break;
                case 2:
                    //System.out.print("Digite o valor : ");
                    //valor = scanner.nextInt();                
                    //arvore.apagar(valor);
                    break;
                case 3:
                    //System.out.print("Digite o valor : ");
                    //valor = scanner.nextInt();                
                    //arvore.buscar(valor);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Pre-Ordem: " + formataSaida(arvore.imprimirPreOrdem(arvore.getRaiz())));
                    System.out.println("");
                    break;                
                case 5:
                    System.out.println("");
                    System.out.println("Em-Ordem: " + formataSaida(arvore.imprimirEmOrdem(arvore.getRaiz())));
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");                
                    System.out.println("Pos-Ordem: " + formataSaida(arvore.imprimirPosOrdem(arvore.getRaiz())));
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("=== Arvore Binaria de Pesquisa CLI ===");
        System.out.println("0. SAIR");
        System.out.println("1. Inserir");
        System.out.println("2. Apagar (em construcao)");
        System.out.println("3. Buscar (em Construcao)");
        System.out.println("4. Imprimir Pre-Ordem");
        System.out.println("5. Imprimir Em-Ordem");
        System.out.println("6. Imprimir Pos-Ordem");                
    }

    private static String formataSaida(String msg) {
        String resultado;
        do {
            resultado = msg;
            msg = msg.replace("  ", " "); //remove excesso de espaços
        } while (!msg.equals(resultado));
        msg = msg.trim(); //remove espaços em branco do inicio e fim, se existir
        msg = msg.replace(" ", ","); //troca espaço por vírgula
        return "[" + msg + "]";
    }    
}