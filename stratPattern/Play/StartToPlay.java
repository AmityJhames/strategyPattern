package stratPattern.Play;

import stratPattern.Characters.Archer;
import stratPattern.Characters.Knight;
import stratPattern.Characters.Wizard;
import stratPattern.Moves.CharacterMove;


public class StartToPlay {
    public static void main(String[] args) {

        CharacterMove oneArcher = new CharacterMove(new Archer());
        CharacterMove oneKnight = new CharacterMove(new Knight());
        CharacterMove oneWizard = new CharacterMove(new Wizard());

        System.out.println(oneKnight.attack() + "\n\n" + oneWizard.defend() + "\n\n"
                          + oneArcher.attack() +"\n\n" + oneKnight.defend() + "\n\n"
                          + oneWizard.attack() + "\n\n"+ oneArcher.defend() );





    }
}
