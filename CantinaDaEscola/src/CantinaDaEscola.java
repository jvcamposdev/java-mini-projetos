
import java.util.Scanner;
public class CantinaDaEscola {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);
        byte opcaoDoMenu;
        byte precoDoSalgado = 6;
        byte precoDoSuco = 4;
        byte precoDoBolo = 8;
        String salgado = "salgado";
        String suco = "suco";
        String bolo = "bolo";

        System.out.println ("====Menu da cantina====" + System.lineSeparator()+
                "1 - salgado - preco: R$ 6 " + System.lineSeparator() +
                "2 - suco - preco: R$ 4 " + System.lineSeparator() +
                "3 - bolo - preco: R$ 8 ");

        opcaoDoMenu = sc.nextByte();

        switch(opcaoDoMenu) {

            case 1-> {
                System.out.println (" salgado - preco: R$ " + precoDoSalgado + " Reais" );
            }

            case 2-> {
                System.out.println (" suco - preco: R$ " + precoDoSuco + " Reais");
            }
            case 3-> {
                System.out.println (" bolo - preco: R$ " + precoDoBolo + " Reais ");
            }
            default-> {
                System.out.println (" opcao invalida ");
            }
        }

    }
}
