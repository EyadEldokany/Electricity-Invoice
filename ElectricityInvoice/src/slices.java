public class slices {
    public static void calculation(int kw) {
        double x = 0;
        if (kw >= 50) {
            for (int i = 1; i <= 50; i++) {
                x += 0.8;
            }
            kw -= 50;
            if (kw > 0) {
                if(kw<=150){
                    for (int i = 0; i < kw; i++) {
                        x+=0.9;
                    }
                } else {
                    for (int i = 0; i < 150; i++) {
                        x+=0.9;
                    }
                }
                kw-=150;
                if (kw>=150){
                    for (int i = 0; i < 150; i++) {
                        x+=1;
                    }
                }
                else {
                    for (int i = 0; i < kw; i++) {
                        x+=1;
                    }

                }
                kw-=150;
                if (kw>0){
                    for (int i = 0; i < kw; i++) {
                        x+=1.2;
                    }
                    System.out.println(x + "L.E.");
                }
                else {
                    System.out.println(x + "L.E.");
                }
            }
            else{
                System.out.println(x + "L.E.");
            }
        }
        else {
            for (int i = 0; i < kw; i++) {
                x+=0.8;
            }
            System.out.println(x + "L.E.");
        }
    }
}
