/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author pavpa01
 */


public class Circle extends Form {

    private int radie;
    private int startX;
    private int startY;
    private boolean fylld;

    public Circle(int yP, int xP, int r, boolean f) {
        super(yP, xP);
        this.radie = r;
        this.fylld = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(xPos, yPos, radie, radie);
    }

    @Override
    public String whatAmI() {
        return "Jag är Cirkel";
    }

    @Override
    public double getArea() {
        return (radie * radie) * Math.PI;
    }

}

  
 


  

