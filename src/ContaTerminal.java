import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
        System.out.println("|----------------------------------|");
        System.out.println("|         Seja bem vindo!          |");
        System.out.println("|----------------------------------|");
        System.out.println();
		System.out.println("Por favor, digite o numero da Conta:");
		numero = sc.nextInt();

		System.out.println("Agora digite o numero da Agencia:");
		agencia = sc.next();

		System.out.println("Me informe seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		saldo = sc.nextDouble();

		System.out.println();
		System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, "
                         + "sua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para saque."
                         , nomeCliente, agencia, numero, saldo);

		sc.close();
	}
}
