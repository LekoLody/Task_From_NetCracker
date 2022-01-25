public class DwellingFloor{

    Flat[] flats;

    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

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

    public void changeFlat(int flatNumber, Flat flat){
        flats[flatNumber] = flat;
    }

    public void newFlatOnFloor(int flatNumber, Flat flat) {
        Flat[] flats1 = new Flat[flats.length + 1];
        for (int i = 0; i < flats.length; i++){
            if (i == flatNumber){
                flats1[flatNumber] = flat;
            }
            if (i >= flatNumber){
                flats1[i + 1] = flats[i];
            }else {
                flats1[i] = flats[i];
            }
        }

    }

    public void deleteFlat(int flatNumber){
        for (int indexOfFlats = 0; indexOfFlats < flats.length - 1; indexOfFlats++){
            if (flats[indexOfFlats] == flats[flatNumber]){
                Flat[] flats1 = new Flat[flats.length - 1];
                for (int indexOfNewFlats = 0; indexOfNewFlats < indexOfFlats; indexOfNewFlats++){
                    flats1[indexOfNewFlats] = flats[indexOfNewFlats];
                }
                for (int i = indexOfFlats; i < flats.length - 1; i++){
                    flats1[i] = flats[i + 1];
                }
            }
        }
    }
}
