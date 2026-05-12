/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author pavpa01
 */
public abstract class Form {

    protected int yPos;
    protected int xPos;
    protected boolean running;
    protected boolean positivRiktning;
    protected Color color;

    public Form(int yP, int xP) {
        this.yPos = yP;
        this.xPos = xP;
    }

    public int getXpos() {
        return this.xPos;
    }

    public int getYpos() {
        return this.yPos;
    }

    public Point getPos() {
        return new Point(xPos, yPos);
    }

    public void setRunning(boolean run) {
        this.running = run;
    }

    public void move(int x, int y) {

    }

    public abstract void draw(Graphics g);

    public abstract String whatAmI();

    public abstract double getArea();

}