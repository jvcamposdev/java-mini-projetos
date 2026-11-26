
import java.util.Scanner;
public class CantinaDaEscola {

    static void menuDaCantina() {
        System.out.println("====Menu da cantina====" + System.lineSeparator() +
                "1 - salgado - preco: R$ 6 " + System.lineSeparator() +
                "2 - suco - preco: R$ 4 " + System.lineSeparator() +
                "3 - bolo - preco: R$ 8 ");

    }
    static void menuDoSistema() {

        System.out.println ("====menu do refeitorio da escola==== " + System.lineSeparator() +
                "1- escolha dos items da cantina " + System.lineSeparator()+
                "2- opcoes futuras ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcaoDoMenu = 0;
        byte opcaoDaCantina = 0;
        String itemEscolhido = "";
        double precoDoitem = 0;
        int quantidadeDoItem;
        double precoTotal = 0;



        while (opcaoDoMenu != 4) {

            menuDoSistema();
            opcaoDoMenu = sc.nextByte();


            if (opcaoDoMenu == 1) {


                menuDaCantina();
                opcaoDaCantina = sc.nextByte();

                switch (opcaoDaCantina) {

                    case 1 -> {
                        itemEscolhido = "salgado";
                        precoDoitem = 6.0;

                    }

                    case 2 -> {
                        itemEscolhido = "suco ";
                        precoDoitem = 4.0;

                    }

                    case 3 -> {
                        itemEscolhido = "bolo ";
                        precoDoitem = 8.0;

                    }


                    default -> {

                        System.out.println(" opcao invalida ");
                    }

                }


                if (precoDoitem > 0) {
                    System.out.println(" item escolhido: " + itemEscolhido);
                    System.out.println(" preco do item: " + precoDoitem);

                    System.out.println(" quantidade: ");
                    quantidadeDoItem = sc.nextInt();

                    if (quantidadeDoItem <= 0) {
                        System.out.println(" quantidade invalida ");

                    } else {
                        precoTotal = quantidadeDoItem * precoDoitem;

                        System.out.println(" voce escolheu: " + itemEscolhido);
                        System.out.println(" preco do produto: " + precoDoitem + " Reais ");
                        System.out.println(" quantidade do item escolhido: " + quantidadeDoItem);
                        System.out.println(" preco final: " + precoTotal + " Reais ");

                    }
                }
            }


        }

    }
}
