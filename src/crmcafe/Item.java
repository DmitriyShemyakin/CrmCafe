
package crmcafe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import net.proteanit.sql.DbUtils;


public class Item extends javax.swing.JFrame {



    public Item() {
        initComponents();
        showProducts();
    }
    
    ResultSet rs = null, rs2 = null;// показывает результат запроса через Statement или PreparedStatement
    Connection con = null;
    Statement st = null, st2 = null;//не обходим для запросов к БД
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PrName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PrPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PtCatBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JTable();
        EditBtn1 = new javax.swing.JButton();
        EditBtn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel5.setText("Управление продуктами");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Категория");

        PrPrice.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PrPrice.setForeground(new java.awt.Color(255, 0, 102));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Цена");

        PtCatBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PtCatBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Напиток", "Мороженое" }));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Фильтр");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Список продуктов");

        jComboBox2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Напиток", "Мороженое" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 0, 102));
        deleteBtn.setText("Удалить");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 0, 102));
        addBtn.setText("Добавить");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        ProductList.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ProductList.setRowHeight(29);
        ProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductList);

        EditBtn1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EditBtn1.setForeground(new java.awt.Color(255, 0, 102));
        EditBtn1.setText("Изменить");
        EditBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtn1ActionPerformed(evt);
            }
        });

        EditBtn2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EditBtn2.setForeground(new java.awt.Color(255, 0, 102));
        EditBtn2.setText("Сброс");
        EditBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(366, 366, 366))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(PtCatBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(PrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(20, 20, 20)))
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn2)
                        .addGap(317, 317, 317))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrName)
                            .addComponent(PtCatBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(addBtn)
                    .addComponent(EditBtn1))
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EditBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Продукты");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
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

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("Продажи");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtn2ActionPerformed
        showProducts();
    }//GEN-LAST:event_EditBtn2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new ViewSells().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void refBtnItemStateChanged(java.awt.event.ItemEvent evt) {//Слушталеь для кнопки "Сброс фильтров"
        showProducts();
    }                                       


    int prNum;
    private void countProd(){
        try {
            st2 = con.createStatement();
            rs2 = st2.executeQuery("select MAX(PNum) from productbl");
            rs2.next();
            prNum = rs2.getInt(1) + 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showProducts(){//Метод отображения в таблице UI данных из БД
        try {

            con = DriverManager.getConnection("", "", "");//подключаемся к БД
            st = con.createStatement();//создаем интерфейс Statement для выполнения SQL – запросов
            rs =  st.executeQuery("select * from productbl");//создание запроса
            ProductList.setModel(DbUtils.resultSetToTableModel(rs));//передаем данные в UI
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void filerProducts(){//Метод отображения в таблице UI данных из БД
        try {

            con = DriverManager.getConnection("", "", "");//подключаемся к БД
            st = con.createStatement();//создаем интерфейс Statement для выполнения SQL – запросов
            //создание запроса (покажи таблицу только, только для тех где category = jComboBox2.getSelectedItem() (выбранный элемент в JCombobox))
            rs =  st.executeQuery("select * from productbl where category = '" +  jComboBox2.getSelectedItem().toString() + "'");
            ProductList.setModel(DbUtils.resultSetToTableModel(rs));//передаем данные в UI
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    private void EditBtn1ActionPerformed(java.awt.event.ActionEvent evt) {


        //Если PrName пустой или PrPrice пустой или PtCatBox имеет индекс -1, то вызывается диалоговое окно с
        // просьбой заполнить все поля
        if(PrName.getText().isEmpty() || PrPrice.getText().isEmpty() || PtCatBox.getSelectedIndex() == -1){

            JOptionPane.showMessageDialog(this, "Заполните все поля");

        }else{ //Если все заполнено
            try {
                countProd();

                //Подключаемся к БД через DriverManager и передаем его методу getConnection в параметрах url базы данных, логин и пароль
                con = DriverManager.getConnection("", "", "");

                //создаем запрос на изменения данных в БД (только если id = key)
                PreparedStatement pst = con.prepareStatement("update  productbl set pname=?, category=?, price=? where pnum=?");
                pst.setInt(4, key);
                pst.setString(1, PrName.getText());
                pst.setString(2, PtCatBox.getSelectedItem().toString());
                pst.setInt(3, Integer.parseInt(PrPrice.getText()));
                int row = pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Продукт изменен!");
                con.close();
                showProducts();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
            }
        }
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//слушатель кнопки "Удалить"
        //Если PrName пустой или PrPrice пустой или PtCatBox имеет индекс -1, то вызывается диалоговое окно с
        // просьбой заполнить все поля
        if(PrName.getText().isEmpty() || PrPrice.getText().isEmpty() || PtCatBox.getSelectedIndex() == -1){

            JOptionPane.showMessageDialog(this, "Заполните все поля");

        }else{ //Если все заполнено
            try {
                countProd();

                //Подключаемся к БС через DriverManager и передаем его методу getConnection в параметрах url базы данных, логин и пароль
                con = DriverManager.getConnection("", "", "");

                //создаем запрос для удаления значения из  таблицы
                PreparedStatement pst = con.prepareStatement("delete from productbl where pnum = ?");
                //передаем значение на место "?"
                pst.setInt(1, key);

                int row = pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Продукт удален!");
                con.close();
                showProducts();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
            }
        }
    }                                         

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//Слушатель для фильтра
        filerProducts();
    }


    int key = 0;
    private void ProductListMouseClicked(java.awt.event.MouseEvent evt) {//слушатель для таблицы продуктов (клик мышкой)

        DefaultTableModel  model = (DefaultTableModel) ProductList.getModel();
        int myIndex = ProductList.getSelectedRow();//записываем в переменную индекс строки
        key = Integer.parseInt(model.getValueAt(myIndex, 0).toString()); //в key записываем
        PrName.setText(model.getValueAt(myIndex, 1).toString());
    //    ptCatBox.setText(model.getValueAt(myIndex, 0).toString());
        PrPrice.setText(model.getValueAt(myIndex, 3).toString());



    }



    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {/// Слушатель кнопки "Добавить"(Item)

        //Если PrName пустой или PrPrice пустой или PtCatBox имеет индекс -1, то вызывается диалоговое окно с
        // просьбой заполнить все поля
        if(PrName.getText().isEmpty() || PrPrice.getText().isEmpty() || PtCatBox.getSelectedIndex() == -1){

            JOptionPane.showMessageDialog(this, "Заполните все поля!");

        }else{ //Если все заполнено
            try {
                countProd();

            //Подключаемся к БС через DriverManager и передаем его методу getConnection в параметрах url базы данных, логин и пароль
                con = DriverManager.getConnection("", "", "");

                PreparedStatement pst = con.prepareStatement("insert into  productbl values (?, ?, ?, ?)");
                pst.setInt(1, prNum);
                pst.setString(2, PrName.getText());
                pst.setString(3, PtCatBox.getSelectedItem().toString());
                pst.setInt(4, Integer.parseInt(PrPrice.getText()));
                int row = pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Продукт добавлен!");
                con.close();
                showProducts();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
            }
            }
    }




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
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBtn1;
    private javax.swing.JButton EditBtn2;
    private javax.swing.JTextField PrName;
    private javax.swing.JTextField PrPrice;
    private javax.swing.JTable ProductList;
    private javax.swing.JComboBox<String> PtCatBox;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
