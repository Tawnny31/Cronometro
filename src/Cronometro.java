
public class Cronometro extends javax.swing.JFrame implements Runnable {
    private Thread hilo;
    public Cronometro() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        txt_min.setText("0");
        txt_seg.setText("0");
        txt_mil.setText("0");
    }
    
    public void iniciar(){
        hilo=new Thread (this);
        hilo.start();
    }
    
    public void detener(){
        hilo.stop();
    }
    
    public void run(){
        int cantMinutos=0, cantSegundos=0, cantMilesimas=0;
        String min="", seg="",mil="";
        try{
            while(true){
                Thread.sleep(1);
                cantMilesimas+=4;
                if(cantMilesimas==1000){
                    cantMilesimas=0;
                    cantSegundos+=1;
                    if(cantSegundos==60){
                        cantSegundos=0;
                        cantMinutos+=1;
                    }
                }                    
                    if(cantMinutos<10){
                        min="0"+cantMinutos;
                    }else{
                        min=String.valueOf(cantMinutos);
                    }
                    if(cantSegundos<10){
                        seg="0"+cantSegundos;
                    }else{
                        seg=String.valueOf(cantSegundos);
                    }
                    if(cantMilesimas<10){
                        mil="0"+cantMilesimas;
                    }else{
                        mil=String.valueOf(cantMilesimas);
                    }
                
                txt_min.setText(String.valueOf(min));
                txt_seg.setText(String.valueOf(seg));
                txt_mil.setText(String.valueOf(mil));
               
            }
        }catch(InterruptedException ex01){
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_iniciar = new javax.swing.JButton();
        btn_pausar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_min = new javax.swing.JLabel();
        txt_seg = new javax.swing.JLabel();
        txt_mil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(242, 242, 242));

        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        btn_pausar.setText("Pausar");
        btn_pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pausarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\imagen cronometro\\cronometro.png")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setFont(new java.awt.Font("Monospac821 BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("C r o n ó m e t r o");

        txt_min.setBackground(new java.awt.Color(51, 51, 51));
        txt_min.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_min.setForeground(new java.awt.Color(51, 204, 255));
        txt_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_min.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        txt_min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_min.setMaximumSize(new java.awt.Dimension(65, 20));
        txt_min.setMinimumSize(new java.awt.Dimension(65, 20));
        txt_min.setOpaque(true);
        txt_min.setPreferredSize(new java.awt.Dimension(65, 20));

        txt_seg.setBackground(new java.awt.Color(51, 51, 51));
        txt_seg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_seg.setForeground(new java.awt.Color(51, 204, 255));
        txt_seg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_seg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        txt_seg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_seg.setMaximumSize(new java.awt.Dimension(65, 20));
        txt_seg.setMinimumSize(new java.awt.Dimension(65, 20));
        txt_seg.setOpaque(true);
        txt_seg.setPreferredSize(new java.awt.Dimension(65, 20));

        txt_mil.setBackground(new java.awt.Color(51, 51, 51));
        txt_mil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_mil.setForeground(new java.awt.Color(51, 204, 255));
        txt_mil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_mil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        txt_mil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_mil.setMaximumSize(new java.awt.Dimension(65, 20));
        txt_mil.setMinimumSize(new java.awt.Dimension(65, 20));
        txt_mil.setOpaque(true);
        txt_mil.setPreferredSize(new java.awt.Dimension(65, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_min, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(txt_seg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_mil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_min, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_seg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_pausar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciar)
                    .addComponent(btn_pausar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        iniciar();
        btn_iniciar.setEnabled(false);
        btn_pausar.setEnabled(true);
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pausarActionPerformed
      detener();
      btn_iniciar.setEnabled(true);
      btn_pausar.setEnabled(false);
    }//GEN-LAST:event_btn_pausarActionPerformed

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
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_pausar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_mil;
    private javax.swing.JLabel txt_min;
    private javax.swing.JLabel txt_seg;
    // End of variables declaration//GEN-END:variables
}
