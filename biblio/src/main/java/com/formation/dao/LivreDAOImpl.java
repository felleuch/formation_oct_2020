package com.formation.dao;

import com.formation.model.Livre;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivreDAOImpl implements  LivreDAO{

    final static Logger logger = Logger.getLogger(LivreDAOImpl.class);

    private static String url = "jdbc:mysql://localhost:3306/biblio";
    private static String user = "root";
    private static String password = "root";
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet rs=null;

    public LivreDAOImpl(){
        logger.info("Tentative de connection a la base de donnee");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password) ;
            logger.info("Connexion a " + url + " avec succès");
        } catch (ClassNotFoundException notFoundException) {
            notFoundException.printStackTrace();
            logger.error("Erreur de connecxion",notFoundException);
        } catch (SQLException sqlException) {
           logger.error("Erreur de connecxion",sqlException);

        }

    }


    public List<Livre> getAllLivres(){
        logger.info("DEBUT getAllLivres()");
        List<Livre>  livres = new ArrayList<Livre>();
        String sql = "select * from livre";

        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                //System.out.println("Titre : "+rs.getString("name"));
                //System.out.println("Titre : "+rs.getString("role"));
                Livre livre = new Livre();
                livre.setId(rs.getInt("id"));
                livre.setTitre(rs.getString("titre"));
                livre.setCategorie(rs.getString("categorie"));
                livres.add(livre);
            }
        } catch (SQLException e) {
            logger.error("Erreur d execution de la requete",e);
        }
        logger.info("recuperation de "+livres.size()+" livres");
        return livres;

    }
    public void insert(Livre livre){
        try {
            statement = connection.createStatement();

            String sql = "INSERT INTO biblio.livre (titre,categorie,isbn,nom_auteur,prenom_auteur,code)\n" +
                    "\tVALUES ('"+livre.getTitre()+"','"+livre.getCategorie()+"','"+livre.getIsbn()+"','"+livre.getNomAuteur()+"','"+livre.getPrenomAuteur()+"','"+livre.getCode()+"');";

            int result = statement.executeUpdate(sql);

        } catch (SQLException e) {
            logger.error("Erreur d insertion",e);
        }
    }

    public void updateLivre(Livre livre){

    }

    public Livre getLivreById(){
        return null;
    }



    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
