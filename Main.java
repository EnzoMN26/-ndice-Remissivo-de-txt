import java.util.Scanner;

/**
 * Classe que inicializa a execução da aplicacao.
 * 
 * @author Isabel H. Manssour
 * 
 * Os arquivos de texto "fiveweeksinaballoon.txt" e "cocoaandchocolate.txt" podem demorar alguns minutos para executar devido a extensão de seus tamanhos.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        int op2;
        do {
            menu1();
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Fechando!");
                    sc.close();
                    break;

                case 1:
                    Menu java = new Menu("java.txt");
                    do {
                        System.out.println("\n\n");
                        menuOpc();
                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1:
                                System.out.println(java.remissivo());
                                break;
                            case 2:
                                System.out.println("Porcentagem de Stopwords: " + java.procentagem() + "%");
                                break;
                            case 3:
                                System.out.println("Palavra mais frequente: " + java.frequente());
                                break;
                            case 4:
                                System.out.println("Digite a palavra que deseja procurar: ");
                                String palavraProcura = sc.next();
                                System.out.println(java.procura(palavraProcura));
                                break;
                            default:
                                break;
                        }
                    } while (op2 != 0);
                    break;

                case 2:
                    Menu fiveWeeks = new Menu("fiveweeksinaballoon.txt");
                    do {
                        System.out.println("\n\n");
                        menuOpc();
                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1:
                                System.out.println(fiveWeeks.remissivo());
                                break;
                            case 2:
                                System.out.println("Porcentagem de Stopwords: " + fiveWeeks.procentagem() + "%");
                                break;
                            case 3:
                                System.out.println("Palavra mais frequente: " + fiveWeeks.frequente());
                                break;
                            case 4:
                                System.out.println("Digite a palavra que deseja procurar: ");
                                String palavraProcura = sc.next();
                                System.out.println(fiveWeeks.procura(palavraProcura));
                                break;
                            default:
                                break;
                        }
                    } while (op2 != 0);
                    break;

                case 3:
                    Menu cocoa = new Menu("cocoaandchocolate.txt");
                    do {
                        System.out.println("\n\n");
                        menuOpc();
                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1:
                                System.out.println(cocoa.remissivo());
                                break;
                            case 2:
                                System.out.println("Porcentagem de Stopwords: " + cocoa.procentagem() + "%");
                                break;
                            case 3:
                                System.out.println("Palavra mais frequente: " + cocoa.frequente());
                                break;
                            case 4:
                                System.out.println("Digite a palavra que deseja procurar: ");
                                String palavraProcura = sc.next();
                                System.out.println(cocoa.procura(palavraProcura));
                                break;
                            default:
                                break;
                        }
                    } while (op2 != 0);
                    break;

                case 4:
                    Menu alice = new Menu("alice.txt");
                    do {
                        System.out.println("\n\n");
                        menuOpc();
                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1:
                                System.out.println(alice.remissivo());
                                break;
                            case 2:
                                System.out.println("Porcentagem de Stopwords: " + alice.procentagem() + "%");
                                break;
                            case 3:
                                System.out.println("Palavra mais frequente: " + alice.frequente());
                                break;
                            case 4:
                                System.out.println("Digite a palavra que deseja procurar: ");
                                String palavraProcura = sc.next();
                                System.out.println(alice.procura(palavraProcura));
                                break;
                            default:
                                break;
                        }
                    } while (op2 != 0);
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        } while (opcao != 0);

    }

    public static void menu1() {
        System.out.print("\n|#######--Trabalho de Alest--#######|\n");
        System.out.print("|-----------------------------------|\n");
        System.out.print("|Qual arquivo deseja executar?      |\n");
        System.out.print("| Opção 1 - Java                    |\n");
        System.out.print("| Opção 2 - Five weeks in a balloon |\n");
        System.out.print("| Opção 3 - Cocoa and chocolate     |\n");
        System.out.print("| Opção 4 - Alice                   |\n");
        System.out.print("| Opção 0 - Sair                    |\n");
        System.out.print("|-----------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

    public static void menuOpc() {
        System.out.print("\n|-----------------------------------|\n");
        System.out.print("| Opção 1 - Exibir índice remissivo |\n");
        System.out.print("| Opção 2 - Percentual de Stopwords |\n");
        System.out.print("| Opção 3 - Palavra mais frequente  |\n");
        System.out.print("| Opção 4 - Pesquisar palavra       |\n");
        System.out.print("| Opção 0 - Voltar                  |\n");
        System.out.print("|-----------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }
}
