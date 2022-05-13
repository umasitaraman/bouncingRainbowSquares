package processing.sketches;

import processing.core.PApplet;

public class Main extends PApplet {

    float xPosition=50;
    float yPosition=50;
    float sideLength=50;
    float xVelocity=5;
    float yVelocity=3;
    float hue=0;

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        colorMode(HSB);
        noStroke();
        background(0, 0, 0);
    }

    public void draw() {
        clear();
        fill(hue%255, 255, 255);
        rect(xPosition, yPosition, sideLength, sideLength);
        xPosition += xVelocity;
        yPosition += yVelocity;

        if (xPosition+sideLength >= width || xPosition <= 0) {
            xVelocity*=-1;
        }
        if (yPosition+sideLength >= height || yPosition <= 0) {
            yVelocity *= -1;
        }
        hue+=1;
    }

    public static void main(String[] args) {
        PApplet.main("processing.sketches.Main");
    }
}
