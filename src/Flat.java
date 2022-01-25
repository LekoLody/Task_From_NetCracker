public class Flat {

    public final int defaultRoomCount = 2;
    public final int defaultFlatArea = 50;
    public int roomCount = 0;
    public int flatArea = 0;
    public static int flatCount = 0;
    public static int totalFlatArea;
    public static int totalRoomCount;

    public static int getTotalFlatArea() {
        return totalFlatArea;
    }

    public static int getTotalRoomCount() {
        return totalRoomCount;
    }

    public Flat(int flatArea) {
        this.flatArea = flatArea;
        roomCount = defaultRoomCount;
        totalRoomCount += roomCount;
        totalFlatArea += flatArea;
        flatCount++;
    }

    public Flat() {
        roomCount = defaultRoomCount;
        flatArea = defaultFlatArea;
        totalRoomCount += roomCount;
        totalFlatArea += flatArea;
        flatCount++;
    }

    public Flat(int flatArea, int roomCount) {
        this.flatArea = flatArea;
        this.roomCount = roomCount;
        totalFlatArea += flatArea;
        totalRoomCount += roomCount;
        flatCount++;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getFlatArea() {
        return flatArea;
    }

    public void setFlatArea(int flatArea) {
        this.flatArea = flatArea;
    }

    public void flat(){
        setRoomCount(defaultRoomCount);
        setFlatArea(defaultFlatArea);
        flatCount++;
        totalFlatArea += defaultFlatArea;
        totalRoomCount += defaultRoomCount;
    }

    public void flat(int flatArea){
        setRoomCount(defaultRoomCount);
        flatCount++;
        this.flatArea = flatArea;
        totalFlatArea += flatArea;
        totalRoomCount += defaultRoomCount;
    }
    public void flat(int flatArea, int roomCount){
        flatCount++;
        this.flatArea = flatArea;
        this.roomCount = roomCount;
        totalFlatArea += flatArea;
        totalRoomCount += roomCount;
    }
}
