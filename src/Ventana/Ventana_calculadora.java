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
import org.omg.CORBA.CODESET_INCOMPATIBLE;


public class Ventana_calculadora extends javax.swing.JFrame {
    private String cadena_numeros = "";
    private double numero_1, resultado;
    private String operacion = "nula";
    private boolean activado = true;
    private boolean punto = true;
    
   
    public Ventana_calculadora() {
        initComponents();
        setSize(300,450);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        etiqueta_muestra = new javax.swing.JLabel();
        etiqueta_numeros = new javax.swing.JLabel();
        boton_c = new javax.swing.JButton();
        boton_raiz = new javax.swing.JButton();
        boton_division = new javax.swing.JButton();
        boton_borrar = new javax.swing.JButton();
        boton_7 = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_multiplicar = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        boton_restar = new javax.swing.JButton();
        boton_1 = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_mas = new javax.swing.JButton();
        boton_cambiar_signo = new javax.swing.JButton();
        boton_cero = new javax.swing.JButton();
        boton_punto = new javax.swing.JButton();
        boton_igual = new javax.swing.JButton();
        barra_menu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        calculadora_estandar = new javax.swing.JMenuItem();
        conversor_divisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        etiqueta_muestra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etiqueta_muestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(etiqueta_muestra, gridBagConstraints);

        etiqueta_numeros.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiqueta_numeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta_numeros.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(etiqueta_numeros, gridBagConstraints);

        boton_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_c.png"))); // NOI18N
        boton_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_c, gridBagConstraints);

