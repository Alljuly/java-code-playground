public class Circulo implements Objeto{
    public double raio;


    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcArea(Object obj){
        if(obj instanceof Circulo rc){
            return c.raio * Math.pow(3.14, 2);
        } else {
            throw new exceptionIllegalArgumentException ("O objeto precisa ser um circulo");
        }
    }

    @Override
    public double calcPerimetro(Object obj){
        if(obj instanceof Circulo c){
            return 2 * 3.14 * c.raio;
        } else {
            throw new exceptionIllegalArgumentException ("O objeto precisa ser um circulo");
        }
    }

}