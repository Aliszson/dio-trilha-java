import java.util.Scanner;;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
    
        System.out.println("Bem vindo (a) ao Sistema do Banco.");

        System.out.print("Por favor, digite o número da Agência: ");
        numero = leitorNumerico.nextInt();

        System.out.print("Agora a Agência: ");
        agencia = leitorTexto.next();

        System.out.print("Nome do Cliente: ");
        nomeCliente = leitorTexto.next();

        System.out.print("Saldo: ");
        saldo = leitorNumerico.nextFloat();

        leitorNumerico.close();
        leitorTexto.close();
        
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}
