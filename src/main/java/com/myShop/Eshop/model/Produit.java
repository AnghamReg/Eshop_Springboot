package com.myShop.Eshop.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Produit {
    private int id;
    private String nom;
    private float prix;
    private int quantite;

    public Produit(@JsonProperty("id") int id,
                   @JsonProperty("nom") String nom,
                   @JsonProperty("prix") float prix,
                   @JsonProperty("qte") int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public boolean consommerProduit(Compte compte,int nb){
        if(nb<quantite) {
            quantite -= nb;
            return true;
        }
        else return false;
    }

    public void setPrix(float prix){
        this.prix=prix;
    }
}
