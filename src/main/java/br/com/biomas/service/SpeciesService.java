package br.com.biomas.service;

import br.com.biomas.model.Species;
import br.com.biomas.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class SpeciesService {

    @Autowired
    private SpeciesRepository speciesRepository;

    @Transactional
    public Species getSpeciesById(UUID speciesId) {

        return speciesRepository.findById(speciesId).orElse(null);
    }

    @Transactional
    public List<Species>  getAllSpecies() {

        return speciesRepository.findAll();
    }

    @Transactional
    public Species saveSpecies(Species species) {

        return speciesRepository.save(species);
    }

    @Transactional
    public void delete(UUID uuid) {

        speciesRepository.deleteById(uuid);
    }
}
