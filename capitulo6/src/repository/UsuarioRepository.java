/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioRepository {
    private List<Livro> livros = new ArrayList<>();
    private int proximoId = 1;
    
    public void cadastrar(Livro livro) {
        livro.setId(proximoId++);
        livros.add(livro);
    }
    
    public List<Livro> buscarTodos() {
        return livros;
    }
    
    public Livro buscarPorId(int id) {
        for (Livro livro : livros) {
            
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
}

