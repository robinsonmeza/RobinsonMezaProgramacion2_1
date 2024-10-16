package Parcial;

import static Parcial.Form_datos.nombre;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Formulario2 extends javax.swing.JFrame {

    public Formulario2() {
        initComponents();
        Imagenes();
        Activo();
        Inactivo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        Help = new javax.swing.JToggleButton();
        SumaPuntos = new javax.swing.JTextField();
        Vidas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Quien_soy = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        iniciar = new javax.swing.JToggleButton();
        dos = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        doce = new javax.swing.JButton();
        once = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        diez = new javax.swing.JButton();
        once1 = new javax.swing.JButton();
        once2 = new javax.swing.JButton();
        once3 = new javax.swing.JButton();
        once4 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Help.setText("Aiuda");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        SumaPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaPuntosActionPerformed(evt);
            }
        });

        Vidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VidasActionPerformed(evt);
            }
        });

        jLabel1.setText("Vidas");

        jLabel2.setText("Puntos");

        Quien_soy.setText("¿Quien Soy?");
        Quien_soy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quien_soyActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        iniciar.setText("Iniciar");
        iniciar.setToolTipText("");
        iniciar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doceActionPerformed(evt);
            }
        });

        once.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onceActionPerformed(evt);
            }
        });

        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        diez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezActionPerformed(evt);
            }
        });

        once1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                once1ActionPerformed(evt);
            }
        });

        once2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                once2ActionPerformed(evt);
            }
        });

        once3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                once3ActionPerformed(evt);
            }
        });

        once4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                once4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Quien_soy, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SumaPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nueve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(once1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(once2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(once3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(once4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diez, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(once, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(doce, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Help)
                    .addComponent(iniciar))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doce, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(once, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diez, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(once1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(once2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(once3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(once4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(SumaPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quien_soy)
                    .addComponent(Salir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        iniciar.setText("Reiniciar"); //Dato del profe para cambiar el nombre
        Activo();
        Random rand = new Random();
        GenerarMatriz();  // Generar la matriz desde el metodo con 4x4 y valores aleatorios
        Vidas.setText("3"); //establece la cantidad de vidas
        VerX();


    }//GEN-LAST:event_iniciarActionPerformed

    private void Quien_soyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quien_soyActionPerformed
        Formulario2 foto = new Formulario2();
        this.dispose(); // Cierra la ventana actual

        java.awt.EventQueue.invokeLater(new Runnable() {//muestra la nueva ventana centrada
            public void run() {
                foto FT = new foto();
                FT.setVisible(true);
                FT.setLocationRelativeTo(null);

            }
        });

    }//GEN-LAST:event_Quien_soyActionPerformed

    private void SumaPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaPuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumaPuntosActionPerformed
    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        ActualizarSuma(0, 0);//punto de partida no 1, 1 como pensaba antes y de ahi en adelante
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        ActualizarSuma(0, 1);
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        ActualizarSuma(0, 2);
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        ActualizarSuma(0, 3);
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        ActualizarSuma(1, 0);
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        ActualizarSuma(1, 1);
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        ActualizarSuma(1, 2);
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        ActualizarSuma(1, 3);
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        ActualizarSuma(2, 0);
    }//GEN-LAST:event_nueveActionPerformed
    private void diezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diezActionPerformed
        ActualizarSuma(2, 1);
    }//GEN-LAST:event_diezActionPerformed

    private void onceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onceActionPerformed
        ActualizarSuma(2, 2);
    }//GEN-LAST:event_onceActionPerformed

    private void doceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doceActionPerformed
        ActualizarSuma(2, 3);
    }//GEN-LAST:event_doceActionPerformed

    private void once1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_once1ActionPerformed
        ActualizarSuma(3, 0);
    }//GEN-LAST:event_once1ActionPerformed

    private void once2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_once2ActionPerformed
        ActualizarSuma(3, 1);
    }//GEN-LAST:event_once2ActionPerformed

    private void once3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_once3ActionPerformed
        ActualizarSuma(3, 2);
    }//GEN-LAST:event_once3ActionPerformed

    private void once4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_once4ActionPerformed
        ActualizarSuma(3, 3);
    }//GEN-LAST:event_once4ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        if (alternar) {
            limpiarFotos();
            tomarNumeroMatriz(); // tomar el valor de la matriz para hacerlo visible
        } else {
            Imagenes();
        }
        alternar = !alternar;

    }//GEN-LAST:event_HelpActionPerformed

    private void VidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VidasActionPerformed


    }//GEN-LAST:event_VidasActionPerformed

      
    public Icon setearImagen(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

        return icono;

    }

    public void limpiarFotos() {
        uno.setIcon(null); //cambiar los iconos por texto
        dos.setIcon(null);
        tres.setIcon(null);
        cuatro.setIcon(null);
        cinco.setIcon(null);
        seis.setIcon(null);
        siete.setIcon(null);
        ocho.setIcon(null);
        nueve.setIcon(null);
        diez.setIcon(null);
        once.setIcon(null);
        doce.setIcon(null);
        once1.setIcon(null);
        once2.setIcon(null);
        once3.setIcon(null);
        once4.setIcon(null);
    }

    public void tomarNumeroMatriz() {
        uno.setText(String.valueOf(matriz[0][0]));
        dos.setText(String.valueOf(matriz[0][1]));
        tres.setText(String.valueOf(matriz[0][2]));
        cuatro.setText(String.valueOf(matriz[0][3]));
        cinco.setText(String.valueOf(matriz[1][0]));
        seis.setText(String.valueOf(matriz[1][1]));
        siete.setText(String.valueOf(matriz[1][2]));
        ocho.setText(String.valueOf(matriz[1][3]));
        nueve.setText(String.valueOf(matriz[2][0]));
        diez.setText(String.valueOf(matriz[2][1]));
        once.setText(String.valueOf(matriz[2][2]));
        doce.setText(String.valueOf(matriz[2][3]));
        once1.setText(String.valueOf(matriz[3][0]));
        once2.setText(String.valueOf(matriz[3][1]));
        once3.setText(String.valueOf(matriz[3][2]));
        once4.setText(String.valueOf(matriz[3][3]));
    }

    public void Inactivo() {
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
        diez.setEnabled(false);
        once.setEnabled(false);
        doce.setEnabled(false);
        once1.setEnabled(false);
        once2.setEnabled(false);
        once3.setEnabled(false);
        once4.setEnabled(false);
    }

    public void Activo() {
        uno.setEnabled(true);
        dos.setEnabled(true);
        tres.setEnabled(true);
        cuatro.setEnabled(true);
        cinco.setEnabled(true);
        seis.setEnabled(true);
        siete.setEnabled(true);
        ocho.setEnabled(true);
        nueve.setEnabled(true);
        diez.setEnabled(true);
        once.setEnabled(true);
        doce.setEnabled(true);
        once1.setEnabled(true);
        once2.setEnabled(true);
        once3.setEnabled(true);
        once4.setEnabled(true);
    }

    private boolean alternar = true; //alternador para ver imagenes o numeros de la matriz

    public void Imagenes() {
        uno.setIcon(setearImagen("/PKM/uno.jpg", dos));
        dos.setIcon(setearImagen("/PKM/2.png", dos));
        tres.setIcon(setearImagen("/PKM/3.png", tres));
        cuatro.setIcon(setearImagen("/PKM/4.png", cuatro));
        cinco.setIcon(setearImagen("/PKM/5.png", cinco));
        seis.setIcon(setearImagen("/PKM/6.png", seis));
        siete.setIcon(setearImagen("/PKM/7.png", siete));
        ocho.setIcon(setearImagen("/PKM/8.png", ocho));
        nueve.setIcon(setearImagen("/PKM/9.png", nueve));
        diez.setIcon(setearImagen("/PKM/10.png", diez));
        once.setIcon(setearImagen("/PKM/11.png", once));
        doce.setIcon(setearImagen("/PKM/12.png", doce));
        once1.setIcon(setearImagen("/PKM/13.png", once1));
        once2.setIcon(setearImagen("/PKM/14.png", once2));
        once3.setIcon(setearImagen("/PKM/15.png", once3));
        once4.setIcon(setearImagen("/PKM/16.png", once4));
    }

    private String[][] matriz = new String[4][4];// inicio la matriz con el rango requerido (si en string, porque lo que hacer facil)

    private void GenerarMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = String.valueOf((int) (Math.random() * 201 - 100));  // Genera un número entre -100 y 100 
            }
        }
        asignarXEnMatriz();
    }

    private void asignarXEnMatriz() {
        Random rand = new Random();
        int filas = 4; // Número de filas en la matriz
        int columnas = 4; // Número de columnas en la matriz

        for (int i = 0; i < 3; i++) { // Ejecutar 3 veces
            int fila, columna;
            do {
                // Generar coordenadas aleatorias
                fila = rand.nextInt(filas); // Genera un número entre 0 y 3
                columna = rand.nextInt(columnas); // Genera un número entre 0 y 3
            } while (matriz[fila][columna].equals("X")); // Si ya tiene "X", genera nuevas coordenadas

            matriz[fila][columna] = "X"; // Asigna "X" a la posición aleatoria
        }
    }

    private void VerX() {
        uno.setText(matriz[0][0]);
        dos.setText(matriz[0][1]);
        tres.setText(matriz[0][2]);
        cuatro.setText(matriz[0][3]);
        cinco.setText(matriz[1][0]);
        seis.setText(matriz[1][1]);
        siete.setText(matriz[1][2]);
        ocho.setText(matriz[1][3]);
        nueve.setText(matriz[2][0]);
        diez.setText(matriz[2][1]);
        once.setText(matriz[2][2]);
        doce.setText(matriz[2][3]);
        once1.setText(matriz[3][0]);
        once2.setText(matriz[3][1]);
        once3.setText(matriz[3][2]);
        once4.setText(matriz[3][3]);
    }

    private void ActualizarSuma(int fila, int columna) {
        int vidasActuales = Integer.parseInt(Vidas.getText());

        // ver el texto del boton
        String buttonText = "";

        if (fila == 0 && columna == 0) {
            buttonText = uno.getText();
        } else if (fila == 0 && columna == 1) {
            buttonText = dos.getText();
        } else if (fila == 0 && columna == 2) {
            buttonText = tres.getText();
        } else if (fila == 0 && columna == 3) {
            buttonText = cuatro.getText();
        } else if (fila == 1 && columna == 0) {
            buttonText = cinco.getText();
        } else if (fila == 1 && columna == 1) {
            buttonText = seis.getText();
        } else if (fila == 1 && columna == 2) {
            buttonText = siete.getText();
        } else if (fila == 1 && columna == 3) {
            buttonText = ocho.getText();
        } else if (fila == 2 && columna == 0) {
            buttonText = nueve.getText();
        } else if (fila == 2 && columna == 1) {
            buttonText = diez.getText();
        } else if (fila == 2 && columna == 2) {
            buttonText = once.getText();
        } else if (fila == 2 && columna == 3) {
            buttonText = doce.getText();
        } else if (fila == 3 && columna == 0) {
            buttonText = once1.getText();
        } else if (fila == 3 && columna == 1) {
            buttonText = once2.getText();
        } else if (fila == 3 && columna == 2) {
            buttonText = once3.getText();
        } else if (fila == 3 && columna == 3) {
            buttonText = once4.getText();
        }

        // Si el boton tiene "X", restar vida
        if (buttonText.equals("X") && vidasActuales > 0) {
            vidasActuales--;
            Vidas.setText(String.valueOf(vidasActuales));

            // Mostrar mensaje
            JOptionPane.showMessageDialog(this, "Uy, le quedan " + vidasActuales + " vidas.");

            // revisar si se acabaron las vidas
            if (vidasActuales == 0) {
                JOptionPane.showMessageDialog(this, "GAME OVER. " + nombre + " Gracias!");
                Vidas.setText("0"); // Opcional: mostrar cuantas vidas quedaron
                Quien_soyActionPerformed(null); //ir directamente al final
            }
        } else {
            // si no 
            int valor;

            try {
                valor = Integer.parseInt(buttonText); // Convertir el texto a int SI, SI ES MAS FACIL ASI 
            } catch (NumberFormatException e) {
                valor = 0; // Si no se puede convertir, asignar 0
            }

            int valorActual = Integer.parseInt(SumaPuntos.getText().isEmpty() ? "0" : SumaPuntos.getText()); // Valor actual en puntos
            int Puntos = valorActual + valor; // Sumar el valor a los puntos actuales
            SumaPuntos.setText(String.valueOf(Puntos)); // Actualizar el campo de puntos
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
            java.util.logging.Logger.getLogger(Formulario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Formulario2 F2 = new Formulario2();
                F2.setVisible(true);
                F2.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Help;
    private javax.swing.JButton Quien_soy;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField SumaPuntos;
    private javax.swing.JTextField Vidas;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton diez;
    private javax.swing.JButton doce;
    private javax.swing.JButton dos;
    private javax.swing.JToggleButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton once;
    private javax.swing.JButton once1;
    private javax.swing.JButton once2;
    private javax.swing.JButton once3;
    private javax.swing.JButton once4;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables

    void establecerNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
