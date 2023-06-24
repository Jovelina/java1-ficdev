/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class CachorroextendsAnimal {
    
    Int corPelo;
    
    public Cachorro(int p, int a) {
        // pata e altura são defindos em Animal e herdaddps aqui
        pata = p;
        altura = a;
        
    }
    
    public Cachorro(int p, int a, corPelo){
        // super usa o construtor da superclasse Animal 
        super(p, a);
        this.corPelo = corPelo;
    }    
    
    }
