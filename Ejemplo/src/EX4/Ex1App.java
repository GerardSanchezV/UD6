package EX4;

public class Ex1App {

	public static void main(String[] args) {
		int x=5;
		int y=2;
		int suma=0;
		int resta=0;
		int multiplicación=0;
		int división=0;
		int residuo=0;
		
		suma=x+y; // suma=7
		resta=x-y; // resta=3
		multiplicación=x*y; // multiplicación=10
		división=x/y; // división=3
		residuo=x%y; // residuo=1
	
	
	System.out.println("La suma de "+x+" + "+y+" es = "+suma);
	System.out.println("La resta de "+x+" - "+y+" es = "+resta);
	System.out.println("La multiplicación de "+x+" * "+y+" es = "+multiplicación);
	System.out.println("La división de "+x+" / "+y+" es = "+división);
	System.out.println("El residuo de "+x+" % "+y+" es = "+residuo);
	}

}


