package br.mack.voto;

public class Eleicao {

	public String classificaEleitor(int idade) {

		String classific;

		if (idade < 0 || idade > 130) {
			classific = "Idade inválida";
		} else if (idade <= 15) {
			classific = "Não permitido";
		} else if (idade <= 17 || idade >= 70) {
			classific = "Facultativo";
		} else {
			classific = "Obrigatório";
		}

		return classific;
	}
}
