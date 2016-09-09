package Roca;
import java.awt.event.KeyEvent; 
import javax.swing.JOptionPane;
/**
 ULISES BELTRAN GOMEZ - PROYECTO FINAL DE PROGRAMACION ORIENTADO A OBJETOS
 */
public class Ventana extends javax.swing.JFrame {

    //agregar el campo:
    Campo miCampo;
    
    public Ventana() {
        this.initComponents();
        this.setTitle( "Muevete! o te aplasta" );
        this.setLocationRelativeTo(null);
        //se crea instancia a panel de animacion y se añade a la ventana
        miCampo= new Campo( this.panelCampo.getSize() );
        this.panelCampo.add(miCampo);
        Campo.dificultadActual = Campo.DIFICULTAD_FACIL;
        
        jLabel1.setText("Dificultad: Facil");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCampo = new javax.swing.JPanel();
        btnI = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMenus = new javax.swing.JMenu();
        menuIniciar = new javax.swing.JMenuItem();
        menuDetener = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        emnuDificultad = new javax.swing.JMenu();
        menuFacil = new javax.swing.JMenuItem();
        menuMedio = new javax.swing.JMenuItem();
        menuDificil = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAcercaDe = new javax.swing.JMenuItem();
        menuInstrucciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        panelCampo.setPreferredSize(new java.awt.Dimension(480, 360));

        javax.swing.GroupLayout panelCampoLayout = new javax.swing.GroupLayout(panelCampo);
        panelCampo.setLayout(panelCampoLayout);
        panelCampoLayout.setHorizontalGroup(
            panelCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCampoLayout.setVerticalGroup(
            panelCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        btnI.setText("←");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        btnI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIKeyPressed(evt);
            }
        });

        btnD.setText("→");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        btnD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDKeyPressed(evt);
            }
        });

        jLabel1.setText("label1");

        menuMenus.setText("Menus");

        menuIniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        menuIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play.png"))); // NOI18N
        menuIniciar.setText("Iniciar juego -");
        menuIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIniciarActionPerformed(evt);
            }
        });
        menuMenus.add(menuIniciar);

        menuDetener.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        menuDetener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pause.png"))); // NOI18N
        menuDetener.setText("Detener         -");
        menuDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDetenerActionPerformed(evt);
            }
        });
        menuMenus.add(menuDetener);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        menuSalir.setText("Salir               -");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuMenus.add(menuSalir);

        jMenuBar1.add(menuMenus);

        emnuDificultad.setText("Dificultad");

        menuFacil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        menuFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facil.png"))); // NOI18N
        menuFacil.setText("Facil    -  ");
        menuFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFacilActionPerformed(evt);
            }
        });
        emnuDificultad.add(menuFacil);

        menuMedio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, 0));
        menuMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medio.jpg"))); // NOI18N
        menuMedio.setText("Medio -");
        menuMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMedioActionPerformed(evt);
            }
        });
        emnuDificultad.add(menuMedio);

        menuDificil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, 0));
        menuDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dificil.jpg"))); // NOI18N
        menuDificil.setText("Dificil  -");
        menuDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDificilActionPerformed(evt);
            }
        });
        emnuDificultad.add(menuDificil);

        jMenuBar1.add(emnuDificultad);

        menuAyuda.setText("Ayuda");

        menuAcercaDe.setText("Acerca de");
        menuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuAcercaDe);

        menuInstrucciones.setText("Instrucciones");
        menuInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInstruccionesActionPerformed(evt);
            }
        });
        menuAyuda.add(menuInstrucciones);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        miCampo.izquierda();
    }//GEN-LAST:event_btnIActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        miCampo.derecha();
    }//GEN-LAST:event_btnDActionPerformed

    private void btnIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_LEFT  : miCampo.izquierda(); break;
            case KeyEvent.VK_RIGHT : miCampo.derecha() ; break;
        }
    }//GEN-LAST:event_btnIKeyPressed

    private void menuMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMedioActionPerformed
        Campo.dificultadActual = Campo.DIFICULTAD_MEDIO;
        miCampo.animar(false);        
        miCampo.animar(true);        
        jLabel1.setText("Dificultad: Medio");
    }//GEN-LAST:event_menuMedioActionPerformed

    private void menuDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDificilActionPerformed
        Campo.dificultadActual = Campo.DIFICULTAD_DIFICIL;
        miCampo.animar(false);        
        miCampo.animar(true);
        jLabel1.setText("Dificultad: Dificil");
    }//GEN-LAST:event_menuDificilActionPerformed

    private void menuIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIniciarActionPerformed
        miCampo.animar(true);
    }//GEN-LAST:event_menuIniciarActionPerformed

    private void menuDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDetenerActionPerformed
        miCampo.animar(false);
    }//GEN-LAST:event_menuDetenerActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFacilActionPerformed
        Campo.dificultadActual = Campo.DIFICULTAD_FACIL;
        //reiniciar animacion
        miCampo.animar(false);        
        miCampo.animar(true);
        jLabel1.setText("Dificultad: Facil");
    }//GEN-LAST:event_menuFacilActionPerformed

    private void btnDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_LEFT  : miCampo.izquierda(); break;
            case KeyEvent.VK_RIGHT : miCampo.derecha() ; break;
        }
    }//GEN-LAST:event_btnDKeyPressed

    private void menuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaDeActionPerformed
        JOptionPane.showMessageDialog(null,"Rocas...Proyecto de Programacion orientada a objetos, elaborado por: Ulises Beltrán Gómez.");    
    }//GEN-LAST:event_menuAcercaDeActionPerformed

    private void menuInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInstruccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuInstruccionesActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnI;
    private javax.swing.JMenu emnuDificultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAcercaDe;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuDetener;
    private javax.swing.JMenuItem menuDificil;
    private javax.swing.JMenuItem menuFacil;
    private javax.swing.JMenuItem menuIniciar;
    private javax.swing.JMenuItem menuInstrucciones;
    private javax.swing.JMenuItem menuMedio;
    private javax.swing.JMenu menuMenus;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPanel panelCampo;
    // End of variables declaration//GEN-END:variables
}
