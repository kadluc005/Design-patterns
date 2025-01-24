package org.example.avions;

import org.example.visitors.AvionVisitor;

public class AvionCargo implements Avion{
    private String cargaison;

    public AvionCargo(String cargaison) {
        this.cargaison = cargaison;
    }

    public String getCargaison() {
        return cargaison;
    }

    @Override
    public void acceptVisitor(AvionVisitor visitor) {
        visitor.visit(this);
    }
}
