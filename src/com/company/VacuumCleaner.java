package com.company;

public class VacuumCleaner {

    private Directions directions;
    private Room room;
    private int[][] roomLayout;

    public VacuumCleaner(Room room) {
        this.room = room;
    }

    public int[][] getRoomLayout() {
        return roomLayout;
    }

    public void setRoomLayout(int[][] roomLayout) {
        this.roomLayout = roomLayout;
    }

    public Directions getDirections() {
        return directions;
    }

    public void setDirections(Directions directions) {
        this.directions = directions;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean move(int row, int col, int height, int width, int[][] layout) {
        return height > col
                && width > row
                && col >= 0
                && row >= 0
                && layout[row][col] != 0;
    }

    public void turnLeft(VacuumCleaner vacuumCleaner) {
        vacuumCleaner.setDirections(Directions.LEFT);
    }

    public void turnRight(VacuumCleaner vacuumCleaner) {
        vacuumCleaner.setDirections(Directions.RIGHT);
    }

    public void clean(int row, int col) {
        if (room.getRoomLayout()[row][col] != 0) {
            room.getRoomLayout()[row][col] = 2;
        }
    }
}
