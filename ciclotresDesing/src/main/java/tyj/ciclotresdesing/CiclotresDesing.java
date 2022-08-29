/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tyj.ciclotresdesing;
import logica.Empresa;
import logica.Empleado;
import logica.Movimientos;
/**
 *
 * @author FamiliaPC
 */
public class CiclotresDesing {

    public static void main(String[] args) {
        Empresa nuevaEmpresa = new Empresa(44566,"Nueva Empresa Americana S.A","Carrera 5 #11-49",7172788,"correo@nuevaempresaamericana.com");
        
        System.out.println(nuevaEmpresa.getNitEmpresa()+" "+nuevaEmpresa.getNombreEmpresa()+" "+nuevaEmpresa.getCorreoEmpresa()+""+nuevaEmpresa.getDireccionEmpresa());
        
        //nuevaEmpresa.actualizarEmpresa(12345, "Actual EMpresa", "Carrea 8 -13", 897999, "nuevocorre.nuevo@dominonuevo.com");
        
        System.out.println(nuevaEmpresa.getNitEmpresa()+" "+nuevaEmpresa.getNombreEmpresa()+" "+nuevaEmpresa.getCorreoEmpresa()+""+nuevaEmpresa.getDireccionEmpresa());
        
        Empleado nuevoEmpleado = new Empleado(1032489656,"Jonathan Camilo","Sanchez Becerra","corre@domino.com",nuevaEmpresa);
        
        System.out.println(nuevoEmpleado.getIdEmpleado()+" "+nuevoEmpleado.getNombreEmpleado()+" "+nuevoEmpleado.getApellidoEmpleado()+" "+
                nuevoEmpleado.getCorreo()+" "+nuevoEmpleado.getMiEmpresa().getNombreEmpresa() );
        
        Movimientos nuevoMovimiento = new Movimientos(1, "Pago deuda", -1_500, nuevoEmpleado, nuevaEmpresa);
        System.out.println(nuevoMovimiento.getIdMovimiento()+" "+nuevoMovimiento.getConcepto()+" "+nuevoMovimiento.getMonto()+" "+nuevoMovimiento.getEmpleado().getNombreEmpleado()+" "+ nuevoMovimiento.getMiEmpresa().getNombreEmpresa());
        
    }
}
