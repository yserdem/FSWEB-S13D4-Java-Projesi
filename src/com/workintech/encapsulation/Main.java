package com.workintech.encapsulation;

public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("----Point Sınıfı----");
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());

        System.out.println("----Player Sınıfı----");

        Player player1 = new Player("Sinan", 120, Weapon.RUGER);
        System.out.println(player1.healthRemaining());
        player1.loseHealth(50);
        System.out.println(player1.healthRemaining());
        player1.loseHealth(75);
        player1.restoreHealth(60);
        System.out.println(player1.healthRemaining());
        System.out.println(player1.getWeaponName());
        player1.setWeapon(Weapon.AK47);
        System.out.println(player1.getWeaponName());

    }
}