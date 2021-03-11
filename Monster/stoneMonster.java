package Java8.Monster;
public class stoneMonster extends Monster {
    public stoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stone and deal 1 damage!";
    }
}