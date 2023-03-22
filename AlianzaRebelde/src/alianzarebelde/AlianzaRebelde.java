
package alianzarebelde;

import javax.swing.JOptionPane;
public class AlianzaRebelde {
public static void main(String[] args) {
     String Suppre = "Supremacy";
     String AtAt= "At-At";
    
    ObjetoNave AlianzaRebelde = new ObjetoNave ();
    
    AlianzaRebelde.LeerDatos();
    
    if (Suppre.equals(Suppre)){
        JOptionPane.showMessageDialog(null,"Combustible: " + AlianzaRebelde.CalculoSupremacy());
        
        if(AtAt.equals(AtAt)){
        JOptionPane.showMessageDialog(null,"Combustible: " + AlianzaRebelde.CalculoAtAt());
        }else{
           AlianzaRebelde.ImprimirDatos();
        }
    }
        
    }
    
}
