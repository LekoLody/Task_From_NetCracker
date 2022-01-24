public class DwellingFloor{

    int[] flatNumbers = new int[10];

    flatNumbers[3] = 3;

    public void floor(int numberOfFlats){
        Flat.flatCount ++;
    }

    public void floor(int[] flats){
        Flat.flatCount += flats.length;
    }

    public int getFlatCount(){
        return Flat.flatCount;
    }

    public int getTotalFlatArea(){
        return Flat.totalFlatArea;
    }

    public int getTotalRoomCount(){
        return Flat.totalRoomCount;
    }

    public int[] getFlatNumbers() {
        for (int i = 0; i < flatNumbers.length; i++)
            ;
        return flatNumbers;
    }

    public int[] getFlatNumber(int[] flats){
        this.flatNumbers = flats;
        return flats;
    }
}
