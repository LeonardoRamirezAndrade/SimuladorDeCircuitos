/*
Integrantes de grupo: 
Gonzales Lauren
Ramirez Andrade Leonardo
Ramos Mateo
Torres Kevin
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Or extends Compuertas {

    public Or(int x, int y) {
        super(x, y, 2);
    }

    @Override
    //se dibuja la compuerta con 2 entradas
    public void draw(Graphics2D g) {

        g.setStroke(new BasicStroke(5));
        g.setColor(Color.RED);
        g.drawArc(x - 15, y, 70, 50, 270, 180);//Arco frente
        g.drawArc(x - 10, y, 40, 50, 270, 180); // Arco atras
        g.drawLine(x + 10, y + 50, x + 20, y + 50); // Linea de abajo
        g.drawLine(x + 10, y, x + 20, y); //Linea de arriba
        g.drawLine(x + 55, y + 25, x + 70, y + 25);  // Linea afuera
 
        if (getNumEntra() == 3) {
            g.setStroke(new BasicStroke(5));
            g.setColor(Color.RED);
            g.drawLine(x, y + 10, x + 28, y + 10); // Patita 1
            g.drawLine(x, y + 25, x + 28, y + 25); // Patita 2
            g.drawLine(x, y + 40, x + 28, y + 40); // Patita 3
        } else if (getNumEntra() == 4) {
            g.setStroke(new BasicStroke(5));
            g.setColor(Color.RED);
            g.drawLine(x - 10, y + 5, x + 18, y + 5);    // Patita 1
            g.drawLine(x - 10, y + 18, x + 28, y + 18);  // Patita 2
            g.drawLine(x - 10, y + 32, x + 28, y + 32);  // Patita 3
            g.drawLine(x - 10, y + 45, x + 18, y + 45); // Patita 4
 
        } else {
            g.setStroke(new BasicStroke(5));
            g.setColor(Color.RED);
            g.drawLine(x, y + 15, x + 28, y + 15); // Patita 1
            g.drawLine(x, y + 35, x + 28, y + 35);  // Patita 2
        }

    }

    /*se dibuja la compuerta con 3 entradas
    public void draw(Graphics2D g) {

    }
    
  
    //se dibuja la compuerta con 4 entradas
    public void draw(Graphics2D g) {

    }*/
}
