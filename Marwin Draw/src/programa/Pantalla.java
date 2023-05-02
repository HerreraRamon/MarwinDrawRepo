
package programa;


import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

    NumeroLinea numLinea;
    public Pantalla() {
        initComponents();
        numLinea= new NumeroLinea(txtResultado);
        jScrollPane1.setRowHeaderView(numLinea);
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
                    T_Dinamica.getInstancia().anadir("Comillas", lexer.lexeme);
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Cadena", lexer.lexeme);
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Tipo de Dato", lexer.lexeme);
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Reservada IF", lexer.lexeme);
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Reservada ELSE", lexer.lexeme);
                    break;
                /*case Do:
                    resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Reservada Do", lexer.lexeme);
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Reservada while", lexer.lexeme);
                    break;*/
                case For:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Reservada for", lexer.lexeme);
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Operador igual", lexer.lexeme);
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Operador suma", lexer.lexeme);
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Opeador resta", lexer.lexeme);
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Operador multiplicacion", lexer.lexeme);
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Operador division", lexer.lexeme);
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Operador logico", lexer.lexeme);
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Operador incremento", lexer.lexeme);
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Operador relacional", lexer.lexeme);
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Operador atribucion", lexer.lexeme);
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                    T_Dinamica.getInstancia().anadir("Operador booleano", lexer.lexeme);
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Parentesis de apertura", lexer.lexeme);
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Parentesis de cierre", lexer.lexeme);
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Llave de apertura", lexer.lexeme);
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Llave de cierre", lexer.lexeme);
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Corchete de apertura", lexer.lexeme);
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Corchete de cierre", lexer.lexeme);
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Reservada main", lexer.lexeme);
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Punto y coma", lexer.lexeme);
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Identificador", lexer.lexeme);
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Numero", lexer.lexeme);
                    break;
                case Squa:
                    resultado += "  <Cuad>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Cuad", lexer.lexeme);
                    break;
                case Tria:
                    resultado += "  <Tria>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Tria", lexer.lexeme);
                    break;
                case Circ:
                    resultado += "  <Cir>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Cir", lexer.lexeme);
                    break;
                case Trazar:
                    resultado += "  <Trazar>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Trazar", lexer.lexeme);
                    break;
                case Index:
                    resultado += "  <Indice>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Indice", lexer.lexeme);
                    break;
                case Move:
                    resultado += "  <Move>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Move", lexer.lexeme);
                    break;
                case Rotate:
                    resultado += "  <Rotar>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Rotar", lexer.lexeme);
                    break;
                case Resize:
                    resultado += "  <Escalar>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Escalar", lexer.lexeme);
                    break;
                case Link:
                    resultado += "  <Unir>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Unir", lexer.lexeme);
                    break;
                case Draw:
                    resultado += "  <Dibujar>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Dibujar", lexer.lexeme);
                    break;
                case Funcion:
                    resultado += "  <Funcion>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Funcion", lexer.lexeme);
                    break;
                case All:
                    resultado += "  <All>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("All", lexer.lexeme);
                    break;
                case Coma:
                    resultado += "  <Coma>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Coma", lexer.lexeme);
                    break;    
                case Array:
                    resultado += "  <Array>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Array", lexer.lexeme);
                    break;
                case Table:
                    resultado += "  <Array>\t\t" + lexer.lexeme + "\n";
                    dinamica(""+lexer.lexeme);
                     T_Dinamica.getInstancia().anadir("Table", lexer.lexeme);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        btnDinamica = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        txtAnalizarLex.setEditable(false);
        txtAnalizarLex.setBackground(new java.awt.Color(51, 153, 255));
        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        btnArchivo.setBackground(new java.awt.Color(255, 255, 51));
        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abrir (1).png"))); // NOI18N
        btnArchivo.setText("Abrir ");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnAnalizarLex.setBackground(new java.awt.Color(255, 255, 51));
        btnAnalizarLex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizarLex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/copilar (1).jpg"))); // NOI18N
        btnAnalizarLex.setText("Analizar");
        btnAnalizarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tabla.png"))); // NOI18N
        jButton1.setText("Tabla Estatica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAnalizarSin.setEditable(false);
        txtAnalizarSin.setBackground(new java.awt.Color(255, 255, 51));
        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programa/logo.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnDinamica.setBackground(new java.awt.Color(255, 255, 51));
        btnDinamica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDinamica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tabla.png"))); // NOI18N
        btnDinamica.setText("Tabla Dinamica");
        btnDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinamicaActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 51));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abrir (1).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAnalizarLex, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDinamica))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalizarLex, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDinamica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // All add your handling code here:
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
        txtAnalizarSin.setText("");
        try {
             T_Dinamica.getInstancia().limpiar();
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ST = txtResultado.getText();
        Sintax s = new Sintax(new programa.LexerCup(new StringReader(ST)));
      
        try {
            s.parse();
            resultado+="Analisis realizado correctamente";

            txtAnalizarLex.setText(resultado);
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
           
        } catch (Exception ex) {
            Symbol sym = s.getS();
            h="";
            h+="Fatal error. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"";
            txtAnalizarSin.append(h);
            txtAnalizarSin.setForeground(Color.red);
        }

    }//GEN-LAST:event_btnAnalizarLexActionPerformed

    public static void algo(String cad){

        txtAnalizarSin.append(cad+"\n");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        T_estatica vtn = new T_estatica();
        vtn.setVisible(true);        // All add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // All add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinamicaActionPerformed
       T_Dinamica.getInstancia().setVisible(true);
    }//GEN-LAST:event_btnDinamicaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
            archivo.showSaveDialog(this);
            if (archivo.getSelectedFile() != null) {
            try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
            guardado.write(txtResultado.getText());
            }
            }
        } catch (IOException ex) {
            //JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
private String h="";
private String[] din;
private Stack<String>st = new Stack<String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLex;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnDinamica;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private static javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
