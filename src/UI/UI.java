/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author User
 */
public class UI {

    public void iniciarPrograma() {
        /*
        RedSocialFrame interfaz = new RedSocialFrame();  
        interfaz.setTitle("Registro de Usuario");
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
        */
        
        LoginFrame logFrm = new LoginFrame();
        logFrm.setTitle("Login");
        logFrm.setLocationRelativeTo(null);
        logFrm.setVisible(true);
        
    }
    
}
