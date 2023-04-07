package exercicio_1_3;

public class Funcionario {
	
	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;
	
	public Funcionario(String primeiroNome, String sobrenome, double salarioMensal) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		if (salarioMensal < 0)
			salarioMensal = 0.00;
			this.salarioMensal = salarioMensal;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public double getCalculoSalarioAnual () {
		return getSalarioMensal() * 12;
	}
	
	public double getNovoSalario() {
	return getCalculoSalarioAnual() *1.10;
		
	}

}
