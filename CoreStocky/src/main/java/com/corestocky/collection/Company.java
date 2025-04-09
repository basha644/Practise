package com.corestocky.collection;

import java.awt.*;
import java.util.Random;

public class Company {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        try {
            Robot robot = new Robot();
            while (true){
                robot.mouseMove(random.nextInt(2000), random.nextInt(5000));
                Thread.sleep(5000);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }
}
