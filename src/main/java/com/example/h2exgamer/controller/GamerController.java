package com.example.h2exgamer.controller;

import com.example.h2exgamer.model.Gamer;
import com.example.h2exgamer.service.GamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gamer")
@RequiredArgsConstructor
public class GamerController {
    private final GamerService service;

    @GetMapping
    public List<Gamer> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gamer> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Gamer> salvar(@RequestBody Gamer gmr){
        return ResponseEntity.ok(service.salvar(gmr));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gamer> atualizar(@PathVariable Long id, @RequestBody Gamer dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}