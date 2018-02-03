package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Veterinario {
    AnimalDomestico animal;
    public Veterinario(AnimalDomestico animal){
        this.animal=animal;
    }
    public void curar(){
        this.animal.saludar();
        if(this.animal instanceof Gato){
            System.out.println("se cura un gato");
        } else {
            System.out.println("se esta curando un perro");
        }
    }
}
