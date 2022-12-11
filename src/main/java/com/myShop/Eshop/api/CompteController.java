package com.myShop.Eshop.api;

import com.myShop.Eshop.model.Compte;
import com.myShop.Eshop.service.compte.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/compte")
@RestController
public class CompteController {
    private final CompteService compteService;

    @Autowired
    public CompteController(CompteService compteService) {
        this.compteService = compteService;
    }

    //en tant qu'un administrateur
    @PostMapping("/ajouter")
    public  void ajouterCompte(@RequestBody Compte compte){
        compteService.ajouterCompte(compte);
    }

    @GetMapping("/listeComptes")
    public List<Compte> getTousComptes(){
        return  compteService.getTousComptes();
    }

    @GetMapping(path = "/{id}")
    public Compte getCompteParId(@PathVariable("id")  UUID id){
    return compteService.getCompteParId(id).orElse(null);
    }

    //en tant qu'un utilisateur
    @GetMapping(path = "/seConnecter/{email}/{mdp}")
    public Compte getCompteParEmailEtMdp(@PathVariable("email")  String email,@PathVariable("mdp")  String mdp){
        return compteService.seConnecter(email,mdp).orElse(null);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerCompteParId(@PathVariable("id") UUID id){
        compteService.supprimerCompte(id);
    }


    @PutMapping("/modifier/{id}")
    public void updateCompte(@PathVariable("id") UUID id,@RequestBody Compte compteToUpdate){
        compteService.modifierCompte(id,compteToUpdate);
    }
}
