package com.novinha.sdw2023;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
//import java.util.List;

@Data // Gera Getters, Setters, toString, equals e hashCode
@Entity(name = "tb_user")
public class Sdw2023Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Em uma aplicação real, você teria mais atributos, como os das entidades Card e Account.
    // Por exemplo:
    // @OneToOne(cascade = CascadeType.ALL)
    // private Account account;
    // @OneToOne(cascade = CascadeType.ALL)
    // private Card card;
    // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // private List<Feature> features;
    // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // private List<News> news;

    // A classe completa do projeto original da DIO inclui essas relações.
    // Para este exercício, o ID e o nome já são suficientes para testar o fluxo.
}