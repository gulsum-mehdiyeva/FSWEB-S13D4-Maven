package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
this.x=x;
this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
         this.x=x;
    }
    public void setY(int y){
         this.y=y;
    }
    public double distance(){
return Math.sqrt(x*x+y*y);
            }
    public double distance(Point p){
        double px = p.getX() - this.x;
        double py = p.getY() - this.y;
        return Math.sqrt(px * px + py * py);

    }
    public double distance(int a, int b){
        return Math.sqrt((a - this.x) * (a - this.x) + (b - this.y) * (b - this.y));    }
}
