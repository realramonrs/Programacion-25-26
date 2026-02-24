package teoria;

public class ParteC {

	public static int cuentaNumeros(int[] x) {
		int contador = 0;
		for(int i = x.length/2;i<x.length;i++) {
			if(x[i]<100) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void cambiarPorPar(int[] x,int numero) {
		
		for(int i = 0;i<x.length;i++) {
			if(x[i]==numero) {
				if(numero%2==0) {
					x[i]+=2;
				}
				else {
					x[i]+=1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
