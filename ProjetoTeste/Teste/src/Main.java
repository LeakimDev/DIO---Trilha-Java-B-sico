import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int v, cont, tot = 0, SImp = 0;

        Scanner entrada = new Scanner(System.in);

        for (cont = 1; cont <= 6; cont++){

            System.out.print("Digite um valor: ");
            v = entrada.nextInt();

            //System.out.println(cont);

            if (v>=0 && v<=10){
                tot++;
            }
            if (v%2 != 0){
                SImp += v;
            }
        }

        System.out.println("Ao todo foram " + tot + " valores ente 0 e 10!");
        System.out.println("Nesse intervalor, as somas dos numeros impares foi de: " + SImp);

        entrada.close();
    }
}