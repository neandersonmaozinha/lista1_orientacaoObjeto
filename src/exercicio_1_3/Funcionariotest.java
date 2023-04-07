package exercicio_1_3;


import java.text.DecimalFormat;

public class Funcionariotest {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		Funcionario funcionario = new Funcionario("Gabriel", "Medeiros", 2000.00);
		df.applyPattern("R$ #,##0.00");
		
		System.out.println("Nome: " + funcionario.getPrimeiroNome());
		System.out.println("Sobrenome: " + funcionario.getSobrenome());
		System.out.println("Salário Mensal: " + df.format(funcionario.getSalarioMensal()));
		System.out.println("Salario Anual: " + df.format(funcionario.getCalculoSalarioAnual()));
		System.out.println("Salario Anual com aumento: " + df.format(funcionario.getNovoSalario())); 

	}

}
