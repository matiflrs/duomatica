public class Cliente {
    private String nombre;
    private String rut;
    private int telefono;
    private String email;
    private String direccion;
    private boolean clienteCreado;

    public Cliente(String nombre, String rut, int telefono, String email, String direccion, boolean clienteCreado) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.clienteCreado = clienteCreado;
    }

    
    public Cliente() {
        this.nombre = "";
        this.rut = "";
        this.telefono = 0;
        this.email = "";
        this.direccion = "";
        this.clienteCreado = true;
    }
    public boolean isClienteCreado() {
        return clienteCreado;
    }

    public void setClienteCreado(boolean clienteCreado) {
        this.clienteCreado = clienteCreado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String imprimirDatos() {
        return "\n=======Cliente=======" +
                "\nNombre    =" + nombre + 
                "\nRut       =" + rut + 
                "\nTelefono  =" + telefono + 
                "\nEmail     =" + email + 
                "\nDireccion =" + direccion;
    }


     
    
    
    
    
}
