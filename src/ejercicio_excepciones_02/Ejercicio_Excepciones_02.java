/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
*/
package ejercicio_excepciones_02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ejercicio_Excepciones_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa genera, captura y trata una excepción ArrayIndexOutOfBoundsException.");
        
        System.out.println("\nGenerando un Array de número enteros de tamaño 5.");
        int[] arrayInt = {1,2,3,4,5};
        
        boolean repetir;
        do {            
            repetir=false;
            try {
            
                MostrarValor(arrayInt);
            
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                repetir=true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número entero la próxima vez.");
                repetir=true;
            }
        } while (repetir);
        
        System.out.println("Programa finalizado.");
        
    }
    
    public static void MostrarValor(int [] arrayInt)throws ArrayIndexOutOfBoundsException, InputMismatchException{
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("\nElija la posición del array que quiere mostrar: ");
        int posicion=leer.nextInt();
        if(posicion>=5 || posicion<0){
            throw new ArrayIndexOutOfBoundsException("El número que ingreso está fuera del rango del Array.");
        }
        
        System.out.println("\nValor en la posición "+posicion+": "+arrayInt[posicion]);
        
    }
    
}
