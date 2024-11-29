
package Facade;

import FactoryMethod.Tarea;
import FactoryMethod.TareaFactory;
import Strategy.Contexto;
import Strategy.EstrategiaCalendario;
import Strategy.EstrategiaListaSimple;
import Strategy.EstrategiaTablero;
import java.util.List;

public class GestorTareaFacade {
    public Contexto vista;
    public List<Tarea> tareas;
    private TareaFactory tareaFactory;
    private Contexto contexto;
    
    public boolean agregarTarea(String tipo,String prioridad,String fechaVencimiento){
        tareas.add(tareaFactory.crearTarea(tipo, fechaVencimiento, prioridad));
        return true;
    }
    
    
    public boolean completarTarea(Tarea tarea){
        tarea.actualizarEstado();
        return true;
    }
    
    public boolean cambiarVista(String estrategia){
        switch (estrategia) {
            case "Calendario":
                contexto.defEstrategia(new EstrategiaCalendario());
                break;
            case "Lista":
                contexto.defEstrategia(new EstrategiaListaSimple());
                break;
            default:
                contexto.defEstrategia(new EstrategiaTablero());
                break;
        }
        return true;
    }
}
