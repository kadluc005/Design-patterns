package org.example.avions;

import org.example.visitors.AvionVisitor;

public class AvionPassagers implements Avion{


    private int nbrPassagers;

    public AvionPassagers(int nbrPassagers) {
        this.nbrPassagers = nbrPassagers;
    }

    public int getNbrPassagers() {
        return nbrPassagers;
    }


    @Override
    public void acceptVisitor(AvionVisitor visitor) {
        visitor.visit(this);
    }
}
