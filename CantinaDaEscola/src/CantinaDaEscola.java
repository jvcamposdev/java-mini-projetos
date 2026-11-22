
import java.util.Scanner;
public class CantinaDaEscola {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);
        byte opcaoDoMenu;

        System.out.println ("====Menu da cantina====" + System.lineSeparator()+
                "1 - salgado - preco: R$ 6 " + System.lineSeparator() +
                "2 - suco - preco: R$ 4 " + System.lineSeparator() +
                "3 - bolo - preco: R$ 8 ");

        opcaoDoMenu = sc.nextByte();

        switch(opcaoDoMenu) {

            case 1-> {
                System.out.println (" salgado - preco: R$ 6 ");
            }

            case 2-> {
                System.out.println (" suco - preco: R$ 4 ");
            }
            case 3-> {
                System.out.println (" bolo - preco: R$ 8 ");
            }
            default-> {
                System.out.println (" opcao invalida");
            }
        }

    }
}
