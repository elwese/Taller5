package Observer;

import java.util.ArrayList;

public class Notificador {
    private ArrayList <CanalNotificacion> canalesNotificaciones;
    
    public boolean agregarCanal(CanalNotificacion canal){
        canalesNotificaciones.add(canal);
        return true;
    }
    public boolean eliminarCanal(CanalNotificacion canal){
        canalesNotificaciones.remove(canal);
        return true;
    }
    
    public boolean enviarNotificacionCanales(){
        for(CanalNotificacion c:canalesNotificaciones){
            c.enviarNotificacion();
        }
        return true;
    }
}
