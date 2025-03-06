public class Main {
    public static void main(String[] args) {
        SpaceShip me = new SpaceShip(100, 200);
        me.shootTheGun();

        System.out.println("I am at " + me.getX() + ", " + me.getY());
    }
}
