package EX6;
import javax.swing.JOptionPane;
public class NumEnteroApp  {
    public static void main(String[] args) {
        int numero=0;
        do{
            String texto=JOptionPane.showInputDialog("Introduce un numero positivo");
            numero=Integer.parseInt(texto);
        }while(numero<0);
        int numCifras=cuentaCifras(numero);
        if (numCifras==1){
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifras");
        }
    }
    public static int cuentaCifras (int numero){
         int contador=0;
         for (int i=numero;i>0;i/=10){
             contador++;
         }
         return contador;
    }
}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		