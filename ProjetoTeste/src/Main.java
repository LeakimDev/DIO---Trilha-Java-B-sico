/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        int c = 1;
        int cont = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite um numero: ");
        i = entrada.nextInt();

        do {
            System.out.println(c);
            if (i % c == 0) {
                cont = cont + 1;
            }
            c = c + 1;
        }
        while (c > i);
        if (cont > 2 ){
            System.out.println("o valor de " + i + " não é primo!");
        }
            else{
            System.out.println("o valor de " + i + " é primo!");
        }
            entrada.close();
    }
}
*/

public class Main {
    public static void main (String[] args) {
        String primeiroNome = "Italo";
        String segundoNome = "Chuwan";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome + " " + segundoNome;
    }

}
