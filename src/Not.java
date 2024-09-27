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

public class Not extends Compuertas {

    public Not(int x, int y) {
        super(x, y, 1);
    }

    @Override
    //se dibuja la compuerta
    public void draw(Graphics2D g) {
        g.setStroke(new BasicStroke(5));
        g.setColor(Color.BLUE);
        g.drawLine(x, y, x + 50, y + 25); // Triangulo patita arriba
        g.drawLine(x + 50, y + 25, x, y + 50); // Triangulo patita abajo
        g.drawLine(x, y, x, y + 50); // Triangulo patita hipotenusa
        g.drawOval(x + 50, y + 20, 10, 10); // Circulo :v
        g.drawLine(x - 20, y + 25, x, y + 25); // Patita atras del triangulo
        g.drawLine(x + 60, y + 25, x + 80, y + 25); // Patita afuera del triangulo
    }
}
