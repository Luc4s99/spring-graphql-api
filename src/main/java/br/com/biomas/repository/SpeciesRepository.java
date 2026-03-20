package br.com.biomas.repository;

import br.com.biomas.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpeciesRepository extends JpaRepository<Species, UUID> {
}
