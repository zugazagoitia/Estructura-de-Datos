public class ColaPrioridades {
    private NodoPrioridad inicio;

    public ColaPrioridades() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    /** Inserta el paciente en la cola que le corresponde según su prioridad.
     * Si no hay ningún paciente con la misma prioridad, crea una cola nueva en la que mete al paciente.
     */
    public void encolar(int prioridad, Paciente paciente) {
        // TODO encolar con prioridad
    }

    /** Busca la clave en la lista. Si la encuentra devuelve el alumno asociado a dicha clave,
     * y si no la encuentra devuelve NULL.
     */
    public Paciente desencolar() {
        // TODO desencolar
        return null;  // Línea puesta para evitar error. Quitarla al implementar el método
    }

    /** Visualizar todos los pacientes del hospital, ordenados por prioridad
     */
    public void verColaPrioridades() {
        // TODO verDatos
    }
}


