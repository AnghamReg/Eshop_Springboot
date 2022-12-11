# Eshop_Springboot
Si vous voulez tester avec POSTMAN :

1) Ajout des produits :

Avec la méthode POST :
http://localhost:8080/produit/ajouter

{
    "id" : 1,
    "nom":"Chaise a bois",
    "prix":25,
    "qte": 10
}


{
    "id" : 2,
    "nom":"Jouet",
    "prix":10,
    "qte": 4
}

{
    "id" : 3,
    "nom":"Clavier gaming",
    "prix":80,
    "qte": 8
}
______________________________________________

2) Consulter la liste des produits :

Avec la méthode GET :
http://localhost:8080/produit/listeProduits
______________________________________________

3) Modifier le prix d'un produit :

Avec la méthode PUT :
http://localhost:8080/produit/modifier/1

{
    "id" : 1,
    "nom":"Chaise a bois",
    "prix":20,
    "qte": 10
}

puis on vérifie.
_______________________________________________

4) Créer un compte :

Avec la méthode POST :
http://localhost:8080/compte/ajouter

{
    "nom" : "Angham",
    "prenom":"Regaieg",
    "email":"angham.regaieg@gmail.com",
    "mdp": "bonjour"
}

{
    "nom" : "Alex",
    "prenom":"Fen",
    "email":"Alex.Fen@gmail.com",
    "mdp": "salut"
}
__________________________________________________
5) Consulter la liste des comptes :

Avec la méthode GET :
http://localhost:8080/compte/listeComptes
___________________________________________________
6) Un utilisateur veut changer son mdp :

Avec la méthode PUT:
http://localhost:8080/compte/modifier/idUtilisateur
___________________________________________________
7) Un utilisateur veut se connecter :

Avec la méthode GET :
http://localhost:8080/compte/seConnecter/angham.regaieg@gmail.com/123456
___________________________________________________

8) Un utilisateur veut acheter un produit :

Avec la méthode PUT :
http://localhost:8080/produit/modifier/1


{
    "id" : 1,
    "nom":"Chaise a bois",
    "prix":20,
    "qte": 6
}

puis on vérifie.
