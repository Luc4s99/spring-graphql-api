package br.com.biomas.repository;

import br.com.biomas.model.Biome;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BiomeRepository extends JpaRepository<Biome, UUID> {
}
