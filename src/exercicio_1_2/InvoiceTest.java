package exercicio_1_2;

import java.text.DecimalFormat;
import java.util.Locale;


public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat();
		Invoice invoice = new Invoice(001, "Calculador HP12C", 7, 350.00);
		df.applyPattern("R$ #,##0.00");
		System.out.println("Número do produto: " + invoice.getNumeroIntemFaturado());
		System.out.println("Descrição do Produto: " + invoice.getDesctricaoItem());
		System.out.println("Quantidade comproda: " + invoice.getQuantidadeItemComprado());
		System.out.println("Preço unitário: " + df.format(invoice.getPrecoItemUnitario()));
		System.out.println("Valor da nota fiscal: " + df.format(invoice.getInvoiceAmount()));
		

	}

}
