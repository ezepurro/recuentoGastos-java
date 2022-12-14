/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import clases.*;
import java.io.*;
import org.json.simple.parser.*;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author ezequ
 */
public class crearGasto extends javax.swing.JFrame {

    String user = "";

    /**
     * Creates new form crearGasto
     */
    public crearGasto(String usuario) {
        initComponents();
        txtFecha.setText(conseguirFecha());
        user = usuario;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        txtComentario = new javax.swing.JTextField();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnCrearGasto = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblCond = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setText("Crear Gasto");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Monto");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Categoria");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Fecha Realizado");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Comentario");

        txtMonto.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));
        txtFecha.setText("dd/mm/yy");
        txtFecha.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N

        txtComentario.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N

        comboBoxCategoria.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servicios", "Compras", "Restaurantes y bares", "Entretenimiento", "Supermercado", "Otro" }));
        comboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("$");

        btnCrearGasto.setBackground(new java.awt.Color(16, 125, 216));
        btnCrearGasto.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnCrearGasto.setForeground(new java.awt.Color(250, 250, 250));
        btnCrearGasto.setText("Crear gasto");
        btnCrearGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearGastoActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(16, 125, 216));
        btnVolver.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(250, 250, 250));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblCond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCond.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMonto)
                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha)
                    .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCrearGasto)
                    .addComponent(btnVolver)
                    .addComponent(lblCond, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(lblCond)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearGasto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void comboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCategoriaActionPerformed

    private void btnCrearGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearGastoActionPerformed

        try {
            float monto = Float.parseFloat(txtMonto.getText());
            String fechaRealizado = txtFecha.getText();
            String categoria = (String) comboBoxCategoria.getSelectedItem();
            String comentario = txtComentario.getText();
            Gasto gasto = new Gasto(monto, fechaRealizado, categoria, comentario);
            parseJsonJava(user, gasto);
            lblCond.setText("Gasto a??adido con exito");
            txtMonto.setText("");
            txtFecha.setText(conseguirFecha());
            txtComentario.setText("");
        } catch (Exception e) {
            lblCond.setText("No se ha podido a??adir el gasto");
            System.out.println(e);
        }


    }//GEN-LAST:event_btnCrearGastoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        main ventana = new main(user);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
  
    public static String conseguirFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public void parseJsonJava(String user, Gasto gasto) throws IOException {
        ArrayList gastos = new ArrayList<>();
        String path = ".\\src\\forms\\dataSrc/" + user + ".json";
        String jsonData = getJSONString(path);
        gastos = getArrayFromJson(jsonData);
        gastos.add(gasto);
        System.out.println(gastos);
        Usuario userr = getObj(user, gastos);
        writeJson(userr, gastos);
    }

    public static Usuario getObj(String userName, ArrayList gastos) {
        Usuario usuario = new Usuario(gastos, 0, "", "", "", "");
        JSONParser parser = new JSONParser();
        String path = ".\\src\\forms\\dataSrc/" + userName + ".json";
        try {
            Object obj = parser.parse(new FileReader(path));
            org.json.simple.JSONObject jsonObject = (org.json.simple.JSONObject) obj;
            String user = (String) jsonObject.get("usuario");
            String password = (String) jsonObject.get("contrasenia");
            String celular = (String) jsonObject.get("celular");
            String edad = (String) jsonObject.get("edad");
            long saldo = (long) jsonObject.get("saldo");
            usuario = new Usuario(gastos, (float) saldo, password, user, edad, celular);
            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public static ArrayList getArrayFromJson(String jsonData) {
        JSONObject jsnobject = new JSONObject(jsonData);
        JSONArray jsonArrayGastos = jsnobject.getJSONArray("gastos");
        ArrayList<Object> arrayGastos = new ArrayList<Object>(); 

        if (jsonArrayGastos != null) {
            for (int i = 0; i < jsonArrayGastos.length(); i++) {
                arrayGastos.add(jsonArrayGastos.get(i));
            }
        }
        return arrayGastos;
    }

    public static String getJSONString(String path) throws IOException {

        FileInputStream fileInputStream = null;
        String data = "";
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            fileInputStream = new FileInputStream(path);
            int i;
            while ((i = fileInputStream.read()) != -1) {
                stringBuffer.append((char) i);
            }
            data = stringBuffer.toString();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        return data;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearGasto;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCond;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

    public boolean writeJson(Usuario user, ArrayList gastos) {
        String path = ".\\src\\forms\\dataSrc/" + user.getNombre() + ".json";
        JSONObject jsonObj = new JSONObject();
        try {
            jsonObj.put("usuario", user.getNombre());
            jsonObj.put("edad", user.getEdad());
            jsonObj.put("celular", user.getCelular());
            jsonObj.put("saldo", user.getSaldo());
            jsonObj.put("gastos", gastos);
            jsonObj.put("contrasenia", user.getContrasenia());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try ( PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(jsonObj.toString());
            lblCond.setText("Gasto a??adido con exito");
            return true;
        } catch (Exception e) {
            lblCond.setText("No se ha podido a??adir el gasto");
            return false;
        }
    }
}
