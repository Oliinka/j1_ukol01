package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

    zofka.penUp();
    zofka.turnLeft(90);

    zofka.move(400);
    zofka.turnRight(90);

    drawBlueLineRights(150);
    drawCircle(100);


    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(90);

    drawBlueLineRights(150);

    drawCircle(100);

    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(90);

    drawBlueLineRights(150);

    drawBlueLineAtAngle(100, 0);
    drawBlueLineLefts(100);
    drawBlueLineAtAngle(116, 46.60282F);
    drawBlueLineLefts(282);
    drawBlueLineAtAngle(116, 133.60219F);
    drawBlueLineLefts(100);
    drawBlueLineAtAngle(100, 180);

    zofka.turnLeft(180);
    zofka.move(250);
    zofka.turnLeft(180);

    drawHouse();

    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnLeft(90);


    writeO();
    writeL();
    writeG();
    writeA();

    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnLeft(90);

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

  public void drawBlueLineRights(int delka) {
    zofka.penDown();
    zofka.turnRight(90);
    zofka.setPenColor(Color.blue);
    zofka.move(delka);
    zofka.turnLeft(90);
    zofka.penUp();
  }

  public void drawBlueLineLefts(int delka) {
    zofka.penDown();
    zofka.turnLeft(90);
    zofka.setPenColor(Color.blue);
    zofka.move(delka);
    zofka.turnRight(90);
    zofka.penUp();
  }

  public void drawBlueLineAtAngle(int delka, float uhel) {
    zofka.penDown();
    zofka.setPenColor(Color.blue);
    zofka.turnLeft(uhel);
    zofka.move(delka);
    zofka.turnRight(uhel);
    zofka.penUp();
  }

  public void drawGrayLineAtAngle(float delka, float uhel) {
    zofka.penDown();
    zofka.setPenColor(Color.darkGray);
    zofka.turnLeft(uhel);
    zofka.move(delka);
    zofka.turnRight(uhel);
    zofka.penUp();
  }


  public void drawCircle(int diameter) {
    diameter = diameter / 2;
    zofka.penDown();
    for (int i = 0; i < 360; i++) {
      zofka.setPenColor(Color.black);
      zofka.move(2 * Math.PI * diameter / 360);
      zofka.turnRight(1);
    }
    zofka.penUp();
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


}
