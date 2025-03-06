public class Enemy extends GameObject implements Movable, Explodable{

    private int size;

    public Enemy(int x, int y) {
        super(x, y);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void accelerate(int newSpeed) {

    }

    @Override
    public void explode() {
        System.out.println("BANG the enemy just blew up");
    }
}
