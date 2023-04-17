
package convertidormonedas;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.BorderLayout;

/*
 *
 * @author ClaudiaIliana_Padilla
 * 
 */
public class Principal extends javax.swing.JFrame {


    TipoMoneda MONEDA = new TipoMoneda();
    //   FuncionConvertir CONVERTIR = new FuncionConvertir();
    
    
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);  //para centrar formulario
        //disenoBoton();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn3 = new javax.swing.JComboBox<>();
        btn2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CANTIDAD:");

        txtCantidad.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(36, 47, 65));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONVERTIR DE:");

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolares", "Colones", "Euros", " " }));
        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONVERTIR A:");

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colones", "Dolares", "Euros" }));
        btn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(36, 47, 65));
        btn2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("CONVERTIR");
        btn2.setBorder(null);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  CONVERTIDOR DE MONEDAS  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
      
        /*if(btn1.getSelectedItem().equals("Colones"))
        {
            btn1.addItem("Dolares");
            btn1.addItem("Euros");
        }*/
        btn1.getSelectedItem();
        
    }//GEN-LAST:event_btn1ActionPerformed

    
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
        /*if(btn3.getSelectedItem().equals("Doalres"))
        {
            btn3.addItem("Colones");
            btn3.addItem("Euros");
        }*/
        btn3.getSelectedItem();
    }//GEN-LAST:event_btn3ActionPerformed

    
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       

        if(txtCantidad.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Rellene el campo Cantidad");
        }else{
                
                String ConvertirDe = (String) btn1.getSelectedItem();
                String ConvertirA = (String) btn3.getSelectedItem();

                double Cantidad = Double.parseDouble(txtCantidad.getText());
                double CantidadResultado = Double.parseDouble(txtCantidad.getText());

                String r;

            
                if(ConvertirDe.equals(ConvertirA))
                {
                    JOptionPane.showMessageDialog(null, "Valor Igual, Debes Cambiar el tipo de conversion");
                }
                else
                {
                  //String resultado = String.valueOf(ConvertirMoneda(Cantidad));
                  r = String.valueOf(ConvertirMoneda(Cantidad));

                  /*
                  txtResultado.append("Convertiste: " + Cantidad + " " + ConvertirDe + " A " + ConvertirA + 
                          "\n Obteniendo: " + r + " " + ConvertirA);
                  */  
                  txtResultado.setText("Convertiste: " + Cantidad + " " + ConvertirDe + " A " + ConvertirA + 
                          "\nObteniendo: " + r + " " + ConvertirA);

                }
         }            
    }//GEN-LAST:event_btn2ActionPerformed

    
    
    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
    
            char validar = evt.getKeyChar();
            
            if(Character.isLetter(validar)){
                getToolkit().beep();
                evt.consume();
                
                 JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        
    }//GEN-LAST:event_txtCantidadKeyTyped


    // FUNCION CONVERTIRMONEDA QUE EJECUTA OPERACIONES
    public double ConvertirMoneda(double input){
            
        String opcion = ""; 
        String opcion1 = (String) btn1.getSelectedItem();
        String opcion2 = (String) btn3.getSelectedItem();

       
            if(opcion1.equals("Colones") && opcion2.equals("Dolares")){
                    JOptionPane.showMessageDialog(null, "Elijio Convertir de Colones a Dolares");
                    opcion =String.valueOf(MONEDA.ConvertirColonADolar(input));
            }else if(opcion1.equals("Dolares") && opcion2.equals("Colones")){
                    JOptionPane.showMessageDialog(null, "Elijio Convertir de Dolares a Colones");
                     opcion =String.valueOf(MONEDA.ConvertirDolarAColon(input));
            }else if(opcion1.equals("Euros") && opcion2.equals("Dolares")){
                    JOptionPane.showMessageDialog(null, "Elijio Convertir de Euros a Dolares");
                     opcion =String.valueOf(MONEDA.ConvertirDeEuroADolar(input));
            }else if(opcion1.equals("Dolares") && opcion2.equals("Euros")){
                    JOptionPane.showMessageDialog(null, "Elijio Convertir de Dolares a Euros");
                     opcion =String.valueOf(MONEDA.ConvertirDolarAEuro(input));
            }
            else{
                JOptionPane.showMessageDialog(null, "Elija una opcion!!");
            }
        
        return Double.parseDouble(opcion);
    }
    
    
    
    // FUNCION CONVERTIR TIPO VOID
    public void Convertir(double input){
            
        String opcion;
        String opcion1 = (String) btn1.getSelectedItem();
        String opcion2 = (String) btn3.getSelectedItem();
        
        if(opcion1.equals("Colones") && opcion2.equals("Dolares")){
                JOptionPane.showMessageDialog(null, "Elijio Convertir de Colones a Dolares");
                MONEDA.ConvertirColonADolar(input);
        }else if(opcion1.equals("Dolares") && opcion2.equals("Colones")){
                JOptionPane.showMessageDialog(null, "Elijio Convertir de Dolares a Colones");
                MONEDA.ConvertirDolarAColon(input);
        
        }else{
            JOptionPane.showMessageDialog(null, "Elija una opcion!!");
        }
        
    
    }
    
    
    
    //FUNCION LIMPIAR DATOS 
    public void BorrarD(){
        txtCantidad.setText("");
        txtResultado.setText("");
    
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
        
        /*
        Principal s = new Principal();
        s.setVisible(true);
        */
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox<String> btn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}

