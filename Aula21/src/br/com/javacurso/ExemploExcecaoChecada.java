package br.com.javacurso;

public class ExemploExcecaoChecada {
	
	public static void main(String[] args) throws Exception {
		boolean ok = usaImprimirRange();
		if(ok){
			System.out.println("Range foi impresso!");
		}
	}//main
	
	private static boolean usaImprimirRange()throws Exception{
		boolean ok = true;
		int inicio = 1;
		int fim = 10;
		try{
			imprimirRange(inicio, fim);
			return ok;
		}catch(RangeInvalidoException ex){
			System.out.println(ex.getMessage());
			System.out.println("Fiz tratativas");
			ok = false;
			return ok;
		}finally{
			System.out.println("Finally excecuted");
		}
	}

	private static void imprimirRange(int inicio, int fim) throws RangeInvalidoException{
		if(fim <= inicio){
			throw new RangeInvalidoException("Fim deve ser maior que inicio.");
		}else{
			for(int i = inicio;i<=fim;i++){
				System.out.printf("%d ",i);
			}
			System.out.println("");
		}
	}//imprimirRange
	
}//class
