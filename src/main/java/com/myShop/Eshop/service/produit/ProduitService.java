package com.myShop.Eshop.service.produit;

import com.myShop.Eshop.dao.compte.produit.ProduitDao;
import com.myShop.Eshop.model.Compte;
import com.myShop.Eshop.model.Produit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProduitService {
    private ProduitDao produitDao;

    public ProduitService(@Qualifier("fakeDaoProduit") ProduitDao produitDao) {
        this.produitDao = produitDao;
    }

    public int ajouterProduit(Produit produit){
        return produitDao.insererProduit(produit.getId(),produit);
    }

    public List<Produit> getTousProduits(){
        return  produitDao.getTousProduits();
    }

    public Optional<Produit> getProduitParId(int id){
        return  produitDao.selectionnerProduitParId(id);
    }

    public Integer modifierPrix(int id,Produit produit){
        return produitDao.modifierPrix(id,produit);
    }


    public void supprimerProduit(int id) {
        produitDao.supprimerProduit(id);
    }
}
