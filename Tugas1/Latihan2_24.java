public class Latihan2_24 {
public static void main(String[] args) {
    int rating [][] = {
        {4,1,1},
        {3,1,2},
        {4,2,3},
        {4,3,4}
    };

    float total;
    float rata2 = 0;
    float tinggi = 0;
    float rendah = 0;
    int tertinggi = 0;
    int terendah = 0;
    for (int i = 0; i < rating.length; i++){
        total = 0;
        for(int j=0; j<rating[0].length; j++){
            total += rating [i][j];    
        }
        rata2 = total / rating[i].length;
        System.out.println("Rata-rata rating movie " +i+ " adalah " + rata2);

        if(rata2 > tinggi){
            tinggi = rata2;
            tertinggi = i;
        } else if (rata2 < rendah){
            rendah = rata2;
            terendah = i;
            }
        }
        System.out.println("Movie dengan rata-rata rating tertinggi adalah movie " + tertinggi);
        System.out.println("Movie dengan rata-rata rating terendah adalah movie " + terendah);
    }    
}
