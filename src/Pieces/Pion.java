package Pieces;

import java.awt.*;

public class Pion implements Piece {

    private int valeur;
    private boolean estBalnc;
    @Override
    public void mouvement(Point depart, Point arrivee) {

    }

    @Override
    public boolean estBlanc() {
        return estBalnc;
    }
}
