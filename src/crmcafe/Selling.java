
package crmcafe;

import net.proteanit.sql.DbUtils;

import java.awt.print.PrinterException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Selling extends javax.swing.JFrame {
    public Selling() {
        initComponents();
        showProducts();
        priceTb.setEditable(false);
        sellerTb.setEditable(false);
        PrName.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PrName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        priceTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        printBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Itemstab = new javax.swing.JTable();
        sellerTb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        prTb = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Название");

        PrName.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PrName.setForeground(new java.awt.Color(255, 0, 102));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Управление продажами");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Кассир");

        priceTb.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        priceTb.setForeground(new java.awt.Color(255, 0, 102));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Цена");

        printBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 0, 102));
        printBtn.setText("Печать");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        Itemstab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Itemstab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Название", "Категория", "Цена"
            }
        ));
        Itemstab.setRowHeight(29);
        Itemstab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemstabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Itemstab);

        sellerTb.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        sellerTb.setForeground(new java.awt.Color(255, 0, 102));
        sellerTb.setText("Seller1");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Количество");

        prTb.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        prTb.setForeground(new java.awt.Color(255, 0, 102));

        BillTable.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Название", "Цена", "Кассир", "Total"
            }
        ));
        BillTable.setRowHeight(29);
        jScrollPane2.setViewportView(BillTable);

        addBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 0, 102));
        addBtn.setText("Добавить в чек");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabelTotal.setText("Итого");
        jLabelTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTotalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(priceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prTb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PrName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sellerTb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(addBtn)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(printBtn)
                                .addGap(186, 186, 186))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelTotal)
                                .addGap(212, 212, 212))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(364, 364, 364))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellerTb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prTb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabelTotal)
                        .addGap(18, 18, 18)
                        .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Продукты");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("Продажи");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("Выход");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    ResultSet rs = null, rs2 = null;// показывает результат запроса через Statement или PreparedStatement
    Connection con = null;
    Statement st = null, st2 = null;//не обходим для запросов к БД

    private void showProducts(){//Метод отображения в таблице UI данных из БД
        try {

            con = DriverManager.getConnection("", "", "");//подключаемся к БД
            st = con.createStatement();//создаем интерфейс Statement для выполнения SQL – запросов
            rs =  st.executeQuery("select * from productbl");//создание запроса
            Itemstab.setModel(DbUtils.resultSetToTableModel(rs));//передаем данные в UI
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    int bNum;
    private void countBill(){
        try {
            st2 = con.createStatement();
            rs2 = st2.executeQuery("select MAX(bnum) from billtbl");
            rs2.next();
            bNum = rs2.getInt(1) + 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void insertBill(){
            try {
                countBill();

                //Подключаемся к БС через DriverManager и передаем его методу getConnection в параметрах url базы данных, логин и пароль
                con = DriverManager.getConnection("", "", "");

                PreparedStatement pst = con.prepareStatement("insert into  billtbl values (?, ?, ?, ?)");
                pst.setInt(1, bNum);
                pst.setString(2, sellerTb.getText());
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                pst.setString(3, now.toString().substring(1, 10));
                pst.setInt(4, grdTotal);
                int row = pst.executeUpdate();
                //JOptionPane.showMessageDialog(this,"Продажа добавлена!");
                con.close();
                showProducts();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
            }
    }


    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        try {
            insertBill();
            BillTable.print();
        } catch (PrinterException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_printBtnActionPerformed

    private void jLabelTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTotalMouseClicked

    }//GEN-LAST:event_jLabelTotalMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(this, "У вас не достаточно прав, выполните вход как Администратор");
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JOptionPane.showMessageDialog(this, "У вас не достаточно прав, выполните вход как Администратор");
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    int grdTotal = 0;
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {

        if(PrName.getText().isEmpty() || prTb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Заполните все поля!");

        }else{
            int total = Integer.parseInt(priceTb.getText()) * Integer.parseInt(prTb.getText());
            grdTotal = grdTotal + total;
            jLabelTotal.setText("Итого " + grdTotal + " руб.");
            
            DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
            String nextRow = Integer.toString(model.getRowCount());
            model.addRow(new Object[]{
                    Integer.parseInt(nextRow) + 1,
                    PrName.getText(),
                    priceTb.getText(),
                    prTb.getText(),
                    total});
        }


       
    }


    int key = 0;
    int stock;
    private void ItemstabMouseClicked(java.awt.event.MouseEvent evt) {                                      
        DefaultTableModel model = (DefaultTableModel) Itemstab.getModel();
        int myIndex = Itemstab.getSelectedRow();//записываем в переменную индекс строки
        key = Integer.parseInt(model.getValueAt(myIndex, 0).toString()); //в key записываем
        PrName.setText(model.getValueAt(myIndex, 1).toString());
        //    ptCatBox.setText(model.getValueAt(myIndex, 0).toString());
        priceTb.setText(model.getValueAt(myIndex, 3).toString());    }

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JTable Itemstab;
    private javax.swing.JTextField PrName;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField prTb;
    private javax.swing.JTextField priceTb;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextField sellerTb;
    // End of variables declaration//GEN-END:variables
}
