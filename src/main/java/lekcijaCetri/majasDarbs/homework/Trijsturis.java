package lekcijaCetri.majasDarbs.homework;

public class Trijsturis {
    int a;
    int b;
    int c;
    double area;
    double halfPerimeter;
    boolean vaiVienadmalu = true;
    boolean vaiVienadsanu = true;

    public void Trijsturis (){
            System.out.println("Veidojam trījstūri");
        }

    public Trijsturis(int a, int b, int c) {
            this.a = 8;
            this.b = 4;
            this.c = 6;


            //pusperimetra aprēķins
            this.halfPerimeter = (a + b + c)/ 2;
            System.out.println("Pusperimetrs ir " + halfPerimeter);
            //Hērona formula
            this.area = Math.sqrt(halfPerimeter * (halfPerimeter - a)
                    * (halfPerimeter - b) * (halfPerimeter - c));
            System.out.println("Trīsstūra laukums ir " + area);
        }

        public boolean vaiVienadmalu() {
            System.out.println("Vai trīsstūris ir vienādmalu?");
            if (a == b && b == c && c == a) {
                return true;
            } else {
                return false;
            }
        }

        public boolean vaiVienadsanu() {
            System.out.println("Vai trījstūris ir vienādsānu?");
            if (a == b || b == c || c == a) {
                return true;
            } else {
                return false;
            }
        }


    }







