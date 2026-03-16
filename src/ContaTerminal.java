import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    Double saldo = 237.48;

    System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o número da Agencia: ");
        int agencia = scanner.nextInt();

    System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

    System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
}
