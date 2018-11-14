package com.raditia.model;

import java.util.Random;

public class Individual {

    public int fitness = 0;
    public int[] genes = new int[5];
    public int geneLength = 5;

    public Individual() {
        Random random = new Random();

        // set genes randomly
        for (int i = 0; i < genes.length; i ++) {
            genes[i] = Math.abs(random.nextInt() % 2);
        }

        fitness = 0;
    }

    // calculate fitness
    public void calculateFitness() {
        fitness = 0;

        for (int i = 0; i < 5; i++) {
            if (genes[i] == 1) {
                fitness++;
            }
        }
    }


}
