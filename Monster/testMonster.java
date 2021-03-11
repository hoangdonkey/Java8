package Java8.Monster;
public class testMonster {
    public static void main(String[] args) {
        Monster m1 = new fireMonster("Fire Monster");
        Monster m2 = new waterMonster("Water Monster");
        Monster m3 = new stoneMonster("Stone Monster");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        //m1 dies

        m1 = new stoneMonster("Stone Monster B");
        System.out.println(m1.attack());

        Monster m4 = new Monster("New Monster");
        System.out.println(m4.attack());
    }
}