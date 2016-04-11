package edu.cwru.sepia.action;

import edu.cwru.sepia.environment.model.state.Unit;

/**
 * This class represents an attack action performed by a friendly footman unto an enemy footman.
 */
public class Attack extends TargetedAction {

    private final Unit.UnitView F;  // friendly footman
    private final Unit.UnitView E;  // enemy footman
    private final int f;  // friendly footman ID
    private final int e;  // enemy footman ID

    public Attack(Unit.UnitView F, Unit.UnitView E) {
        super(F.getID(), ActionType.COMPOUNDATTACK, E.getID());
        this.F = F;
        this.E = E;
        this.f = F.getID();
        this.e = E.getID();
    }

    @Override
    public String toString() {
        return "Attack(F=" + this.f + ", E=" + this.e + ")";
    }

}
