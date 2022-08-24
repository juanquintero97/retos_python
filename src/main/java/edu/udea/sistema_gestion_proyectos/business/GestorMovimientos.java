package edu.udea.sistema_gestion_proyectos.business;

import edu.udea.sistema_gestion_proyectos.model.MovimientoDinero;

import java.util.ArrayList;

public class GestorMovimientos {
    private ArrayList<MovimientoDinero> movimientosDinero;
    private GestorEmpleados gestorEmpleados = new GestorEmpleados();

    public GestorMovimientos(){
        this.movimientosDinero=new ArrayList<>();
        this.movimientosDinero.add(new MovimientoDinero(1000000,"Proyecto paneles",gestorEmpleados.getEmpleado("JJ")));
        this.movimientosDinero.add(new MovimientoDinero(-200000,"Pago internet",gestorEmpleados.getEmpleado("TT")));
    }
}
