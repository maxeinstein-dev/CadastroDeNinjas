package br.com.maxsueleinstein.cadastrodeninjas.repository;

import br.com.maxsueleinstein.cadastrodeninjas.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}