
package Observer;

/**
 *
 * @author Cesar
 */
public class CanalMensajeTexto implements CanalNotificacion{
    private String telefono;
    @Override
    public boolean enviarNotificacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public boolean guardarCorreo(String telefono){
        this.telefono=telefono;
        return true;
    }
    
}
