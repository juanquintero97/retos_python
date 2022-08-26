package edu.udea.sistema_gestion_proyectos;

import edu.udea.sistema_gestion_proyectos.model.Empleado;
import edu.udea.sistema_gestion_proyectos.model.Empresa;
import edu.udea.sistema_gestion_proyectos.model.MovimientoDinero;

public class test {
    public static void main(String [] Args){
        Empresa empresa1 = new Empresa("Equipo 99","900665478-7","3335446","La nube");
        Empleado empleado1 = new Empleado("Juan Quintero", "jquintero@mail.com",empresa1,"Administrador");
        MovimientoDinero movimientoDinero1 = new MovimientoDinero("Proyecto energia solar",50000000,empleado1);
        Empresa empresa2 = new Empresa("MARS","900335879-1","3335566","Bogotá");
        Empleado empleado2 = new Empleado("Juan Lopez", "jlopez@mail.com",empresa2,"Administrador");
        MovimientoDinero movimientoDinero2 = new MovimientoDinero("Proyecto Granja Eolica",80000000,empleado2);

        System.out.println(empresa1.getName());
        System.out.println(empresa1.getNIT());
        System.out.println(empresa1.getPhone());
        System.out.println(empresa1.getAdress());

        empresa1.setName("Team 99");
        empresa1.setNIT("600355784-3");
        empresa1.setPhone("6657894");
        empresa1.setAdress("Colombia");

        System.out.println(empresa1.getName());
        System.out.println(empresa1.getNIT());
        System.out.println(empresa1.getPhone());
        System.out.println(empresa1.getAdress());


        System.out.println(empleado1.getName());
        System.out.println(empleado1.getEmail());
        System.out.println(empleado1.getEnterprise().getName());
        System.out.println(empleado1.getRole());

        empleado1.setEnterprise(empresa2);
        empleado1.setRole("Operativo");

        System.out.println(empleado1.getName());
        System.out.println(empleado1.getEmail());
        System.out.println(empleado1.getEnterprise().getName());
        System.out.println(empleado1.getRole());

        System.out.println(movimientoDinero1.getConcept());
        System.out.println(movimientoDinero1.getAmount());
        System.out.println(movimientoDinero1.getUser().getName());

        movimientoDinero1.setAmount(60000000);
        movimientoDinero1.setUser(empleado2);

        System.out.println(movimientoDinero1.getConcept());
        System.out.println(movimientoDinero1.getAmount());
        System.out.println(movimientoDinero1.getUser().getName());

    }
}
