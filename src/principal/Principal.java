package principal;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import paneles.CambiaPanel;

public class Principal extends javax.swing.JFrame {

    int x, y;
   
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.uno.setSelected(true);
        new CambiaPanel(pnlPrincipal, new paneles.pnlHome());
//        setIconImage(new ImageIcon(getClass().getResource("../../img1/IconoPrograma.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        iPanelPrincipal = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        uno = new rsbuttom.RSButtonMetro();
        jPTituloMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tres = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        jPDevices = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ocho = new rsbuttom.RSButtonMetro();
        siete = new rsbuttom.RSButtonMetro();
        seis = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();
        jPSuperior = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        lblMinimizar = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblMinimizar1 = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        jPTituloDashboard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        iPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        iPanelPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(38, 86, 186)));
        iPanelPrincipal.setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(239, 238, 244));

        uno.setForeground(new java.awt.Color(128, 128, 131));
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addFile.png"))); // NOI18N
        uno.setText("NUEVO    ");
        uno.setAlignmentX(1.0F);
        uno.setColorHover(new java.awt.Color(204, 204, 204));
        uno.setColorNormal(new java.awt.Color(204, 204, 204));
        uno.setColorPressed(new java.awt.Color(204, 204, 204));
        uno.setColorTextHover(new java.awt.Color(128, 128, 131));
        uno.setColorTextNormal(new java.awt.Color(128, 128, 131));
        uno.setColorTextPressed(new java.awt.Color(128, 128, 131));
        uno.setFocusPainted(false);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        uno.setIconTextGap(25);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
        });
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        jPTituloMenu.setBackground(new java.awt.Color(239, 238, 244));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 131));
        jLabel1.setText("MENÚ");

        javax.swing.GroupLayout jPTituloMenuLayout = new javax.swing.GroupLayout(jPTituloMenu);
        jPTituloMenu.setLayout(jPTituloMenuLayout);
        jPTituloMenuLayout.setHorizontalGroup(
            jPTituloMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTituloMenuLayout.setVerticalGroup(
            jPTituloMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTituloMenuLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tres.setBackground(new java.awt.Color(239, 238, 244));
        tres.setForeground(new java.awt.Color(128, 128, 131));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chat.png"))); // NOI18N
        tres.setText("Chat         ");
        tres.setColorHover(new java.awt.Color(204, 204, 204));
        tres.setColorNormal(new java.awt.Color(239, 238, 244));
        tres.setColorPressed(new java.awt.Color(204, 204, 204));
        tres.setColorTextHover(new java.awt.Color(128, 128, 131));
        tres.setColorTextNormal(new java.awt.Color(128, 128, 131));
        tres.setColorTextPressed(new java.awt.Color(128, 128, 131));
        tres.setFocusPainted(false);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tres.setIconTextGap(19);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
        });
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(239, 238, 244));
        dos.setForeground(new java.awt.Color(128, 128, 131));
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
        dos.setText("Collection");
        dos.setColorHover(new java.awt.Color(204, 204, 204));
        dos.setColorNormal(new java.awt.Color(239, 238, 244));
        dos.setColorPressed(new java.awt.Color(204, 204, 204));
        dos.setColorTextHover(new java.awt.Color(128, 128, 131));
        dos.setColorTextNormal(new java.awt.Color(128, 128, 131));
        dos.setColorTextPressed(new java.awt.Color(128, 128, 131));
        dos.setFocusPainted(false);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dos.setIconTextGap(25);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
        });
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(239, 238, 244));
        cinco.setForeground(new java.awt.Color(128, 128, 131));
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/market.png"))); // NOI18N
        cinco.setText("Market     ");
        cinco.setColorHover(new java.awt.Color(204, 204, 204));
        cinco.setColorNormal(new java.awt.Color(239, 238, 244));
        cinco.setColorPressed(new java.awt.Color(204, 204, 204));
        cinco.setColorTextHover(new java.awt.Color(128, 128, 131));
        cinco.setColorTextNormal(new java.awt.Color(128, 128, 131));
        cinco.setColorTextPressed(new java.awt.Color(128, 128, 131));
        cinco.setFocusPainted(false);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cinco.setIconTextGap(19);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cincoMousePressed(evt);
            }
        });
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        jPDevices.setBackground(new java.awt.Color(239, 238, 244));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(128, 128, 131));
        jLabel3.setText("REDES SOCIALES");

        javax.swing.GroupLayout jPDevicesLayout = new javax.swing.GroupLayout(jPDevices);
        jPDevices.setLayout(jPDevicesLayout);
        jPDevicesLayout.setHorizontalGroup(
            jPDevicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDevicesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDevicesLayout.setVerticalGroup(
            jPDevicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDevicesLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        ocho.setBackground(new java.awt.Color(239, 238, 244));
        ocho.setForeground(new java.awt.Color(128, 128, 131));
        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/youtubeIcon32.png"))); // NOI18N
        ocho.setText("YouTube   ");
        ocho.setColorHover(new java.awt.Color(204, 204, 204));
        ocho.setColorNormal(new java.awt.Color(239, 238, 244));
        ocho.setColorPressed(new java.awt.Color(204, 204, 204));
        ocho.setColorTextHover(new java.awt.Color(128, 128, 131));
        ocho.setColorTextNormal(new java.awt.Color(128, 128, 131));
        ocho.setColorTextPressed(new java.awt.Color(128, 128, 131));
        ocho.setFocusPainted(false);
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ocho.setIconTextGap(19);
        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ochoMousePressed(evt);
            }
        });
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(239, 238, 244));
        siete.setForeground(new java.awt.Color(128, 128, 131));
        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skypeIcon32.png"))); // NOI18N
        siete.setText("Skype       ");
        siete.setColorHover(new java.awt.Color(204, 204, 204));
        siete.setColorNormal(new java.awt.Color(239, 238, 244));
        siete.setColorPressed(new java.awt.Color(204, 204, 204));
        siete.setColorTextHover(new java.awt.Color(128, 128, 131));
        siete.setColorTextNormal(new java.awt.Color(128, 128, 131));
        siete.setColorTextPressed(new java.awt.Color(128, 128, 131));
        siete.setFocusPainted(false);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        siete.setIconTextGap(19);
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
        });
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(239, 238, 244));
        seis.setForeground(new java.awt.Color(128, 128, 131));
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebookIcon32.png"))); // NOI18N
        seis.setText("Facebook");
        seis.setColorHover(new java.awt.Color(204, 204, 204));
        seis.setColorNormal(new java.awt.Color(239, 238, 244));
        seis.setColorPressed(new java.awt.Color(204, 204, 204));
        seis.setColorTextHover(new java.awt.Color(128, 128, 131));
        seis.setColorTextNormal(new java.awt.Color(128, 128, 131));
        seis.setColorTextPressed(new java.awt.Color(128, 128, 131));
        seis.setFocusPainted(false);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        seis.setIconTextGap(25);
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seisMousePressed(evt);
            }
        });
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(239, 238, 244));
        cuatro.setForeground(new java.awt.Color(128, 128, 131));
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/feeedback.png"))); // NOI18N
        cuatro.setText("FeedBack   ");
        cuatro.setColorHover(new java.awt.Color(204, 204, 204));
        cuatro.setColorNormal(new java.awt.Color(239, 238, 244));
        cuatro.setColorPressed(new java.awt.Color(204, 204, 204));
        cuatro.setColorTextHover(new java.awt.Color(128, 128, 131));
        cuatro.setColorTextNormal(new java.awt.Color(128, 128, 131));
        cuatro.setColorTextPressed(new java.awt.Color(128, 128, 131));
        cuatro.setFocusPainted(false);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cuatro.setIconTextGap(19);
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuatroMousePressed(evt);
            }
        });
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPDevices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jPTituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPDevices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        iPanelPrincipal.add(pnlMenu, gridBagConstraints);

        jPSuperior.setBackground(new java.awt.Color(38, 86, 186));
        jPSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPSuperior.setPreferredSize(new java.awt.Dimension(964, 72));
        jPSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPSuperiorMouseDragged(evt);
            }
        });
        jPSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPSuperiorMousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(38, 86, 186));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Historias Clinicas");

        jCTextField1.setBackground(new java.awt.Color(38, 86, 186));
        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jCTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCTextField1.setPhColor(new java.awt.Color(255, 255, 255));
        jCTextField1.setPlaceholder("SEARCH");

        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar.png"))); // NOI18N
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.setDoubleBuffered(true);
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setDoubleBuffered(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifier.png"))); // NOI18N

        lblMinimizar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/MINIMIZAR.png"))); // NOI18N
        lblMinimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar1.setDoubleBuffered(true);
        lblMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPSuperiorLayout = new javax.swing.GroupLayout(jPSuperior);
        jPSuperior.setLayout(jPSuperiorLayout);
        jPSuperiorLayout.setHorizontalGroup(
            jPSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPSuperiorLayout.setVerticalGroup(
            jPSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMinimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        iPanelPrincipal.add(jPSuperior, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jPTituloDashboard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 128, 131));
        jLabel4.setText("PANELES");

        javax.swing.GroupLayout jPTituloDashboardLayout = new javax.swing.GroupLayout(jPTituloDashboard);
        jPTituloDashboard.setLayout(jPTituloDashboardLayout);
        jPTituloDashboardLayout.setHorizontalGroup(
            jPTituloDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(624, Short.MAX_VALUE))
        );
        jPTituloDashboardLayout.setVerticalGroup(
            jPTituloDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTituloDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addComponent(jPTituloDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        iPanelPrincipal.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlHome());
        if(this.uno.isSelected()){
            this.uno.setColorNormal(new Color(204,204,204));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_unoActionPerformed

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
        this.uno.setSelected(true);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_unoMousePressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlChat());
        if(this.tres.isSelected()){
            this.tres.setColorNormal(new Color(204,204,204));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_tresActionPerformed

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(true);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_tresMousePressed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(true);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_dosMousePressed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlCollection());
        if(this.dos.isSelected()){
            this.dos.setColorNormal(new Color(204,204,204));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_dosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = pnlMenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(5, -264, 1, 1, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(-264, 5, 1, 1, pnlMenu);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ochoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ochoMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(true);
    }//GEN-LAST:event_ochoMousePressed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlYoutube());
        if(this.ocho.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(204,204,204));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_ochoActionPerformed

    private void sieteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(true);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_sieteMousePressed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlSkype());
        if(this.siete.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(204,204,204));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_sieteActionPerformed

    private void seisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(true);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_seisMousePressed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlFacebook());
        if(this.seis.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(204,204,204));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_seisActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlMarket());
        if(this.cinco.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(204,204,204));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(true);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_cincoMousePressed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(true);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_cuatroMousePressed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlFeeBack());
        if(this.cuatro.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(204,204,204));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(204,204,204));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(204,204,204));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(204,204,204));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_cuatroActionPerformed

    private void jPSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPSuperiorMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPSuperiorMousePressed

    private void jPSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPSuperiorMouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPSuperiorMouseDragged

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizar1MouseClicked
//        this.setExtendedState(MAXIMIZED_BOTH);
        if ((this.getExtendedState() & javax.swing.JFrame.MAXIMIZED_BOTH) != 0) {
            // Si está maximizado, restaurar a estado normal
            this.setExtendedState(NORMAL);
        } else {
            // Si no está maximizado, maximizar
            this.setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_lblMinimizar1MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Principal().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro cinco;
    private rsbuttom.RSButtonMetro cuatro;
    private rsbuttom.RSButtonMetro dos;
    private javax.swing.JPanel iPanelPrincipal;
    private javax.swing.JButton jButton1;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPDevices;
    private javax.swing.JPanel jPSuperior;
    private javax.swing.JPanel jPTituloDashboard;
    private javax.swing.JPanel jPTituloMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMinimizar1;
    private rsbuttom.RSButtonMetro ocho;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro seis;
    private rsbuttom.RSButtonMetro siete;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
