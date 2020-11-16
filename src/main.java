public class main {
    public static void main(String[] args) {
        Circulo circulo=new Circulo(4);
        System.out.println("circulo area="+circulo.getArea()+" perimeter= "+circulo.getperimeter());

        Triangulo triangulo=new Triangulo(2,8);
        System.out.println("triangulo area="+triangulo.getArea()+" perimeter= "+triangulo.getperimeter());

        Piramide piramide=new Piramide(4,8);
        System.out.println("piramide volumen="+piramide.getvolume());
    }
}
