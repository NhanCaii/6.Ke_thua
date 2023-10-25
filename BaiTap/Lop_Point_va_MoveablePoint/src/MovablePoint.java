public class MovablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){}


    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{getxSpeed(), getySpeed()};
    }
    public String toString(){
        return "("+ getX() +","+ getY() +"),speed=("+getxSpeed()+","+getySpeed();
    }
    public void move(){
        setX(getX() +xSpeed);
        setY(getY() +ySpeed);
    }
}
