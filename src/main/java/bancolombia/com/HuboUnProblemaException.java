package bancolombia.com;

public class HuboUnProblemaException extends Exception{
    private String descripcion;

    public HuboUnProblemaException(String descripcion) {
        super();
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "HuboUnProblemaException{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
