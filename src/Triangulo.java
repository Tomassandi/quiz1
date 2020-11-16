public class Triangulo {

    private double side;
    private double height;


    public double getArea() {

        return (side * height) / 2;
    }

    public double getSide() {
        return this.side;
    }

    public double getperimeter() {

        return   side*3;
    }

    public double getHeight() {
        return this.height;
    }

    public Triangulo(double side, double height) {
        this.side = side;
        this.height = height;
    }


}

