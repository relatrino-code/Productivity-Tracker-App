package productivityTracker;

/**
 *
 * @author coder
 */
public class ActivityMap extends javax.swing.JFrame {

    /**
     * Creates new form ActivityMap
     */
    public ActivityMap() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("ACTIVITY MAP");

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"July 05 (T)", "Registration for Practice School II"},
                {"July 05 (T)", "Practice School II begins"},
                {"July 10 (Su)", "Id-ul-Zuha (H)"},
                {"August 11 (Th)", "Raksha Bandhan (H)"},
                {"August 15 (M)", "Independence Day (H)"},
                {"August 19 (F) ", "Janmashtami (H)"},
                {"August 29 (M)", "First Semester begins"},
                {"August 29 (M)", "Registration for all students"},
                {"August 30 (T) ", "Classwork begins"},
                {"August 31 (W)", "Ganesh Chaturthi (H)"},
                {"September 16 (F)", "Last day for substitution of courses"},
                {"October 02 (Su)", "Mahatma Gandhi’s Birthday (H)"},
                {"October 05 (W)", "Dussehra (H)"},
                {"October 24 (M) - 25 (T)", "Diwali (H)"},
                {"October 31 (M) to November 05 (S)", "Midsemester Test"},
                {"November 05 (S) ", "Last day for withdrawal from courses"},
                {"November 08 (T) ", "Guru Nanak’s Birthday (H)"},
                {"November 12 (S) ", "Last day for Mid-Semester Grading"},
                {"December 15 (Th)", "Last day for classwork"},
                {"December 15 (Th)", "Practice School II ends"},
                {"December 17 (S)", "Comprehensive Examination begins"},
                {"December 19 (M)", "Goa Liberation Day (H)"},
                {"December 25 (Su) ", "Christmas (H) "},
                {"December 31 (S) ", "Comprehensive Examination ends "},
                {"December 31 (S)", "First Semester ends"},
                {"January 01 (Su) - January 15 (Su) ", "Recess "},
                {"January 14 (S)", "January 14 (S)"},
                {"January 16 (M)", "Second Semester begins "},
                {"January 16 (M)", "Registration for all students "},
                {"January 16 (M)", "Registration for Practice School II"},
                {"January 17 (T) ", "Practice School II"},
                {"January 17 (T) ", "Classwork begins "},
                {"January 26 (Th)", "Republic Day (H) & Basant Panchami (H)"},
                {"January 30 (M) ", "Last day for substitution of courses "},
                {"February 18 (S)", "Maha Shivratri (H) "},
                {"March 08 (W) ", "Holi (H) "},
                {"March 13 (M) – 18 (S) ", "Midsemester Test"},
                {"March 18 (S) ", "Last day for withdrawal from courses"},
                {"March 22 (W)", "Ugadi (H) "},
                {"March 25 (S) ", "Last day for Mid-Semester Grading"},
                {"March 30 (Th)", "Ram Navami (H)"},
                {"April 04 (T) ", "Mahavir Jayanti (H)"},
                {"April 07 (F) ", "Good Friday (H) "},
                {"April 22 (S) ", "Id-ul Fitr (H)"},
                {"May 03 (W)", "Registration for Practice School I"},
                {"May 04 (Th)", "Last day for classwork"},
                {"May 05 (F) ", "Buddha Purnima (H) "},
                {"May 06 (S) ", "Comprehensive Examination begins "},
                {"May 22 (M) ", "Comprehensive Examination ends"},
                {"May 22 (M)", "Second Semester ends "},
                {"May 22 (M)", "Summer Vacation begins"},
                {"May 23 (T)", "Summer term begins"},
                {"May 23 (T)", "Practice School I begins"},
                {"June 26 (M)", "Practice School II ends"},
                {"July 18 (T) ", "Practice School I ends"},
                {"July 18 (T)", "Summer Term ends"},
                {"July 20 (Th)", "Summer Vacation ends"}
            },
            new String [] {
                "DATE", "ACTIVITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setText("FOR ACADEMIC YEAR 2022-23");

        jButton1.setText("Close Activity Map");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel2)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ActivityMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivityMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivityMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivityMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivityMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
