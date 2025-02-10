package com.example.pokemonapi.service;

import com.example.pokemonapi.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;

    public PokemonService() {
        this.restTemplate = new RestTemplate();
    }

    public Pokemon getPokemonByName(String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        return restTemplate.getForObject(url, Pokemon.class);
    }
}
