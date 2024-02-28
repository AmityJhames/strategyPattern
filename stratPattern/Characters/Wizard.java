package stratPattern.Characters;

import stratPattern.Moves.CastSpell;
import stratPattern.Moves.CreateMagicBarrier;
import stratPattern.Moves.ImpStrat;

public class Wizard implements ImpStrat {
   @Override
    public String attack() {
        CastSpell castSpell = new CastSpell();
        return "WIZARD IS ATTACKING:" + castSpell.toAttack();
    }

  @Override
   public String defend() {
        CreateMagicBarrier createMagicBarrier = new CreateMagicBarrier();

        return "WIZARD IS DEFENDING:" + createMagicBarrier.toDefend();
    }
}
