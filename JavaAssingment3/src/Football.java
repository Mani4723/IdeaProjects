/**
 * Created by zemosozemoso on 3/7/17.
 */

interface GoalKeeper {
    void stop ();
    void kick ();
}
interface Defender {
    void defend ();
    void tackle ();
}
interface Striker {
    void dribble ();
    void shoot ();
}
interface Fifa extends GoalKeeper, Defender, Striker { // New interface inherited from above three interfaces.
    void play ();
}
class Player {
    void start () {}
}

class Ronaldo extends Player implements Fifa {
    // Defining all the methods of interface.
    String s;
    Ronaldo (String name) {
        s = name;
    }
    public void stop() {System.out.println(s + "stop the shot.");}
    public void kick() {System.out.println(s + "sick the ball back into play.");}
    public void defend() {System.out.println(s + "defend the ball.");}
    public void tackle() {System.out.println(s + "tackle the opponent.");}
    public void dribble() {System.out.println(s + "dribble the ball forward.");}
    public void shoot() {System.out.println(s + "Goal..............");}
    public void play() {System.out.println("play again.");}
}
public class Football {
    static void Goalkie (GoalKeeper g) {g.stop();}
    static void Defend (Defender d) {d.tackle();}
    static void Forward (Striker s) {s.shoot();}
    static void FifaGame (Fifa f) {f.play();}

    public static void main(String[] args) {
        Ronaldo cr = new Ronaldo("Cristiano ");
        Goalkie(cr);
        Defend(cr);
        Forward(cr);
        FifaGame(cr);
    }
}
