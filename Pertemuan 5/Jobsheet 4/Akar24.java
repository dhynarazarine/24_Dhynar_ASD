public class Akar24 {
    public int nilai, akar;

    public int akarBF(int bilangan) {
        int akar = 0;
        while (akar * akar <= bilangan) {
            akar++;
        }
        return akar - 1;
    }

    public int akarDC(int bilangan, int terendah, int tertinggi) {
        if (tertinggi < terendah) {
            return terendah - 1;
        }
        int mid = (terendah + tertinggi) / 2;
        if (mid * mid == bilangan) {
            return mid;
        } else if (mid * mid < bilangan) {
            return akarDC(bilangan, mid + 1, tertinggi);
        } else {
            return akarDC(bilangan, terendah, mid - 1);
        }
    }
}