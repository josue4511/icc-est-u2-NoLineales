package models;

public class Contacto implements Comparable<Contacto> {

    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int compareTo(Contacto otro) {
        int comparacion = this.nombre.compareTo(otro.nombre);

        if (comparacion == 0) {
            comparacion = this.apellido.compareTo(otro.apellido);
        }

        if (comparacion == 0) {
            comparacion = this.telefono.compareTo(otro.telefono);
        }

        return comparacion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (nombre != null ? nombre.hashCode() : 0);
        hash = 31 * hash + (apellido != null ? apellido.hashCode() : 0);
        hash = 31 * hash + (telefono != null ? telefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Contacto other = (Contacto) obj;

        if (!nombre.equals(other.nombre)) {
            return false;
        }

        if (!apellido.equals(other.apellido)) {
            return false;
        }

        return telefono.equals(other.telefono);
    }
}