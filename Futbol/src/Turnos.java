//Realice un programa donde defini la clase (atributos y metodos) de acuerdo al programa, los atributos son variables que
se declaran dentro de una clase y los metodos son funciones. Luego use los paradigmas que son public y private hacen que
tenga accesibilidad mas amplia o menos amplia
public class Turnos {
    private int cod;
    private String nombre;
    private String apellido;
    private int hora;
    private String fecha;s
    private double precio;

    public Turnos(int cod, String nombre, String apellido, int hora, int fecha, double precio) {
        this.cod = cod;
        this.nombre = nombre;
        this.apellido = apellido;
        this.hora = hora;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Turnos{" +
                "cod=" + cod +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", hora=" + hora +
                ", fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }

    public void Turnos(float precio){
        return precio<0;
    }
}
