package belajar;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author GANI
 */
public class mahasiswa extends javax.swing.JFrame {
private Connection con;
private Statement stat;
private ResultSet res;
private String t;
    public mahasiswa() {
        initComponents();
        setTitle("Entry Data Mahasiswa");
        koneksi();
        kosongkan();
        jurusan();
       //membuat layout tampil di tengah pada saat di tampilkan
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
    }
private void koneksi(){
try {
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/belajar", "userdatabase", "password-database");
stat=con.createStatement();
} catch (Exception e) {
JOptionPane.showMessageDialog(null, e);
}
}
private void kosongkan()
{ 
nm.setText(""); 
nma.setText(""); 
jsn.setSelectedIndex(-1); 
tgl.setDate(null); 
almt.setText(""); 
nm.requestFocus();
 } 
private void jurusan(){ 
jsn.addItem("Teknik Informatika"); 
jsn.addItem("Teknik Mesin"); 
jsn.addItem("Teknik Elektro"); 
jsn.addItem("Teknik Makan Sambil Tidur"); 
jsn.setSelectedIndex(-1); }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        nma = new javax.swing.JTextField();
        jsn = new javax.swing.JComboBox();
        tgl = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        almt = new javax.swing.JTextArea();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Entry Data Mahasiswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 26, 201, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NIM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 21, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 108, 30, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 144, 41, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tanggal Lahir");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 190, 72, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 238, 37, 15);

        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        getContentPane().add(nm);
        nm.setBounds(115, 65, 144, 30);
        getContentPane().add(nma);
        nma.setBounds(115, 106, 144, 30);

        getContentPane().add(jsn);
        jsn.setBounds(115, 144, 144, 30);

        tgl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglPropertyChange(evt);
            }
        });
        getContentPane().add(tgl);
        tgl.setBounds(115, 186, 140, 30);

        almt.setColumns(20);
        almt.setRows(5);
        jScrollPane1.setViewportView(almt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(115, 238, 166, 57);

        simpan.setText("Simpat");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(10, 331, 65, 23);

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(81, 331, 51, 23);

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus);
        hapus.setBounds(138, 331, 63, 23);

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        getContentPane().add(batal);
        batal.setBounds(207, 331, 57, 23);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(270, 331, 70, 23);

        setBounds(0, 0, 368, 441);
    }// </editor-fold>//GEN-END:initComponents

    private void tglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglPropertyChange
        if(tgl.getDate()!=null){
SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
t = format.format(tgl.getDate());
        }
    }//GEN-LAST:event_tglPropertyChange

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        
try {
 stat.executeUpdate("insert into mahasiswa values (" 
+ "'" + nm.getText()+"'," 
+ "'" + nma.getText()+"'," 
+ "'" + jsn.getSelectedItem()+ "'," 
+ "'" + t + "'," 
+ "'" + almt.getText()+ "')" ); 
kosongkan(); 
JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data"); 
} catch (Exception e) { 
JOptionPane.showMessageDialog(null, "Perintah Salah : "+e);
 } 
 
    }//GEN-LAST:event_simpanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try { 
stat.executeUpdate("update mahasiswa set "
+ "nama='"+nma.getText()+"'," 
+ "jurusan='"+jsn.getSelectedItem()+"'," 
+ "tanggal_lahir='"+t+"'," 
+ "alamat='"+almt.getText()+"'" 
+ " where " + "nim='"+nm.getText()+"'" ); 
kosongkan(); 
JOptionPane.showMessageDialog(rootPane, "Data berhasil Diupdate"); 
} catch (Exception e) { 
JOptionPane.showMessageDialog(rootPane, e); 
} 
   
    }//GEN-LAST:event_editActionPerformed

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        try { 
res=stat.executeQuery("select * from mahasiswa where "+ "nim='" +nm.getText()
+"'" ); while (res.next()) 
{ nma.setText(res.getString("nama")); 
jsn.setSelectedItem(res.getString("jurusan")); 
tgl.setDate(res.getDate("tanggal_lahir")); 
almt.setText(res.getString("alamat")); 
} 
} 
catch (Exception e) { 
JOptionPane.showMessageDialog(rootPane, e); 
} 

    }//GEN-LAST:event_nmActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try { 
stat.executeUpdate("delete from mahasiswa where " 
+ "nim='"+nm.getText()
+"'" ); 
kosongkan(); 
JOptionPane.showMessageDialog(null, "Berhasil");
 } catch (Exception e) { 
JOptionPane.showMessageDialog(null, "pesan salah : "+e);
 } 
    }//GEN-LAST:event_hapusActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        kosongkan();
    }//GEN-LAST:event_batalActionPerformed

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
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mahasiswa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea almt;
    private javax.swing.JButton batal;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jsn;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField nma;
    private javax.swing.JButton simpan;
    private com.toedter.calendar.JDateChooser tgl;
    // End of variables declaration//GEN-END:variables
}
