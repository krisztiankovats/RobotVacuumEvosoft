package com.company;

import java.util.HashSet;
import java.util.Set;

public class Cleaning {

    final int[][] DIRECTIONS = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    Set<String> cleaned = new HashSet<>();

    int[][] layout = {
            {1, 1, 0, 0},
            {1, 1, 1, 1},
            {0, 0, 1, 0},
            {0, 0, 1, 0}};

    Room testRoom = new Room(4, 4, layout);

    public void cleanRoom(VacuumCleaner vacuumCleaner, Room room) {
        cleaning(0, 0, vacuumCleaner, room, 0);
    }

    private void cleaning(int row, int col, VacuumCleaner vacuumCleaner, Room room, int arrow) {
        String data = row + " " + col;

        if (!cleaned.contains(data) && vacuumCleaner.move(row, col, room.getHeight(), room.getWidth(), testRoom.getRoomLayout())) {
            cleaned.add(data);

            vacuumCleaner.clean(row, col);

            for (int i = 0; i < 4; i++) {
                if (vacuumCleaner.move(row, col, room.getHeight(), room.getWidth(), testRoom.getRoomLayout())) {
                    int[] curDirection = DIRECTIONS[arrow];
                    cleaning(row + curDirection[0], col + curDirection[1], vacuumCleaner, room, arrow);
                }

                vacuumCleaner.turnRight(vacuumCleaner);
                arrow = (arrow + 1) % 4;
            }
        }
        goBack(vacuumCleaner);

        if ((occupiedAreas(layout) - cleaned.size()) > 0) {
            room.setClean(false);
        } else
            room.setClean(true);

    }

    private int occupiedAreas(int[][] layout) {
        int counter = 0;
        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < layout[i].length; j++) {
                if (layout[j][i] == 0) {
                    counter++;
                }
            }
        }
        return testRoom.getFullRoom() - counter;
    }

    private void goBack(VacuumCleaner vacuumCleaner) {
        vacuumCleaner.setDirections(Directions.BACK);
    }

}
