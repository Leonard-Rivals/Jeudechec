package Pieces;

import java.awt.*;

public abstract class Piece {
    private int valeur;
    private boolean estBalnc;

    public Piece(boolean estBlanc) {
        this.estBalnc = estBlanc;
    }

    //public abstract void mouvement(Point depart, Point arrivee);
    public boolean estBlanc(){
        return estBalnc;
    }
    //public  abstract boolean mouvementValide(Point depart, Point arrivee);





}
