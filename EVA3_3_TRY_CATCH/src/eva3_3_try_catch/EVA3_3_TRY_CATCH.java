/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_try_catch;

/**
 *
 * @author invitado
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
             int x=3,y=0;
            int res=x/y;
            System.out.println("Resultado: "+res);
            
//            Primero va el tipo de excepcion y luego la variable
        } catch (ArithmeticException error) {
                    System.out.println("Exception: "+error.getMessage());
        } 
        
        
        
        System.out.println("Si jala");
    }
    
}
