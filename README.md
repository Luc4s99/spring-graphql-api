# spring-graphql-api
Estudos em graphql utilizando a linguagem java juntamente com spring framework. O console graphiql pode ser acessado através do recurso: **/graphiql**

# Alguns exemplos de querys que podem ser realizadas:

- Consultar um bioma:

```
{
  getBiomeById(id: "43198762-e527-47b3-8935-1e34e0a47764") {
    name
    location
  }
}
```

- Adicionar um bioma:

```
mutation {
  
  addBiome(biome:  {
     name: "Savana"
     location: "Africa"
  }) {

    name
  }
}
```

- Deletar uma espécie:

```
mutation {
  
  deleteSpecies(uuid: "b7106f3e-79ea-4f2d-aed9-943433942340")
}
```
