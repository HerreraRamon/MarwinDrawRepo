/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;


import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import java.util.*;
/**
 *
 * @author yumar
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }
    private void dinamica(String a) throws IOException{
        st.push(a);
    }
    private void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case For:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Cuad:
                    resultado += "  <Cuad>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Tria:
                    resultado += "  <Tria>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Cir:
                    resultado += "  <Cir>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Trazar:
                    resultado += "  <Trazar>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Indice:
                    resultado += "  <Indice>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Mover:
                    resultado += "  <Mover>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Rotar:
                    resultado += "  <Rotar>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Escalar:
                    resultado += "  <Escalar>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Unir:
                    resultado += "  <Unir>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Dibujar:
                    resultado += "  <Dibujar>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Funcion:
                    resultado += "  <Funcion>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Todo:
                    resultado += "  <Todo>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Coma:
                    resultado += "  <Coma>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;    
                case Array:
                    resultado += "  <Array>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case Tabla:
                    resultado += "  <Array>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnAnalizarLex = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 192, 63));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAnalizarLex.setEditable(false);
        txtAnalizarLex.setBackground(new java.awt.Color(166, 227, 95));
        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 322, 349));

        btnArchivo.setBackground(new java.awt.Color(166, 227, 95));
        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnArchivo.setText("Abrir archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 150, 40));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 314, 349));

        btnAnalizarLex.setBackground(new java.awt.Color(166, 227, 95));
        btnAnalizarLex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizarLex.setText("Analizar");
        btnAnalizarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnalizarLex, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 110, 40));

        jButton1.setBackground(new java.awt.Color(166, 227, 95));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("TABLA ESTATICA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 190, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programa/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        txtAnalizarSin.setEditable(false);
        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, 650, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtResultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnAnalizarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLexActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ST = txtResultado.getText();
        Sintax s = new Sintax(new programa.LexerCup(new StringReader(ST)));

        try {
            s.parse();
            resultado+="Analisis realizado correctamente";
            h+="Analisis realizado correctamente";
            txtAnalizarLex.setText(resultado);
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
            txtAnalizarSin.setText(h);
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
            
        } catch (Exception ex) {
            Symbol sym = s.getS();
            resultado+="Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"";
            txtAnalizarLex.setText(resultado);
            txtAnalizarLex.setForeground(Color.red);
            h+="Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"";
            txtAnalizarSin.setText(h);
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAnalizarLexActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        T_estatica vtn = new T_estatica();
        vtn.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
private String resultado;
private String h;
private String[] din;
private Stack<String>st = new Stack<String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLex;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
