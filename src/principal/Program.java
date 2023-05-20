package principal;

public class Program {

	public static void main(String[] args) {
		//mais uma utilizada quando ja sabemos
		//a quantidade de vezes que precisamos
		//repetir comandos
		
		/*SINTAXE DO FOR 
		*1° variável que inicia o contador;
		*2° condição que deve ser aceita;
		*3° incremento
		*/
		
		/*1 Programa em Java que mostra os números ímpares ate 25
		* 2 Altere o primeiro programa para mostrar a soma dos números impares
		* 3 altere novamente o programa para mostrar os números impares um abaixo do outro e depois um ao lado do outro
		*/
		 int soma = 0;
		 
		for (int contador = 0; contador <= 25; contador++){
			 if (contador % 2 != 0 ) {
			 		 
			 System.out.println(contador);
			 		 
			 }	 
		 }
		for (int contador = 0; contador <= 25; contador++){
			 if (contador % 2 != 0 ) {
				 
				 soma += contador;
				 System.out.print(contador+" + ");
			 }if(contador == 25) {
				 
				 System.out.println(" = "+soma);
			 
			 }}
		
	}
	
	

}
