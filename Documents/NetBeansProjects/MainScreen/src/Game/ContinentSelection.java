/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 *
 * @author Lloyd
 */
public class ContinentSelection extends javax.swing.JFrame {

    /**
     * Creates new form ContinentSelection
     */
    public ContinentSelection() {
        initComponents();
         //southAmericaHighlighted.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TitleSelectContinent = new javax.swing.JPanel();
        SouthAmericaHighlighted = new javax.swing.JPanel();
        NorthAmericaHighlighted = new javax.swing.JPanel();
        AfricaHighlighted = new javax.swing.JPanel();
        EuropeHighlighted = new javax.swing.JPanel();
        AustraliaHighlighted = new javax.swing.JPanel();
        AsiaHighlighted = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        TitleSelectContinent.setOpaque(false);

        SouthAmericaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SouthAmericaHighlighted.setOpaque(false);
        SouthAmericaHighlighted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SouthAmericaHighlightedMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SouthAmericaHighlightedMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SouthAmericaHighlightedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SouthAmericaHighlightedLayout = new javax.swing.GroupLayout(SouthAmericaHighlighted);
        SouthAmericaHighlighted.setLayout(SouthAmericaHighlightedLayout);
        SouthAmericaHighlightedLayout.setHorizontalGroup(
            SouthAmericaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        SouthAmericaHighlightedLayout.setVerticalGroup(
            SouthAmericaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        NorthAmericaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NorthAmericaHighlighted.setOpaque(false);
        NorthAmericaHighlighted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NorthAmericaHighlightedMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NorthAmericaHighlightedMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NorthAmericaHighlightedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout NorthAmericaHighlightedLayout = new javax.swing.GroupLayout(NorthAmericaHighlighted);
        NorthAmericaHighlighted.setLayout(NorthAmericaHighlightedLayout);
        NorthAmericaHighlightedLayout.setHorizontalGroup(
            NorthAmericaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        NorthAmericaHighlightedLayout.setVerticalGroup(
            NorthAmericaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        AfricaHighlighted.setOpaque(false);
        AfricaHighlighted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AfricaHighlightedMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AfricaHighlightedMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AfricaHighlightedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AfricaHighlightedLayout = new javax.swing.GroupLayout(AfricaHighlighted);
        AfricaHighlighted.setLayout(AfricaHighlightedLayout);
        AfricaHighlightedLayout.setHorizontalGroup(
            AfricaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        AfricaHighlightedLayout.setVerticalGroup(
            AfricaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        EuropeHighlighted.setOpaque(false);
        EuropeHighlighted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EuropeHighlightedMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EuropeHighlightedMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EuropeHighlightedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EuropeHighlightedLayout = new javax.swing.GroupLayout(EuropeHighlighted);
        EuropeHighlighted.setLayout(EuropeHighlightedLayout);
        EuropeHighlightedLayout.setHorizontalGroup(
            EuropeHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        EuropeHighlightedLayout.setVerticalGroup(
            EuropeHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        AustraliaHighlighted.setOpaque(false);
        AustraliaHighlighted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AustraliaHighlightedMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AustraliaHighlightedMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AustraliaHighlightedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AustraliaHighlightedLayout = new javax.swing.GroupLayout(AustraliaHighlighted);
        AustraliaHighlighted.setLayout(AustraliaHighlightedLayout);
        AustraliaHighlightedLayout.setHorizontalGroup(
            AustraliaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        AustraliaHighlightedLayout.setVerticalGroup(
            AustraliaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        AsiaHighlighted.setOpaque(false);
        AsiaHighlighted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AsiaHighlightedMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AsiaHighlightedMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AsiaHighlightedMouseExited(evt);
            }
        });

        Title.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Select a Continent");

        javax.swing.GroupLayout AsiaHighlightedLayout = new javax.swing.GroupLayout(AsiaHighlighted);
        AsiaHighlighted.setLayout(AsiaHighlightedLayout);
        AsiaHighlightedLayout.setHorizontalGroup(
            AsiaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsiaHighlightedLayout.createSequentialGroup()
                .addComponent(Title)
                .addGap(0, 99, Short.MAX_VALUE))
        );
        AsiaHighlightedLayout.setVerticalGroup(
            AsiaHighlightedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsiaHighlightedLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Title)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        backButton.setBackground(new java.awt.Color(0, 153, 204));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TitleSelectContinentLayout = new javax.swing.GroupLayout(TitleSelectContinent);
        TitleSelectContinent.setLayout(TitleSelectContinentLayout);
        TitleSelectContinentLayout.setHorizontalGroup(
            TitleSelectContinentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleSelectContinentLayout.createSequentialGroup()
                .addGroup(TitleSelectContinentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TitleSelectContinentLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(backButton)
                        .addGap(83, 83, 83)
                        .addComponent(SouthAmericaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleSelectContinentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NorthAmericaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(TitleSelectContinentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TitleSelectContinentLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(EuropeHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AfricaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(AustraliaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleSelectContinentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AsiaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        TitleSelectContinentLayout.setVerticalGroup(
            TitleSelectContinentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleSelectContinentLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(TitleSelectContinentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TitleSelectContinentLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(EuropeHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AfricaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(TitleSelectContinentLayout.createSequentialGroup()
                        .addComponent(NorthAmericaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(TitleSelectContinentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleSelectContinentLayout.createSequentialGroup()
                                .addComponent(SouthAmericaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleSelectContinentLayout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(30, 30, 30))))))
            .addGroup(TitleSelectContinentLayout.createSequentialGroup()
                .addComponent(AsiaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AustraliaHighlighted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(TitleSelectContinent, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/newpackage1/world-map-background1.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel2, gridBagConstraints);
        jLabel2.getAccessibleContext().setAccessibleName("mapBackground");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AustraliaHighlightedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AustraliaHighlightedMouseExited
        // TODO add your handling code here:
        AustraliaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AustraliaHighlightedMouseExited

    private void AustraliaHighlightedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AustraliaHighlightedMouseClicked
        // TODO add your handling code here:
        Australia australia = new Australia();
        australia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AustraliaHighlightedMouseClicked

    private void AustraliaHighlightedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AustraliaHighlightedMouseEntered
        // TODO add your handling code here:
        AustraliaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AustraliaHighlightedMouseEntered

    private void EuropeHighlightedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EuropeHighlightedMouseExited
        // TODO add your handling code here:
        EuropeHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_EuropeHighlightedMouseExited

    private void EuropeHighlightedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EuropeHighlightedMouseClicked
        // TODO add your handling code here:
        Europe eu = new Europe();
        eu.setVisible(true);
        this.setVisible(false);
       
        
        
    }//GEN-LAST:event_EuropeHighlightedMouseClicked

    private void EuropeHighlightedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EuropeHighlightedMouseEntered
        EuropeHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));        // TODO add your handling code here:
    }//GEN-LAST:event_EuropeHighlightedMouseEntered

    private void AfricaHighlightedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AfricaHighlightedMouseExited
        // TODO add your handling code here:
        AfricaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AfricaHighlightedMouseExited

    private void AfricaHighlightedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AfricaHighlightedMouseClicked
        // TODO add your handling code here:
      Africa africa = new Africa();
        africa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AfricaHighlightedMouseClicked

    private void AfricaHighlightedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AfricaHighlightedMouseEntered
        // TODO add your handling code here:
        AfricaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AfricaHighlightedMouseEntered

    private void AsiaHighlightedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsiaHighlightedMouseExited
        // TODO add your handling code here:
        AsiaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AsiaHighlightedMouseExited

    private void AsiaHighlightedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsiaHighlightedMouseClicked
        // TODO add your handling code here:
      Asia asia = new Asia();
        asia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AsiaHighlightedMouseClicked

    private void AsiaHighlightedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsiaHighlightedMouseEntered
        // TODO add your handling code here:
        AsiaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }//GEN-LAST:event_AsiaHighlightedMouseEntered

    private void NorthAmericaHighlightedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthAmericaHighlightedMouseExited
        // TODO add your handling code here:
        NorthAmericaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));//back to arrow cursor onmouseout
    }//GEN-LAST:event_NorthAmericaHighlightedMouseExited

    private void NorthAmericaHighlightedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthAmericaHighlightedMouseClicked
        // TODO add your handling code here:
      NorthAmerica na = new NorthAmerica();
        na.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NorthAmericaHighlightedMouseClicked

    private void NorthAmericaHighlightedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthAmericaHighlightedMouseEntered
        // TODO add your handling code here:
        NorthAmericaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_NorthAmericaHighlightedMouseEntered

    private void SouthAmericaHighlightedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SouthAmericaHighlightedMouseExited
        // TODO add your handling code here:
        SouthAmericaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));//back to arrow cursor onmouseout
    }//GEN-LAST:event_SouthAmericaHighlightedMouseExited

    private void SouthAmericaHighlightedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SouthAmericaHighlightedMouseClicked
        // TODO add your handling code here:
        SouthAmerica sa = new SouthAmerica();
        sa.setVisible(true);
        this.setVisible(false);
       // new SouthAmerica().setVisible(true);
    }//GEN-LAST:event_SouthAmericaHighlightedMouseClicked

    private void SouthAmericaHighlightedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SouthAmericaHighlightedMouseEntered
        // TODO add your handling code here:

        SouthAmericaHighlighted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));//changes to click cursor when moused over
    }//GEN-LAST:event_SouthAmericaHighlightedMouseEntered

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Home backhome = new Home();
        backhome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

  
    
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
            java.util.logging.Logger.getLogger(ContinentSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContinentSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContinentSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContinentSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContinentSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AfricaHighlighted;
    private javax.swing.JPanel AsiaHighlighted;
    private javax.swing.JPanel AustraliaHighlighted;
    private javax.swing.JPanel EuropeHighlighted;
    private javax.swing.JPanel NorthAmericaHighlighted;
    private javax.swing.JPanel SouthAmericaHighlighted;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TitleSelectContinent;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
