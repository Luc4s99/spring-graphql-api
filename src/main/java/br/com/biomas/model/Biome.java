package br.com.biomas.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "biomes")
public class Biome {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid")
    private UUID uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;

    public Biome() {

    }

    public Biome(String name, String location) {
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
