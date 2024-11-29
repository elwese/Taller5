
package Observer;


public class CanalCorreo implements CanalNotificacion{
    private String correo;
    @Override
    public boolean enviarNotificacion() {
        //codigo para enviar notificacion por correo electronico
        return true;
    }
    public boolean guardarCorreo(String correo){
        this.correo=correo;
        return true;
    }
    
}
