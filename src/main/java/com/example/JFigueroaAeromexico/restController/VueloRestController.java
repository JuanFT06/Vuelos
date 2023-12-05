/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaAeromexico.restController;

import com.example.JFigueroaAeromexico.dao.VueloDAOImplementation;
import com.example.JFigueroaAeromexico.jpa.Vuelo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digis
 */
@RestController
@RequestMapping("/api/vuelos")
public class VueloRestController {

    @Autowired
    public VueloRestController(com.example.JFigueroaAeromexico.dao.VueloDAOImplementation vueloDAOImplementation) {
        this.vueloDAOImplementation = vueloDAOImplementation;
    }
    private final VueloDAOImplementation vueloDAOImplementation;

    @GetMapping("")
    public ResponseEntity<List<Vuelo>> getAll() {
        List<Vuelo> vuelos = this.vueloDAOImplementation.getAll();
        return ResponseEntity.ok(vuelos);
    }

    @GetMapping("/fechas")
    public ResponseEntity<List<Vuelo>> getByFecha(@RequestParam("start")@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime start, @RequestParam("end")@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime end) {

        List<Vuelo> vuelos = this.vueloDAOImplementation.findByFecha(start, end);
        return ResponseEntity.ok(vuelos);
    }
}
