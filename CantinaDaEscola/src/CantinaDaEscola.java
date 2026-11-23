
import java.util.Scanner;
public class CantinaDaEscola {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);
        byte opcaoDoMenu;
        String itemEscolhido = "";
        double precoDoitem = 0;
        int quantidadeDoItem = 0;
        double precoTotal = 0;

        System.out.println ("====Menu da cantina====" + System.lineSeparator()+
                "1 - salgado - preco: R$ 6 " + System.lineSeparator() +
                "2 - suco - preco: R$ 4 " + System.lineSeparator() +
                "3 - bolo - preco: R$ 8 ");

        opcaoDoMenu = sc.nextByte();

        switch(opcaoDoMenu) {

            case 1-> {
                itemEscolhido = "salgado";
                precoDoitem = 6.0;
                System.out.println (" item escolhido: " + itemEscolhido);
                System.out.println (" preco do item: " + precoDoitem);
                
                System.out.println (" quantidade: ");
                 quantidadeDoItem = sc.nextInt();
                
                if ( quantidadeDoItem > 0 ) {
                    precoTotal = quantidadeDoItem * precoDoitem;
                }

            }

            case 2-> {
                itemEscolhido = "suco ";
                precoDoitem = 4.0;

                System.out.println (" item escolhido: " + itemEscolhido);
                System.out.println (" preco do item: " + precoDoitem);

                System.out.println (" quantidade: ");
                quantidadeDoItem = sc.nextInt();

                if ( quantidadeDoItem > 0 ) {
                    precoTotal = quantidadeDoItem * precoDoitem;
                }

            }
            case 3-> {
                itemEscolhido = "bolo ";
                precoDoitem =  8.0;

                System.out.println (" item escolhido: " + itemEscolhido);
                System.out.println (" preco do item: " + precoDoitem);

                System.out.println (" quantidade: ");
                quantidadeDoItem = sc.nextInt();

                if ( quantidadeDoItem > 0 ) {
                    precoTotal = quantidadeDoItem * precoDoitem;
                }
            }
            default-> {


                itemEscolhido = "nenhuma ";
                precoDoitem = 0;

            }
            
            
        }
        System.out.println (" voce escolheu: " + itemEscolhido);
        System.out.println (" preco do produto: " + precoDoitem + " Reais ");
        System.out.println (" quantidade do item escolhido: " + quantidadeDoItem);
        System.out.println (" preco final: " + precoTotal + " Reais ");
        

        

    }
}
