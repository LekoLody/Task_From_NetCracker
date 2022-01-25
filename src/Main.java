public class Main {
    public static void main(String[] args) {
        Flat flat1 = new Flat();
        Flat flat2 = new Flat(22);
        Flat flat3 = new Flat(26, 2);
        Flat[] flats = new Flat[]{flat1, flat2, flat3};
        DwellingFloor dwellingFloor = new DwellingFloor(flats);
       // dwellingFloor.floor(dwellingFloor.flatNumbers);
        System.out.println(Flat.getTotalFlatArea());
        System.out.println(Flat.getTotalRoomCount());
        dwellingFloor.newFlatOnFloor(1, new Flat(35, 2));
        dwellingFloor.deleteFlat(2);
        for (int i = flats.length - 1; i >= 0; i--){
            System.out.println(flats[i].getFlatArea() + " " + flats[i].getRoomCount());
        }

//        System.out.println(dwellingFloor.getFlatCount());
//        System.out.println(dwellingFloor.getTotalFlatArea());
//        System.out.println(dwellingFloor.getTotalRoomCount());
//        dwellingFloor.newFlatOnFloor(3, flat);
    }
}

