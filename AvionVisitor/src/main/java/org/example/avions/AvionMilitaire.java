package org.example.avions;

import org.example.visitors.AvionVisitor;

public class AvionMilitaire implements Avion{
    private String mission;

    public AvionMilitaire(String mission) {
        this.mission = mission;
    }

    public String getMission() {
        return mission;
    }


    @Override
    public void acceptVisitor(AvionVisitor visitor) {
        visitor.visit(this);
    }
}
