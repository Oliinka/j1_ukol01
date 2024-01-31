package cz.czechitas.java.homework01;

import cz.czechitas.java.homework01.engine.Turtle;

import java.awt.*;

public class MainProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new MainProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    zofka.setSpeed(100);

    //TODO implementace domácího úkolu

    zofka.setX(500);
    zofka.setY(150);

    drawSun(40);


    zofka.setX(100);
    zofka.setY(400);

    for (int i = 0; i < 5; i++) {
      drawHouse();
      zofka.turnRight(90);
      zofka.move(30);
      zofka.turnLeft(90);
    }

    zofka.setX(100);
    zofka.setY(600);

    drawHouse();

    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnLeft(90);

    writeOLGA();

    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnLeft(90);

    drawHouse();

    zofka.setX(100);
    zofka.setY(600);



  }

  public void writeOLGA() {
    writeO();
    writeL();
    writeG();
    writeA();
  }


  public void drawArc() {
    for (int i = 0; i < 180; i++) {
      zofka.move(2 * Math.PI * 40 / 360);
      zofka.turnRight(1);
    }

  }

  public void writeL() {
    zofka.move(150);
    zofka.setPenColor(Color.darkGray);
    zofka.penDown();
    zofka.turnRight(180);
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.move(60);
    zofka.penUp();
    zofka.move(20);
    zofka.turnRight(-90);
  }


  public void writeO() {
    zofka.move(40);
    zofka.setPenColor(Color.darkGray);
    zofka.penDown();
    zofka.move(70);
    drawArc();
    zofka.move(70);
    drawArc();
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnLeft(90);
  }

  public void writeG() {
    zofka.penUp();
    zofka.move(60);
    zofka.turnRight(90);
    zofka.move(50);
    zofka.setPenColor(Color.darkGray);
    zofka.penDown();
    zofka.move(30);
    zofka.turnRight(90);
    zofka.move(20);
    drawArc();
    zofka.move(70);
    drawArc();
    zofka.penUp();
    zofka.move(120);
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);
  }

  public void writeA() {
    zofka.setPenColor(Color.darkGray);
    zofka.penDown();

    zofka.turnRight(14.93142);
    zofka.move(155.24175);
    zofka.turnLeft(-150.13716);
    zofka.move(155.24175);
    zofka.penUp();
    zofka.turnLeft(75.06858);
    zofka.turnLeft(180);
    zofka.move(80);
    zofka.turnRight(90);
    zofka.move(80);
    zofka.turnRight(90);
    zofka.move(20);
    zofka.penDown();
    zofka.move(40);
    zofka.penUp();
    zofka.move(40);
    zofka.turnRight(90);
    zofka.move(80);
    zofka.turnRight(180);
  }

  public void drawGrayLineAtAngle(float delka, float uhel) {
    zofka.penDown();
    zofka.setPenColor(Color.darkGray);
    zofka.turnLeft(uhel);
    zofka.move(delka);
    zofka.turnRight(uhel);
    zofka.penUp();
  }

  //NEEDS 2B FINISHED
  public void pigLeg(){
    zofka.penDown();
    zofka.turnRight(60);
    zofka.move(30);
    //zofka.penUp();
    zofka.turnRight(60);
    zofka.move(30);
    zofka.penDown();
    zofka.turnRight(60);
    zofka.move(30);
    zofka.turnRight(60);
  }

  //NEEDS 2B FINISHED
    public void drawPig(){
      zofka.penUp();
      zofka.turnRight(90);
      zofka.move(60);
      drawHouse();
      zofka.turnLeft(90);
      zofka.move(100);
      pigLeg();
      zofka.turnLeft(90);
      zofka.move(100);
      pigLeg();
}
    public  void  drawHouse(){
    drawSquare();
      zofka.setPenColor(Color.darkGray);
      zofka.penDown();
      zofka.move(100);
      drawGrayLineAtAngle(70.710678F, 315);
      drawGrayLineAtAngle(70.710678F, 225);
      zofka.turnLeft(180);
      zofka.penUp();
      zofka.move(100);
      zofka.turnLeft(180);
    }
    
    public void drawSquare() {
      zofka.setPenColor(Color.darkGray);
      zofka.penDown();
      for (int i = 0; i < 4; i++) {
        zofka.move(100);    // Move forward by 100 units (assuming 'zofka' is an instance of a turtle)
        zofka.turnRight(90);
      }// Turn left by 90 degrees to create the square shape
      zofka.penUp();
    }

  public void drawSun(int sunRadius) {
    drawSunCircle(sunRadius);
    drawSunRays(sunRadius);
  }

  public void drawSunCircle(int radius) {
    zofka.penUp();
    zofka.setPenColor(Color.yellow);
    zofka.move(radius);
    zofka.penDown();

    for (int i = 0; i < 360; i++) {
      zofka.move(2 * Math.PI * radius / 360);
      zofka.turnRight(1);
    }

    zofka.penUp();
    zofka.move(-radius);
  }

  public void drawSunRays(int radius) {
    zofka.penUp();
    zofka.move(radius);
    zofka.turnRight(90);
    zofka.move(radius);
    zofka.turnLeft(90);
    zofka.setPenColor(Color.yellow);
    zofka.penDown();

    int numRays = 12;

    for (int i = 0; i < numRays; i++) {
      zofka.penUp();
      zofka.turnRight(360 / numRays);
      zofka.move(radius);
      zofka.penDown();
      zofka.move(radius);
      zofka.penUp();
      zofka.turnLeft(180);
      zofka.move(2*radius);

    }

  }


  }

