package org.example.avions;

import org.example.visitors.AvionVisitor;

public interface Avion {
    public void acceptVisitor(AvionVisitor visitor);
}
