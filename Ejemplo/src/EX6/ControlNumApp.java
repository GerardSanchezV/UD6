package EX6;

import javax.swing.JOptionPane;
public class ControlNumApp {
 
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(texto)];
 
        int ultimoDigito;
        do{
            texto=JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
            ultimoDigito=Integer.parseInt(texto);
        }while(!(ultimoDigito>=0 && ultimoDigito<=9));
 
        rellenarNumAleatorioArray(num, 1, 300);
 
        int terminadosEn[]=numTerminadosEn(num, ultimoDigito);
 
        mostrarArrayTerminadosEn(terminadosEn);
 
    }
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrarArrayTerminadosEn(int lista[]){
        for(int i=0;i<lista.length;i++){
            if(lista[i]!=0){
                System.out.println("El numero "+lista[i]+" acaba en el numero deseado");
            }
        }
    }
 
    public static int[] numTerminadosEn (int num[], int ultimo_numero){
 
        int terminadosEn[]=new int[num.length];
 
        int numeroFinal=0;
 
        for (int i=0;i<terminadosEn.length;i++){

            numeroFinal=num[i]-(num[i]/10*10);

            if (numeroFinal==ultimo_numero){
                terminadosEn[i]=num[i];
            }
        }
 
        return terminadosEn;
    }
 
}
