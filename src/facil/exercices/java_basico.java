package facil.exercices;

public class java_basico {
    public static void main(String[] args) {
        byte years = 1;
        byte montlhy = 8;
        int days = 20;
        int real_date = (((years * 12) + montlhy) * 30) + days;
        System.out.println("Ex 01:real_date = " + real_date);
        System.out.println();


        double media1 = (8.9 + 7) / 2;
        int media2 = (4 + 5+ 6) / 3;
        double sum_medias = media2 + media1;
        double media_media = (media1 + media2) / 2;
        System.out.println("media1 = " + media1);
        System.out.println("media2 = " + media2);
        System.out.println("sum_medias = " + sum_medias);
        System.out.println("media_media = " + media_media);
    }
}


