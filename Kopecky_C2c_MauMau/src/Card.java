import javax.swing.*;

public class Card {
    private Suit suit;
    private Rank rank;
    private ImageIcon face;

    public Card(Suit suit, Rank rank, ImageIcon face) {
        this.suit = suit;
        this.rank = rank;
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public ImageIcon getFace() {
        return face;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Character suitString(){

        switch (suit){
            case CLUBS -> {
                return '♣';
            }
            case HEARTS -> {
                return '♥';
            }
            case DIAMONDS -> {
                return '♦';
            }
            case SPADES -> {
                return '♠';
            }
        }
        return null;
    }

    public String rankString(){
        switch (rank){
            case SEVEN ->{
                return "7";
            }
            case EIGHT ->{
                return "8";
            }
            case NINE ->{
                return "9";
            }
            case TEN ->{
                return "10";
            }
            case JACK ->{
                return "J";
            }
            case QUEEN ->{
                return "Q";
            }
            case KING ->{
                return "K";
            }
            case ACE ->{
                return "A";
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return rankString() + suitString();
    }

}
