
package FactoryMethod;


public class TareaSimpleFactory extends TareaFactory{

    @Override
    public Tarea crearTarea(String tipo, String fechaVen, String prioridad) {
        return new TareaSimple();
    }
    
}
