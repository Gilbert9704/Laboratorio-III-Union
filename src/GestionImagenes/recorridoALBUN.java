/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionImagenes;


import java.awt.Image;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class recorridoALBUN extends javax.swing.JFrame {
 ArrayList<File>direcionDefotosalbun=new ArrayList<>(); 
    
    
   
       File archivo;
       File escrivir;
       byte[] bytesImg=new byte[1024*100];;
       FileInputStream Entrada;
         private  int numeroPedido;
          int idsiguiiente=0;
    
       

    /**
     * Creates new form recorridoALBUN
     */
    public recorridoALBUN() {
        
        initComponents();
    }

    public void setDirecionDefotosalbun(ArrayList<File> direcionDefotosalbun) {
        this.direcionDefotosalbun = direcionDefotosalbun;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IMAGEN = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IMAGEN.setText("  ");

        jButton1.setText("SIGUIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ANTERIOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(IMAGEN, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IMAGEN, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         if((numeroPedido<direcionDefotosalbun.size())||(numeroPedido>0)){
        idsiguiiente++;
        numeroPedido=idsiguiiente;
         
        numeroPedido=idsiguiiente;
            
         try{
                   ImageIcon icon  = new ImageIcon(direcionDefotosalbun.get(numeroPedido).toString() );
                   Icon icono=new ImageIcon(icon.getImage().getScaledInstance(IMAGEN.getWidth(),IMAGEN.getHeight(), Image.SCALE_DEFAULT));
         
                     IMAGEN.setIcon(icono);
                      }catch(Exception ex){
                      }

     
         }else{
             JOptionPane.showMessageDialog(null,"NO HAY MAS IMAGENES HACIA DELANTE");
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        idsiguiiente--; 
        numeroPedido=idsiguiiente;
        
       if((numeroPedido<direcionDefotosalbun.size())||(numeroPedido>0)){
         numeroPedido=idsiguiiente;
        idsiguiiente--; 
           
           
        try{
                   ImageIcon icon  = new ImageIcon(direcionDefotosalbun.get(numeroPedido).toString() );
                   Icon icono=new ImageIcon(icon.getImage().getScaledInstance(IMAGEN.getWidth(),IMAGEN.getHeight(), Image.SCALE_DEFAULT));
         
                     IMAGEN.setIcon(icono);
                      }catch(Exception ex){
                      }
        }else {
            String mensaje="NO HAY MAS IMAGENES HACIA TRAS";
         JOptionPane.showMessageDialog(null,mensaje);}
                                          
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMAGEN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

    private File File(java.lang.String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
