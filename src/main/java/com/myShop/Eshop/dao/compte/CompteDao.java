package com.myShop.Eshop.dao.compte;

import com.myShop.Eshop.model.Compte;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CompteDao {

    int insererPersonne(UUID id, Compte compte);
    default int insererPersonne(Compte compte){
    UUID id=UUID.randomUUID();
    return  insererPersonne(id,compte);
    }
    //en tant qu'un administrateur
    public List<Compte> getTousComptes();

    Optional<Compte> selectionnerCompteParId(UUID id);
    int supprimerCompteParId(UUID id);
    int modifierCompteParId(UUID id, Compte compte);

    //en tant qu'un utilisateur
    Optional<Compte> seConnecter(String email,String mdp);
}
