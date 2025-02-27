import java.util.Scanner;

public class Conta {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double conta= 0;


        while (true) {
            System.out.print("Depositar na conta: ");
            try {
                double deposito = scanner.nextDouble();
                if (deposito < 0) {
                    System.out.println("Valor inválido. Digite um valor positivo.");
                } else {
                    System.out.println("Depósito realizado com sucesso.");
                    conta += deposito;
                    System.out.println("Saldo atual: " + conta);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Valor inválido. Digite um valor numérico.");
                scanner.nextLine();
            }
            
        }
        

        scanner.close();
    }
}
