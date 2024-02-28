package stratPattern.Moves;

public class CharacterMove {
    private ImpStrat impStrat;

    public CharacterMove(ImpStrat move) {
        this.impStrat = move;
    }

    public String attack() {
        return impStrat.attack();
    }

    public String defend() {
        return impStrat.defend();
    }
}

