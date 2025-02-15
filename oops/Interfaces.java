public class Interfaces {
    public static void main(String args[]) {
        King k = new King();
        k.moves();
        Queen q = new Queen();
        q.moves();

        MithcellStark stark = new MithcellStark();
        stark.bowler();
        JaspritBhumrah jasprit = new JaspritBhumrah();
        jasprit.bowler();
        DaleStyne dale = new DaleStyne();
        dale.bowler();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal (1 step)");
    }
}

interface CriketPlayer {
    void bowler();
}

class DaleStyne implements CriketPlayer {
    public void bowler() {
        System.out.println("right arm fast");
    }
}

class MithcellStark implements CriketPlayer {
    public void bowler() {
        System.out.println("left arm fast");
    }
}

class JaspritBhumrah implements CriketPlayer {
    public void bowler() {
        System.out.println("rigth arm fast");
    }
}