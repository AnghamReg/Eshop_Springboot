package com.myShop.Eshop.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Compte {
    private UUID id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;

    public Compte(@JsonProperty("id") UUID id,
                  @JsonProperty("nom") String nom,
                  @JsonProperty("prenom") String prenom,
                  @JsonProperty("email") String email,
                  @JsonProperty("mdp") String motDePasse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public UUID getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }
}
