import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Tarjeta tarjeta1 = new Tarjeta();
        Tarjeta tarjeta2 = new Tarjeta();
        
        while(true)
        {
            System.out.println("============ Menú ============");
            System.out.println("1.- Crear Clientes");
            System.out.println("2.- Crear Tarjetas");
            System.out.println("3.- Mostrar información de Tarjetas");
            System.out.println("4.- Monto de compra para cliente nuevo");
            System.out.println("5.- Monto de compra para cliente antiguo");
            System.out.println("6.- Salir");
            System.out.print("Ingrese su opción:");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 1)
            {
                cliente1.setNombre("Juan");
                cliente1.setRut("11.111.111-1");
                cliente1.setTelefono(911111111);
                cliente1.setEmail("juan@gmail.com");
                cliente1.setDireccion("moneda 123, Santiago");
                cliente1.setClienteCreado(true);
                
                cliente2.setNombre("Maria");
                cliente2.setRut("22.222.222-2");
                cliente2.setTelefono(922222222);
                cliente2.setEmail("maria@gmail.com");
                cliente2.setDireccion("santa lucia 123, Santiago");
                cliente2.setClienteCreado(true);
                
                System.out.println("Clientes creados exitosamente");
            }
            else if(opcion == 2)
            {
                tarjeta1.setCliente(cliente1);
                tarjeta1.setTipoTarjeta("Cuenta Corriente");
                tarjeta1.setNumeroTarjeta(1234567890);
                tarjeta1.setFechaExpiracion("12/2027");
                tarjeta1.setSaldo(100000);
                tarjeta1.setPrimeraCompra(true);
                
                tarjeta1.setCliente(cliente2);
                tarjeta2.setTipoTarjeta("Cuenta Corriente");
                tarjeta2.setNumeroTarjeta(1987654321);
                tarjeta2.setFechaExpiracion("12/2028");
                tarjeta2.setSaldo(100000);
                tarjeta2.setPrimeraCompra(true);
                System.out.println("Tarjetas creadas exitosamente");
                
            }
            else if(opcion == 3)
            {
                System.out.println("===Datos===");
                System.out.println("Tarjeta 1");
                System.out.println(tarjeta1.imprimirDatos());
                System.out.println("Tarjeta 2");
                System.out.println(tarjeta2.imprimirDatos());
            }
            else if(opcion == 4 )
            {
                if(cliente1.isClienteCreado() == true && tarjeta1.getPrimeraCompra() == true )
                {
                    System.out.println("===Compra cliente nuevo===");
                    System.out.println("Tarjeta 1");
                    System.out.println("Cliente :" + tarjeta1.getCliente().getNombre());
                    System.out.println("ingrese monto de primera compra (cashback de 10% sobre sus compras con tope de $10.000) ");
                    int monto1 = leerTeclado.nextInt();
                    if(monto1 < tarjeta1.getSaldo())
                    {
                        tarjeta1.setCompra(monto1);
                        tarjeta1.cashBack();
                        tarjeta1.setSaldo(tarjeta1.getSaldo()-monto1+tarjeta1.getCompra());
                        System.out.println("Por su compra de $"  + monto1 + "\nObtendra $" + tarjeta1.getCompra() + " de cashback");
                        System.out.println(tarjeta1.enviarCorreo());
                        System.out.println("Correo enviado...");
                        tarjeta1.setCompra(0);
                    } 
                    else 
                    {
                        System.out.println("Saldo insuficiente en su tarjeta, Pruebe con otro monto");
                    }
                }
                else if(cliente2.isClienteCreado() == true && tarjeta2.getPrimeraCompra() == true )
                {
                    System.out.println("===Compra cliente nuevo===");
                    System.out.println("Tarjeta 2");
                    System.out.println("Cliente :" + tarjeta2.getCliente().getNombre());
                    System.out.println("ingrese monto de primera compra (cashback de 10% sobre sus compras) ");
                    int monto2 = leerTeclado.nextInt();
                    if(monto2 < tarjeta2.getSaldo())
                    {
                        tarjeta2.setCompra(monto2);
                        tarjeta2.cashBack();
                        tarjeta2.setSaldo(tarjeta2.getSaldo()-monto2+tarjeta2.getCompra());
                        System.out.println("Por su compra de $"  + monto2 + "\nObtendra $" + tarjeta2.getCompra() + " de cashback");
                        System.out.println(tarjeta2.enviarCorreo());
                        System.out.println("Correo enviado...");
                        tarjeta2.setCompra(0);
                    } 
                    else 
                    {
                        System.out.println("Saldo insuficiente en su tarjeta, Pruebe con otro monto");
                    }
                    
                }
                else
                    System.out.println("no hay tarjeta");
                
            }
            else if(opcion == 5)
            {
                if(cliente1.isClienteCreado() == true && tarjeta1.getPrimeraCompra() == false )
                {
                    System.out.println("===Compra cliente Antiguo===");
                    System.out.println("Tarjeta 1");
                    System.out.println("Cliente :" + tarjeta1.getCliente().getNombre());
                    System.out.println("ingrese monto de compra");
                    int monto1 = leerTeclado.nextInt();
                    if(monto1 < tarjeta1.getSaldo())
                    {
                        tarjeta1.setCompra(monto1);
                        tarjeta1.setSaldo(tarjeta1.getSaldo()-monto1);
                        System.out.println(tarjeta1.enviarCorreo());
                        System.out.println("Correo enviado...");
                    } 
                    else 
                    {
                        System.out.println("Saldo insuficiente en su tarjeta, Pruebe con otro monto");
                    }
                }
                else if(cliente2.isClienteCreado() == true && tarjeta2.getPrimeraCompra() == true )
                {
                    System.out.println("===ompra cliente Antiguo===");
                    System.out.println("Tarjeta 2");
                    System.out.println("Cliente :" + tarjeta2.getCliente().getNombre());
                    System.out.println("ingrese monto de compra");
                    int monto2 = leerTeclado.nextInt();
                    if(monto2 < tarjeta2.getSaldo())
                    {
                        tarjeta2.setCompra(monto2);
                        tarjeta2.cashBack();
                        tarjeta2.setSaldo(tarjeta2.getSaldo()-monto2);
                        System.out.println(tarjeta2.enviarCorreo());
                        System.out.println("Correo enviado...");
                    } 
                    else 
                    {
                        System.out.println("Saldo insuficiente en su tarjeta, Pruebe con otro monto");
                    }
                    
                }
                else
                    System.out.println("no hay tarjeta");
                
            }
            else if(opcion == 6)
            {
                break;
            }
            else
            {
                System.out.println("Opción ingresada no es válida");
            }
        }
    }
}
