/**
 * Created by zemosozemoso on 3/7/17.
 */
interface Cycles { // Cycles
    void ride();
}
interface CycleFactory {
    Cycles getCycle();
}
class UniCycle implements Cycles {
    public void ride() {
        System.out.println("Riding the Factory made Unicycle.");
    }
}
class UnicycleFactory implements CycleFactory { // Implementing factories for each type.
    public Cycles getCycle() {
        return new UniCycle();
    }
}
class BiCycle implements Cycles {
    public void ride() {
        System.out.println("Riding the Factory made Bicycle.");
    }
}
class BicycleFactory implements CycleFactory {
    public Cycles getCycle() {
        return new BiCycle();
    }
}
class TriCycle implements Cycles {
    public void ride() {
        System.out.println("Riding the Factory made Tricycle.");
    }
}
class TricycleFactory implements CycleFactory {
    public Cycles getCycle() {
        return new TriCycle();
    }
}

public class TestCycleFactory {
    public static void main(String[] args) {
        cycleriding(new UnicycleFactory());
        cycleriding(new BicycleFactory());
        cycleriding(new TricycleFactory());
    }

    public static void cycleriding (CycleFactory fact){
        Cycles c = fact.getCycle();
        c.ride();
    }
}
