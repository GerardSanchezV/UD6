package EX6;
import java.util.Scanner;
public class NumerosPrimosApp {

	public static void main(String [] args){

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce el tama�o deseado para tu array porfavor: ");
	    int tama�o = sc.nextInt();
	    int array_primos[] = new int[tama�o]; 

	    int cantidadPrimos = 0, numero = 0;

	    while(cantidadPrimos < array_primos.length){

	        numero = (int) (Math.random()*100 + 1);

	        if(esPrimo(numero) == true){

	            array_primos[cantidadPrimos] = numero;
	            System.out.println(array_primos[cantidadPrimos]);
	            cantidadPrimos++; 
	        }
	       }
	    }
	    
	

	public static boolean esPrimo(int num){ 

	        int contador = 2;
	        boolean primo = true;

	        while(contador < num){

	            if(num % contador == 0){
	    
	                primo = false;
	                break;

	            }else{

	                contador++;
	            }
	        }
	            
	        return primo;

	}
	}