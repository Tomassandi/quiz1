public class Circulo<getarea> {


    private double radio;




    public double getArea(){

        return 3.14 * radio*radio;
    }
    public double getradio(){
        return this.radio;
    }
public double getperimeter(){

    return 2*3.14* radio;


    }


public Circulo(final double radio) {
        this.radio=radio;
        this.getArea();
        this.getperimeter();
    }
 }
