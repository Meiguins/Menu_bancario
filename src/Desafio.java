import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Kauan Meiguins";
        String tipoConta = "Corrente";
        double saldo = 1999.90;
        int opcao = 0;

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta:" + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


        String menu = """
                +++++++++++++++++++++++++++++
                Escolha uma das opcoes
                
                1 - Consultar saldo
                2 - Depositar
                3 - Retirar
                4 - Sair
                +++++++++++++++++++++++++++++
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo atual e: " + saldo);

            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja depositar");
                double valorDepositado = leitura.nextDouble();
                saldo = saldo + valorDepositado;

                System.out.println("Saldo atual: " + saldo);

            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja retirar");
                double valorRetirado = leitura.nextDouble();
                if (valorRetirado > saldo){
                    System.out.println("Seu saldo e insuficiente");
                }else {
                    saldo = saldo - valorRetirado;
                }

                System.out.println("Saldo atual: " + saldo);

            }else {
                System.out.println("Opcao invalida");
            }
        }
    }
}
