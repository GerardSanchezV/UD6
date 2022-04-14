package EX6;
import javax.swing.JOptionPane;
public class MultArraysApp {
 
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int tamanio=Integer.parseInt(texto);
 
        int array1[]=new int [tamanio];
        int array2[];
 
        rellenarNumAleatorioArray(array1, 10, 100);
 
        array2=array1;
 
        array1=new int[tamanio];
 
        rellenarNumAleatorioArray(array1, 10, 100);
 
        int array3[]=multiplicador(array1, array2);
 
        System.out.println("Array1");
        mostrarArray(array1);
 
        System.out.println("Array2");
        mostrarArray(array2);
 
        System.out.println("Array3");
        mostrarArray(array3);
 
                
                System.gc();
 
    }
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){      
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
 
    public static int[] multiplicador(int array1[], int array2[]){
        int array3[]=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }
}