
package Principal;

import controlador.AdministradorService;
import controlador.VendedorService;
import java.util.List;
import java.util.Scanner;
import modelo.Administrador;
import modelo.Vendedor;


public class Main {
    
    public void iniciarSesion(){
   
    } 
    
    public static void main(String[] args) {
        
    AdministradorService service = new AdministradorService();
    
       int cedulaAdmin = 1225093621;
       String nombreAdmin = "Marlon Deyber Restrepo Rodriguez";
       String contraseñaAdmin = "Password";
       int celularAdmin = 3236874;
       String direccionAdmin = "M3 CS9 VILLANAVARRA";
     
       System.out.println("Administrador Guardado");
           
       Administrador administrador = new Administrador(cedulaAdmin,nombreAdmin,contraseñaAdmin,celularAdmin,direccionAdmin);
       
      service.guardarAdministrador(administrador);
      
      System.out.println("Listando los usuarios creados");
        List<Administrador> listarAdministradores = service.listarAdministradores();
        for (Administrador administrador1 : listarAdministradores) {
            System.out.println(administrador1);
        }
        
       VendedorService service2 = new VendedorService();
    
       int cedulaVendedor = 1225092708;
       String nombreVendedor = "Kevin Alexander Rodriguez Bedoya";
       String contraseñaVendedor = "0000";
       int celularVendedor= 3333335;
       String direccionVendedor = "M18 CS9 COMUNAOSO";
     
       System.out.println("Vendedor Guardado");
           
       Vendedor vendedor = new Vendedor(cedulaVendedor,nombreVendedor,contraseñaVendedor,celularVendedor,direccionVendedor);
       
      service2.guardarVendedor(vendedor);
      
      System.out.println("Listando los vendedores creados");
        List<Vendedor> listarVendedores = service2.listarVendedores();
        for (Vendedor vendedor1 : listarVendedores) {
            System.out.println(vendedor1);
        }
        
    }

}
  
