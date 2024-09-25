
package IGU;


public class Matriz2 extends javax.swing.JFrame {

    public Matriz2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Filas = new javax.swing.JTextField();
        Columnas = new javax.swing.JTextField();
        Generador = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N° Filas");

        jLabel2.setText("N° Columnas");

        Filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilasActionPerformed(evt);
            }
        });

        Columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColumnasActionPerformed(evt);
            }
        });

        Generador.setText("Generar");
        Generador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneradorActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Area.setColumns(20);
        Area.setRows(5);
        jScrollPane2.setViewportView(Area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Filas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Generador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilasActionPerformed
        int filas = PedirFilas();
    }//GEN-LAST:event_FilasActionPerformed

    private void ColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColumnasActionPerformed
        int columnas = PedirColumnas();
    }//GEN-LAST:event_ColumnasActionPerformed

    private void GeneradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneradorActionPerformed
        int filas = PedirFilas();      // Obtener el número de filas
        int columnas = PedirColumnas(); // Obtener el número de columnas

        // Verificar que los valores sean válidos antes de generar la matriz
        if (filas > 0 && columnas > 0) {
            MostrarCampoMatriz(filas, columnas); // Mostrar la matriz si ambos son válidos
        } else {
            // Opcional: Mostrar un mensaje de error si las filas o columnas son inválidas
            System.out.println("Por favor, ingrese valores válidos para filas y columnas.");
        }

    }//GEN-LAST:event_GeneradorActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Filas.setText("");
        Columnas.setText("");
        Area.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private int PedirFilas() {
        int filas = 0;
        try {
            filas = Integer.parseInt(Filas.getText());
            if (filas <= 0) {
                System.out.println("El número de filas debe ser mayor que cero.");
                filas = 0; // Reiniciar a 0 si la entrada no es válida
            }
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un numero valido para las filas.");
        }
        return filas;
    }

    private int PedirColumnas() {
        int columnas = 0;
        try {
            columnas = Integer.parseInt(Columnas.getText());
            if (columnas <= 0) {
                System.out.println("El numero de columnas debe ser mayor que cero.");
                columnas = 0; // Reiniciar a 0 si la entrada no es válida
            }
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un numero valido para las columnas.");
        }
        return columnas;
    }

    private void MostrarCampoMatriz(int filas, int columnas) {
        if (filas <= 0 || columnas <= 0) {
            System.out.println("Que dijo, no pense en matrices al usar cero....");
            return;
        }

        StringBuilder matrizString = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizString.append((int) (Math.random() * 100)).append(" ");
            }
            matrizString.append("\n");
        }
        Area.setText(matrizString.toString());
    }

        
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
        java.util.logging.Logger.getLogger(Matriz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Matriz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Matriz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Matriz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Matriz2 M2 = new Matriz2();
            M2.setVisible(true);
            M2.setLocationRelativeTo(null);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area;
    private javax.swing.JTextField Columnas;
    private javax.swing.JTextField Filas;
    private javax.swing.JButton Generador;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
