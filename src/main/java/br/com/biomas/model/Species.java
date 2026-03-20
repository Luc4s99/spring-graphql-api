package br.com.biomas.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "species")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid")
    private UUID uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "isEndemic")
    private Boolean isEndemic;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "biome", referencedColumnName = "uuid")
    private Biome biome;

    public Species() {

    }

    public Species(String name, Boolean isEndemic, Biome biome) {
        this.name = name;
        this.isEndemic = isEndemic;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsEndemic() {
        return isEndemic;
    }

    public void setIsEndemic(Boolean endemic) {
        isEndemic = endemic;
    }

    public Biome getBiome() {
        return biome;
    }

    public void setBiome(Biome biome) {
        this.biome = biome;
    }
}
