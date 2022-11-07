import util.Cores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao , submenu = 0;
        boolean loop = true;

        System.out.println(Cores.TEXT_YELLOW + "*******************************************************************************************" + Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + " __  __  ______  _       _____   _                 _   _   _____  _    _  ______   _____\n" +
                "|  \\/  ||  ____|| |     |_   _| | |         /\\    | \\ | | / ____|| |  | ||  ____| / ____|\n" +
                "| \\  / || |__   | |       | |   | |        /  \\   |  \\| || |     | |__| || |__   | (___\n" +
                "| |\\/| ||  __|  | |       | |   | |       / /\\ \\  | . ` || |     |  __  ||  __|   \\___ \\\n" +
                "| |  | || |____ | |____  _| |_  | |____  / ____ \\ | |\\  || |____ | |  | || |____  ____) |\n" +
                "|_|  |_||______||______||_____| |______|/_/    \\_\\|_| \\_| \\_____||_|  |_||______||_____/\n" +
                "\n" + Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println(Cores.TEXT_YELLOW + "*******************************************************************************************" + Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println("               1 - Produto                           ");//Gabriel Galvão (criar pedido e listar no final o pedido)
        System.out.println("               2 - Pedido                            ");
        System.out.println("               7 - SAIR                              ");//
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("Digite a opção desejada:                             ");
        System.out.println("                                                     ");



        do {
            try {
                opcao = leia.nextInt();

                if (opcao == 7) {
                    System.out.println("MeLi Lanches - Agradece a sua preferência e volte sempre!");
                    leia.close();
                    System.exit(0);
                }

                switch (opcao) {
                    case 1 -> {
                        System.out.println("\nProduto");
                            /*System.out.println("Digite a opção desejada:");
                            submenu = leia.nextInt();*/
                        switch (submenu) {
                            case 1:
                                System.out.println("1 - Adicionar produto");
                                break;
                            case 2:
                                System.out.println("2 - Alterar produto");
                                break;
                            case 3:
                                System.out.println("3 - Excluir produto");
                                break;
                            case 4:
                                System.out.println("4 - Listar todos os produtos");
                                break;
                            default:
                                System.out.println("Voltar ao menu principal");
                                break;
                        }
                    }
                    case 2 -> {
                            /*System.out.println("Digite a opção desejada:");
                            submenu = leia.nextInt();*/
                        System.out.println("\n");
                        System.out.println("*** Pedido ***");
                        switch (submenu) {
                            case 1:
                                System.out.println("1 - Criar pedido");
                                break;
                            case 2:
                                System.out.println("2 - Listar itens do pedido");
                                break;
                            case 3:
                                System.out.println("3 - Excluir item do pedido");
                                break;
                            case 4:
                                System.out.println("4 - Gerar relatório ao fim do dia");
                                break;
                            default:
                                System.out.println("Voltar ao menu principal");
                                break;
                        }
                    }
                }
                loop = false;
            }catch (InputMismatchException e){
                System.out.println("Excessão: "+e);
                leia.nextLine();
                System.out.println("\nDIGITE APENAS NÚMEROS POSITIVOS!");
            }
        } while (loop);
    }
}
