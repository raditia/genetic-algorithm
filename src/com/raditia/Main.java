package com.raditia;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm();

        geneticAlgorithm.population.initializePopulation(10);
        geneticAlgorithm.population.calculateFitness();

        System.out.println("Generation: " + geneticAlgorithm.generationCount + " Fittest: " + geneticAlgorithm.population.fittest);

        while (geneticAlgorithm.population.fittest < 5) {
            geneticAlgorithm.generationCount++;

            geneticAlgorithm.selection();
            geneticAlgorithm.crossover();

            if (random.nextInt() % 7 < 5) {
                geneticAlgorithm.mutation();
            }

            geneticAlgorithm.addFittestOffspring();
            geneticAlgorithm.population.calculateFitness();
            System.out.println("Generation: " + geneticAlgorithm.generationCount + " Fittest: " + geneticAlgorithm.population.fittest);
        }

        System.out.println("\nSolution found in generation " + geneticAlgorithm.generationCount);
        System.out.println("Fitness: "+geneticAlgorithm.population.getFittest().fitness);
        System.out.print("Genes: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(geneticAlgorithm.population.getFittest().genes[i]);
        }

        System.out.println("");
    }
}
