package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Classe qui s'occupe de la fonction clear
 */
public class CommandeClear extends CommandeDocument{

    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        this.document.clear();
        super.executer();
    }
}