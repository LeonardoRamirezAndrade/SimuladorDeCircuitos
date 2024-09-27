/*
Integrantes de grupo: 
Gonzales Lauren
Ramirez Andrade Leonardo
Ramos Mateo
Torres Kevin
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class Interfaz extends javax.swing.JFrame implements NewInterface {

    private ArrayList<Compuertas> compuertas = new ArrayList<>();  //arreglo donde almecenar las compuertas 
    private Compuertas arrastrarCompuerta = null; //para tener la compuerta que se esta deslizando
    private Compuertas clickCompuerta = null; //para tener la compuerta que se esta likeando ara eliminar
    private int offsetX, offsetY;

    private static final int POSICION_INICIAL_X = 100;
    private static final int POSICION_INICIAL_Y = 100;

    JPopupMenu popupMenu = new JPopupMenu();
    JMenuItem item1 = new JMenuItem("Eliminar compuerta");
    JMenuItem item2 = new JMenuItem("Añadir 3 entradas");
    JMenuItem item3 = new JMenuItem("Añadir 4 entradas");
    private int index = 0;

    public Interfaz() {
        initComponents();
        popupMenu.add(item1);
        popupMenu.add(item2);
        popupMenu.add(item3);

        Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                onMousePressed(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                onMouseReleased(evt);
            }
        });

        Panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                onMouseDragged(evt);
            }
        });

        Panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Mostrar el menú solo si es un clic derecho
                if (SwingUtilities.isRightMouseButton(e)) {
                    onMouseLine(e);
                }
            }
        });

        item1.addActionListener(e -> {
            if (clickCompuerta != null) {
                compuertas.remove(clickCompuerta); // Elimina la compuerta de la lista
                clickCompuerta = null;  // Reinicia la referencia
                repaint();  // Vuelve a pintar el panel
                JOptionPane.showMessageDialog(null, "Compuerta eliminada, quedan " + compuertas.size() + " compuertas.");

            } else {
                JOptionPane.showMessageDialog(null, "No hay compuerta seleccionada.");
            }
        });

        item2.addActionListener(e -> {
            if (clickCompuerta != null) {
                index = compuertas.indexOf(clickCompuerta); // obtenemos el indice del objeto que esta en la lista 
                compuertas.get(index).setNumEntra(3); // aumentamos el numero de entradas de la compuerta 
                clickCompuerta = null;  // Reinicia la referencia
                repaint();  // Vuelve a pintar el panel
                index=0;
            } else {
                JOptionPane.showMessageDialog(null, "No hay compuerta seleccionada.");
            }
        });

        item3.addActionListener(e -> {
            if (clickCompuerta != null) {
                index = compuertas.indexOf(clickCompuerta); // obtenemos el indice del objeto que esta en la lista 
                compuertas.get(index).setNumEntra(4); // aumentamos el numero de entradas de la compuerta 
                clickCompuerta = null;  // Reinicia la referencia
                repaint();  // Vuelve a pintar el panel
                index=0;
            } else {
                JOptionPane.showMessageDialog(null, "No hay compuerta seleccionada.");
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAnd = new javax.swing.JButton();
        BotonOr = new javax.swing.JButton();
        BotonNot = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        BotonNand = new javax.swing.JButton();
        BotonNor = new javax.swing.JButton();
        BotonXor1 = new javax.swing.JButton();
        BotonXnor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAnd.setText("AND");
        BotonAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAndActionPerformed(evt);
            }
        });

        BotonOr.setText("OR");
        BotonOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOrActionPerformed(evt);
            }
        });

        BotonNot.setText("NOT");
        BotonNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNotActionPerformed(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel de Compuertas dibujadas"));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        BotonNand.setText("NAND");
        BotonNand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNandActionPerformed(evt);
            }
        });

        BotonNor.setText("NOR");
        BotonNor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNorActionPerformed(evt);
            }
        });

        BotonXor1.setText("XOR");
        BotonXor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXor1ActionPerformed(evt);
            }
        });

        BotonXnor.setText("XNOR");
        BotonXnor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXnorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(BotonAnd)
                .addGap(74, 74, 74)
                .addComponent(BotonNand)
                .addGap(73, 73, 73)
                .addComponent(BotonOr)
                .addGap(59, 59, 59)
                .addComponent(BotonNor)
                .addGap(55, 55, 55)
                .addComponent(BotonXor1)
                .addGap(57, 57, 57)
                .addComponent(BotonXnor)
                .addGap(62, 62, 62)
                .addComponent(BotonNot)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAnd)
                    .addComponent(BotonOr)
                    .addComponent(BotonNot)
                    .addComponent(BotonNand)
                    .addComponent(BotonNor)
                    .addComponent(BotonXor1)
                    .addComponent(BotonXnor))
                .addGap(18, 18, 18)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //metodo para agregar una nueva compuerta en la interfaz
    /**
     *
     * @param compuerta
     */
    @Override
    public void agregarCompuerta(Compuertas compuerta) {
        int x = POSICION_INICIAL_X;
        int y = POSICION_INICIAL_Y;
        compuerta.cambiarPosicion(x, y);
        compuertas.add(compuerta);
        repaint();
    }


    private void BotonAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAndActionPerformed
        agregarCompuerta(new And(0, 0));

    }//GEN-LAST:event_BotonAndActionPerformed

    private void BotonOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOrActionPerformed
        agregarCompuerta(new Or(0, 0));

    }//GEN-LAST:event_BotonOrActionPerformed

    private void BotonNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNotActionPerformed
        agregarCompuerta(new Not(0, 0));

    }//GEN-LAST:event_BotonNotActionPerformed

    private void BotonNandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNandActionPerformed
        agregarCompuerta(new Nand(0, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_BotonNandActionPerformed

    private void BotonNorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNorActionPerformed
        agregarCompuerta(new Nor(0, 0));      // TODO add your handling code here:
    }//GEN-LAST:event_BotonNorActionPerformed

    private void BotonXor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXor1ActionPerformed
        agregarCompuerta(new Xor(0, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_BotonXor1ActionPerformed

    private void BotonXnorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXnorActionPerformed
        agregarCompuerta(new Xnor(0, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_BotonXnorActionPerformed
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) Panel.getGraphics();
        for (Compuertas compu : compuertas) {
            compu.draw(gr);
        }
    }

    private void onMousePressed(MouseEvent evt) {
        for (Compuertas compu : compuertas) {
            if (compu.estaEnLaLinea(evt.getX(), evt.getY())) {
                arrastrarCompuerta = compu;
                offsetX = evt.getX() - compu.getX();
                offsetY = evt.getY() - compu.getY();
                break;
            }
        }
    }

    private void onMouseLine(MouseEvent evt) {
        for (Compuertas compu : compuertas) {
            if (compu.estaEnLaLinea(evt.getX(), evt.getY())) {
                clickCompuerta = compu;
                popupMenu.show(Panel, 800, -70); // mostrar el panel

                break;
            }
        }
    }

    private void onMouseReleased(MouseEvent evt) {
        arrastrarCompuerta = null;  // Dejar de deslizar la compuerta
    }

    private void onMouseDragged(MouseEvent evt) {
        if (arrastrarCompuerta != null) {
            // Actualizar la posición de la compuerta que se esta moviendo 
            arrastrarCompuerta.cambiarPosicion(evt.getX() - offsetX, evt.getY() - offsetY);
            repaint();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnd;
    private javax.swing.JButton BotonNand;
    private javax.swing.JButton BotonNor;
    private javax.swing.JButton BotonNot;
    private javax.swing.JButton BotonOr;
    private javax.swing.JButton BotonXnor;
    private javax.swing.JButton BotonXor1;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

}
