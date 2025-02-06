package stratPattern.Characters;

import stratPattern.Moves.ImpStrat;
import stratPattern.Moves.Shield;
import stratPattern.Moves.ShootArrows;

public class Archer implements ImpStrat {
    @Override
    public String attack() {
        ShootArrows shootArrows = new ShootArrows();
        return "ARCHER IS ATTACKING..." + shootArrows.toAttack();

    }

    @Override
    public String defend() {
        Shield shield = new Shield();

        return "...ARCHER IS DEFENDING" + shield.toDefend();
    }
}
