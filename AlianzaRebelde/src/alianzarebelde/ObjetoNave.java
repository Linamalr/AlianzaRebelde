
package alianzarebelde;

import javax.swing.JOptionPane;

public class ObjetoNave {
    private int numPasa,cantiNa = 0;
    private double combus= 3.2408e-14;
    private int km = 0;
    private String tipNave; 
    private final double CalculoCombustible =0;
    
 public ObjetoNave (){
 super ();
 }
 public void LeerDatos(){
 tipNave=JOptionPane.showInputDialog(null, "Digite el tipo de Nave:");
 numPasa= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero de Pasajeros:"));
 km= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de kilometros a recorrer:")); 
 cantiNa=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de Naves:"));
 }

public double CalculoCombustible(){
  double CalculoCombustible = this.km*this.combus;
  return CalculoCombustible;        
}    
public double CalculoSupremacy (){
   double CalculoSupremacy= this.km*this.combus*10/100;
   return CalculoSupremacy;
} 
public double CalculoAtAt (){
  double CalculoAtAt = this.km*this.combus-(10/100);
  return CalculoAtAt;
  
}
public void ImprimirDatos (){
   JOptionPane.showMessageDialog(null,"El Tipo de Nave es:" +tipNave);
   JOptionPane.showMessageDialog(null,"El Numero de Pasajeros son:" +numPasa);
   JOptionPane.showMessageDialog(null,"El Combustible Requerido es:" +CalculoCombustible);
   JOptionPane.showMessageDialog(null,"El tipo de Nave es;" + cantiNa);
}
    public int getNumPasa() {
        return numPasa;
    }

    public void setNumPasa(int numPasa) {
        this.numPasa = numPasa;
    }

    public int getCantiNa() {
        return cantiNa;
    }

    public void setCantiNa(int cantiNa) {
        this.cantiNa = cantiNa;
    }

    public double getCombus() {
        return combus;
    }

    public void setCombus(double combus) {
        this.combus = combus;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getTipNave() {
        return tipNave;
    }

    public void setTipNave(String tipNave) {
        this.tipNave = tipNave;
    
    
    
    
    }

   
     
     }
     
    
    
    
    
    
    
 
 
    

