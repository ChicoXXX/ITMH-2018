
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class calculadora extends javax.swing.JFrame {
private String cadena="";
private String memoria="";
private double memoriaoperacion=0.00;
private double temporal=0.00;
private double tercera=0.00;
private double otro=0.00;
private String resultado="";
int pendiente=0;

    /** Creates new form calculadora */
    public calculadora() {
        initComponents();
        txtsalida.setHorizontalAlignment(JTextField.RIGHT);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtsalida = new javax.swing.JTextField();
        cmdMc = new javax.swing.JButton();
        cmdMr = new javax.swing.JButton();
        cmdMmas = new javax.swing.JButton();
        cmdMmenos = new javax.swing.JButton();
        cmdMmasmenos = new javax.swing.JButton();
        cmdCe = new javax.swing.JButton();
        cmdC = new javax.swing.JButton();
        cmdMasmenos = new javax.swing.JButton();
        cmdSqrt = new javax.swing.JButton();
        cmdx2 = new javax.swing.JButton();
        cmd9 = new javax.swing.JButton();
        cmd8 = new javax.swing.JButton();
        cmd7 = new javax.swing.JButton();
        cmdEntre = new javax.swing.JButton();
        cmdPorciento = new javax.swing.JButton();
        cmdUnosobrex = new javax.swing.JButton();
        cmd4 = new javax.swing.JButton();
        cmdMas = new javax.swing.JButton();
        cmd6 = new javax.swing.JButton();
        cmd5 = new javax.swing.JButton();
        cmd1 = new javax.swing.JButton();
        cmd2 = new javax.swing.JButton();
        cmdXpotenciay = new javax.swing.JButton();
        cmd3 = new javax.swing.JButton();
        cmdMenos = new javax.swing.JButton();
        cmdCero = new javax.swing.JButton();
        cmdPunto = new javax.swing.JButton();
        cmdIgual = new javax.swing.JButton();
        cmdBackspace = new javax.swing.JButton();
        cmdMultiplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocationByPlatform(true);
        setResizable(false);

        txtsalida.setBackground(new java.awt.Color(255, 255, 255));
        txtsalida.setEditable(false);
        txtsalida.setText("0");
        txtsalida.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        cmdMc.setText("MC");
        cmdMc.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdMc.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdMc.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdMr.setText("MR");
        cmdMr.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdMr.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdMr.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdMr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdMmas.setText("M+");
        cmdMmas.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdMmas.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdMmas.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdMmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdMmenos.setText("M-");
        cmdMmenos.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdMmenos.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdMmenos.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdMmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdMmasmenos.setText("M+/-");
        cmdMmasmenos.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdMmasmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdCe.setText("CE");
        cmdCe.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdCe.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdCe.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdC.setText("C");
        cmdC.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdC.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdC.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdMasmenos.setText("+/-");
        cmdMasmenos.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdMasmenos.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdMasmenos.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdMasmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdSqrt.setText("sqrt");
        cmdSqrt.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdSqrt.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdSqrt.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdx2.setText("x^2");
        cmdx2.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdx2.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdx2.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd9.setText("9");
        cmd9.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd9.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd8.setText("8");
        cmd8.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd8.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd7.setText("7");
        cmd7.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd7.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdEntre.setText("/");
        cmdEntre.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdEntre.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdEntre.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdPorciento.setText("%");
        cmdPorciento.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdPorciento.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdPorciento.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdPorciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdUnosobrex.setText("1/x");
        cmdUnosobrex.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdUnosobrex.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdUnosobrex.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdUnosobrex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd4.setText("4");
        cmd4.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd4.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdMas.setText("+");
        cmdMas.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdMas.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdMas.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd6.setText("6");
        cmd6.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd6.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd5.setText("5");
        cmd5.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd5.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd1.setText("1");
        cmd1.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd1.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd2.setText("2");
        cmd2.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd2.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdXpotenciay.setText("x^y");
        cmdXpotenciay.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdXpotenciay.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdXpotenciay.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdXpotenciay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmd3.setText("3");
        cmd3.setMaximumSize(new java.awt.Dimension(61, 25));
        cmd3.setMinimumSize(new java.awt.Dimension(61, 25));
        cmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdMenos.setText("-");
        cmdMenos.setMaximumSize(new java.awt.Dimension(61, 25));
        cmdMenos.setMinimumSize(new java.awt.Dimension(61, 25));
        cmdMenos.setPreferredSize(new java.awt.Dimension(39, 25));
        cmdMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdCero.setText("0");
        cmdCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdPunto.setText(".");
        cmdPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdIgual.setText("=");
        cmdIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdBackspace.setText("Borrar");
        cmdBackspace.setMargin(new java.awt.Insets(2, 1, 2, 1));
        cmdBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        cmdMultiplicar.setText("*");
        cmdMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evento(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsalida, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmd4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(cmd7, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(cmdCe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(cmdMc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmdC, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(cmdMr, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                    .addComponent(cmd8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmd9, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(cmdMasmenos, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(cmdMmas, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdMas, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(cmdEntre, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(cmdMmenos, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(cmdSqrt, 0, 66, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdUnosobrex, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(cmdPorciento, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(cmdx2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(cmdMmasmenos, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdCero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(cmd1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdPunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmd2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmd3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmdBackspace, 0, 0, Short.MAX_VALUE)
                            .addComponent(cmdXpotenciay, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdMc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMmenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMmasmenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMasmenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdUnosobrex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdXpotenciay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCero)
                    .addComponent(cmdBackspace)
                    .addComponent(cmdPunto)
                    .addComponent(cmdIgual)
                    .addComponent(cmdMultiplicar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evento
    
    if(evt.getSource()==cmdCero)
    {
        cadena=cadena.concat("0");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

     if(evt.getSource()==cmd1)
    {
        cadena=cadena.concat("1");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

    if(evt.getSource()==cmd2)
    {
        cadena=cadena.concat("2");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

     if(evt.getSource()==cmd3)
    {
        cadena=cadena.concat("3");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

    if(evt.getSource()==cmd4)
    {
        cadena=cadena.concat("4");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

     if(evt.getSource()==cmd5)
    {
        cadena=cadena.concat("5");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

    if(evt.getSource()==cmd6)
    {
        cadena=cadena.concat("6");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

     if(evt.getSource()==cmd7)
    {
        cadena=cadena.concat("7");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

    if(evt.getSource()==cmd8)
    {
        cadena=cadena.concat("8");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

     if(evt.getSource()==cmd9)
    {
        cadena=cadena.concat("9");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

    if(evt.getSource()==cmdBackspace)
    {
        int tamano=cadena.length();
        String quitar=cadena.substring(0,(tamano-1));
        cadena=quitar;
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

    if (evt.getSource()==cmdPunto)
    {
        cadena=cadena.concat(".");
        txtsalida.setText(cadena);
        temporal=Double.parseDouble(cadena);
    }

    if (evt.getSource()==cmdC)
    {
        txtsalida.setText("0");
        cadena="";
        resultado="";
        memoriaoperacion=0.00;
        temporal=0.00;
        tercera=0.00;
    }
    if (evt.getSource()==cmdCe)
    {
        txtsalida.setText("0");
        cadena="";
        temporal=0.00;
    }

  if (evt.getSource()==cmdMas)
  {
    cadena="";
    pendiente=1;
    tercera=temporal;
    
    cmdIgual.setSelected(true);
  }

  if (evt.getSource()==cmdMenos)
  {
    cadena="";
    pendiente=2;
    tercera=temporal;

  }

  if (evt.getSource()==cmdMultiplicar)
  {
    cadena="";
    pendiente=3;
    tercera=temporal;

  }

  if (evt.getSource()==cmdEntre)
  {
    cadena="";
    pendiente=4;
    tercera=temporal;
  }

  if (evt.getSource()==cmdSqrt)
  {
    cadena="";
    pendiente=5;
    tercera=temporal;
  }

  if (evt.getSource()==cmdx2)
  {
    cadena="";
    pendiente=6;
    tercera=temporal;
  }

 if (evt.getSource()==cmdXpotenciay)
  {
    cadena="";
    pendiente=7;
    tercera=temporal;
  }

  if (evt.getSource()==cmdUnosobrex)
  {
    cadena="";
    pendiente=8;
    tercera=temporal;
  }

  if (evt.getSource()==cmdMasmenos)
  {
    cadena="";
    pendiente=9;
    tercera=temporal;
  }

  if (evt.getSource()==cmdMc)
  {
    cadena="";
    pendiente=10;
    tercera=temporal;
  }

  if (evt.getSource()==cmdMr)
  {
    cadena="";
    pendiente=11;
    tercera=temporal;
  }

  if (evt.getSource()==cmdMmas)
  {
    cadena="";
    pendiente=12;
    tercera=temporal;
  }

  if (evt.getSource()==cmdMmenos)
  {
    cadena="";
    pendiente=13;
    tercera=temporal;
  }

  if (evt.getSource()==cmdMmasmenos)
  {
    cadena="";
    pendiente=14;
    tercera=temporal;
  }

   if (evt.getSource()==cmdIgual)
    {
       if (pendiente==1)
       {
           if (tercera==0)
           memoriaoperacion+=Double.parseDouble(txtsalida.getText());
           else
           memoriaoperacion=tercera+temporal;

        txtsalida.setText(String.valueOf(memoriaoperacion));
       }
       if (pendiente==2)
       {
           if(tercera==0)
           memoriaoperacion-=Double.parseDouble(txtsalida.getText());
           else
           memoriaoperacion=tercera-temporal;

       txtsalida.setText(String.valueOf(memoriaoperacion));
       }

       if (pendiente==3)
       {
           if(tercera==0)
           memoriaoperacion*=Double.parseDouble(txtsalida.getText());
           else
           memoriaoperacion=tercera*temporal;

       txtsalida.setText(String.valueOf(memoriaoperacion));
       }

       if (pendiente==4)
       {
       try
       {    otro=Double.parseDouble(txtsalida.getText());

           if (tercera==0)
               memoriaoperacion/=otro;
           else
               memoriaoperacion=tercera/temporal;
       }

       catch(ArithmeticException e)
       {
       JOptionPane.showMessageDialog(null, "Error, cociente debe ser distinto a cero");
       }

       txtsalida.setText(String.valueOf(memoriaoperacion));
       }

       if (pendiente==5)
       {
           memoriaoperacion=Math.sqrt(Double.parseDouble(txtsalida.getText()));
           txtsalida.setText(String.valueOf(memoriaoperacion));
       }

        if (pendiente==6)
        {
           memoriaoperacion=Math.pow(Double.parseDouble(txtsalida.getText()),2);
           txtsalida.setText(String.valueOf(memoriaoperacion));
        }

       if (pendiente==7)
       {
          if(tercera==0)
           memoriaoperacion=Math.pow(memoriaoperacion, Double.parseDouble(txtsalida.getText()));
          else
           memoriaoperacion=Math.pow(tercera, Double.parseDouble(txtsalida.getText()));

       txtsalida.setText(String.valueOf(memoriaoperacion));
       }

        if (pendiente==8)
        {
       try
       {    otro=Double.parseDouble(txtsalida.getText());

           if (tercera==0)
               memoriaoperacion=1/memoriaoperacion;
           else
               memoriaoperacion=1/tercera;
       }

       catch(ArithmeticException e)
       {
       JOptionPane.showMessageDialog(null, "Error, cociente debe ser distinto a cero");
       }

       txtsalida.setText(String.valueOf(memoriaoperacion));
        }


       if (pendiente==9)
       {
           memoriaoperacion*=(-1);
           txtsalida.setText(String.valueOf(memoriaoperacion));
       }


       if (pendiente==10)
       {
           memoria=String.valueOf(txtsalida.getText());
           txtsalida.setText(String.valueOf(memoria));
       }

       if (pendiente==11)
       {
           txtsalida.setText(String.valueOf(memoria));
       }

       if (pendiente==12)
       {
           otro=Double.parseDouble(memoria);
           memoriaoperacion=otro+tercera;
           memoria=String.valueOf(memoriaoperacion);
           txtsalida.setText(String.valueOf(memoria));
       }

       if (pendiente==13)
       {
           otro=Double.parseDouble(memoria)-Double.parseDouble(txtsalida.getText());
           memoria=String.valueOf(otro);
           txtsalida.setText(String.valueOf(memoria));
       }

       if (pendiente==14)
       {
           otro=Double.parseDouble(memoria)*(-1);
           memoria=String.valueOf(otro);
           txtsalida.setText(String.valueOf(memoria));
       }

       pendiente=0;
       temporal=0.00;
    }



    }//GEN-LAST:event_evento

   

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd1;
    private javax.swing.JButton cmd2;
    private javax.swing.JButton cmd3;
    private javax.swing.JButton cmd4;
    private javax.swing.JButton cmd5;
    private javax.swing.JButton cmd6;
    private javax.swing.JButton cmd7;
    private javax.swing.JButton cmd8;
    private javax.swing.JButton cmd9;
    private javax.swing.JButton cmdBackspace;
    private javax.swing.JButton cmdC;
    private javax.swing.JButton cmdCe;
    private javax.swing.JButton cmdCero;
    private javax.swing.JButton cmdEntre;
    private javax.swing.JButton cmdIgual;
    private javax.swing.JButton cmdMas;
    private javax.swing.JButton cmdMasmenos;
    private javax.swing.JButton cmdMc;
    private javax.swing.JButton cmdMenos;
    private javax.swing.JButton cmdMmas;
    private javax.swing.JButton cmdMmasmenos;
    private javax.swing.JButton cmdMmenos;
    private javax.swing.JButton cmdMr;
    private javax.swing.JButton cmdMultiplicar;
    private javax.swing.JButton cmdPorciento;
    private javax.swing.JButton cmdPunto;
    private javax.swing.JButton cmdSqrt;
    private javax.swing.JButton cmdUnosobrex;
    private javax.swing.JButton cmdXpotenciay;
    private javax.swing.JButton cmdx2;
    private javax.swing.JTextField txtsalida;
    // End of variables declaration//GEN-END:variables

}
