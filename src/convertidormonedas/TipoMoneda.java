
package convertidormonedas;

import javax.swing.JOptionPane;

/*
 *
 * @author Claudia_94
 * 
 */

public class TipoMoneda {
    
        protected double conversor;
    

        public double ConvertirColonADolar(double valor){
            this.conversor = 0.114;
            double MonedaDolar = (valor * this.conversor);
            MonedaDolar = (double)Math.round(MonedaDolar*100)/100;
            return MonedaDolar; 
            
            // JOptionPane.showMessageDialog(null, "El valor de " + valor + " es igual a  $" + MonedaDolar + " Dolares");
        }
        
        
        public double ConvertirDolarAColon(double valor){
            this.conversor = 0.0875;
            double MonedaColon = (valor * this.conversor)*100;
            MonedaColon = (double)Math.round(MonedaColon*100)/100;
            //JOptionPane.showMessageDialog(null, "El valor de " + valor + " es igual a ₡" + MonedaColon + " Colones");           
            return MonedaColon;
        }
    
        
        public double ConvertirDolarAEuro(double valor){
            this.conversor = 0.904;
            double MonedaEuro = (valor * this.conversor);
            MonedaEuro = (double)Math.round(MonedaEuro*100)/100;
            //JOptionPane.showMessageDialog(null, "El valor de " + valor + " es igual a  €" + MonedaEuro + " Euros"); 
            return MonedaEuro;
        }
        
        
        public double ConvertirDeEuroADolar(double valor){
            this.conversor = 1.0995;
            double MonedaDolars = (valor * this.conversor);
            MonedaDolars = (double)Math.round(MonedaDolars*100)/100;
            //JOptionPane.showMessageDialog(null, "El valor de " + valor + " es igual a  $" + MonedaDolars + " Dolares"); 
            return MonedaDolars;
        }

    
}
