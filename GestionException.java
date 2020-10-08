package com.formation;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class GestionException {
    final static Logger logger = Logger.getLogger(GestionException.class);


    public static void main(String[] args) {



        logger.info("Debut du programme");


        gestionRunTimeException();
/*
        try {
            gestionExceptionControleWithThrow();
        } catch (FileNotFoundException e) {
            logger.error("Exception with Throw : ouverture de fichier",e);
        }
*/


        logger.info("Fin du programme");
    }

    private static void gestionExceptionControle() {
        try{
            FileInputStream monFichier = new FileInputStream("c:\\toto.txt");
        } catch (FileNotFoundException e) {
           logger.error("Exception : ouverture de fichier",e);
        }
    }

    private static void gestionExceptionControleWithThrow() throws FileNotFoundException {

            FileInputStream monFichier = new FileInputStream("c:\\toto.txt");

    }

    private static void gestionRunTimeException() {
        int a = 1;
        int b=0;
        logger.info("Debut du block try");
        try{

            try {
                testEAN(8);
            } catch (MonException e) {
                logger.error("Exception personalisé  ",e);
            }

            int d = a/b;
            logger.debug("Aucune erreur declanché");

        }catch(ArithmeticException e){
            logger.info("Debut du block catch");
            //System.out.println("Exception division par zero ! impossible");
            logger.error("Exception division par zero ! impossible",e);
        }
    }

    private static void testEAN(int value) throws MonException {
        if (value<13) {
            throw new MonException("13");
        }
    }
}
