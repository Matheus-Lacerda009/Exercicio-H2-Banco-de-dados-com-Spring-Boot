package com.example.h2exgamer.service;

import com.example.h2exgamer.model.Gamer;
import com.example.h2exgamer.repository.GamerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GamerService {
        private final GamerRepository repository;

        public List<Gamer> listar(){
            return repository.findAll();
        };
        //buscar pelo id
        public Gamer buscarPorId(Long id){
            return repository.findById(id).orElseThrow(() -> new RuntimeException("Gamer não encontrado"));
        }

        public Gamer salvar(Gamer gmr){
            return repository.save(gmr);
        }

        public Gamer atualizar(Long id, Gamer dados){
            Gamer gmr = buscarPorId(id);
            gmr.setNickname(dados.getNickname());
            gmr.setEmail(dados.getEmail());
            gmr.setJogoFavorito(dados.getJogoFavorito());
            gmr.setNivel(dados.getNivel());
            return repository.save(gmr);
        }

        public void excluir(Long id){
            repository.deleteById(id);
        }
}
