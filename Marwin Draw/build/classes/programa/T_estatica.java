/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author kevin
 */
public class T_estatica extends javax.swing.JFrame {

      /**
       * Creates new form T_estatica
       */
      public T_estatica() {
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblstatica = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblstatica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Palabra Reservada", "Cuad"},
                {"Palabra Reservada", "Tria"},
                {"Palabra Reservada", "Cir"},
                {"Palabra Reservada", "Trazar"},
                {"Palabra Reservada", "T_dato"},
                {"Palabra Reservada", "Indice"},
                {"Palabra Reservada", "Mover"},
                {"Palabra Reservada", "Rotar"},
                {"Palabra Reservada", "Escalar"},
                {"Palabra Reservada", "Unir"},
                {"Palabra Reservada", "Dibujar"},
                {"Palabra Reservada", "Funcion"},
                {"Palabra Reservada", "Esquema"},
                {"Palabra Reservada", "Todo"},
                {"Palabra Reservada", "Tabla"},
                {"Op_asignacion", "="},
                {"Punto", "."},
                {"Op_aritmeticos", "+"},
                {"Op_aritmeticos", "-"},
                {"Op_aritmetico", "*"},
                {"Op_aritmetico", "/"},
                {"Op_logico", "&&"},
                {"Op_logico ", "| |"},
                {"Op_logico", "|"},
                {"Op_logico", "!"},
                {"Op_logico", "&"},
                {"Op_relacional", ">"},
                {"Op_relacional", ">"},
                {"Op_relacional", "=="},
                {"Op_relacional", "!="},
                {"Op_relacional", ">="},
                {"Op_relacional", "<="},
                {"Op_relacional", "<<"},
                {"Op_relacional", ">>"},
                {"Op_atribucion", "+="},
                {"Op_atribucion", "-="},
                {"Op_atribucion", "*="},
                {"Op_atribucion", "/="},
                {"Op_atribucion", "%="},
                {"Op_incremento", "++"},
                {"Op_incremento", "--"},
                {"Op_booleano", "verdadero"},
                {"Op_booleano", "Falso"},
                {"Op_agrupacion", "("},
                {"Op_agrupacion", ")"},
                {"Op_agrupacion", "{"},
                {"Op_agrupacion", "}"},
                {"Op_agrupacion", "["},
                {"Op_agrupacion", "]"},
                {"P_coma", ";"}
            },
            new String [] {
                "Componente Lexico", "Lexema"
            }
        ));
        jScrollPane1.setViewportView(tblstatica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                  java.util.logging.Logger.getLogger(T_estatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(T_estatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(T_estatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(T_estatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new T_estatica().setVisible(true);
                  }
            });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblstatica;
    // End of variables declaration//GEN-END:variables
}