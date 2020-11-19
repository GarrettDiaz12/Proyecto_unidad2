package Proyecto_unidad_2;
public class Punto {
    private int x, y;
    public Punto() {
        this.x = 0;
        this.y = 0;
    }
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return this.y;
    }
}
