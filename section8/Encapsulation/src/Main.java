public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Romulo";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(10);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer romulo = new EnhancedPlayer("Romulo", 100, "Sword");
        System.out.println("Initial health is " + romulo.healthRemaining());
    }

}
