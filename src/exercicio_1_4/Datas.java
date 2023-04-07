package exercicio_1_4;

import java.util.Locale;
import java.util.Calendar;
import java.time.LocalDate;
import java.util.Date;

public class Datas {
	private int dia;
	private int mes;
	private int ano;

	public Datas(int dia, int mes, int ano) {

		if (mes == 2) {
			if (dia > 29)
				throw new IllegalArgumentException("Não pode haver dias maiores que 29 em fevereiro");
		}
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("Não existe dia maior que 29 no mês de fevereiro");
		}

		this.dia = dia;

		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("Favor, lançar um mês validado de 1 a 12");

		}

		this.mes = mes;

		if (ano < 0)
			throw new IllegalArgumentException("Você deve lançar um valor válido para o ano");
		this.ano = ano;
	}

	public Datas() {
		LocalDate now = LocalDate.now();
		this.setDia(now.getDayOfMonth());
		this.setMes(now.getMonth().getValue());
		this.setAno(now.getYear());
	}

	public String toString() {
		return "Data{" + dia + "/" + mes + "/" + ano + '}';
	}

	public void avancarUmDia() {
		this.setDia(this.getDia() + 1);

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
