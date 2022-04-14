package EX6;
import javax.swing.JOptionPane;
public class FactorialesApp {

	public static void main(String[] args) {
		String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        System.out.println("El factorial de "+numero+ " es " +factorial(numero));
    }
   public static int factorial (int numero){
        int res=numero;
        for(int cont=(numero-1);cont>0;cont--){
            res=res*cont;
        }
        return res;
    }
		
}
