/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author H.P
 */
public class Ventana_divisas extends javax.swing.JFrame {

    private String divisa_1 = "";
    private String divisa_2 = "";
    private String cantidad_dinero = "";
    private double dinero, cambio;
    private boolean punto = true;
    

    public Ventana_divisas() {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
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

        panel = new javax.swing.JPanel();
        etiqueta_divisa_1 = new javax.swing.JLabel();
        etiqueta_cambio_1 = new javax.swing.JLabel();
        combo_divisas_1 = new javax.swing.JComboBox<>();
        etiqueta_divisa_2 = new javax.swing.JLabel();
        etiqueta_cambio_2 = new javax.swing.JLabel();
        combo_divisas_2 = new javax.swing.JComboBox<>();
        boton_c = new javax.swing.JButton();
        boton_borrar = new javax.swing.JButton();
        boton_7 = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        boton_1 = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_cero = new javax.swing.JButton();
        boton_punto = new javax.swing.JButton();
        barra_menu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        calculadora_estandar = new javax.swing.JMenuItem();
        conversor_divisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de divisas");

        panel.setLayout(new java.awt.GridBagLayout());

        etiqueta_divisa_1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiqueta_divisa_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta_divisa_1.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        panel.add(etiqueta_divisa_1, gridBagConstraints);

        etiqueta_cambio_1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiqueta_cambio_1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiqueta_cambio_1, gridBagConstraints);

        combo_divisas_1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        combo_divisas_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar", "Colombia - Peso", "Europa - Euro" }));
        combo_divisas_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_divisas_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(combo_divisas_1, gridBagConstraints);

        etiqueta_divisa_2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiqueta_divisa_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta_divisa_2.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        panel.add(etiqueta_divisa_2, gridBagConstraints);

