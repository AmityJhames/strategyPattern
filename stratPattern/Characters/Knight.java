package stratPattern.Characters;

import stratPattern.Moves.*;

public class Knight implements ImpStrat {
    @Override
    public String attack() {
        SwingSword swingSword = new SwingSword();

        return "KNIGHT IS ATTACKING..." + swingSword.toAttack();
    }

    @Override
    public String defend() {
        CreateMagicBarrier castMagicBarrier = new CreateMagicBarrier();
        Dodge dodge = new Dodge();
        Shield shield = new Shield();

        return "...KNIGHT IS DEFENDING:" + shield.toDefend() +
                "\n" + dodge.toDefend() + "\n" + castMagicBarrier.toDefend();
    }
}
