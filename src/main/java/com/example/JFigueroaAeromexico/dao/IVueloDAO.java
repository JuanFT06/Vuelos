/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.JFigueroaAeromexico.dao;

import com.example.JFigueroaAeromexico.jpa.Vuelo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.repository.ListCrudRepository;

/**
 *
 * @author digis
 */
public interface IVueloDAO  extends ListCrudRepository<Vuelo, String>{
    List<Vuelo> findAllByFechaSalidaBetween(LocalDateTime start,LocalDateTime end);
}
