package JavaPodstawy;

public class SprawdzenieWartosci {
    //PobranieWartosci pobranieWartosci = new PobranieWartosci();
    //SprawdzenieWartosci sprawdzenieWartosci = new SprawdzenieWartosci();
    /*int a = pobranieWartosci.a;
    int b = pobranieWartosci.b;
    int c = pobranieWartosci.c;*/

    public SprawdzenieWartosci() {

        int a1, b1, c1;

        {
            PobranieWartosci pobranieWartosci = new PobranieWartosci();
            //int a = PobranieWartosci.a;
            //System.out.println(pobranieWartosci.a);

            if ((pobranieWartosci.a > pobranieWartosci.b) && (pobranieWartosci.b > pobranieWartosci.c)&&(pobranieWartosci.b>pobranieWartosci.c)) {
                a1 = 1;
                b1 = 2;
                c1 = 3;
                System.out.println("Największa :"+pobranieWartosci.a+"\nsrednia :"+pobranieWartosci.b+"\nnajnizsza :"+pobranieWartosci.c);
            }
            //PPPPP
            if ((pobranieWartosci.a > pobranieWartosci.b) && (pobranieWartosci.c > pobranieWartosci.b)&&(pobranieWartosci.c>pobranieWartosci.a)) {
                a1 = 1;
                b1 = 2;
                c1 = 3;
                System.out.println("Największa :" + pobranieWartosci.a + "\nsrednia :" + pobranieWartosci.c + "\nnajnizsza :" + pobranieWartosci.b);
            }


            if ((pobranieWartosci.b > pobranieWartosci.c) && (pobranieWartosci.c > pobranieWartosci.a)&&(pobranieWartosci.c>pobranieWartosci.a)) {
                b1 = 1;
                c1 = 2;
                a1 = 3;
                System.out.println("Największa :"+pobranieWartosci.b+"\nsrednia :"+pobranieWartosci.c+"\nnajnizsza :"+pobranieWartosci.a);
            }
            if ((pobranieWartosci.b > pobranieWartosci.c) && (pobranieWartosci.a > pobranieWartosci.c)&&(pobranieWartosci.a>pobranieWartosci.b)) {
                b1 = 1;
                c1 = 2;
                a1 = 3;
                System.out.println("Największa :"+pobranieWartosci.b+"\nsrednia :"+pobranieWartosci.a+"\nnajnizsza :"+pobranieWartosci.c);
            }
            //ppppppp
            if ((pobranieWartosci.c > pobranieWartosci.a) && (pobranieWartosci.a > pobranieWartosci.b)&&(pobranieWartosci.c>pobranieWartosci.b)) {
                c1 = 1;
                a1 = 2;
                b1 = 3;
                System.out.println("Największa :"+pobranieWartosci.c+"\nsrednia :"+pobranieWartosci.a+"\nnajnizsza :"+pobranieWartosci.b);
            }
            if ((pobranieWartosci.c > pobranieWartosci.a) && (pobranieWartosci.b > pobranieWartosci.a)&&(pobranieWartosci.c>pobranieWartosci.b)) {
                c1 = 1;
                a1 = 2;
                b1 = 3;
                System.out.println("Największa :"+pobranieWartosci.c+"\nsrednia :"+pobranieWartosci.b+"\nnajnizsza :"+pobranieWartosci.a);
            }


        }

        // sprawdzenie a <b
        //if (a>b)

    }
}
