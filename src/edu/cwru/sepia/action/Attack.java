package edu.cwru.sepia.action;

import edu.cwru.sepia.environment.model.state.Unit;

/**
 * This class represents an attack action performed by a friendly footman unto an enemy footman.
 */
public class Attack extends TargetedAction {

    private final Unit.UnitView F;  // friendly footman
    private final Unit.UnitView E;  // enemy footman

    public Attack(Unit.UnitView F, Unit.UnitView E) {
        super(F.getID(), ActionType.COMPOUNDATTACK, E.getID());
        this.F = F;
        this.E = E;
    }

    @Override
    public String toString() {
        return "Attack(F=" + this.F.getID() + ", E=" + this.E.getID() + ")";
    }

}