        etiqueta_cambio_2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiqueta_cambio_2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiqueta_cambio_2, gridBagConstraints);

        combo_divisas_2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        combo_divisas_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar", "Colombia - Peso", "Europa - Euro" }));
        combo_divisas_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_divisas_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(combo_divisas_2, gridBagConstraints);

        boton_c.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton_c.setText("C");
        boton_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(boton_c, gridBagConstraints);

        boton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_borrar.png"))); // NOI18N
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(boton_borrar, gridBagConstraints);

        boton_7.setBackground(new java.awt.Color(204, 204, 0));
        boton_7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_7.setText("7");
        boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_7, gridBagConstraints);

        boton_8.setBackground(new java.awt.Color(204, 204, 0));
        boton_8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_8.setText("8");
        boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_8, gridBagConstraints);

        boton_9.setBackground(new java.awt.Color(204, 204, 0));
        boton_9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_9.setText("9");
        boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_9, gridBagConstraints);

        boton_4.setBackground(new java.awt.Color(204, 204, 0));
        boton_4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_4.setText("4");
        boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_4, gridBagConstraints);

        boton_5.setBackground(new java.awt.Color(204, 204, 0));
        boton_5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_5.setText("5");
        boton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_5, gridBagConstraints);

        boton_6.setBackground(new java.awt.Color(204, 204, 0));
        boton_6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_6.setText("6");
        boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_6, gridBagConstraints);

        boton_1.setBackground(new java.awt.Color(204, 204, 0));
        boton_1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_1.setText("1");
        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_1, gridBagConstraints);

        boton_2.setBackground(new java.awt.Color(204, 204, 0));
        boton_2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_2.setText("2");
        boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_2, gridBagConstraints);

        boton_3.setBackground(new java.awt.Color(204, 204, 0));
        boton_3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_3.setText("3");
        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_3, gridBagConstraints);

        boton_cero.setBackground(new java.awt.Color(204, 204, 0));
        boton_cero.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_cero.setText("0");
        boton_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ceroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_cero, gridBagConstraints);

        boton_punto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_punto.setText(".");
        boton_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_puntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton_punto, gridBagConstraints);

        barra_menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        calculadora_estandar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        calculadora_estandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora_reducida.jpg"))); // NOI18N
        calculadora_estandar.setText("Calculadora Estándar");
        calculadora_estandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadora_estandarActionPerformed(evt);
            }
        });
        menu.add(calculadora_estandar);

        conversor_divisas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        conversor_divisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/divisas.png"))); // NOI18N
        conversor_divisas.setText("Conversor de Divisas");
        menu.add(conversor_divisas);
        menu.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barra_menu.add(menu);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void calculadora_estandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadora_estandarActionPerformed
        Ventana_calculadora calculadora = new Ventana_calculadora();
        calculadora.setVisible(true);

        dispose();
    }//GEN-LAST:event_calculadora_estandarActionPerformed

    private void combo_divisas_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_divisas_1ActionPerformed
        divisa_1 = (String) combo_divisas_1.getSelectedItem();
        if (divisa_1.equals("Estados Unidos - Dólar")) {
            etiqueta_divisa_1.setText("$ USD");
        } else if (divisa_1.equals("Colombia - Peso")) {
            etiqueta_divisa_1.setText("$ COP");
        } else if (divisa_1.equals("Europa - Euro")) {
            etiqueta_divisa_1.setText("€");
        }
        obtener_dinero();
    }//GEN-LAST:event_combo_divisas_1ActionPerformed

    private void combo_divisas_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_divisas_2ActionPerformed
        divisa_2 = (String) combo_divisas_2.getSelectedItem();
        if (divisa_2.equals("Estados Unidos - Dólar")) {
            etiqueta_divisa_2.setText("$ USD");
        } else if (divisa_2.equals("Colombia - Peso")) {
            etiqueta_divisa_2.setText("$ COP");
        } else if (divisa_2.equals("Europa - Euro")) {
            etiqueta_divisa_2.setText("€");
        }
        obtener_dinero();
    }//GEN-LAST:event_combo_divisas_2ActionPerformed

    private void boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_1ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "1";
        } else {
            cantidad_dinero += "1";
        }

        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_1ActionPerformed

    private void boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_2ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "2";
        } else {
            cantidad_dinero += "2";
        }
        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_2ActionPerformed

    private void boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_3ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "3";
        } else {
            cantidad_dinero += "3";
        }
        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_3ActionPerformed

    private void boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_4ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "4";
        } else {
            cantidad_dinero += "4";
        }
        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_4ActionPerformed

    private void boton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "5";
        } else {
            cantidad_dinero += "5";
        }
        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_5ActionPerformed

    private void boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_6ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "6";
        } else {
            cantidad_dinero += "6";
        }
        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_6ActionPerformed

    private void boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_7ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "7";
        } else {
            cantidad_dinero += "7";
        }
        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_7ActionPerformed

    private void boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_8ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "8";
        } else {
            cantidad_dinero += "8";
        }
        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_8ActionPerformed

    private void boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_9ActionPerformed
        if (etiqueta_cambio_1.getText() == "0") {
            cantidad_dinero = "9";
        } else {
            cantidad_dinero += "9";
        }
        etiqueta_cambio_1.setText(cantidad_dinero);
        obtener_dinero();
    }//GEN-LAST:event_boton_9ActionPerformed

    private void boton_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ceroActionPerformed
        if (cantidad_dinero != "") {
            if (etiqueta_cambio_1.getText() == "0") {
                cantidad_dinero = "1";
            } else {
                cantidad_dinero += "1";
            }
            etiqueta_cambio_1.setText(cantidad_dinero);
            obtener_dinero();
        }
    }//GEN-LAST:event_boton_ceroActionPerformed

    private void boton_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_puntoActionPerformed
        if (punto == true) {
            if (cantidad_dinero == "") {
                cantidad_dinero = "0.";
            } else {
                cantidad_dinero += ".";
            }
            etiqueta_cambio_1.setText(cantidad_dinero);
            punto = false;

        }

    }//GEN-LAST:event_boton_puntoActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        int tamaño = cantidad_dinero.length();
        if(tamaño > 0){
            if (tamaño == 1){
                cantidad_dinero = "0";
            }
            else{
                cantidad_dinero = cantidad_dinero.substring(0,cantidad_dinero.length()-1);
            }
            etiqueta_cambio_1.setText(cantidad_dinero);
            obtener_dinero();
        }
    }//GEN-LAST:event_boton_borrarActionPerformed

    private void boton_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cActionPerformed
        cantidad_dinero = "";
        punto = true;
        etiqueta_cambio_1.setText("0");
        etiqueta_cambio_2.setText("0");
    }//GEN-LAST:event_boton_cActionPerformed

    private void obtener_dinero() {
        cantidad_dinero = etiqueta_cambio_1.getText();
        dinero = Double.parseDouble(cantidad_dinero);
        cambio_divisas();
        dinero = dinero * cambio;
        etiqueta_cambio_2.setText(String.format("%.2f", dinero));
    }

    private void cambio_divisas() {
        if (divisa_1.equals(divisa_2)) {
            cambio = 1;
        } else if (divisa_1.equals("Estados Unidos - Dólar") && divisa_2.equals("Colombia - Peso")) {
            cambio = 3596.25;
        } else if (divisa_1.equals("Estados Unidos - Dólar") && divisa_2.equals("Europa - Euro")) {
            cambio = 0.84;
        } else if (divisa_1.equals("Colombia - Peso") && divisa_2.equals("Estados Unidos - Dólar")) {
            cambio = 0.00028;
        } else if (divisa_1.equals("Colombia - Peso") && divisa_2.equals("Europa - Euro")) {
            cambio = 0.00023;
        } else if (divisa_1.equals("Europa - Euro") && divisa_2.equals("Estados Unidos - Dólar")) {
            cambio = 1.20;
        } else if (divisa_1.equals("Europa - Euro") && divisa_2.equals("Colombia - Peso")) {
            cambio = 4300.14;
        }

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
            java.util.logging.Logger.getLogger(Ventana_divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            //</editor-fold>
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana_divisas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana_divisas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana_divisas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana_divisas.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JButton boton_1;
    private javax.swing.JButton boton_2;
    private javax.swing.JButton boton_3;
    private javax.swing.JButton boton_4;
    private javax.swing.JButton boton_5;
    private javax.swing.JButton boton_6;
    private javax.swing.JButton boton_7;
    private javax.swing.JButton boton_8;
    private javax.swing.JButton boton_9;
    private javax.swing.JButton boton_borrar;
    private javax.swing.JButton boton_c;
    private javax.swing.JButton boton_cero;
    private javax.swing.JButton boton_punto;
    private javax.swing.JMenuItem calculadora_estandar;
    private javax.swing.JComboBox<String> combo_divisas_1;
    private javax.swing.JComboBox<String> combo_divisas_2;
    private javax.swing.JMenuItem conversor_divisas;
    private javax.swing.JLabel etiqueta_cambio_1;
    private javax.swing.JLabel etiqueta_cambio_2;
    private javax.swing.JLabel etiqueta_divisa_1;
    private javax.swing.JLabel etiqueta_divisa_2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
