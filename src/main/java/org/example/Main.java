package org.example;

public class Main {
    public static void main(String[] args)
    {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());
         Player player = new Player("mürü",100,Weapon.AXE);
        System.out.println("health: " + player.healthRemaining() );
        Player player2 = new Player("merve",90,Weapon.SWORD);

        System.out.println("health: " + player2.healthRemaining() );

        player.loseHealth((int) ((int)player2.getWeapon().getDamage()*player2.getWeapon().getAttackSpeed()));
        System.out.println("healthremaining after damage: " + player.healthRemaining());

        player.restoreHealth(70);
        System.out.println("healthremaining after restore: " + player.healthRemaining());

    }
}