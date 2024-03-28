public class PencarianMhs24 {
    Mahasiswa24 listMhs[] = new Mahasiswa24[5];
    int idx;

    void tambah(Mahasiswa24 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa24 m : listMhs){
            m.tampil();
            System.out.println("----------------------");
        }
    }
    
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

    public void TampilPosisi(int x, int pos)
    {
        if (pos!= -1){
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        
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
}
