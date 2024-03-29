/**
 * Created by Jiatong Hao, Xiankang Wu and Lijun Chen on 10/05/2019.
 */

public class TriantaEnaAceCard extends TriantaEnaCard {
    public TriantaEnaAceCard(String suit, int value) {
        super(suit, value);
    }

    public TriantaEnaAceCard(String suit) {
        super(suit, 1);
    }

    @Override
    public int getSoftValue() {
        return 1;
    }

    @Override
    public int getHardValue() {
        return 11;
    }

    @Override
    public String toString() {
        return getSuit() + " A";
    }
}
