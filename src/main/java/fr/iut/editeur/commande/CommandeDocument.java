package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Classe qui s'occupe de gérer la classe Document
 */
public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * permet l'éxécution de la classe Document
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
