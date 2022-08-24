package edu.udea.sistema_gestion_proyectos.model;

public class MovimientoDinero {
    private long montoMovimiento;
    private String conceptoMovimiento;
    private Empleado encargadoMovimiento;

    public MovimientoDinero(long montoMovimiento, String conceptoMovimiento, Empleado encargadoMovimiento){
        this.montoMovimiento=montoMovimiento;
        this.conceptoMovimiento=conceptoMovimiento;
        this.encargadoMovimiento=encargadoMovimiento;
    }

    public long getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(long montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getEncargadoMovimiento() {
        return encargadoMovimiento;
    }

    public void setEncargadoMovimiento(Empleado encargadoMovimiento) {
        this.encargadoMovimiento = encargadoMovimiento;
    }
}
