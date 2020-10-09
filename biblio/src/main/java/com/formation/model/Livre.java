package com.formation.model;

import java.util.*;
public class Livre {


    private Integer id;
    private String titre;
    private String categorie ;
    private String isbn ;
    private String nomAuteur ;
    private String prenomAuteur ;
    private String code ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Le Titre
    public void setTitre (String valeur) {
        titre = valeur ;
    }
    // La cat�gorie
    public void setCategorie (String valeur) {
        categorie = valeur;
    }
    // Le num�ro ISBN
    public void setIsbn (String valeur) {
        isbn =valeur;
    }
    // Le nom de l'auteur
    public void setNomAuteur (String valeur) {
        nomAuteur =valeur;
    }
    // Le pr�nom de l'auteur
    public void setPrenomAuteur (String valeur) {
        prenomAuteur =valeur;
    }

    //Le titre
    public String getTitre () {
        return titre;
    }
    // La cat�gorie
    public String getCategorie () {
        return categorie;
    }
    // Le num�ro ISBN
    public String getIsbn () {
        return isbn;
    }
    // Le nom de l'auteur
    public String getNomAuteur () {
        return nomAuteur;
    }
    // Le pr�nom de l'auteur
    public String getPrenomAuteur () {
        return prenomAuteur;
    }
    // Le code d'enregistrement
    public String getCode() {
        code= setCode ();
        return code;
    }


    private String setCode () {
        String debutNom;
        String debutPrenom;
        String debutCategorie;
        int longueurIsbn;
        String finIsbn;

        debutNom=nomAuteur.substring(0,2);
        debutPrenom=prenomAuteur.substring(0,2);
        debutCategorie=categorie.substring(0,2);
        longueurIsbn=isbn.length();
        finIsbn=isbn.substring((longueurIsbn-2),longueurIsbn);
        return debutNom+debutPrenom+debutCategorie+finIsbn;

    }


    public Livre() {
        /*Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrez le titre : ");
        setTitre(lectureClavier.next());
        System.out.print("Entrez la categorie : ");
        setCategorie(lectureClavier.next());
        System.out.print("Entrez le nom de l'auteur : ");
        setNomAuteur(lectureClavier.next());
        System.out.print("Entrez le prenom de l'auteur : ");
        setPrenomAuteur(lectureClavier.next());
        System.out.print("Entrez le numero ISBN : ");
        setIsbn(lectureClavier.next());*/
    }


    public Livre(String t, String c, String na, String pa, String i) {
        setTitre(t);
        setCategorie(c);
        setNomAuteur(na);
        setPrenomAuteur(pa);
        setIsbn(i);
    }

    public void afficherUnLivre(){
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + nomAuteur + " " + prenomAuteur);
        System.out.println("Categorie : " + categorie);
        System.out.println("ISBN : " + isbn);

        System.out.println("Code : " + getCode());
    }



    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", categorie='" + categorie + '\'' +
                ", isbn='" + isbn + '\'' +
                ", nomAuteur='" + nomAuteur + '\'' +
                ", prenomAuteur='" + prenomAuteur + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
