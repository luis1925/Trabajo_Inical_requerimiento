
package Vista;
import Control.ArregloEmpresa;
import Control.ArregloFechas;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import org.jvnet.substance.SubstanceLookAndFeel;

public class Trabajo extends javax.swing.JFrame {

     ArregloFechas objFechas= new ArregloFechas();
     ArregloEmpresa objDias= new ArregloEmpresa();
     
    public Trabajo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.EmeraldDuskSkin");

        //incorporar dias de facturacion a la tabla
        int numero_columnas=tbl_data.getColumnCount();
        int pos=0;
        for (int i = 0; i <=numero_columnas ; i++) {
            if(i==1){
               tbl_data.setValueAt(objDias.getElementoRegistro(pos), 0, i);
               pos=pos+1;
            }
            else if(i==3){
                tbl_data.setValueAt(objDias.getElementoRegistro(pos), 0, i);
                pos=pos+1;
            }
            else if(i==5){
                tbl_data.setValueAt(objDias.getElementoRegistro(pos), 0, i);
                pos=pos+1;
            }
            else if(i==7){
                tbl_data.setValueAt(objDias.getElementoRegistro(pos), 0, i);
                pos=pos+1;
            }
        }
        //llenar combo de meses
        cbo_meses.removeAllItems();
        cbo_meses.addItem("--seleccione--");
          for (int i = 0; i < objFechas.getRegistro().size(); i++) {
            String mes=(String) objFechas.getElementoRegistro(i)[0];
            cbo_meses.addItem(mes);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_diaDesembolso = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        cbo_meses = new javax.swing.JComboBox<>();
        jpanel_grafica = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpanel_fechas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        label_fechaCorte = new javax.swing.JLabel();
        label_fechaFacturacion = new javax.swing.JLabel();
        label_fechaDesembolso = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación");
        setIconImages(null);

        jLabel1.setText("Dia de desembolso:");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        cbo_meses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "meses" }));
        cbo_meses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_mesesItemStateChanged(evt);
            }
        });

        jpanel_grafica.setPreferredSize(new java.awt.Dimension(0, 120));

        jLabel2.setText("Grafica:");

        jpanel_fechas.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jpanel_fechasLayout = new javax.swing.GroupLayout(jpanel_fechas);
        jpanel_fechas.setLayout(jpanel_fechasLayout);
        jpanel_fechasLayout.setHorizontalGroup(
            jpanel_fechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        jpanel_fechasLayout.setVerticalGroup(
            jpanel_fechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        tbl_data.setForeground(new java.awt.Color(204, 0, 0));
        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "2", "", "4", "", "6", "", "8", ""}
            },
            new String [] {
                "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_data.setAlignmentX(0.0F);
        tbl_data.setAlignmentY(0.0F);
        tbl_data.setAutoscrolls(false);
        tbl_data.setEnabled(false);
        tbl_data.setFocusable(false);
        tbl_data.setRowMargin(0);
        tbl_data.setShowHorizontalLines(false);
        tbl_data.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tbl_data);

        jLabel4.setText("Dias de facturacion");

        label_fechaCorte.setText("fecha de corte");

        label_fechaFacturacion.setText("fecha de facturacion");

        label_fechaDesembolso.setText("fecha de desembolso");

        javax.swing.GroupLayout jpanel_graficaLayout = new javax.swing.GroupLayout(jpanel_grafica);
        jpanel_grafica.setLayout(jpanel_graficaLayout);
        jpanel_graficaLayout.setHorizontalGroup(
            jpanel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_graficaLayout.createSequentialGroup()
                .addGroup(jpanel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_fechaCorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_fechaFacturacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanel_graficaLayout.createSequentialGroup()
                        .addGroup(jpanel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2)
                                .addGroup(jpanel_graficaLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jpanel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jpanel_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(label_fechaDesembolso))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpanel_graficaLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_graficaLayout.setVerticalGroup(
            jpanel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_graficaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(label_fechaDesembolso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_fechaCorte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_fechaFacturacion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanel_grafica, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbo_meses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_diaDesembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_calcular)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cbo_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_diaDesembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calcular))
                .addGap(18, 18, 18)
                .addComponent(jpanel_grafica, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed

        try {
             //recuperacion de datos del formulario
            int date = Integer.parseInt(txt_diaDesembolso.getText());
            int valor_mes_formulario = cbo_meses.getSelectedIndex();
            //validacion de mensaje
             message(valor_mes_formulario, date);
            //mostrar la fecha de desembolso
            label_fechaDesembolso.setText("La fecha de desembolso es " + date + " de " + objFechas.getElementoRegistro(valor_mes_formulario-1)[0]);
            //para hallar la fecha de corte
            int valor_mes_fecha_corte=0;
            int fecha_de_corte = 0;
            for (int i = 0; i < objDias.getRegistro().size(); i++) {
                if(objDias.getElementoRegistro(i)>date){
                    fecha_de_corte = objDias.getElementoRegistro(i);
                    valor_mes_fecha_corte=valor_mes_formulario;
                    label_fechaCorte.setText("La fecha de corte seria: " + fecha_de_corte + " de " + objFechas.getElementoRegistro(valor_mes_fecha_corte-1)[0]);
                    break;
                }
                else if(date > objDias.getElementoRegistro(i) && date > objDias.getElementoRegistro(objDias.getRegistro().size()-1)){
                    fecha_de_corte = objDias.getElementoRegistro(0);
                    valor_mes_fecha_corte=valor_mes_formulario+1;
                    if(valor_mes_formulario==12){
                        valor_mes_fecha_corte=1;
                    }
                    label_fechaCorte.setText("La fecha de corte seria: " + fecha_de_corte + " de " + objFechas.getElementoRegistro(valor_mes_fecha_corte-1)[0]);
                    break;
                }
                else if(date == objDias.getElementoRegistro(i) && date >= objDias.getElementoRegistro(objDias.getRegistro().size()-1)){
                    fecha_de_corte = objDias.getElementoRegistro(0);
                    valor_mes_fecha_corte = valor_mes_formulario+1;
                    label_fechaCorte.setText("La fecha de corte seria: " + fecha_de_corte + " de " + objFechas.getElementoRegistro(valor_mes_fecha_corte-1)[0]);
                    break;
                }
            }
            //hallar la fecha provicional
            int valor_mes_fecha_facturacion=0;
            int fecha_provicional = 0;
            int residuo_mes=0;
            if(fecha_de_corte < 12){
                fecha_provicional = fecha_de_corte + 15;
                valor_mes_fecha_facturacion=valor_mes_fecha_corte;
            }
            else{
               fecha_provicional = fecha_de_corte + 15;
               int maxMes=(int) objFechas.getElementoRegistro(valor_mes_fecha_corte-1)[1];
               if(fecha_provicional > maxMes){
                   residuo_mes=fecha_provicional-maxMes;
                   fecha_provicional = residuo_mes;
                   valor_mes_fecha_facturacion = valor_mes_fecha_corte+1;
                   if(valor_mes_fecha_facturacion==13){
                       valor_mes_fecha_facturacion=1;
                   }
               }
               else{
                    valor_mes_fecha_facturacion = valor_mes_fecha_corte+1; 
               }
            }
            //calculo de la aproximacion del dia de facturacion
            int fecha_facturacion=0;
            int residuoIzquierda=0;
            int residuoDerecha=0;
            for (int i = 0; i < objDias.getRegistro().size(); i++) {
                if(objDias.getElementoRegistro(i) < fecha_provicional && objDias.getElementoRegistro(i+1)> fecha_provicional){
                    residuoIzquierda = fecha_provicional-objDias.getElementoRegistro(i);
                    residuoDerecha = objDias.getElementoRegistro(i+1)-fecha_provicional;
                    if(residuoIzquierda < residuoDerecha){
                        fecha_facturacion= objDias.getElementoRegistro(i);
                    }
                    else{
                        fecha_facturacion = objDias.getElementoRegistro(i+1);
                    }
                }
                else if(fecha_provicional > objDias.getElementoRegistro(objDias.getRegistro().size()-1)){
                    fecha_facturacion= objDias.getElementoRegistro(0);
                    if(valor_mes_fecha_facturacion > 12){
                        valor_mes_fecha_facturacion = 1;
                    }
                    break;
                }
                else if(fecha_provicional==objDias.getElementoRegistro(i)){
                    fecha_facturacion= objDias.getElementoRegistro(i);
                    break;
                }
            }
            label_fechaFacturacion.setText("La fecha de facturacion seria: " +fecha_facturacion+ " de " +
                    objFechas.getElementoRegistro(valor_mes_fecha_facturacion-1)[0]);
           //cambiar el color de la linea y las fechas 
            jpanel_fechas.setBackground(new Color(22,154,237));
            tbl_data.setForeground(new Color(22,154,237));
          
        } catch (Exception e) {
            int valor_mes_formulario = cbo_meses.getSelectedIndex();
            if(valor_mes_formulario==0){
                JOptionPane.showMessageDialog(this, "Debe seleccionar un mes");
            }
            else{
                JOptionPane.showMessageDialog(this, "Debe ingresar un dia de desembolso");
            }
        }
        
       
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void cbo_mesesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_mesesItemStateChanged
        // TODO add your handling code here:
        int pos=cbo_meses.getSelectedIndex();
        if(pos!=0){
            status(1);
            jpanel_grafica.setForeground(new Color(204, 51, 0));
            tbl_data.setForeground(new Color(204, 51, 0));
        }
        else{
            status(0);
            jpanel_fechas.setBackground(new Color(204, 51, 0));
            tbl_data.setForeground(new Color(204, 51, 0));
            label_fechaCorte.setText("fecha de corte");
            label_fechaFacturacion.setText("fecha de facturacion");
            label_fechaDesembolso.setText("fecha de desembolso");
        }
    }//GEN-LAST:event_cbo_mesesItemStateChanged

     public void message(int valor_mes_formulario,int day){
        String mes = cbo_meses.getItemAt(valor_mes_formulario);
        String message="El mes de "+ mes+" no tiene "+day+" dias.";
        for (int i = 0; i < objFechas.getRegistro().size(); i++) {
            int valor_maximo_mes = (int) objFechas.getElementoRegistro(i)[1];
            if(i == valor_mes_formulario-1 && valor_maximo_mes < day){
                JOptionPane.showMessageDialog(this, message);
                txt_diaDesembolso.setText("");
                break;
            }
        }
    }
     public void status(int status){
        if(status==0){
            btn_calcular.setEnabled(false);
            txt_diaDesembolso.setEnabled(false);
        }
        else{
             btn_calcular.setEnabled(true);
             txt_diaDesembolso.setEnabled(true);
        }
    }
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
            java.util.logging.Logger.getLogger(Trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JComboBox<String> cbo_meses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpanel_fechas;
    private javax.swing.JPanel jpanel_grafica;
    private javax.swing.JLabel label_fechaCorte;
    private javax.swing.JLabel label_fechaDesembolso;
    private javax.swing.JLabel label_fechaFacturacion;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_diaDesembolso;
    // End of variables declaration//GEN-END:variables
}
