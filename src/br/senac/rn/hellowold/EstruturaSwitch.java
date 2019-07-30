package br.senac.rn.hellowold;

public class EstruturaSwitch {

    public static void main(String[] args) {

       Character letra = 'a';

       switch (letra) {
           case 'a': case  'e': case 'i': case 'o': case 'u':
               System.out.println("VOGAL");
               break;
           default:
               System.out.println("NÃO È VOGAL");
       }

    }

}
