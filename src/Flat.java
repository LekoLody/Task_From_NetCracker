public class Flat {

    public final int defaultRoomCount = 2;
    public final int defaultFlatArea = 50;
    public int roomCount;
    public int flatArea;
    public static int flatCount;
    public static int totalFlatArea;
    public static int totalRoomCount;

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
