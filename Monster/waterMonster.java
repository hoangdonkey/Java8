package Java8.Monster;
public class waterMonster extends Monster {
    public waterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water and deal 1 damage!";
    }
}