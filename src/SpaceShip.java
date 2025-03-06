public class SpaceShip extends GameObject implements Movable, Explodable {

    private int bullets;
    private boolean canFire;

    public void shootTheGun(){
        System.out.println("shoot the lase, pew pew pew");
    }

    public SpaceShip(int x, int y) {
        super(x, y);
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public boolean isCanFire() {
        return canFire;
    }

    public void setCanFire(boolean canFire) {
        this.canFire = canFire;
    }

    @Override
    public void accelerate(int newSpeed) {

    }

    @Override
    public void explode() {
        System.out.println("BANG you just blew up");
    }
}
