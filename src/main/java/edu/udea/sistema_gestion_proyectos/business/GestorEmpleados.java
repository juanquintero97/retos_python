package edu.udea.sistema_gestion_proyectos.business;

import edu.udea.sistema_gestion_proyectos.model.Empleado;
import edu.udea.sistema_gestion_proyectos.model.Empresa;

import java.util.ArrayList;

public class GestorEmpleados {
    private ArrayList<Empleado> empleados;
    private GestorEmpresas gestorEmpresas= new GestorEmpresas();

    public GestorEmpleados(){
        this.empleados=new ArrayList<>();

        this.empleados.add(new Empleado("JJ", "jj@admin.com",gestorEmpresas.getEmpresa("Equipo 99"),"administrador"));
        this.empleados.add(new Empleado("TT", "tt@admin.com",gestorEmpresas.getEmpresa("DreamCode"),"operativo"));
    }

    public Empleado getEmpleado(String nombreEmpleado){
        for(Empleado empleado: this.empleados){
            if(empleado.getNombre().equals(nombreEmpleado)){
                return empleado;
            }
        }
        return null;
    }
    public ArrayList<Empleado> getEmpleados(){return empleados;}
}
