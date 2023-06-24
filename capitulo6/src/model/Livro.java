/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ficdev
 */
public class Livro {
    private int id;
    private String titulo;
    private autor;
    private int anoPublicacao;
    private bpplean disponivel;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponovel = true;
        
        // getters e setters vocês já sabem fazer:)
        
        public boolean isDisponivel() {
            return disponivel;
            
        }
    
}

package model;

import java.util.ArrayList;
import java.util.List;
