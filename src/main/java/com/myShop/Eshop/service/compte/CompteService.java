package com.myShop.Eshop.service.compte;

import com.myShop.Eshop.dao.compte.CompteDao;
import com.myShop.Eshop.model.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CompteService {
    private final CompteDao compteDao;

    @Autowired
    public CompteService(@Qualifier("fakeDao") CompteDao compteDao) {
        this.compteDao = compteDao;
    }

    public int ajouterCompte(Compte compte){
        return compteDao.insererPersonne(compte);
    }

    public List<Compte> getTousComptes(){
        return  compteDao.getTousComptes();
    }

    public Optional<Compte> getCompteParId(UUID id){
        return  compteDao.selectionnerCompteParId(id);
    }

    public Optional<Compte> seConnecter(String email,String mdp){
        return  compteDao.seConnecter(email,mdp);
    }

    public  int supprimerCompte(UUID id){
        return compteDao.supprimerCompteParId(id);
    }

   public int modifierCompte(UUID id, Compte nouveauCompte){
       return compteDao.modifierCompteParId(id,nouveauCompte);
    }
}
