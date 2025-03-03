import java.util.Scanner;

public class cauculadoraVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número de dias que a loja esteve aberta? ");
        int numeroDeDias = scanner.nextInt();

        double total = 0.00;
        int acimaDeMil = 0;
        int i = 1;

        while (i <= numeroDeDias) {
            System.out.println("Digite o valor de vendas do dia " + i + ": ");
            double vendasDia = scanner.nextDouble();

            
            total += vendasDia;

            
            if (vendasDia > 1000) {
                acimaDeMil++;
            }

            i++; 
        }

        
        System.out.printf("Total de vendas do mês: R$%.2f%n", total);
        System.out.println("Número de dias com vendas acima de R$1000: " + acimaDeMil);

        scanner.close(); 
    }
}