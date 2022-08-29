/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author FamiliaPC
 */
public class Movimientos {
    private int idMovimiento;
    private String concepto;
    private float monto;
    private Empleado empleado;
    private Empresa miEmpresa;

    public Movimientos() {
    }

    public Movimientos(int idMovimiento, String concepto, float monto, Empleado empleado, Empresa miEmpresa) {
        this.idMovimiento = idMovimiento;
        this.concepto = concepto;
        this.monto = monto;
        this.empleado = empleado;
        this.miEmpresa = miEmpresa;
    }
    
    public void editarMovimientos(int idMovimiento, String concepto, float monto, Empleado empleado, Empresa miEmpresa){
        this.idMovimiento = idMovimiento;
        this.concepto = concepto;
        this.monto = monto;
        this.empleado = empleado;
        this.miEmpresa = miEmpresa;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getMiEmpresa() {
        return miEmpresa;
    }

    public void setMiEmpresa(Empresa miEmpresa) {
        this.miEmpresa = miEmpresa;
    }
    
    
}
