package com.myShop.Eshop.dao.compte;

import com.myShop.Eshop.model.Compte;
import com.myShop.Eshop.model.Produit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class CompteDataAccessService implements CompteDao{
    private static List<Compte> db=new ArrayList<Compte>();

    @Override
    public int insererPersonne(UUID id, Compte compte) {
        db.add(new Compte(id, compte.getNom(), compte.getPrenom(), compte.getEmail(), compte.getMotDePasse()));
        return 1;
    }

    @Override
    public List<Compte> getTousComptes() {
        return db;
    }

    @Override
    public Optional<Compte> selectionnerCompteParId(UUID id) {
        return db.stream()
                .filter(compte -> compte.getId().equals(id))
                .findFirst();
    }

    public Optional<Compte> seConnecter(String email,String mdp) {

            return db.stream()
                .filter(compte -> (compte.getMotDePasse().equals(mdp)&&compte.getEmail().equals(email)))
                .findFirst();
    }


    @Override
    public int supprimerCompteParId(UUID id) {
        Optional<Compte> compteMaybe=selectionnerCompteParId(id);
        if(compteMaybe.isEmpty()){
            return 0;
        }
        db.remove(compteMaybe.get());
        return 1;
    }

    @Override
    public int modifierCompteParId(UUID id, Compte nouveauCompte) {
        for(int i=0;i<db.size();i++)
        {
            Compte c=db.get(i);
            if(c.getId().equals(id)){
                db.set(i,nouveauCompte);
                return 1;
            }
        }
        return 0;
    }


}
