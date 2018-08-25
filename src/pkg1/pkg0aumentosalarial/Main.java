/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg0aumentosalarial;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double salarioinicial =1000,salariofinal=0;
       double aux,acum=1.5;
       
       aux=(1000*acum)/100;
       salariofinal=salarioinicial+aux;           
       acum=acum*2;
       for(int i=2006;i<2018;i++)
       {           
           aux=(1000*acum)/100;
           salariofinal=salariofinal+aux;         
       }
        JOptionPane.showMessageDialog(null,"salario atual é:"+salariofinal);
    }
    
}
