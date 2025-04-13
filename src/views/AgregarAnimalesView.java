/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import data.Persistencia;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import domain.*;
import java.util.InvalidPropertiesFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class AgregarAnimalesView extends javax.swing.JFrame {

    /**
     * Creates new form AgregarAnimalesView
     */
    
    public AgregarAnimalesView() {
        initComponents();
        filtro(pesoField, "NUMERO");
        filtro(edadField, "NUMERO");
        filtro(paisField, "TEXTO");
        filtro(valorFijoField, "NUMERO");
    }
    
    private void filtro (javax.swing.JTextField campotexto, String opcion){
    ((javax.swing.text.AbstractDocument) campotexto.getDocument()).setDocumentFilter(new javax.swing.text.DocumentFilter() {
    
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        
        switch (opcion){
            case "TEXTO":
                if (text.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) { 
                     super.replace(fb, offset, length, text, attrs);
                 }
                break;
            case "NUMERO":
                if (text.matches("\\d+")) {
                     super.replace(fb, offset, length, text, attrs);
                 }
                break;
                    
        }
        
    }
});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edadField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pesoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        paisField = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        labelAlimentacion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        aptitudLabel = new javax.swing.JLabel();
        valorFijoField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zoológico - Agregar Animales");

        edadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Edad");

        jLabel2.setText("Peso");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar especie...", "León", "Jirafa", "Tigre", "Elefante" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("País");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una especie..." }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Alimentación:");

        labelAlimentacion.setText("...");

        jLabel5.setText("Especie:");

        jLabel6.setText("Sector:");

        jButton1.setText("Agregar Animal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        aptitudLabel.setText("No apto");

        valorFijoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorFijoFieldActionPerformed(evt);
            }
        });
        valorFijoField.setVisible(false);

        jLabel7.setText("Comida Fija");
        jLabel7.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(aptitudLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(edadField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(paisField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorFijoField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAlimentacion)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorFijoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(aptitudLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadFieldActionPerformed

    String alimentacion = new String();
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String especie = (String) jComboBox1.getSelectedItem();
        if("Seleccionar especie...".equals(especie)){
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una especie..."}));
        }else if("Jirafa".equals(especie) || "Elefante".equals(especie)){
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un sector..." ,"Sector 1, Raul", "Sector 3, Maria"}));
            alimentacion = "Herbívoro";
        }else if("León".equals(especie) || "Tigre".equals(especie)){
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un sector..." ,"Sector 2, Maria", "Sector 4, Raul"}));
            alimentacion = "Carnívoro";
        }
        labelAlimentacion.setText(alimentacion);
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    String[] especiesConvert= {"León", "Jirafa", "Tigre", "Elefante"};
    
    
    
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

    }//GEN-LAST:event_jComboBox3ActionPerformed
        double peso;
        int edad;
        String pais;
        int numEspecie=-1;
        int numSector;
        int estado=-1;
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((pesoField.getText()!="") & (edadField.getText()!="") & (paisField.getText()!="") & (jComboBox1.getSelectedItem()!="Seleccionar especie...") & (jComboBox3.getSelectedItem()!="Seleccione un sector...")){
            aptitudLabel.setText("Apto");
            peso = Double.parseDouble(pesoField.getText());
            edad = Integer.parseInt(edadField.getText());
            pais = paisField.getText();
            
            for(int i=0 ; i<4 ; i++){
                if(especiesConvert[i].equals(jComboBox1.getSelectedItem())){
                    numEspecie=i;
                    break;
                }
            }
            
            if(numEspecie==-1){
            System.out.println("Especie no encontrada");
            }else{
            
            String auxiliar = (String) jComboBox3.getSelectedItem();
            numSector = Character.getNumericValue(auxiliar.charAt(7))-1;
            
            Especie esp = Persistencia.getEspecie(numEspecie); 
            
            if(estado==-1){
            if(esp.getTipoAlimentacion().esCarnivoro()){
                try {
                    Persistencia.addAnimal(edad, peso, numEspecie, numSector, 0, paisField.getText());
                    System.out.println("Animal creado");
                } catch (InvalidPropertiesFormatException ex) {
                    System.out.println(ex);
                }
                }else if(esp.getTipoAlimentacion().esHerbivoro()){
                    
                    javax.swing.JOptionPane.showMessageDialog(null, "Al ser herbívoro necesitas ingresar la cantidad de comida fija.");
                    jLabel7.setVisible(true);
                    valorFijoField.setVisible(true);
                    estado=1;
                    
                }
            }else if(!valorFijoField.getText().equals("")){
                try {
                    Persistencia.addAnimal(edad, peso, numEspecie, numSector, Double.parseDouble(valorFijoField.getText()), paisField.getText());
                    System.out.println("Animal creado");
                    estado=-1;
                    jLabel7.setVisible(false);
                    valorFijoField.setVisible(false);
                } catch (InvalidPropertiesFormatException ex) {
                    System.out.println(ex);
                }             
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, "Al ser herbívoro necesitas ingresar la cantidad de comida fija.");
            }
            }
        }else{
        aptitudLabel.setText("No apto");}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void valorFijoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorFijoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorFijoFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAnimalesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aptitudLabel;
    private javax.swing.JTextField edadField;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelAlimentacion;
    private javax.swing.JTextField paisField;
    private javax.swing.JTextField pesoField;
    private javax.swing.JTextField valorFijoField;
    // End of variables declaration//GEN-END:variables
}
