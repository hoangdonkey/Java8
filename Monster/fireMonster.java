package Java8.Monster;
public class fireMonster extends Monster {
    public fireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire and deal 1 damage!";
    }
}