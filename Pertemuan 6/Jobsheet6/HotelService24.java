class HotelService24 {
    Hotel24[] rooms;
    int count;

    HotelService24(int size) {
        rooms = new Hotel24[size];
        count = 0;
    }

    void tambah(Hotel24 h) {
        if (count < rooms.length) {
            rooms[count] = h;
            count++;
        } else {
            System.out.println("Tidak dapat menambahkan hotel, kapasitas penuh.");
        }
    }

    void tampilAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("Hotel   : " + rooms[i].nama);
            System.out.println("Kota    : " + rooms[i].kota);
            System.out.println("Harga   : " + rooms[i].harga);
            System.out.println("Bintang : " + rooms[i].bintang);
            System.out.println("------------------------------");
        }
    }

    void bubbleSortByPrice() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel24 tmp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tmp;
                }
            }
        }
    }
    void selectionSortByPrice() {
        int n = count;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (rooms[j].harga < rooms[minIndex].harga) {
                    minIndex = j;
                }
            }
            // Swap
            Hotel24 tmp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = tmp;
        }
    }
    
    void bubbleSortByStar() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    // Swap
                    Hotel24 tmp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tmp;
                }
            }
        }
    }    
    void selectionSortByStar() {
        for (int i = 0; i < count - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (rooms[j].bintang > rooms[maxIndex].bintang) {
                    maxIndex = j;
                }
            }
            Hotel24 tmp = rooms[maxIndex];
            rooms[maxIndex] = rooms[i];
            rooms[i] = tmp;
        }
    }
}