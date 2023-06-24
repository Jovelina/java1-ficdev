/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public interface AnimalPeixe {
    public interface Animal {public void respirar(); }
    
    public interface Peixe {public void nada(); }
    public class Tubarao implements Animal, Peixe {

        /**
         *
         */
        @Override
        public void respirar(){System.out.println("Usando guelras!"); }
        public void nadar () {System.out.println("Mergulhando!"); }

        @Override
        public void nada() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
}
