/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Congregacion arrCongregacion[] = new Congregacion[1];

        for (int i = 0; i < arrCongregacion.length; i++) {
            String name = JOptionPane.showInputDialog(null,"Digite el nombre de la iglesia: ");
            String name1 = JOptionPane.showInputDialog(null,"Digite su nombre: ");
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad" ));
            arrCongregacion[i] = new Congregacion(name);

        }

    }
    
}
