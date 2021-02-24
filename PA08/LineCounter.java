/*
 * NAME: TODO
 * PID: TODO
 */

import java.io.*;
import java.util.LinkedList;

/**
 * TODO
 * 
 * @author TODO
 * @since TODO
 */
public class LineCounter {

    /* Constants */
    private static final int MIN_INIT_CAPACITY = 10;

    /**
     * Method to print the filename to the console
     * @param filename filename to print
     */
    public static void printFileName(String filename) {
        System.out.println("\n" + filename + ":");
    }

    /**
     * Method to print the statistics to the console
     * @param compareFileName name of the file being compared
     * @param percentage similarity percentage
     */
    public static void printStatistics(String compareFileName, int percentage) {
        System.out.println(percentage + "% of lines are also in " + compareFileName);
    }

    /**
     * Main method.
     * @param args names of the files to compare
     */
    public static void main(String[] args) {

        if (args.length < 2) {
            System.err.println("Invalid number of arguments passed");
            return;
        }

        int numArgs = args.length;

        // Create a hash table for every file
        HashTable[] tableList = new HashTable[numArgs];

        // Preprocessing: Read every file and create a HashTable

        for (int i = 0; i < numArgs; i++) {
            /* TODO */
        }

        // Find similarities across files

        for (int i = 0; i < numArgs; i++) {
            /* TODO */
        }
    }

}