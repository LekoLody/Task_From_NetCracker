public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat();
        DwellingFloor dwellingFloor = new DwellingFloor();
        flat.flat();
        flat.flat(22);
        flat.flat(26, 2);
        dwellingFloor.floor(dwellingFloor.flatNumbers);
        System.out.println(flat.getFlatArea());
        System.out.println(flat.getRoomCount());
        System.out.println(dwellingFloor.getFlatCount());
        System.out.println(dwellingFloor.getTotalFlatArea());
        System.out.println(dwellingFloor.getTotalRoomCount());
    }
}

