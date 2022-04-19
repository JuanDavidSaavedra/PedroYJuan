/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedroyjuan;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class PedroYJuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Declaración de variables
        int n;
        double C1, C2, C3;
        String rta = "CAPITAL - MESES: \n\n";
        
        //Input
        C1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del capital de Pedro: "));
        C2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del capital Juan: "));
        C3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del capital para iniciar el negocio: "));
        
        //Processing
        
        n = 0;
        
        while (C1 + C2 < C3)
        {
            rta = rta + "C1: " + C1 + " -- C2: " + C2 + " -- C3: " + C3 + "\n";
            C1 = 1.03*C1;
            C2 = 1.04*C2;
            n++;
        }
        
        //Output
        JOptionPane.showMessageDialog(null, rta + "En " + n + " meses, uniendo los 2 capitales de Pedro y Juan, se puede hacer el negocio que desean.");
        
        //End
        System.exit(0);
    }
    
}
