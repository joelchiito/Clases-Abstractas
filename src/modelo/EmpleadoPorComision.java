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
public class EmpleadoPorComision extends Empleado{
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
        super(nombre, apellido, nss);
        setVentasBrutas(ventas);
        setTarifaComision(tarifa);
    }
    
    public void setTarifaComision(double tarifa){
        if (tarifa > 0.0 && tarifa < 1.0)
            tarifaComision = tarifa;
        else
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
    }
    
    public double getTarifaComision(){
        return tarifaComision;
    }
    
    public void setVentasBrutas(double ventas){
        if(ventas >= 0.0)
            ventasBrutas = ventas;
        else
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
    }
    
    public double getVentasBrutas(){
        return ventasBrutas;
    }
    
    @Override
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "empleado por comisión", super.toString(), "ventas brutas",
                getVentasBrutas(), "tarifa de comisión", getTarifaComision());
    }
    
}
