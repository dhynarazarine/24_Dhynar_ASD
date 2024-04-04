public class HotelMain24 {
    public static void main(String[] args) {
        HotelService24 hotelService = new HotelService24(5);
        hotelService.tambah(new Hotel24("Langit", "Probolinggo", 550000, (byte) 4));
        hotelService.tambah(new Hotel24("Angkasa", "Bali", 425000, (byte) 2));
        hotelService.tambah(new Hotel24("Bulan", "Kediri", 675000, (byte) 4));
        hotelService.tambah(new Hotel24("Matahari", "Malang", 325000, (byte) 3));
        hotelService.tambah(new Hotel24("Awan", "Bekasi", 760000, (byte) 5));

        System.out.println("Daftar hotel sebelum sorting:");
        System.out.println();
        hotelService.tampilAll();

        // hotelService.bubbleSortByPrice();
        // System.out.println("\nDaftar hotel setelah bubble sort berdasarkan harga:");
        // System.out.println();
        // hotelService.tampilAll();

        hotelService.selectionSortByPrice();
        System.out.println("\nDaftar hotel setelah selection sort berdasarkan harga:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.bubbleSortByStar();
        System.out.println("\nDaftar hotel setelah bubble sort berdasarkan bintang:");
        System.out.println();
        hotelService.tampilAll();

        // hotelService.selectionSortByStar();
        // System.out.println("\nDaftar hotel setelah selection sort berdasarkan bintang:");
        // System.out.println();
        // hotelService.tampilAll();
    }
}