package com.example.ProjetoEstudoMaven.Repository;

import com.example.ProjetoEstudoMaven.Entity.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicaRepository extends JpaRepository<Musica, Integer> {
    List<Musica> findMusicaByNomeLike(String nome);

    List<Musica> findMusicaByNotaGreaterThan(Double nota);
}
