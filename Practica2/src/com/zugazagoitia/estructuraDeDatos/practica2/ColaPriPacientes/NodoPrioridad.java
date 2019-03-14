public class NodoPrioridad {
    private int clave;
    private int dato;
    private NodoPrioridad siguiente;

    public NodoPrioridad(int clave, int dato, NodoPrioridad siguiente) {
        this.clave = clave;
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoPrioridad getSiguiente() {
        return siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setSiguiente(NodoPrioridad siguiente) {
        this.siguiente = siguiente;
    }

    public void setCola(int dato) {
        this.dato = dato;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
}
