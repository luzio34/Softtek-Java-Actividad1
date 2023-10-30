
import javax.swing.JOptionPane;

public class Numeros {
    
    private int num1;
    private int num2; 
    private int suma;

    public void leerNumeros (){
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do numero"));    
    }
    
    public void suma () {
        suma = num1 + num2;
    }
    
     public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
    }
    
}
