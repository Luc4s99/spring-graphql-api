package br.com.biomas.controller;

import br.com.biomas.model.Species;
import br.com.biomas.service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class SpeciesController {

    @Autowired
    private SpeciesService speciesService;

    @QueryMapping
    public List<Species> getSpecies() {

        return speciesService.getAllSpecies();
    }

    @QueryMapping
    public Species getSpeciesById(@Argument String id){

        return speciesService.getSpeciesById(UUID.fromString(id));
    }

    @MutationMapping
    public Species addSpecies(@Argument Species species) {

        return speciesService.saveSpecies(species);
    }

    @MutationMapping
    public String deleteSpecies(@Argument UUID uuid) {

        speciesService.delete(uuid);
        return  uuid.toString();
    }
}
