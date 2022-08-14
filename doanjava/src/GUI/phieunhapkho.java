/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Hong Xuan
 */
import BLL.dichvukhambenh_BLL;
import DAL.*;
import DTO.*;
import BLL.*;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class phieunhapkho extends javax.swing.JFrame {

    DefaultTableModel chitiet = new DefaultTableModel();

    /**
     * Creates new form phieunhapkho
     */
    public phieunhapkho() {
        initComponents();
        this.showtable();
    }

    public void showtable() {
        datengaynk.setDate(java.util.Date.from(Instant.now()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngayht = sdf.format(java.util.Date.from(Instant.now()));
        datengaynk.setDateFormatString(ngayht);
        chitiet.addColumn("Mã Thuốc");
        chitiet.addColumn("Tên Thuốc");
        chitiet.addColumn("Giá");
        chitiet.addColumn("SL");
        tablechitietnk.setModel(chitiet);
        tfmanv.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbmathuoc = new javax.swing.JLabel();
        lbtenthuoc = new javax.swing.JLabel();
        lbgia = new javax.swing.JLabel();
        lbsl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablechitietnk = new javax.swing.JTable()
        {
            @Override
            public boolean isCellEditable(int row,int columns)
            {
                return false;
            }
        } ;
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfmank = new javax.swing.JTextField();
        tfmanv = new javax.swing.JTextField();
        tfmathuoc = new javax.swing.JTextField();
        tftenthuoc = new javax.swing.JTextField();
        tfgia = new javax.swing.JTextField();
        tfsl = new javax.swing.JSpinner();
        btnthoat = new javax.swing.JButton();
        btnxoa1hang = new javax.swing.JButton();
        btnthemphieunk = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        datengaynk = new com.toedter.calendar.JDateChooser();
        btnthemthuoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel1.setText("PHIẾU NHẬP KHO");

        lbmathuoc.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lbmathuoc.setText("Nhập mã thuốc");

        lbtenthuoc.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lbtenthuoc.setText("Nhập tên thuốc");

        lbgia.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        lbgia.setText("Nhập Giá");

        lbsl.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lbsl.setText("Số lượng");

        tablechitietnk.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablechitietnk);

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel6.setText("Mã nhập kho");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel7.setText("Mã Nhân viên");

        tfmank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmankActionPerformed(evt);
            }
        });

        tfmathuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmathuocActionPerformed(evt);
            }
        });
        tfmathuoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfmathuocKeyPressed(evt);
            }
        });

        tfgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfgiaActionPerformed(evt);
            }
        });

        tfsl.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnthoat.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        btnxoa1hang.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnxoa1hang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cut.png"))); // NOI18N
        btnxoa1hang.setText("Xóa 1 Hàng");
        btnxoa1hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoa1hangActionPerformed(evt);
            }
        });

        btnthemphieunk.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnthemphieunk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add.png"))); // NOI18N
        btnthemphieunk.setText("Thêm");
        btnthemphieunk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemphieunkActionPerformed(evt);
            }
        });

        jLabel8.setText("Ngày nhập");

        btnthemthuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add.png"))); // NOI18N
        btnthemthuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemthuocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(btnthemphieunk, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnxoa1hang, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnthemthuoc)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                        .addComponent(lbgia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbmathuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbtenthuoc)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfmank)
                                            .addComponent(tfmanv)
                                            .addComponent(datengaynk, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                            .addComponent(tftenthuoc)
                                            .addComponent(tfmathuoc))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfgia, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(73, 73, 73)
                                            .addComponent(lbsl)
                                            .addGap(34, 34, 34)
                                            .addComponent(tfsl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfmank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datengaynk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmathuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfmathuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtenthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftenthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbsl)
                            .addComponent(tfsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthoat)
                            .addComponent(btnxoa1hang)
                            .addComponent(btnthemphieunk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnthemthuoc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean hasnv(String manv) {
        nhanvien_BLL nvBLL = new nhanvien_BLL();
        if (nvBLL.hasnv(manv)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasnk(String mank) {
        phieunhapkho_BLL phieu = new phieunhapkho_BLL();
        return phieu.hasphieunk(mank);
    }

    private void btnthemphieunkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemphieunkActionPerformed
        // TODO add your handling code here:

        if (tfmank.getText().trim().equals("") || tfmanv.getText().trim().equals("")
                || tfmathuoc.getText().trim().equals("") || tftenthuoc.getText().trim().equals("")
                || tfgia.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Vui Lòng nhập đầy đủ thông tin", "Thông báo ", JOptionPane.CLOSED_OPTION);
            return;
        }
        try {
            //tạo dữ liệu khi người dùng nhập vào
            chitietnhapkho_BLL ctnk_BLL = new chitietnhapkho_BLL();
            chitietnhapkho_DTO ctnkDTO = new chitietnhapkho_DTO();
            phieunhapkho_DTO phieunkDTO = new phieunhapkho_DTO();
            phieunhapkho_BLL phieunkBLL = new phieunhapkho_BLL();
            String mank = tfmank.getText().trim();
            String manv = tfmanv.getText().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String ngay = sdf.format(java.util.Date.from(Instant.now()));
            if (this.hasnk(mank) == true) {
                JOptionPane.showConfirmDialog(this, "Trùng mã nhập kho.Vui lòng chọn lại !!", "Thông báo", JOptionPane.CLOSED_OPTION);
            }
            if (this.hasnv(manv)==false) {
                JOptionPane.showConfirmDialog(this, "Nhân viên không tồn tại.Vui lòng chọn lại !!", "Thông báo", JOptionPane.CLOSED_OPTION);
            }

            phieunkDTO.setMank(mank);
            phieunkDTO.setManv(manv);
            phieunkDTO.setNgaynk(ngay);
            int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm phiếu nhập!", "Thông báo", JOptionPane.CANCEL_OPTION);
            if (a == 0) {
                if (phieunkBLL.them(phieunkDTO)) 
                {
                    for (int i = 0; i < chitiet.getRowCount(); i++) {
                        String mathuoc = (String) chitiet.getValueAt(i, 0);
                        String tenthuoc = (String) chitiet.getValueAt(i, 1);
                        double gia = (double)chitiet.getValueAt(i, 2);
                        int sl = (int)chitiet.getValueAt(i, 3);
                        ctnkDTO.setMank(mank);
                        ctnkDTO.setMathuoc(mathuoc);
                        ctnkDTO.setTenthuoc(tenthuoc);
                        ctnkDTO.setGia(gia);
                        ctnkDTO.setSl(sl);
                        if(ctnk_BLL.them(ctnkDTO)==false)
                        {
                            JOptionPane.showConfirmDialog(this, "Lỗi dữ liệu chi tiết nhập kho!", "Thông báo", JOptionPane.CLOSED_OPTION);
                        }
                      
                    }
                     JOptionPane.showConfirmDialog(this, "Thêm phiếu nhập kho thành công!", "Thông báo", JOptionPane.CLOSED_OPTION);
                }
                else
                {
                     JOptionPane.showConfirmDialog(this, "Thêm phiếu nhập kho không thành công!", "Thông báo", JOptionPane.CLOSED_OPTION);
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(this, "Lỗi Kiểu dữ liệu .Vui lòng kiểm tra!", "thông báo", JOptionPane.CLOSED_OPTION);
        }


    }//GEN-LAST:event_btnthemphieunkActionPerformed

    private void btnxoa1hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoa1hangActionPerformed
        // TODO add your handling code here:
        try {
            int i = tablechitietnk.getSelectedRow();
            chitiet.removeRow(i);
            tablechitietnk.setModel(chitiet);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showConfirmDialog(this, "Bạn chưa chọn hàng cần xóa Vui lòng chọn", "Thông báo", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_btnxoa1hangActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "bạn có muốn thoát ??", "Thông báo!!", JOptionPane.CANCEL_OPTION);
        if (a == 0) {
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnthoatActionPerformed

    private void tfgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfgiaActionPerformed

    private void tfmathuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmathuocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmathuocActionPerformed

    private void tfmankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmankActionPerformed

    private void btnthemthuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemthuocActionPerformed
        // TODO add your handling code here:

        try {
            String mathuoc = tfmathuoc.getText().trim();
            String tenthuoc = tftenthuoc.getText();
            double gia = Double.parseDouble(tfgia.getText());
            int sl = (int) tfsl.getValue();
            Object[] row = {mathuoc, tenthuoc, gia, sl};
            for (int i = 0; i < chitiet.getRowCount(); i++) {
                if (mathuoc.equals(chitiet.getValueAt(i, 0))) {
                    JOptionPane.showConfirmDialog(this, "Mã thuốc này đã được chọn vui lòng nhập lại!", "thông báo", JOptionPane.CLOSED_OPTION);
                    return;
                }
            }
            chitiet.addRow(row);
            tablechitietnk.setModel(chitiet);
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(this, "Lỗi dữ liệu!! vui lòng kiểm tra lại!!", "Thông báo", JOptionPane.CLOSED_OPTION);
        }

    }//GEN-LAST:event_btnthemthuocActionPerformed
    public void setmanv(String manv)
    {
        tfmanv.setText(manv);
    }
    private void tfmathuocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfmathuocKeyPressed
        // TODO add your handling code here:
        String mathuoc=tfmathuoc.getText().trim();
        thuoc_BLL thuoc=new thuoc_BLL();
        if(thuoc.hasthuoc(mathuoc))
        {
            System.out.println(thuoc.getten(mathuoc));
            tftenthuoc.setText(thuoc.getten(mathuoc));
        }
    }//GEN-LAST:event_tfmathuocKeyPressed
    public void showchitietnhapkho(String mank) {
        chitiet.setColumnCount(0);
        chitiet.setRowCount(0);
        btnthemthuoc.setVisible(false);
        chitiet.addColumn("Mã Thuốc");
        chitiet.addColumn("Tên Thuốc");
        chitiet.addColumn("Giá");
        chitiet.addColumn("SL");
        chitietnhapkho_BLL chitietnk = new chitietnhapkho_BLL();
        ArrayList<chitietnhapkho_DTO> arr = new ArrayList<chitietnhapkho_DTO>();
        arr = chitietnk.gettheomank(mank);
        for (int i = 0; i < arr.size(); i++) {
            chitietnhapkho_DTO ctnk = arr.get(i);
            String mathuoc = ctnk.getMathuoc();
            String tenthuoc = ctnk.getTenthuoc();
            double gia = ctnk.getGia();
            int sl = ctnk.getSl();
            Object[] obj = {mathuoc, tenthuoc, gia, sl};
            chitiet.addRow(obj);
        }
        tablechitietnk.setModel(chitiet);
    }

    public void showphieunk(phieunhapkho_DTO phieunkDTO) {

        btnthemphieunk.setVisible(false);
        btnxoa1hang.setVisible(false);
        lbmathuoc.setEnabled(false);
        lbtenthuoc.setEnabled(false);
        lbsl.setEnabled(false);
        lbgia.setEnabled(false);
        tfmathuoc.setEnabled(false);
        tftenthuoc.setEnabled(false);
        tfgia.setEnabled(false);
        tfsl.setEnabled(false);
        tfmank.setText(phieunkDTO.getMank());
        tfmank.setEditable(false);
        tfmanv.setText(phieunkDTO.getManv());
        tfmanv.setEditable(false);
        String dateString = phieunkDTO.getNgaynk();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = df.parse(dateString);
            datengaynk.setDate(date);
            datengaynk.setDateFormatString(dateString);
        } catch (ParseException ex) {
            System.out.println("hé lô Mai Hồng Xuân!!" + ex);
        }
        this.showchitietnhapkho(phieunkDTO.getMank());
    }

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
            java.util.logging.Logger.getLogger(phieunhapkho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(phieunhapkho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(phieunhapkho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(phieunhapkho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phieunhapkho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnthemphieunk;
    private javax.swing.JButton btnthemthuoc;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa1hang;
    private com.toedter.calendar.JDateChooser datengaynk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbgia;
    private javax.swing.JLabel lbmathuoc;
    private javax.swing.JLabel lbsl;
    private javax.swing.JLabel lbtenthuoc;
    private javax.swing.JTable tablechitietnk;
    private javax.swing.JTextField tfgia;
    private javax.swing.JTextField tfmank;
    private javax.swing.JTextField tfmanv;
    private javax.swing.JTextField tfmathuoc;
    private javax.swing.JSpinner tfsl;
    private javax.swing.JTextField tftenthuoc;
    // End of variables declaration//GEN-END:variables
}