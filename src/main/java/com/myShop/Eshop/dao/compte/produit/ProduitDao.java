package com.myShop.Eshop.dao.compte.produit;

import com.myShop.Eshop.model.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitDao {

    int insererProduit(int id, Produit produit);


    public List<Produit> getTousProduits();

    Optional<Produit> selectionnerProduitParId(int id);

    Integer modifierPrix(int id, Produit produit);

    int supprimerProduit(int id);
}
