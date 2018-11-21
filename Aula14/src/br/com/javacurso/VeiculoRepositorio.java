package br.com.javacurso;

import java.util.ArrayList;

public class VeiculoRepositorio {
	
	private ArrayList<Veiculo> veiculos = new ArrayList<>();
	private int contagem = 1;
	
	
	public boolean cadastarVeiculo(Veiculo veiculo) {
		boolean resultado = false;
		if (veiculo != null){
			veiculo.setId(contagem++);
			resultado = veiculos.add(veiculo);
		}//if
		return resultado;
	}//cadastrarVeiculo
	
	
	public ArrayList<Veiculo> listarVeiculos() {
		return veiculos;
	}
	
	
	public boolean remover(int remocao) {
		boolean resultado = false;
		int pos = -1;
		for(int index = 0; index < veiculos.size(); index++){
			if(veiculos.get(index).getId() == remocao){
				pos = index;
				break;
			}
		}
		if(pos > -1){
			veiculos.remove(pos);
			resultado = true;
		}
		return resultado;
		//  return veiculos.remove(getId(remocao));
		//  return veiculos.getId(remocao).remove();
	}//remover
}//class
