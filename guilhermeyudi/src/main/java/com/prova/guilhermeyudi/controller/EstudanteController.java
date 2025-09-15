package com.prova.guilhermeyudi.controller;

import com.prova.guilhermeyudi.business.EstudanteService;
import com.prova.guilhermeyudi.infrastructure.entity.Estudante;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/estudante")
@RestController
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public ResponseEntity<Estudante> createEstudante(@RequestBody Estudante estudante){
        return ResponseEntity.ok(estudanteService.createEstudante(estudante));
    }

    @GetMapping
    public ResponseEntity<List<Estudante>> procurarEstudante(){
        return ResponseEntity.ok(estudanteService.getAllEstudante());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Estudante>> procurarEstudante(@PathParam("id") Long id){
        return ResponseEntity.ok(estudanteService.getByIdEstudante(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEstudante(@PathVariable Long id){
        estudanteService.deleteByIdEstudante(id);
        return ResponseEntity.ok().build();
    }

}
