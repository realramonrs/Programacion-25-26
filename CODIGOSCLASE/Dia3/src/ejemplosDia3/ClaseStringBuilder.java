package ejemplosDia3;

public class ClaseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder frase = new StringBuilder("Este año el Celta gana la Europa League");
		
        frase.append(" ja ja ja...");
        
        System.out.println(frase);
        
        frase.insert(4,"*");
        
        System.out.println(frase);
        
        frase.delete(10, frase.length());
        
        System.out.println(frase);
	}

}
