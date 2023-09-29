
package guia4ej1consulta;


public abstract class Barco {
    protected String matricula;
    protected int fabricacion;
    protected int eslora;
    public double modulo(){
        return 10 * eslora;
    }
                    
}
