/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tyj.ciclotresdesing;
import logica.Empresa;
/**
 *
 * @author FamiliaPC
 */
public class CiclotresDesing {

    public static void main(String[] args) {
        Empresa nuevaEmpresa = new Empresa(44566,"Nueva Empresa Americana S.A","Carrera 5 #11-49",7172788,"correo@nuevaempresaamericana.com");
        
        System.out.println(nuevaEmpresa.getNitEmpresa()+" "+nuevaEmpresa.getNombreEmpresa());
    }
}
