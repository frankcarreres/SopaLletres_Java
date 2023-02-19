
package sopalletresompliteclat;

public class SopalletresOmpliTeclat {

    /**
     * @author Frank Carreres Catalá :P
     * Aquesta funció s'utilitza per omplir la sopa de paraules introïdes per teclat, introduïra tantes lletres com columnes té la sopa.
     * 
     *  - Demana una paraula de tantes lletres com columnes té la sopa. 
     *  - Posa cada lletra de la paraula en cada columna d'eixa fila.
     * 
     * @param sopa
     * 
     */
    
    static void ompliPerTeclat(char sopa[][]){
        
        for (int fila = 0; fila < sopa.length; fila++) {
            
            String paraula = "";
            
            while (paraula.length() < sopa[0].length){
                
                paraula = Teclat.lligString("- Quina paraula vols colocar a la fila " + fila + ": ");     
            }
           
            
            for (int col = 0; col < sopa[0].length; col++) {
                
                sopa [fila][col] = paraula.charAt(col);
                
            }
              
        }
        
    }
    

    public static void main(String[] args) {
          
    }
    
}
