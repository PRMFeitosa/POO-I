/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ferramentas;

import java.util.List;

/**
 *
 * @author Paulo
 */
public interface DAO<T> {
    public boolean salvar(T t);
    public List listar();
    public boolean excluir(T t);
    public boolean editar(T t);
    
    
    
}
