/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class Principal {

    public static void main(String[] args) {
        Animal cachorro = new Animal(" Toto ", 5);
        cachorro.comer();
        cachorro.dormir();
        System.out.println(" Nome : " + cachorro.getNome());
        System.out.println(" Idade : " + cachorro.getIdade());
    }
}
