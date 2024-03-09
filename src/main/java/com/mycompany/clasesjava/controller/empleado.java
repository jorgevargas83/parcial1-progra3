package com.mycompany.clasesjava.controller;

public class empleado extends AbstractPersona {

    private int codigo;
    private String puesto;
    private int saldo;

    public empleado(int id, String nombre, String apellido, String direccion, int telefono, int codigo, String puesto, int saldo) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.puesto = puesto;
        this.saldo = saldo;
    }

    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId() + " " + this.getNombre() + " " + this.getApellido() + " "
                + this.getDireccion() + " " + this.getTelefono());
    }

    public void GuardarAlumno(empleado alumno) {
        this.setCodigo(alumno.getCodigo());
        this.setCurso(alumno.getCurso());
        this.setCiclo(alumno.getCiclo());
    }

    public void ObtenerAlumno() {
        System.out.println(this.codigo + " " + this.saldo + " " + this.puesto);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return puesto;
    }

    public void setCurso(String curso) {
        this.puesto = puesto;
    }

    public int getCiclo() {
        return saldo;
    }

    public void setCiclo(int ciclo) {
        this.saldo = saldo;
    }

}
