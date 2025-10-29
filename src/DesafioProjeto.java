import java.util.Scanner;

public class DesafioProjeto {
    public static void main(String[] args) {
        double saldo = 2500;
        int opcao;
        Scanner input = new Scanner(System.in);

        String menu = """
                Operações:
                
                1- Consultar Saldo
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                """ ;

        System.out.printf("""
                *******************************************************
                
                Dados iniciais do cliente
                Nome: Vinicius Machado
                Tipo Conta: Corrente
                Saldo: R$ %.2f
                
                *******************************************************
                
                
                """, saldo);

        while(true){

            System.out.println(menu);
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();

            if(opcao == 1){
                System.out.printf("Seu Saldo atual é de R$%.2f\n", saldo);
            }
            else if(opcao == 2){
                System.out.print("Informe o valor a receber: R$");
                double valorReceber = input.nextDouble();
                if (valorReceber < 0) {
                    System.out.println("Não é possivel receber um valor menor que 0");
                }
                else {
                    saldo += valorReceber;
                    System.out.printf("Saldo atual: %.2f\n", saldo);
                }
            }
            else if(opcao == 3){
                System.out.print("Digite o valor a transferir: R$");
                double valorTransferir = input.nextDouble();
                if (valorTransferir > saldo){
                    System.out.println("Saldo Insuficiente");
                }
                else {
                    saldo -= valorTransferir;
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);
                }
            }
            else if(opcao == 4){
                System.out.println("Volte sempre");
                break;
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
        input.close();
    }
}
