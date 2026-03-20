package br.com.biomas.service;

import br.com.biomas.model.Biome;
import br.com.biomas.repository.BiomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BiomeService {

    @Autowired
    private BiomeRepository biomeRepository;

    @Transactional
    public Biome saveBiome(Biome biomeToSave) {

        return biomeRepository.save(biomeToSave);
    }

    @Transactional
    public void delete(UUID biomeId) {

        biomeRepository.deleteById(biomeId);
    }

    @Transactional
    public Biome getBiomeById(UUID biomeId) {

        Optional<Biome> biomeRet = biomeRepository.findById(biomeId);

        return biomeRet.orElse(null);
    }

    @Transactional
    public List<Biome> getAllBiomes() {
        return biomeRepository.findAll();
    }
}
