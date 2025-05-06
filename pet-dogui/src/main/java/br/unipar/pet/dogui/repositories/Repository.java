/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.repositories;

import java.util.List;

/**
 *
 * @author andersonbosing
 */
public interface Repository {
 
    public Object insert(Object object);
    public List<Object> findAll();
    public Object update(Object object);
    public void delete(Integer id);
    
}