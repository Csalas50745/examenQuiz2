/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
public class Congregacion {

    public Congregacion(int congregacion, String lecture) {
        this.congregacion = congregacion;
        this.lecture = lecture;
    }

    public int getCongregacion() {
        return congregacion;
    }

    public void setCongregacion(int congregacion) {
        
        for (int i = 0; i < Integer.parseInt(JOptionPane.showInputDialog("Cuantas congregacion hay? ")); i++) {
            
        }
        this.congregacion = congregacion;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }
    
    int congregacion; 
    String lecture;
    
}
