package kartoyunu;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class konsol extends javax.swing.JFrame {

    test test1 = new test(5);
    kullanıcı kullanici = new kullanıcı("46", "Hamit", 0, test1.kart_futbolcu1, test1.kart_basketbolcu1);
    bilgisayar bilgisayar = new bilgisayar("66", "Bilgisayar", 0, test1.kart_futbolcu2, test1.kart_basketbolcu2);

    public konsol() {
        initComponents();

        jButton1.setText("Futbolcu");
        jButton2.setText("Futbolcu");
        jButton3.setText("Futbolcu");
        jButton4.setText("Futbolcu");
        jButton5.setText("Basketbolcu");
        jButton6.setText("Basketbolcu");
        jButton7.setText("Basketbolcu");
        jButton8.setText("Basketbolcu");

        jButton9.setIcon(new javax.swing.ImageIcon(kullanici.getFutbolcular().get(0).getLink()));
        jButton10.setIcon(new javax.swing.ImageIcon(kullanici.getFutbolcular().get(1).getLink()));
        jButton11.setIcon(new javax.swing.ImageIcon(kullanici.getFutbolcular().get(2).getLink()));
        jButton12.setIcon(new javax.swing.ImageIcon(kullanici.getFutbolcular().get(3).getLink()));
        jButton13.setIcon(new javax.swing.ImageIcon(kullanici.getBasketbolcular().get(0).getLink()));
        jButton14.setIcon(new javax.swing.ImageIcon(kullanici.getBasketbolcular().get(1).getLink()));
        jButton15.setIcon(new javax.swing.ImageIcon(kullanici.getBasketbolcular().get(2).getLink()));
        jButton16.setIcon(new javax.swing.ImageIcon(kullanici.getBasketbolcular().get(3).getLink()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();

        label1.setText("label1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pozisyon");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 0, 102));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kullanıcının Kartları", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 103))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 51, 153));

        jButton16.setBackground(new java.awt.Color(255, 0, 51));
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 0, 51));
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 0, 51));
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 0, 51));
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 0, 51));
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 0, 51));
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 0, 51));
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 0, 51));
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bilgisayarın Kartları", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 153))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("jButton2");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("jButton3");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("jButton4");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("jButton5");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("jButton6");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 0, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("jButton7");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 0, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("jButton8");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skorlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KULLANICI :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BİLGİSAYAR :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTextField3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextField3.setText("Lütfen Alttaki Bir Oyuncuyu Seçiniz...");
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9))
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bilgilendirme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(jTextField12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void sirasiylaSectir(int x) {
        if (x <= 12) {
            jButton9.setEnabled(false);
            jButton10.setEnabled(false);
            jButton11.setEnabled(false);
            jButton12.setEnabled(false);
            jButton13.setEnabled(true);
            jButton14.setEnabled(true);
            jButton15.setEnabled(true);
            jButton16.setEnabled(true);

        } else {
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            jButton11.setEnabled(true);
            jButton12.setEnabled(true);
            jButton13.setEnabled(false);
            jButton14.setEnabled(false);
            jButton15.setEnabled(false);
            jButton16.setEnabled(false);
        }

    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextField3.setText(kullanici.getFutbolcular().get(0).getFutbolcuAdi());
        jTextField4.setText("Penaltı: " + String.valueOf(kullanici.getFutbolcular().get(0).getPenalti()));
        jTextField5.setText("Serbest Vuruş: " + String.valueOf(kullanici.getFutbolcular().get(0).getSerbestAtis()));
        jTextField6.setText("Kaleciyle Karşı Karşıya: " + String.valueOf(kullanici.getFutbolcular().get(0).getKaleciKarsiKarsiya()));
        jTextField7.setText(bilgisayar.getFutbolcular().get(0).getFutbolcuAdi());
        jTextField8.setText("Penaltı: " + String.valueOf(bilgisayar.getFutbolcular().get(0).getPenalti()));
        jTextField9.setText("Serbest Vuruş: " + String.valueOf(bilgisayar.getFutbolcular().get(0).getSerbestAtis()));
        jTextField10.setText("Kaleciyle Karşı Karşıya: " + String.valueOf(bilgisayar.getFutbolcular().get(0).getKaleciKarsiKarsiya()));
        jButton1.setIcon(new javax.swing.ImageIcon(bilgisayar.getFutbolcular().get(0).getLink()));
        jButton1.setText("");
        test1.karsilastir(kullanici, bilgisayar, kullanici.kartSec(0));
        jTextField1.setText(String.valueOf(kullanici.getSkor()));
        jTextField2.setText(String.valueOf(bilgisayar.getSkor()));
        if (kullanici.getFutbolcular().get(0).getSayac() == 1) {
            kullanici.getFutbolcular().get(0).setSayac(5);
            sirasiylaSectir(9);
        }

        if (bilgisayar.getSkor() < kullanici.getSkor()) {
            jTextField11.setText("Kullanici kazaniyor...");
        } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
            jTextField11.setText("Bilgisayar kazaniyor...");
        } else if (bilgisayar.getSkor() == kullanici.getSkor()) {
            jTextField11.setText("Berabere ...");

        }
        switch (test1.getA()) {
            case 0:
                jTextField12.setText("Penaltı Pozisyonu");
                break;
            case 1:
                jTextField12.setText("Kaleciyle Karşı Karşıya Pozisyonu");
                break;
            case 2:
                jTextField12.setText("Serbest Vuruş Pozisyonu");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        jTextField3.setText(kullanici.getFutbolcular().get(1).getFutbolcuAdi());
        jTextField4.setText("Penaltı: " + String.valueOf(kullanici.getFutbolcular().get(1).getPenalti()));
        jTextField5.setText("Serbest Vuruş: " + String.valueOf(kullanici.getFutbolcular().get(1).getSerbestAtis()));
        jTextField6.setText("Kaleciyle Karşı Karşıya: " + String.valueOf(kullanici.getFutbolcular().get(1).getKaleciKarsiKarsiya()));
        jTextField7.setText(bilgisayar.getFutbolcular().get(1).getFutbolcuAdi());
        jTextField8.setText("Penaltı: " + String.valueOf(bilgisayar.getFutbolcular().get(1).getPenalti()));
        jTextField9.setText("Serbest Vuruş: " + String.valueOf(bilgisayar.getFutbolcular().get(1).getSerbestAtis()));
        jTextField10.setText("Kaleciyle Karşı Karşıya: " + String.valueOf(bilgisayar.getFutbolcular().get(1).getKaleciKarsiKarsiya()));
        jButton2.setText("");
        jButton2.setIcon(new javax.swing.ImageIcon(bilgisayar.getFutbolcular().get(1).getLink()));
        test1.karsilastir(kullanici, bilgisayar, kullanici.kartSec(1));
        jTextField1.setText(String.valueOf(kullanici.getSkor()));
        jTextField2.setText(String.valueOf(bilgisayar.getSkor()));
        if (kullanici.getFutbolcular().get(1).getSayac() == 1) {
            kullanici.getFutbolcular().get(1).setSayac(5);
            sirasiylaSectir(10);
        }
        if (bilgisayar.getSkor() < kullanici.getSkor()) {
            jTextField11.setText("Kullanici kazaniyor...");
        } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
            jTextField11.setText("Bilgisayar kazaniyor...");
        } else if (bilgisayar.getSkor() == kullanici.getSkor()) {
            jTextField11.setText("Berabere ...");

        }
        switch (test1.getA()) {
            case 0:
                jTextField12.setText("Penaltı Pozisyonu");
                break;
            case 1:
                jTextField12.setText("Kaleciyle Karşı Karşıya Pozisyonu");
                break;
            case 2:
                jTextField12.setText("Serbest Vuruş Pozisyonu");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        jTextField3.setText(kullanici.getFutbolcular().get(2).getFutbolcuAdi());
        jTextField4.setText("Penaltı: " + String.valueOf(kullanici.getFutbolcular().get(2).getPenalti()));
        jTextField5.setText("Serbest Vuruş: " + String.valueOf(kullanici.getFutbolcular().get(2).getSerbestAtis()));
        jTextField6.setText("Kaleciyle Karşı Karşıya: " + String.valueOf(kullanici.getFutbolcular().get(2).getKaleciKarsiKarsiya()));
        jTextField7.setText(bilgisayar.getFutbolcular().get(2).getFutbolcuAdi());
        jTextField8.setText("Penaltı: " + String.valueOf(bilgisayar.getFutbolcular().get(2).getPenalti()));
        jTextField9.setText("Serbest Vuruş: " + String.valueOf(bilgisayar.getFutbolcular().get(2).getSerbestAtis()));
        jTextField10.setText("Kaleciyle Karşı Karşıya: " + String.valueOf(bilgisayar.getFutbolcular().get(2).getKaleciKarsiKarsiya()));
        jButton3.setText("");
        jButton3.setIcon(new javax.swing.ImageIcon(bilgisayar.getFutbolcular().get(2).getLink()));
        test1.karsilastir(kullanici, bilgisayar, kullanici.kartSec(2));
        jTextField1.setText(String.valueOf(kullanici.getSkor()));
        jTextField2.setText(String.valueOf(bilgisayar.getSkor()));
        if (kullanici.getFutbolcular().get(2).getSayac() == 1) {
            kullanici.getFutbolcular().get(2).setSayac(5);
            sirasiylaSectir(11);
        }
        if (bilgisayar.getSkor() < kullanici.getSkor()) {
            jTextField11.setText("Kullanici kazaniyor...");
        } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
            jTextField11.setText("Bilgisayar kazaniyor...");
        } else if (bilgisayar.getSkor() == kullanici.getSkor()) {
            jTextField11.setText("Berabere ...");

        }
        switch (test1.getA()) {
            case 0:
                jTextField12.setText("Penaltı Pozisyonu");
                break;
            case 1:
                jTextField12.setText("Kaleciyle Karşı Karşıya Pozisyonu");
                break;
            case 2:
                jTextField12.setText("Serbest Vuruş Pozisyonu");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        jTextField3.setText(kullanici.getFutbolcular().get(3).getFutbolcuAdi());
        jTextField4.setText("Penaltı: " + String.valueOf(kullanici.getFutbolcular().get(3).getPenalti()));
        jTextField5.setText("Serbest Vuruş: " + String.valueOf(kullanici.getFutbolcular().get(3).getSerbestAtis()));
        jTextField6.setText("Kaleciyle Karşı Karşıya: " + String.valueOf(kullanici.getFutbolcular().get(3).getKaleciKarsiKarsiya()));
        jTextField7.setText(bilgisayar.getFutbolcular().get(3).getFutbolcuAdi());
        jTextField8.setText("Penaltı: " + String.valueOf(bilgisayar.getFutbolcular().get(3).getPenalti()));
        jTextField9.setText("Serbest Vuruş: " + String.valueOf(bilgisayar.getFutbolcular().get(3).getSerbestAtis()));
        jTextField10.setText("Kaleciyle Karşı Karşıya: " + String.valueOf(bilgisayar.getFutbolcular().get(3).getKaleciKarsiKarsiya()));
        jButton4.setText("");
        jButton4.setIcon(new javax.swing.ImageIcon(bilgisayar.getFutbolcular().get(3).getLink()));
        test1.karsilastir(kullanici, bilgisayar, kullanici.kartSec(3));
        jTextField1.setText(String.valueOf(kullanici.getSkor()));
        jTextField2.setText(String.valueOf(bilgisayar.getSkor()));
        if (kullanici.getFutbolcular().get(3).getSayac() == 1) {
            kullanici.getFutbolcular().get(3).setSayac(5);
            sirasiylaSectir(12);
        }
        if (bilgisayar.getSkor() < kullanici.getSkor()) {
            jTextField11.setText("Kullanici kazaniyor...");
        } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
            jTextField11.setText("Bilgisayar kazaniyor...");
        } else if (bilgisayar.getSkor() == kullanici.getSkor()) {
            jTextField11.setText("Berabere ...");

        }
        switch (test1.getA()) {
            case 0:
                jTextField12.setText("Penaltı Pozisyonu");
                break;
            case 1:
                jTextField12.setText("Kaleciyle Karşı Karşıya Pozisyonu");
                break;
            case 2:
                jTextField12.setText("Serbest Vuruş Pozisyonu");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        jTextField3.setText(kullanici.getBasketbolcular().get(0).getBasketbolcuAdi());
        jTextField4.setText("İkilik : " + String.valueOf(kullanici.getBasketbolcular().get(0).getIkilik()));
        jTextField5.setText("Üçlük : " + String.valueOf(kullanici.getBasketbolcular().get(0).getUcluk()));
        jTextField6.setText("Serbest Atış : " + String.valueOf(kullanici.getBasketbolcular().get(0).getSerbestAtis()));
        jTextField7.setText(bilgisayar.getBasketbolcular().get(0).getBasketbolcuAdi());
        jTextField8.setText("İkilik: " + String.valueOf(bilgisayar.getBasketbolcular().get(0).getIkilik()));
        jTextField9.setText("Üçlük : " + String.valueOf(bilgisayar.getBasketbolcular().get(0).getUcluk()));
        jTextField10.setText("Serbest Atış : " + String.valueOf(bilgisayar.getBasketbolcular().get(0).getSerbestAtis()));
        jButton5.setText("");
        jButton5.setIcon(new javax.swing.ImageIcon(bilgisayar.getBasketbolcular().get(0).getLink()));
        test1.karsilastir2(kullanici, bilgisayar, kullanici.kartSec(0, 0));
        jTextField1.setText(String.valueOf(kullanici.getSkor()));
        jTextField2.setText(String.valueOf(bilgisayar.getSkor()));
        if (kullanici.getBasketbolcular().get(0).getSayac() == 1) {
            kullanici.getBasketbolcular().get(0).setSayac(5);
            sirasiylaSectir(13);
        }
        if (bilgisayar.getSkor() < kullanici.getSkor()) {
            jTextField11.setText("Kullanici kazaniyor...");
        } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
            jTextField11.setText("Bilgisayar kazaniyor...");
        } else if (bilgisayar.getSkor() == kullanici.getSkor()) {
            jTextField11.setText("Berabere ...");

        }
        switch (test1.getB()) {
            case 0:
                jTextField12.setText("İkilik Pozisyonu");
                break;
            case 1:
                jTextField12.setText("Üçlük Pozisyonu");
                break;
            case 2:
                jTextField12.setText("Serbest Atış Pozisyonu");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        jTextField3.setText(kullanici.getBasketbolcular().get(1).getBasketbolcuAdi());
        jTextField4.setText("İkilik : " + String.valueOf(kullanici.getBasketbolcular().get(1).getIkilik()));
        jTextField5.setText("Üçlük : " + String.valueOf(kullanici.getBasketbolcular().get(1).getUcluk()));
        jTextField6.setText("Serbest Atış : " + String.valueOf(kullanici.getBasketbolcular().get(1).getSerbestAtis()));
        jTextField7.setText(bilgisayar.getBasketbolcular().get(1).getBasketbolcuAdi());
        jTextField8.setText("İkilik: " + String.valueOf(bilgisayar.getBasketbolcular().get(1).getIkilik()));
        jTextField9.setText("Üçlük : " + String.valueOf(bilgisayar.getBasketbolcular().get(1).getUcluk()));
        jTextField10.setText("Serbest Atış : " + String.valueOf(bilgisayar.getBasketbolcular().get(1).getSerbestAtis()));
        jButton6.setText("");
        jButton6.setIcon(new javax.swing.ImageIcon(bilgisayar.getBasketbolcular().get(1).getLink()));
        test1.karsilastir2(kullanici, bilgisayar, kullanici.kartSec(0, 1));
        jTextField1.setText(String.valueOf(kullanici.getSkor()));
        jTextField2.setText(String.valueOf(bilgisayar.getSkor()));
        if (kullanici.getBasketbolcular().get(1).getSayac() == 1) {
            kullanici.getBasketbolcular().get(1).setSayac(5);
            sirasiylaSectir(14);
        }
        if (bilgisayar.getSkor() < kullanici.getSkor()) {
            jTextField11.setText("Kullanici kazaniyor...");
        } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
            jTextField11.setText("Bilgisayar kazaniyor...");
        } else if (bilgisayar.getSkor() == kullanici.getSkor()) {
            jTextField11.setText("Berabere ...");

        }
        switch (test1.getB()) {
            case 0:
                jTextField12.setText("İkilik Pozisyonu");
                break;
            case 1:
                jTextField12.setText("Üçlük Pozisyonu");
                break;
            case 2:
                jTextField12.setText("Serbest Atış Pozisyonu");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        jTextField3.setText(kullanici.getBasketbolcular().get(2).getBasketbolcuAdi());
        jTextField4.setText("İkilik : " + String.valueOf(kullanici.getBasketbolcular().get(2).getIkilik()));
        jTextField5.setText("Üçlük : " + String.valueOf(kullanici.getBasketbolcular().get(2).getUcluk()));
        jTextField6.setText("Serbest Atış : " + String.valueOf(kullanici.getBasketbolcular().get(2).getSerbestAtis()));
        jTextField7.setText(bilgisayar.getBasketbolcular().get(0).getBasketbolcuAdi());
        jTextField8.setText("İkilik: " + String.valueOf(bilgisayar.getBasketbolcular().get(2).getIkilik()));
        jTextField9.setText("Üçlük : " + String.valueOf(bilgisayar.getBasketbolcular().get(2).getUcluk()));
        jTextField10.setText("Serbest Atış : " + String.valueOf(bilgisayar.getBasketbolcular().get(2).getSerbestAtis()));
        jButton7.setText("");

        jButton7.setIcon(new javax.swing.ImageIcon(bilgisayar.getBasketbolcular().get(2).getLink()));
        test1.karsilastir2(kullanici, bilgisayar, kullanici.kartSec(0, 2));
        jTextField1.setText(String.valueOf(kullanici.getSkor()));
        jTextField2.setText(String.valueOf(bilgisayar.getSkor()));
        if (kullanici.getBasketbolcular().get(2).getSayac() == 1) {
            kullanici.getBasketbolcular().get(2).setSayac(5);
            sirasiylaSectir(15);
        }
        if (bilgisayar.getSkor() < kullanici.getSkor()) {
            jTextField11.setText("Kullanici kazaniyor...");
        } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
            jTextField11.setText("Bilgisayar kazaniyor...");
        } else if (bilgisayar.getSkor() == kullanici.getSkor()) {
            jTextField11.setText("Berabere ...");

        }
        switch (test1.getB()) {
            case 0:
                jTextField12.setText("İkilik Pozisyonu");
                break;
            case 1:
                jTextField12.setText("Üçlük Pozisyonu");
                break;
            case 2:
                jTextField12.setText("Serbest Atış Pozisyonu");
                break;
            default:
                break;
        }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        jTextField3.setText(kullanici.getBasketbolcular().get(3).getBasketbolcuAdi());
        jTextField4.setText("İkilik : " + String.valueOf(kullanici.getBasketbolcular().get(3).getIkilik()));
        jTextField5.setText("Üçlük : " + String.valueOf(kullanici.getBasketbolcular().get(3).getUcluk()));
        jTextField6.setText("Serbest Atış : " + String.valueOf(kullanici.getBasketbolcular().get(3).getSerbestAtis()));
        jTextField7.setText(bilgisayar.getBasketbolcular().get(0).getBasketbolcuAdi());
        jTextField8.setText("İkilik: " + String.valueOf(bilgisayar.getBasketbolcular().get(3).getIkilik()));
        jTextField9.setText("Üçlük : " + String.valueOf(bilgisayar.getBasketbolcular().get(3).getUcluk()));
        jTextField10.setText("Serbest Atış : " + String.valueOf(bilgisayar.getBasketbolcular().get(3).getSerbestAtis()));
        jButton8.setText("");
        jButton8.setIcon(new javax.swing.ImageIcon(bilgisayar.getBasketbolcular().get(3).getLink()));
        test1.karsilastir2(kullanici, bilgisayar, kullanici.kartSec(0, 3));
        jTextField1.setText(String.valueOf(kullanici.getSkor()));
        jTextField2.setText(String.valueOf(bilgisayar.getSkor()));
        if (kullanici.getBasketbolcular().get(3).getSayac() == 1) {
            kullanici.getBasketbolcular().get(3).setSayac(5);
            sirasiylaSectir(16);
        }
        if (bilgisayar.getSkor() < kullanici.getSkor()) {
            jTextField11.setText("Kullanici kazanıyor...");
        } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
            jTextField11.setText("Bilgisayar kazanıyor....");
        } else if (bilgisayar.getSkor() == kullanici.getSkor()) {
            jTextField11.setText("Berabere ...");

        }
        switch (test1.getB()) {
            case 0:
                jTextField12.setText("İkilik Pozisyonu");
                break;
            case 1:
                jTextField12.setText("Üçlük Pozisyonu");
                break;
            case 2:
                jTextField12.setText("Serbest Atış Pozisyonu");
                break;
            default:
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setIcon(new javax.swing.ImageIcon(bilgisayar.getFutbolcular().get(0).getLink()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setIcon(new javax.swing.ImageIcon(bilgisayar.getFutbolcular().get(1).getLink()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setIcon(new javax.swing.ImageIcon(bilgisayar.getFutbolcular().get(2).getLink()));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setIcon(new javax.swing.ImageIcon(bilgisayar.getFutbolcular().get(3).getLink()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setIcon(new javax.swing.ImageIcon(bilgisayar.getBasketbolcular().get(0).getLink()));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setIcon(new javax.swing.ImageIcon(bilgisayar.getBasketbolcular().get(1).getLink()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setIcon(new javax.swing.ImageIcon(bilgisayar.getBasketbolcular().get(2).getLink()));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setIcon(new javax.swing.ImageIcon(bilgisayar.getBasketbolcular().get(3).getLink()));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed

    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(konsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konsol().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
