package EX6;
import javax.swing.JOptionPane;
public class CoinConvApp {

	public static void main(String[] args) {
		String texto=JOptionPane.showInputDialog("Escribe una cantidad en euros");
        double cantidad=Double.parseDouble(texto);
        String moneda=JOptionPane.showInputDialog("Escribe la moneda a la que quieres convertir");
        conversor(cantidad, moneda);
    }
   public static void conversor (double cantidad, String moneda){
        double res=0;
        boolean correcto = true;
        switch (moneda){
        case "libras":
            res=cantidad*0.86;
            break;
        case "dolares":
            res=cantidad*1.29;
            break;
        case "yenes":
            res=cantidad*129.852;
            break;
        default:
            System.out.println("No has introducido una moneda correcta");
            correcto=false;
        }
 
        if (correcto){
            System.out.println(cantidad+ " euros en " +moneda+ " son " +res);
        }
		
	}

}
