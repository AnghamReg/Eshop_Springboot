package com.myShop.Eshop.dao.compte.produit;


import com.myShop.Eshop.model.Produit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDaoProduit")
public class ProduitDataAccessService implements ProduitDao {
    private static List<Produit> db=new ArrayList<Produit>();
    @Override
    public int insererProduit(int id, Produit produit) {
        db.add(new Produit(id,produit.getNom(),produit.getPrix(),produit.getQuantite()));
        return 1;
    }

    @Override
    public List<Produit> getTousProduits() {
        return db;
    }

    @Override
    public Optional<Produit> selectionnerProduitParId(int id) {
        return db.stream()
                .filter(produit -> produit.getId()==id)
                .findFirst();
    }

    private Produit chercherParId(int id){
        for(Produit i:db){
            if(i.getId()==id)
                return i;
        }
        return null;
    }

    private Produit changerPrix(float prix,Produit produit){
        Produit p=produit;
         p.setPrix(prix);
         return  p;
    }

    @Override
    public Integer modifierPrix(int id, Produit nouveauProduit) {
        for(int i=0;i<db.size();i++)
        {
            Produit p=db.get(i);
            if(p.getId()==id){
                db.set(i,nouveauProduit);
                return 1;
            }
        }
        return 0;
    }

  public int supprimerProduit(int id){
      Optional<Produit> produitMaybe=selectionnerProduitParId(id);
      if(produitMaybe.isEmpty()){
          return 0;
      }
      db.remove(produitMaybe.get());
      return 1;
  }


}
