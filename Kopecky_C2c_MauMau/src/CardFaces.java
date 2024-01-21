import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CardFaces {

    List<ImageIcon> faces = new ArrayList<>();

    CardFaces(){

        faces.add(new ImageIcon("cards/spades_7.png"));
        faces.add(new ImageIcon("cards/spades_8.png"));
        faces.add(new ImageIcon("cards/spades_9.png"));
        faces.add(new ImageIcon("cards/spades_10.png"));
        faces.add(new ImageIcon("cards/spades_jack.png"));
        faces.add(new ImageIcon("cards/spades_queen.png"));
        faces.add(new ImageIcon("cards/spades_king.png"));
        faces.add(new ImageIcon("cards/spades_ace.png"));

        faces.add(new ImageIcon("cards/diamonds_7.png"));
        faces.add(new ImageIcon("cards/diamonds_8.png"));
        faces.add(new ImageIcon("cards/diamonds_9.png"));
        faces.add(new ImageIcon("cards/diamonds_10.png"));
        faces.add(new ImageIcon("cards/diamonds_jack.png"));
        faces.add(new ImageIcon("cards/diamonds_queen.png"));
        faces.add(new ImageIcon("cards/diamonds_king.png"));
        faces.add(new ImageIcon("cards/diamonds_ace.png"));

        faces.add(new ImageIcon("cards/clubs_7.png"));
        faces.add(new ImageIcon("cards/clubs_8.png"));
        faces.add(new ImageIcon("cards/clubs_9.png"));
        faces.add(new ImageIcon("cards/clubs_10.png"));
        faces.add(new ImageIcon("cards/clubs_jack.png"));
        faces.add(new ImageIcon("cards/clubs_queen.png"));
        faces.add(new ImageIcon("cards/clubs_king.png"));
        faces.add(new ImageIcon("cards/clubs_ace.png"));

        faces.add(new ImageIcon("cards/hearts_7.png"));
        faces.add(new ImageIcon("cards/hearts_8.png"));
        faces.add(new ImageIcon("cards/hearts_9.png"));
        faces.add(new ImageIcon("cards/hearts_10.png"));
        faces.add(new ImageIcon("cards/hearts_jack.png"));
        faces.add(new ImageIcon("cards/hearts_queen.png"));
        faces.add(new ImageIcon("cards/hearts_king.png"));
        faces.add(new ImageIcon("cards/hearts_ace.png"));

    }
}
