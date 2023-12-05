/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaAeromexico.dao;

import com.example.JFigueroaAeromexico.jpa.Vuelo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digis
 */
@Service
public class VueloDAOImplementation {

    @Autowired
    public VueloDAOImplementation(com.example.JFigueroaAeromexico.dao.IVueloDAO iVueloDAO) {
        this.iVueloDAO = iVueloDAO;
    }
    private final IVueloDAO iVueloDAO;
     
    public List<Vuelo> getAll(){
        return this.iVueloDAO.findAll();
    }
    
    public List<Vuelo> findByFecha(LocalDateTime start, LocalDateTime end){
        return this.iVueloDAO.findAllByFechaSalidaBetween(start, end);
    }
    
    
}