        boton_raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_raiz.png"))); // NOI18N
        boton_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_raizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_raiz, gridBagConstraints);

        boton_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_division.png"))); // NOI18N
        boton_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_division, gridBagConstraints);

        boton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_borrar.png"))); // NOI18N
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_borrar, gridBagConstraints);

        boton_7.setBackground(new java.awt.Color(0, 102, 102));
        boton_7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_7.setText("7");
        boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_7, gridBagConstraints);

        boton_8.setBackground(new java.awt.Color(0, 102, 102));
        boton_8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_8.setText("8");
        boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_8, gridBagConstraints);

        boton_9.setBackground(new java.awt.Color(0, 102, 102));
        boton_9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_9.setText("9");
        boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_9, gridBagConstraints);

        boton_multiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_multiplicar.png"))); // NOI18N
        boton_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_multiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_multiplicar, gridBagConstraints);

        boton_4.setBackground(new java.awt.Color(0, 102, 102));
        boton_4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_4.setText("4");
        boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_4, gridBagConstraints);

        boton_5.setBackground(new java.awt.Color(0, 102, 102));
        boton_5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_5.setText("5");
        boton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_5, gridBagConstraints);

        boton_6.setBackground(new java.awt.Color(0, 102, 102));
        boton_6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_6.setText("6");
        boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_6, gridBagConstraints);

        boton_restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_restar.png"))); // NOI18N
        boton_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_restarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_restar, gridBagConstraints);

        boton_1.setBackground(new java.awt.Color(0, 102, 102));
        boton_1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_1.setText("1");
        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_1, gridBagConstraints);

        boton_2.setBackground(new java.awt.Color(0, 102, 102));
        boton_2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_2.setText("2");
        boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_2, gridBagConstraints);

        boton_3.setBackground(new java.awt.Color(0, 102, 102));
        boton_3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_3.setText("3");
        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_3, gridBagConstraints);

        boton_mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        boton_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_masActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_mas, gridBagConstraints);

        boton_cambiar_signo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas_menos.png"))); // NOI18N
        boton_cambiar_signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cambiar_signoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_cambiar_signo, gridBagConstraints);

        boton_cero.setBackground(new java.awt.Color(0, 102, 102));
        boton_cero.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        boton_cero.setText("0");
        boton_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ceroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_cero, gridBagConstraints);

        boton_punto.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        boton_punto.setText(".");
        boton_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_puntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_punto, gridBagConstraints);

        boton_igual.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton_igual.setText("=");
        boton_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_igualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton_igual, gridBagConstraints);

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        calculadora_estandar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        calculadora_estandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora_reducida.jpg"))); // NOI18N
        calculadora_estandar.setText("Calculadora Estándar");
        menu.add(calculadora_estandar);

        conversor_divisas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        conversor_divisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/divisas.png"))); // NOI18N
        conversor_divisas.setText("Conversor de Divisas");
        conversor_divisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversor_divisasActionPerformed(evt);
            }
        });
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void conversor_divisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversor_divisasActionPerformed
        Ventana_divisas conversor = new Ventana_divisas();
        conversor.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_conversor_divisasActionPerformed

    private void boton_cambiar_signoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cambiar_signoActionPerformed
        if(cadena_numeros.charAt(0) != '-'){cadena_numeros = "-"+cadena_numeros;}
        else{cadena_numeros = cadena_numeros.substring(1,cadena_numeros.length());}
        etiqueta_numeros.setText(cadena_numeros);
    }//GEN-LAST:event_boton_cambiar_signoActionPerformed

    private void boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_1ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "1";
        }
        else{
            cadena_numeros += 1;
        }
         etiqueta_numeros.setText(cadena_numeros);
         activado = true;
    }//GEN-LAST:event_boton_1ActionPerformed

    private void boton_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ceroActionPerformed
        if(cadena_numeros != ""){
            if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "0";
        }
        else{
            cadena_numeros += 0;
        }
        etiqueta_numeros.setText(cadena_numeros);}
        activado = true;
    }//GEN-LAST:event_boton_ceroActionPerformed

    private void boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_2ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "2";
        }
        else{
            cadena_numeros += 2;
        }
        etiqueta_numeros.setText(cadena_numeros);
        activado = true;
    }//GEN-LAST:event_boton_2ActionPerformed

    private void boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_3ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "3";
        }
        else{
            cadena_numeros += 3;
        }
        etiqueta_numeros.setText(cadena_numeros);
        activado = true;
    }//GEN-LAST:event_boton_3ActionPerformed

    private void boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_4ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "4";
        }
        else{
            cadena_numeros += 4;
        }
        etiqueta_numeros.setText(cadena_numeros);
        activado = true;
    }//GEN-LAST:event_boton_4ActionPerformed

    private void boton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "5";
        }
        else{
            cadena_numeros += 5;
        }
        etiqueta_numeros.setText(cadena_numeros);
        activado = true;
    }//GEN-LAST:event_boton_5ActionPerformed

    private void boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_6ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "6";
        }
        else{
            cadena_numeros += 6;
        }
        etiqueta_numeros.setText(cadena_numeros);
        activado = true;
    }//GEN-LAST:event_boton_6ActionPerformed

    private void boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_7ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "7";
        }
        else{
            cadena_numeros += 7;
        }
        etiqueta_numeros.setText(cadena_numeros);
        activado = true;
    }//GEN-LAST:event_boton_7ActionPerformed

    private void boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_8ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "8";
        }
        else{
            cadena_numeros += 8;
        }
        etiqueta_numeros.setText(cadena_numeros);
        activado = true;
    }//GEN-LAST:event_boton_8ActionPerformed

    private void boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_9ActionPerformed
        if (etiqueta_numeros.getText() == "0"){
            cadena_numeros = "9";
        }
        else{
            cadena_numeros += 9;
        }
        etiqueta_numeros.setText(cadena_numeros);
        activado = true;
    }//GEN-LAST:event_boton_9ActionPerformed

    private void boton_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_masActionPerformed
        if (activado == true){
        numero_1 = Double.parseDouble(cadena_numeros);
        etiqueta_muestra.setText(cadena_numeros+" + ");
        cadena_numeros = "";
        operacion = "sumar";
        activado = false;
        punto = true;
        }
    }//GEN-LAST:event_boton_masActionPerformed

    private void boton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_igualActionPerformed
        double numero_2;
        if(operacion.equals("nula")){
            etiqueta_numeros.setText(cadena_numeros);
        }
        else if(operacion.equals("sumar")){
            numero_2 = Double.parseDouble(cadena_numeros);
            resultado = numero_1+numero_2;
            etiqueta_numeros.setText(String.format("%.2f", resultado));
            cadena_numeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if(operacion.equals("restar")){
            numero_2 = Double.parseDouble(cadena_numeros);
            resultado = numero_1-numero_2;
            etiqueta_numeros.setText(String.format("%.2f", resultado));
            cadena_numeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if(operacion.equals("multiplicacion")){
            numero_2 = Double.parseDouble(cadena_numeros);
            resultado = numero_1*numero_2;
            etiqueta_numeros.setText(String.format("%.2f", resultado));
            cadena_numeros = String.valueOf(resultado);
            operacion = "nula";
        }
         else if(operacion.equals("division")){
            numero_2 = Double.parseDouble(cadena_numeros);
            resultado = numero_1/numero_2;
            etiqueta_numeros.setText(String.format("%.2f", resultado));
            cadena_numeros = String.valueOf(resultado);
            operacion = "nula";
        }
        
        etiqueta_muestra.setText("");
        activado = true;
    }//GEN-LAST:event_boton_igualActionPerformed

    private void boton_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_puntoActionPerformed
        if (punto == true){
                 if(cadena_numeros ==""){
                     cadena_numeros ="0.";
                 }
                 else{cadena_numeros += ".";}
        
        etiqueta_numeros.setText(cadena_numeros);
        punto = false;
        }
    }//GEN-LAST:event_boton_puntoActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        int tamaño = cadena_numeros.length();
        if(tamaño >0){
            if(tamaño == 1){
                cadena_numeros = "0";
            }
            else{cadena_numeros = cadena_numeros.substring(0,cadena_numeros.length()-1);}
        etiqueta_numeros.setText(cadena_numeros);
        }
    }//GEN-LAST:event_boton_borrarActionPerformed

    private void boton_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_restarActionPerformed
         if (activado == true){
        numero_1 = Double.parseDouble(cadena_numeros);
        etiqueta_muestra.setText(cadena_numeros+" - ");
        cadena_numeros = "";
        operacion = "restar";
        activado = false;
        punto = true;
        }
    }//GEN-LAST:event_boton_restarActionPerformed

    private void boton_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_multiplicarActionPerformed
         if (activado == true){
        numero_1 = Double.parseDouble(cadena_numeros);
        etiqueta_muestra.setText(cadena_numeros+" x ");
        cadena_numeros = "";
        operacion = "multiplicacion";
        activado = false;
        punto = true;
        }
    }//GEN-LAST:event_boton_multiplicarActionPerformed

    private void boton_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divisionActionPerformed
         if (activado == true){
        numero_1 = Double.parseDouble(cadena_numeros);
        etiqueta_muestra.setText(cadena_numeros+" / ");
        cadena_numeros = "";
        operacion = "division";
        activado = false;
        punto = true;
        }
    }//GEN-LAST:event_boton_divisionActionPerformed

    private void boton_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_raizActionPerformed
        
           numero_1 = Double.parseDouble(cadena_numeros);
           etiqueta_muestra.setText("sqrt("+cadena_numeros+")");
           cadena_numeros="";
           resultado = Math.sqrt(numero_1);
           etiqueta_numeros.setText(String.format("%.2f", resultado));
           cadena_numeros = String.valueOf(resultado);
           
           punto = true;
           
        
    }//GEN-LAST:event_boton_raizActionPerformed

    private void boton_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cActionPerformed
        etiqueta_muestra.setText("");
        etiqueta_numeros.setText("0");
        cadena_numeros = "";
        operacion = "nula";
        activado = true;
        punto = true;
    }//GEN-LAST:event_boton_cActionPerformed
       
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
            java.util.logging.Logger.getLogger(Ventana_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            //</editor-fold>
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana_calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana_calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana_calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana_calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_calculadora().setVisible(true);
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
    private javax.swing.JButton boton_cambiar_signo;
    private javax.swing.JButton boton_cero;
    private javax.swing.JButton boton_division;
    private javax.swing.JButton boton_igual;
    private javax.swing.JButton boton_mas;
    private javax.swing.JButton boton_multiplicar;
    private javax.swing.JButton boton_punto;
    private javax.swing.JButton boton_raiz;
    private javax.swing.JButton boton_restar;
    private javax.swing.JMenuItem calculadora_estandar;
    private javax.swing.JMenuItem conversor_divisas;
    private javax.swing.JLabel etiqueta_muestra;
    private javax.swing.JLabel etiqueta_numeros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
