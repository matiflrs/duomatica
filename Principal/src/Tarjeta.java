public class Tarjeta {
    private int numeroTarjeta;
    private String tipoTarjeta;
    private String fechaExpiracion;
    private int saldo;
    private int compra;
    private Boolean primeraCompra;
    private Cliente cliente;

    public Tarjeta(int numeroTarjeta, String tipoTarjeta, String fechaExpiracion, int saldo, Boolean primeraCompra, Cliente cliente) {
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.saldo = saldo;
        this.primeraCompra = primeraCompra;
        this.cliente = cliente;
    }
    public Tarjeta() {
        this.numeroTarjeta = 0;
        this.tipoTarjeta = "";
        this.fechaExpiracion = "";
        this.saldo = 0;
        this.primeraCompra = true;
        this.cliente = new Cliente();
    }

   
    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Boolean getPrimeraCompra() {
        return primeraCompra;
    }

    public void setPrimeraCompra(Boolean primeraCompra) {
        this.primeraCompra = primeraCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   
    public String imprimirDatos() {
        return  
                "\nNumero Tarjeta     =" + numeroTarjeta + 
                "\nTipo Tarjeta       =" + tipoTarjeta + 
                "\nFecha Expiracion   =" + fechaExpiracion + 
                "\nSaldo              =" + saldo + 
                "\nPrimera Compra     =" + (primeraCompra?"Si":"No") + 
                "\nDueño Tarjeta      =" + cliente.getNombre();
    }
    
    public String enviarCorreo()
    {
        return  "Estimado: " + "\n" + cliente.getNombre() + 
                "\nRut       =" + cliente.getRut() + 
                "\nTelefono  =" + cliente.getTelefono() + 
                "\nDireccion =" + cliente.getDireccion() +
                "\nLe informamos que se ha realizado un cargo a su tarjeta: " + this.getTipoTarjeta() +
                "\nFecha Expiracion tarjeta =" + this.getFechaExpiracion() + 
                "\nSu correo es: " + cliente.getEmail();
        

    }
    
    public void cashBack()
    {
        if(primeraCompra == true)
            this.compra = (int) (compra * 0.10);
        else
            System.out.println("El monto de la compra debe ser superior a 10.000 para recibir cashback");
    }


    
}

