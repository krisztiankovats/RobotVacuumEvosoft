package com.company;

public class Main {

    public static void main(String[] args) {
        Cleaning cleaning = new Cleaning();
        int[][] layout = {
                {1, 1, 0, 0},
                {1, 1, 1, 1},
                {0, 0, 1, 0},
                {0, 0, 1, 0}};

        Room testRoom = new Room(4, 4, layout);
        cleaning.cleanRoom(new VacuumCleaner(testRoom), testRoom);
    }
}
