package com.myShop.Eshop.api;

import com.myShop.Eshop.model.Produit;
import com.myShop.Eshop.service.produit.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/produit")
@RestController
public class ProduitController {

    private final ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @PostMapping("/ajouter")
    public void ajouterProduit(@RequestBody Produit produit){
        produitService.ajouterProduit(produit);
    }

    @GetMapping("/listeProduits")
    public List<Produit> getTousProduits(){
        return produitService.getTousProduits();
    }

    @GetMapping("{id}")
    public Produit getProduitParId(@PathVariable int id){
        return produitService.getProduitParId(id).orElse(null);
    }

    @PutMapping("/modifier/{id}")
    public void modifierPrix(@PathVariable("id")  int id,@RequestBody Produit produit){
        produitService.modifierPrix(id,produit);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerProduitParId(@PathVariable("id") int id){
        produitService.supprimerProduit(id);
    }

}
