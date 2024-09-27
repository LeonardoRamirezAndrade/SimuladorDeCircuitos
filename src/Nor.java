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


public class Nor extends Compuertas {
 
    public Nor(int x, int y) {
        super(x, y, 2);
    }

 

    @Override
    //se dibuja la compuerta 
    public void draw(Graphics2D g) {
        
        g.setColor(Color.GRAY);
        g.drawArc(x - 15, y, 70, 50, 270, 180);//Arco frente
        g.drawArc(x - 10, y, 40, 50, 270, 180); // Arco atras
        g.drawLine(x + 10, y + 50, x + 20, y + 50); // Linea de abajo
        g.drawLine(x + 10, y, x + 20, y); //Linea de arriba
        g.drawOval(x + 60, y + 20, 10, 10); // Circulo
        g.drawLine(x, y + 15, x + 28, y + 15); // Patita arriba
        g.drawLine(x, y + 35, x + 28, y + 35);  // Patita abajo
        g.drawLine(x + 80, y + 25, x + 70, y + 25);  // Linea afuera
 
        if (getNumEntra() == 3) {
            g.setStroke(new BasicStroke(5));
            g.setColor(Color.GREEN);
            g.drawLine(x - 20, y + 10, x, y + 10); // Patita 1
            g.drawLine(x - 20, y + 25, x, y + 25); // Patita 2
            g.drawLine(x - 20, y + 40, x, y + 40); // Patita 3
        } else if (getNumEntra() == 4) {
            g.setStroke(new BasicStroke(5));
            g.setColor(Color.GREEN);
            g.drawLine(x - 20, y + 5, x, y + 5);    // Patita 1
            g.drawLine(x - 20, y + 18, x, y + 18);  // Patita 2
            g.drawLine(x - 20, y + 32, x, y + 32);  // Patita 3
            g.drawLine(x - 20, y + 45, x, y + 45);  // Patita 4
        } else {
 
            g.drawLine(x - 20, y + 15, x, y + 15); // Patita 1
            g.drawLine(x - 20, y + 35, x, y + 35); // Patita 2
        }
    }
}
