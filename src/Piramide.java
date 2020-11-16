import java.lang.Math;
public class Piramide {
    private double height;
    private Triangulo triangulo;
    private double getHeight(){
        return this. height;

    }
    public double getvolume(){
        return (Math.sqrt(3)/12)*triangulo.getArea()*height;

    }

    public Piramide(double side,double height) {
        this.triangulo=new Triangulo(side, height);
        this.height = height;
    }
}
