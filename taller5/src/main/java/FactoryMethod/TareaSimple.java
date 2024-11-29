
package FactoryMethod;


public class TareaSimple implements Tarea{
    private String prioridad;
    private String fechaVencimiento;
    private String estado;

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean actualizarEstado() {
        if (estado.equals("Terminada")){
            estado="Sin terminar";
        }
        else{
            estado="Terminada";
        }
        return true;
    }
}
