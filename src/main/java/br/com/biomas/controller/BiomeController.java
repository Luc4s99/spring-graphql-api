package br.com.biomas.controller;

import br.com.biomas.model.Biome;
import br.com.biomas.service.BiomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class BiomeController {

    @Autowired
    private BiomeService biomeService;

    @QueryMapping
    public List<Biome> getBiomes() {

        return biomeService.getAllBiomes();
    }

    @QueryMapping
    public Biome getBiomeById(@Argument String id){

        return biomeService.getBiomeById(UUID.fromString(id));
    }

    @MutationMapping
    public Biome addBiome(@Argument Biome biome) {

        return biomeService.saveBiome(biome);
    }

    @MutationMapping
    public String deleteBiome(@Argument UUID uuid) {

        biomeService.delete(uuid);
        return uuid.toString();
    }
}
