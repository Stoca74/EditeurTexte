package fr.iut.editeur.document;

/**
 * Classe qui répertorie les différentes fonctionnalités
 */
public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * ajoute texte au texte déjà écrit et si pas de texte écrit ajoute juste le texte
     * @param texte le texte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * fonction qui remplace le texte de start à end par remplacement
     * @param start l'endroit où commence la modification
     * @param end la fin de la modification
     * @param remplacement le texte à mettre à la place de l'ancien
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String majPart = texte.substring(start, end);
        majPart = majPart.toUpperCase();
        remplacer(start, end, majPart);
    }

    public void effacer(int start, int end){
        remplacer(start, end, "");
    }

    /**
     * efface tout
     */
    public void clear(){
        texte = "";
    }
}
