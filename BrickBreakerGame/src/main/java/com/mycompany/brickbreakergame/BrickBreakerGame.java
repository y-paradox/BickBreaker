/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.brickbreakergame;
import javax.swing.JFrame;

/**
 *
 * @author Akshat Yadav
 */
public class BrickBreakerGame {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
        
        
    }
}
