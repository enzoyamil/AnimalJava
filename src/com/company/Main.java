package com.company;

public class Main {

    public static void main(String[] args) {
AnimalDomestico g;
AnimalDomestico p;
Veterinario v;
g=new Gato("fofy","gris");
p=new Perro("wanko","blanco","chapi");
v=new Veterinario(p);
g.saludar();
p.saludar();
v.curar();
    }
}
