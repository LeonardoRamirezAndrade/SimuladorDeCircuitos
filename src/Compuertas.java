/*
Integrantes de grupo: 
Gonzales Lauren
Ramirez Andrade Leonardo
Ramos Mateo
Torres Kevin
*/


import java.awt.Graphics2D;


//Aquí la clase padre 
public abstract class Compuertas {
    protected int x, y;
    private int numEntra;
    protected int width, height;

    
    //Metodo constructor
    public Compuertas(int x, int y, int numEntrada) {
        this.x = x;
        this.y = y;
        this.width = 50;
        this.height = 30;
        this.numEntra=numEntrada;
    }
    
    //Metodos abstractos
    public abstract void draw(Graphics2D g);

    public boolean estaEnLaLinea(int posicionX, int posicionY) { 
        return posicionX >= x && posicionX <= x + width && posicionY >= y && posicionY <= y + height;
    }

    public void cambiarPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    //Getters y setters 
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the numEntra
     */
    public int getNumEntra() {
        return numEntra;
    }

    /**
     * @param numEntra the numEntra to set
     */
    public void setNumEntra(int numEntra) {
        this.numEntra = numEntra;
    }
}
