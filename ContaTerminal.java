import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var agencia = "012-34";
        var numeroConta = "0001";


        System.out.println(" Olá Bem vindo ao nosso banco");
        System.out.println(" ----------------------------");
        System.out.println(" Por favor digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println(" Agora, quanto R$ deseja adicionar a sua nova conta?: ");
        int saldo = scanner.nextInt();

        System.out.println(" Adicionei o valor no MeuPix: meupix@pixzao.com para Autenticar a conta" +
                " em seguida digite 'OK' ");

        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("Ok")) {
            System.out.println("Que bom!.....\b");
        } else if (resposta.equalsIgnoreCase("Não")) {
            System.out.println("Que pena!");
        } else {
            System.out.println("Resposta inválida. Digite 'Ok' ou 'Não'.");
        }




        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta "+numeroConta+" e seu saldo R$: "+saldo+" já está disponível para saque!");











    }
}
