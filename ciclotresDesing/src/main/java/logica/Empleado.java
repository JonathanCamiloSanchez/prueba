/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author FamiliaPC
 */
public class Empleado {
    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String correo;
    private Empresa miEmpresa;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String correo, Empresa miEmpresa) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.correo = correo;
        this.miEmpresa = miEmpresa;
    }
    
    public void editarEmpleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String correo, Empresa miEmpresa){
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.correo = correo;
        this.miEmpresa = miEmpresa;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getMiEmpresa() {
        return miEmpresa;
    }

    public void setMiEmpresa(Empresa miEmpresa) {
        this.miEmpresa = miEmpresa;
    }
    
}

