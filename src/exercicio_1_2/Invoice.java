package exercicio_1_2;

public class Invoice {
	
	private int numeroIntemFaturado;
	private String desctricaoItem;
	private int quantidadeItemComprado;
	private double precoItemUnitario;
	
	public Invoice (int numeroIntemFaturado, String desctricaoItem, int quantidadeItemComprado, double precoItemUnitario) {
		
		this.numeroIntemFaturado = numeroIntemFaturado;
		this.desctricaoItem = desctricaoItem;
		if(quantidadeItemComprado < 0) 
			this.quantidadeItemComprado = 0;
		else this.quantidadeItemComprado = quantidadeItemComprado;
		
		if(precoItemUnitario < 0) 
			this.precoItemUnitario = 0;
			else this.precoItemUnitario = precoItemUnitario;
		
		
	}

	public int getNumeroIntemFaturado() {
		return numeroIntemFaturado;
	}

	public void setNumeroIntemFaturado(int numeroIntemFaturado) {
		this.numeroIntemFaturado = numeroIntemFaturado;
	}

	public String getDesctricaoItem() {
		return desctricaoItem;
	}

	public void setDesctricaoItem(String desctricaoItem) {
		this.desctricaoItem = desctricaoItem;
	}

	public int getQuantidadeItemComprado() {
		return quantidadeItemComprado;
	}

	public void setQuantidadeItemComprado(int quantidadeItemComprado) {
		this.quantidadeItemComprado = quantidadeItemComprado;
	}

	public double getPrecoItemUnitario() {
		return precoItemUnitario;
	}

	public void setPrecoItemUnitario(double precoItemUnitario) {
		this.precoItemUnitario = precoItemUnitario;
	}
	
	public double getInvoiceAmount() {
		
		return getQuantidadeItemComprado() * getPrecoItemUnitario();
		
	}

	

}
