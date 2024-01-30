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

    nakresliModrouCaruDoPrava(150);
    nakresliKolecko(100);


    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(90);

    nakresliModrouCaruDoPrava(150);

    nakresliKolecko(100);

    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(90);

    nakresliModrouCaruDoPrava(150);

    nakresliSikmouModrouCaru(100, 0);
    nakresliModrouCaruDoLeva(100);
    nakresliSikmouModrouCaru(116, 46.60282F);
    nakresliModrouCaruDoLeva(282);
    nakresliSikmouModrouCaru(116, 133.60219F);
    nakresliModrouCaruDoLeva(100);
    nakresliSikmouModrouCaru(100, 180);

    zofka.turnLeft(180);
    zofka.move(250);
    zofka.turnLeft(180);

    nakresliCtverecek();
    zofka.move(100);
    nakresliSikmouSedouCaru(70.710678F, 315);
    nakresliSikmouSedouCaru(70.710678F, 225);

    zofka.turnLeft(180);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnLeft(90);

    napisO();
    napisL();
    napisG();
    napisA();
  }

    public void napisL() {
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


    public void napisO() {
      zofka.move(40);
      zofka.setPenColor(Color.darkGray);
      zofka.penDown();
      zofka.move(70);
      for (int i = 0; i < 180; i++) {
        zofka.move(2 * Math.PI * 40 / 360);
        zofka.turnRight(1);
      }
      zofka.move(70);
      for (int i = 0; i < 180; i++) {
        zofka.move(2 * Math.PI * 40 / 360);
        zofka.turnRight(1);
      }
      zofka.penUp();
      zofka.turnLeft(180);
      zofka.move(40);
      zofka.turnLeft(90);
      zofka.move(100);
      zofka.turnLeft(90);
    }

    public void napisG() {
      zofka.penUp();
      zofka.move(60);
      zofka.turnRight(90);
      zofka.move(50);
      zofka.setPenColor(Color.darkGray);
      zofka.penDown();
      zofka.move(30);
      zofka.turnRight(90);
      zofka.move(20);
      for (int i = 0; i < 180; i++) {
        zofka.move(2 * Math.PI * 40 / 360);
        zofka.turnRight(1);
      }
      zofka.move(70);
      for (int i = 0; i < 180; i++) {
        zofka.move(2 * Math.PI * 40 / 360);
        zofka.turnRight(1);
      }
      zofka.penUp();
      zofka.move(120);
      zofka.turnLeft(90);
      zofka.move(20);
      zofka.turnLeft(90);
    }

    public void napisA() {
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

    public void nakresliModrouCaruDoPrava(int delka) {
      delka = delka;
      zofka.penDown();
      zofka.turnRight(90);
      zofka.setPenColor(Color.blue);
      zofka.move(delka);
      zofka.turnLeft(90);
      zofka.penUp();
    }

    public void nakresliModrouCaruDoLeva(int delka) {
      delka = delka;
      zofka.penDown();
      zofka.turnLeft(90);
      zofka.setPenColor(Color.blue);
      zofka.move(delka);
      zofka.turnRight(90);
      zofka.penUp();
    }

    public void nakresliSikmouModrouCaru(int delka, float uhel) {
      delka = delka;
      uhel = uhel;
      zofka.penDown();
      zofka.setPenColor(Color.blue);
      zofka.turnLeft(uhel);
      zofka.move(delka);
      zofka.turnRight(uhel);
      zofka.penUp();
    }

    public void nakresliSikmouSedouCaru(float delka, float uhel) {
      delka = delka;
      uhel = uhel;
      zofka.penDown();
      zofka.setPenColor(Color.darkGray);
      zofka.turnLeft(uhel);
      zofka.move(delka);
      zofka.turnRight(uhel);
      zofka.penUp();
    }


    public void nakresliKolecko(int polomer) {
      polomer = polomer / 2;
      zofka.penDown();
      for (int i = 0; i < 360; i++) {
        zofka.setPenColor(Color.black);
        zofka.move(2 * Math.PI * polomer / 360);
        zofka.turnRight(1);
      }
      zofka.penUp();
    }

    public void nakresliCtverecek() {
      zofka.setPenColor(Color.darkGray);
      zofka.penDown();
      for (int i = 0; i < 4; i++) {
        zofka.move(100);    // Move forward by 100 units (assuming 'zofka' is an instance of a turtle)
        zofka.turnRight(90);
      }// Turn left by 90 degrees to create the square shape
      zofka.penUp();
    }

    public void nakresliRonostrannyTrojuhelnik(float stranaA, Color barva) {
      stranaA = stranaA;
      barva = barva;
      zofka.setPenColor(barva);
      zofka.penDown();
      zofka.turnRight(90);
      for (int i = 0; i < 3; i++) {
        zofka.move(stranaA);
        zofka.turnLeft(120);
      }
      zofka.turnLeft(90);
  }

}
