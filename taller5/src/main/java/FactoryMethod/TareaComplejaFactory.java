
package FactoryMethod;


public class TareaComplejaFactory extends TareaFactory{

    @Override
    public Tarea crearTarea(String tipo, String fechaVen, String prioridad) {
        return new TareaCompleja();
    }
    
}
