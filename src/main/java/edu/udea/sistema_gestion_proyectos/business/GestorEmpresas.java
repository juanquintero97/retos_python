package edu.udea.sistema_gestion_proyectos.business;

import edu.udea.sistema_gestion_proyectos.model.Empresa;

import java.util.ArrayList;

public class GestorEmpresas {
    private ArrayList<Empresa> empresas;

    public GestorEmpresas(){
        this.empresas = new ArrayList<>();

        this.empresas.add(new Empresa("Equipo 99","La nube",3006647,"900663862-8"));
        this.empresas.add(new Empresa("DreamCode", "Cra 100 #16-321",3206598,"200662587-3"));
        this.empresas.add(new Empresa("MetroCali","Calle 25N #2F-136",6600001,"123456789-0"));
    }

    public Empresa getEmpresa(String nombreEmpresa){
        for(Empresa empresa: this.empresas){
            if(empresa.getNombre().equals(nombreEmpresa)){
                return empresa;
            }
        }
        return null;
    }
    public ArrayList<Empresa> getEmpresas(){return empresas;}
}
