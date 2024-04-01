package com.example.ProjetoEstudoMaven.Controller;

import com.example.ProjetoEstudoMaven.Entity.Musica;
import com.example.ProjetoEstudoMaven.Repository.MusicaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
    private final MusicaRepository musicaRepository;

    public MusicaController(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    @PostMapping
    public ResponseEntity<Musica> cadastrar(@RequestBody Musica musica){
        return ResponseEntity.status(201).body(this.musicaRepository.save(musica));
    }

    @GetMapping
    public ResponseEntity<List<Musica>> listar(){
        List<Musica> musicas = this.musicaRepository.findAll();
        return !musicas.isEmpty() ? ResponseEntity.status(200).body(musicas) : ResponseEntity.status(204).build();
    }

    @GetMapping("buscarPorNome/{nome}")
    public ResponseEntity<List<Musica>> buscarPorNome(@PathVariable String nome){
        List<Musica> musicas = this.musicaRepository.findMusicaByNomeLike(nome);
        return !musicas.isEmpty() ? ResponseEntity.status(200).body(musicas) : ResponseEntity.status(204).build();
    }

    @GetMapping("buscarPorNota/{nota}")
    public ResponseEntity<List<Musica>> buscarPorNota(@PathVariable Double nota){
        List<Musica> musicas = this.musicaRepository.findMusicaByNotaGreaterThan(nota);
        return !musicas.isEmpty() ? ResponseEntity.status(200).body(musicas) : ResponseEntity.status(204).build();
     }

    @PutMapping("/{id}")
    public ResponseEntity<Musica> editar(@PathVariable int id, @RequestBody Musica musica){
        if(this.musicaRepository.existsById(Integer.valueOf(id))){
            musica.setId(id);
            return ResponseEntity.status(200).body(this.musicaRepository.save(musica));
        }
        return ResponseEntity.status(400).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable int id){
        if(this.musicaRepository.existsById(Integer.valueOf(id))){
            this.musicaRepository.deleteById(Integer.valueOf(id));
            return ResponseEntity.status(204).body("Musica deletada com sucesso.");
        }
        return ResponseEntity.status(404).body("id inválido, revise!!");
    }
}
