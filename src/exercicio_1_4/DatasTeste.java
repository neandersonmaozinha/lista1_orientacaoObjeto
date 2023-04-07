package exercicio_1_4;

public class DatasTeste {

	public static void main(String[] args) {
		Datas dataAtual = new Datas();
        System.out.println("Data no sistema: " + dataAtual.toString());

        Datas datas = new Datas(27,8,1987);
        System.out.println("Passando uma data: " + datas.toString());

        //Adiantando a data em um dia
        datas.avancarUmDia();
        System.out.println("Adiantando a data em um dia: " + datas.getDia());

	}

}
