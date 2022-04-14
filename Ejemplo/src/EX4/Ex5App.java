package EX4;


public class Ex5App {

	public static void main(String[] args) {
		int A=0;
		int B=5;
		int C=10;
		int D=20;
		int AUX;
		System.out.println("Valores iniciales");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		System.out.println("D = "+D);
		
		AUX=B;
		B=C;
		C=A;
		A=D;
		D=AUX;
			
		System.out.println("Valores finales");
		System.out.println("B tome el valor de C entonces B = "+B);
		System.out.println("C tome el valor de A entonces C = "+C);
		System.out.println("A tome el valor de D entonces A = "+A);
		System.out.println("D tome el valor de B entonces D = "+D);

	}

}
