/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Controlador;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facastaneda
 */
public class Detalle extends javax.swing.JInternalFrame {
    
    private Controlador ctrl;
    private Object[][] dtDetalle;

    /**
     * Creates new form Detalle
     */
    public Detalle(Controlador ctrl) {
        initComponents();
        this.ctrl = ctrl;
        this.setTitle("Detalle de Venta Factura N° "+ ctrl.getNumFactura() +" - by Mouse");
        updateTabla();
    }
    
     private void updateTabla(){
        //actualiza los datos de la tabla realizando una consulta a la base de datos
        String[] columNames = {"id producto","cantidad","precio/Unidad","Total"};        
        //nombre de columnas, tabla, instruccion sql
        dtDetalle = ctrl.getDetalle( ctrl.getNumFactura() );
        // se colocan los datos en la tabla
        DefaultTableModel datos = new DefaultTableModel(dtDetalle,columNames);
        tabla.setModel(datos);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
