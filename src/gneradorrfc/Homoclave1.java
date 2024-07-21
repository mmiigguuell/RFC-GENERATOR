package gneradorrfc;


import java.io.Serializable;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Homoclave1 implements Serializable{
    private Random random;

    public Homoclave1() {
        random = new Random();
    }

    public String generarHomoclave() {
        StringBuilder homoclave = new StringBuilder(3);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            homoclave.append(randomChar);
        }

        return homoclave.toString();
    }
}
