package com.formation;

import com.formation.dao.LivreDAO;
import com.formation.dao.LivreDAOImpl;
import com.formation.model.Livre;
import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class Bibliotheque {

    public static void main(String [] arg){
        LivreDAO livreDao = new LivreDAOImpl();
        Scanner lectureClavier = new Scanner(System.in);

        Livre livrePoche = new Livre();

        System.out.print("Entrez le titre : ");
        livrePoche.setTitre(lectureClavier.next());
        System.out.print("Entrez la categorie : ");
        livrePoche.setCategorie(lectureClavier.next());
        System.out.print("Entrez le nom de l'auteur : ");
        livrePoche.setNomAuteur(lectureClavier.next());
        System.out.print("Entrez le prenom de l'auteur : ");
        livrePoche.setPrenomAuteur(lectureClavier.next());
        System.out.print("Entrez le numero ISBN : ");
        livrePoche.setIsbn(lectureClavier.next());


        System.out.print("Code du livre " + livrePoche.getTitre()+ " : ");
        System.out.println(livrePoche.getCode());

        livrePoche.afficherUnLivre();

/*

        Livre unPolar = new Livre("Le myst�re de la chambre jaune","Leroux", "Gaston", "Policier", "2253005495");
        unPolar.afficherUnLivre();*/

        livreDao.insert(livrePoche);

      /*  List<Livre>  listeLivre = new ArrayList<Livre>();
        listeLivre.add(livrePoche);
        listeLivre.add(unPolar);*/

        //exportLivresToTextFile(listeLivre);

        //exportLivreToCSV(listeLivre);


        List<Livre>  livres =  livreDao.getAllLivres();

        for(Livre livre:livres){
            System.out.println(livre);
        }




    }

    private static void exportLivreToCSV(List<Livre> listeLivre) {
        List<String[]> livreTitles = new ArrayList<>();
        for(Livre l:listeLivre){
            String[] livre = new String[3];
            livre[0] = l.getCode();
            livre[1] = l.getTitre();
            livre[2] = l.getNomAuteur();
            livreTitles.add(livre);
        }

        String fileName = "src/main/resources/livres.csv";

        try (FileOutputStream fos = new FileOutputStream(fileName);
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             CSVWriter writer = new CSVWriter(osw)) {

            writer.writeAll(livreTitles);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void exportLivresToTextFile(List<Livre> listeLivre) {
        try {
            FileWriter writer = new FileWriter("src/main/resources/livres.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);


            for(Livre l:listeLivre){
                bufferedWriter.write(l.toString());
                bufferedWriter.newLine();

            }

          /*  bufferedWriter.write("Une ligne de plus");
            bufferedWriter.newLine();
            bufferedWriter.write("encore une ligne!");
*/
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
