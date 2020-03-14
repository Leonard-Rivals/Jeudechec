package Pieces;

import java.awt.*;

public abstract class Piece {
    private int valeur;
    private boolean estBalnc;
    public abstract void mouvement(Point depart, Point arrivee);
    public abstract boolean estBlanc();
    public  abstract boolean mouvementValide(Point depart, Point arrivee);





}
