public class Retangulo implements Objeto{
    public double base;
    public double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcArea(Object obj){
        if(obj instanceof Retangulo r){
            return r.base * r.altura;
        } else {
            throw new exceptionIllegalArgumentException ("O objeto precisa ser um retangulo");
        }
    }

    @Override
    public double calcPerimetro(Object obj){
        if(obj instanceof Retangulo r){
            return (2 * r.base) + (2 * r.altura);
        } else {
            throw new exceptionIllegalArgumentException ("O objeto precisa ser um retangulo");
        }
    }

}