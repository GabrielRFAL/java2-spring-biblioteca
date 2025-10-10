package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
    public Optional<Genero> findByNome(String nome);
}
