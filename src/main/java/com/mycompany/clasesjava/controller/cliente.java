package com.mycompany.clasesjava.controller;

public class cliente extends AbstractPersona{

    private int codigo;
    private int saldo;
  
    
    public cliente(int id, String nombre, String apellido, String direccion, int telefono, int codigo, int saldo, String curso) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.saldo = saldo;
        
    }

    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId()+" "+this.getNombre()+" "+this.getApellido()+" "
        +this.getDireccion()+" "+this.getTelefono());
    }
    
    public void ConsultarDocente(){
        System.out.println(codigo+" "+" "+saldo);
    }
    
}
