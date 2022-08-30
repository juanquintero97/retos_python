package edu.udea.sistema_gestion_proyectos.business;

import edu.udea.sistema_gestion_proyectos.model.Empresa;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class GestorEmpresa {
    private ArrayList<Empresa> empresas;

    public GestorEmpresa(){
        this.empresas = new ArrayList<>();

        this.empresas.add(new Empresa(1,"Team 99","100-1","6027776543","Cali",null,null,new Date(),new Date()));
        this.empresas.add(new Empresa(2,"La Bastilla","200-1","6027444543","Medellin",null,null,new Date(),new Date()));
    }

    public Empresa getEmpresa(String nombreEmpresa) throws Exception {
        for (Empresa empresa:this.empresas){
            if(empresa.getName().equals(nombreEmpresa)){
                return empresa;
            }
        }
        throw new Exception("La empresa no existe");
    }
    public String setEmpresa(Empresa empresaParametro) throws Exception {
        try {
            getEmpresa(empresaParametro.getName());
        } catch (Exception e){
            this.empresas.add(empresaParametro);
            return "Empresa creada exitosamente";
        }
        throw new Exception("La empresa ya existe");
    }

    public ArrayList<Empresa> getEmpresas(){return empresas;}
    public void setEmpresas(ArrayList<Empresa> empresas){
        this.empresas=empresas;
    }



}
