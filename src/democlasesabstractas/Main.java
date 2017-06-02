/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlasesabstractas;
import modelo.Empleado;
import modelo.EmpleadoAsalariado;
import modelo.EmpleadoporHoras;
import modelo.EmpleadoPorComision;
import modelo.EmpleadoBaseMasComision;
/**
 *
 * @author hp245
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado ("John", "Smith", "111-11-1111", 800.0);
        EmpleadoporHoras empleadoporHoras = new EmpleadoporHoras ("Karen", "Price", "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision ("Sue", "Jones", "333-33-3333", 10000, 0.06);
        EmpleadoBaseMasComision empleadoBaseMasComision =new EmpleadoBaseMasComision ("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        
        System.out.println("Empleados procesados por separado:\n");
        
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoporHoras, "ingresos", empleadoporHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());
        
        Empleado[] empleados = new Empleado [4];
        
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoporHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        
        System.out.println("Empleados procesados en forma polimorfica:\n");
        
        for (Empleado empleadoActual : empleados){
            System.out.println(empleadoActual);
            
            if (empleadoActual instanceof EmpleadoBaseMasComision){
            EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
            empleado.setSalarioBase( 1.10 * empleado.getSalarioBase());
            System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f\n", empleado.getSalarioBase());
        }
            
            System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }
        
        for (int j = 0; j < empleados.length; j++)
            System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());
    }
}
