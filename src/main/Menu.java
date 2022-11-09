package main;
import controller.ControllerProduto;
import model.Bebida;
import util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao, submenu;
        ControllerProduto produto = new ControllerProduto();


        Bebida suco01 = new Bebida("Natural", 5.50f, 1, "Ades", "Laranja", 500, 12,2,2);


        while (true) {
            try {
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
                System.out.println("               1 - Produto                           ");
                System.out.println("               2 - Pedido                            ");
                System.out.println("               7 - SAIR                              ");
                System.out.println("                                                     ");
                System.out.println(Cores.TEXT_YELLOW + "*****************************************************" + Cores.TEXT_RESET);
                System.out.println("Digite a opção desejada:                             ");
                System.out.println("                                                     ");
                opcao = leia.nextInt();

                if (opcao == 7) {
                    System.out.println("MeLi Lanches - Agradece a sua preferência e volte sempre!");
                    leia.close();
                    System.exit(0);
                }

                switch (opcao) {
                    case 1 -> {
                        System.out.println(Cores.TEXT_YELLOW + "\n******************** Produto ***********************" + Cores.TEXT_RESET);
                        System.out.println("               1 - Adicionar produto                 ");//VALDEMIRO
                        System.out.println("               2 - Alterar produto                   ");//---
                        System.out.println("               3 - Excluir produto                   ");//FEITO
                        System.out.println("               4 - Listar todos os produtos          ");//VALDEMIRO
                        System.out.println("               0 - Voltar ao menu principal          ");
                        System.out.println(Cores.TEXT_YELLOW + "*****************************************************" + Cores.TEXT_RESET);
                        System.out.println("Digite a opção desejada:");
                        submenu = leia.nextInt();
                        switch (submenu) {
                            case 1 -> {
//                                System.out.println("1 - Adicionar produto");
//                                ControllerProduto controllerProduto = new ControllerProduto();
//                                controllerProduto.salvarProduto();
                            	produto.salvarProduto();
                            }

                            case 2 -> System.out.println("2 - Alterar produto");


                            case 3 -> {
                                System.out.println("3 - Excluir produto");
                                System.out.println("Digita o número do produto: ");
                                int numero = leia.nextInt();

                                produto.excluirProduto(numero);
                                produto.listarProdutos();
                                break;

                            }


                            case 4 -> {
                                System.out.println("4 - Listar todos os produtos");
                                produto.listarProdutos();
                            }


                            default -> System.out.println("0 - Voltar ao menu principal");


                        }
                        keyPress();
                    }
                    case 2 -> {
                        System.out.println(Cores.TEXT_YELLOW + "********************** Pedido ***********************" + Cores.TEXT_RESET);
                        System.out.println("               1 - Criar Pedido                      ");//AMANHA
                        System.out.println("               4 - Gerar relatório                   ");//AMANHA
                        System.out.println("               0 - Voltar ao menu principal          ");
                        System.out.println(Cores.TEXT_YELLOW + "*****************************************************" + Cores.TEXT_RESET);
                        System.out.println("Digite a opção desejada:");
                        submenu = leia.nextInt();
                        System.out.println("\n");
                        System.out.println("*** Pedido ***");
                        switch (submenu) {
                            case 1 -> {
                                System.out.println("1 - Criar pedido");

                            }
                            //exclusão
                            case 4 -> {
                                System.out.println("4 - Gerar relatório ao fim do dia");

                            }
                            case 0 -> {
                                System.out.println("Voltar ao menu principal");

                            }
                        }
                        keyPress();
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Excessão: " + e);
                leia.nextLine();
                System.out.println("\nDIGITE APENAS NÚMEROS POSITIVOS!");
            }
        }
    }

    public static void keyPress() {
        try {
            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter Para Voltar Ao Menu Principal...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }


}