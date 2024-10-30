package Ex4;

import java.util.Scanner;

public class TesteInvoice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do item:");
        String numeroItem = sc.nextLine();

        System.out.println("Digite a descrição do item:");
        String descricao = sc.nextLine();

        System.out.println("Digite a quantidade comprada do item:");
        int quantidade = sc.nextInt();

        System.out.println("Digite o preço unitário do item:");
        double precoUnitario = sc.nextDouble();

        
        Invoice invoice = new Invoice(numeroItem, descricao, quantidade, precoUnitario);

        
        System.out.println("\nInformações da fatura:");
        System.out.println("Número do item: " + invoice.getNumeroItem());
        System.out.println("Descrição: " + invoice.getDescricao());
        System.out.println("Quantidade: " + invoice.getQuantidade());
        System.out.println("Preço unitário: " + invoice.getPrecoUnitario());
        System.out.println("Valor total da fatura: " + invoice.getInvoiceAmount());

        sc.close();
    }
}
