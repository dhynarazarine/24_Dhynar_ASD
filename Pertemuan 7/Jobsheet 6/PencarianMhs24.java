public class PencarianMhs24 {
    Mahasiswa24 listMhs[] = new Mahasiswa24[5];
    int idx;
    //modif
    public PencarianMhs24 (int maxSize){
        listMhs = new Mahasiswa24[maxSize];
    }

    void tambah(Mahasiswa24 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(int i = 0; i < idx; i++){
            listMhs[i].tampil();
            System.out.println("----------------------");
        }
    }
    
    public void TampilPosisi(int x, int pos)
    {
        if (pos!= -1){
            System.out.println("data : " + x + " ditemukan pada indeks " + (pos + 1));
            
        } else {
            System.out.println("data : " + x + "tidak ditemukan");
        }
    }

    public void TampilData (int x, int pos){
        if (pos!= -1){
            System.out.println("Nim\t   : " + x);
            System.out.println("Nim\t   : " + listMhs[pos].nama);
            System.out.println("Umur\t   : " + listMhs[pos].umur);
            System.out.println("IPK\t   : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    
    //Sequential Search
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if (listMhs[j].nim==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    //Binary Search
    public int FindBinarySearch (int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;  
            if (cari == listMhs[mid].nim){
                return (mid);
            } else if (listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
