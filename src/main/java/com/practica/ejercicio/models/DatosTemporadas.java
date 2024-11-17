package com.practica.ejercicio.models;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DatosTemporadas(
        @JsonAlias("Season") Integer numero,
        @JsonAlias("Episodes") List<DatosEpisodio> episodios
) {
}
