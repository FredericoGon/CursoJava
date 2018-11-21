package br.com.javacurso;

import java.util.ArrayList;

public class VeiculoController {
	
	VeiculoRepositorio repositorio = new VeiculoRepositorio();

	public boolean validarMarca(String marca) {
		boolean resultado = false;
		if (marca != null &&  !"".equals(marca.trim()) && marca.length()>=3){
			resultado = true;
		}//if
		return resultado;
	}//validarMarca

	public boolean validarPlaca(String placa) {
		boolean resultado = false;
		if (placa != null && placa.length()==7){
			resultado = true;
		}//if
		return resultado;
	}//validarPlaca

	public boolean validarAnoFabricacao(int anoFabricacao) {
		boolean resultado = false;
		if (anoFabricacao>=2000){
			resultado = true;
		}//if
		return resultado;
	}//validarAnoFabricacao

	public boolean validarAnoModelo(int anoModelo, int anoFabricacao) {
		boolean resultado = false;
		if (anoModelo>anoFabricacao){
			resultado = true;
		}//if
		return resultado;
	}//validarAnoModelo

	public boolean cadastrarVeiculos(String marca, String modelo, String placa, int anoFabricacao, int anoModelo,
			String cor) {
		boolean resultado = false;
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setPlaca(placa);
		veiculo.setAnoFabricacao(anoFabricacao);
		veiculo.setAnoModelo(anoModelo);
		veiculo.setCor(cor);
		if(repositorio.cadastarVeiculo(veiculo)){
			resultado = true;
		}
		return resultado;
	}

	public ArrayList<Veiculo> listarVeiculos() {
		return repositorio.listarVeiculos();
	}//listarVeiculos

	public ArrayList<Veiculo> listarPorMarca(String pesquisa) {
		Veiculo atual = null;
		ArrayList<Veiculo> lista = repositorio.listarVeiculos();
		ArrayList<Veiculo> lista2 = new ArrayList<Veiculo>();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			if(atual.getMarca().startsWith(pesquisa)){
				lista2.add(atual);				
			}//if
		}//for
		return lista2;
	}

	public ArrayList<Veiculo> listarPorModelo(String pesquisa) {
		Veiculo atual = null;
		ArrayList<Veiculo> lista = repositorio.listarVeiculos();
		ArrayList<Veiculo> lista2 = new ArrayList<Veiculo>();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			if(atual.getModelo().startsWith(pesquisa)){
				lista2.add(atual);				
			}//if
		}//for
		return lista2;
	}

	public ArrayList<Veiculo> listarPorPlaca(String pesquisa) {
		Veiculo atual = null;
		ArrayList<Veiculo> lista = repositorio.listarVeiculos();
		ArrayList<Veiculo> lista2 = new ArrayList<Veiculo>();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			if(atual.getPlaca().startsWith(pesquisa)){
				lista2.add(atual);				
			}//if
		}//for
		return lista2;
	}

	public ArrayList<Veiculo> listarPorAnoFabricacao(int pesquisa) {
		Veiculo atual = null;
		ArrayList<Veiculo> lista = repositorio.listarVeiculos();
		ArrayList<Veiculo> lista2 = new ArrayList<Veiculo>();
		for (int i = 0;i<lista.size();i++){
			atual = lista.get(i);
			if(atual.getAnoFabricacao()==pesquisa){
				lista2.add(atual);				
			}//if
		}//for
		return lista2;
	}

	public boolean remover(int remocao) {
		return repositorio.remover(remocao);
	}
	
	
	

}
