package com.company;

//Creación de clase con herencia de la clase Person
public class Accountant extends Person{
    private String leader;
    private String parking;
    //Aplicación de Setter y getter
    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }
    //Creación de método para mostrar la info
    public String mostrarAccountant(){
        return "Nombre: "+this.getName()+ "\n"+
                "Identificación: "+this.getIdentification()+"\n"+
                "Edad: "+this.getAge()+"\n"+
                "Lider: "+this.getLeader()+"\n"+
                "Parqueadero: "+this.getParking();
    }

}
