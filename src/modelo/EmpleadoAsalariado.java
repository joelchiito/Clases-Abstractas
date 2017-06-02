/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hp245
 */
public abstract class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    public EmpleadoAsalariado (String nombre, String apellido, String nss, double salario)
    {
        super(nombre, apellido, nss);
        setSalarioSemanal(salario);
    }
    
    public void setSalarioSemanal(double salario){
        if (salario>= 0.0)
            salarioSemanal = salario;
        else
            throw new IllegalArgumentException( "El salario semanal debe ser >= 0.0");
    }
    
    public double getSalarioSemanal(){
        return salarioSemanal;
    }
    
    @Override
    public double ingresos(){
        return getSalarioSemanal();
    }
    
    @Override
    public String toString(){
        return String.format("empleadoasalariado: %s\n%s: $%,.2f",
        super.toString(), "salario semanal", getSalarioSemanal() );
    }
}
