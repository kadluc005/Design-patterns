package org.example.visitors;

import org.example.avions.Avion;
import org.example.avions.AvionCargo;
import org.example.avions.AvionMilitaire;
import org.example.avions.AvionPassagers;

public interface AvionVisitor {
    public void visit(AvionCargo avion);
    public void visit(AvionMilitaire avion);
    public void visit(AvionPassagers avion);
}
