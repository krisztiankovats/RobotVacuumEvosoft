package com.company;

public class Room {

    private int height;
    private int width;
    private int fullRoom;
    private boolean isClean;
    private int[][] roomLayout;


    public Room(int height, int width, int[][] roomLayout) {
        this.height = height;
        this.width = width;
        this.fullRoom = allAreasInTheRoom();
        this.roomLayout = roomLayout;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getFullRoom() {
        return fullRoom;
    }

    public int allAreasInTheRoom() {
        return this.fullRoom = this.height * this.width;
    }

    public void setFullRoom(int fullRoom) {
        this.fullRoom = fullRoom;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int[][] getRoomLayout() {
        return roomLayout;
    }

    public int[][] setRoomLayout(int[][] roomLayout) {
        return this.roomLayout = roomLayout;
    }
}
