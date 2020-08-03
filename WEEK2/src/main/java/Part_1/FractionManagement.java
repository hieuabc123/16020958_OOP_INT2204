package Part_1;

public class FractionManagement {
    public static void main(String[] args) {
        Fraction p1 = new Fraction(1,2);
        Fraction p2 = new Fraction(50 , 100);
        FractionManagement F = new FractionManagement();
        System.out.println(F.equals(p1, p2));
    }

    /*---------------------------------------
     * Cộng 2 phân số
     * Created by Hieu 02/08/2020
     * ------------------------------------------
     * */
    public Fraction add(Fraction p1, Fraction p2){
        Fraction p = new Fraction();
        p.setNumerator(p1.getNumerator() * p2.getDenominator() + p2.getNumerator() * p1.getDenominator());
        p.setDenominator( p1.getDenominator() * p2.getDenominator()) ;
        return  p;
    }

    /*---------------------------------------
     * Trừ 2 phân số
     * Created by Hieu 02/08/2020
     * ------------------------------------------
     * */
    public Fraction subtract (Fraction p1 , Fraction p2){
        Fraction p = new Fraction();
        p.setNumerator(p1.getNumerator() * p2.getDenominator() - p2.getNumerator() * p1.getDenominator()) ;
        p.setDenominator(p1.getDenominator() * p2.getDenominator()) ;
        return p;
    }

    /*---------------------------------------
     * Nhân 2 phân số
     * Created by Hieu 02/08/2020
     * ------------------------------------------
     * */
    public Fraction multiply (Fraction p1 , Fraction p2){
        Fraction p = new Fraction();
        p.setNumerator(p1.getNumerator() * p2.getNumerator()) ;
        p.setDenominator(p1.getDenominator() * p2.getDenominator())  ;
        return p;
    }

    /*---------------------------------------
     * Chia 2 phân số
     * Created by Hieu 02/08/2020
     * ------------------------------------------
     * */
    public Fraction devide (Fraction p1 , Fraction p2){
        Fraction p = new Fraction();
        p.setNumerator(p1.getNumerator() * p2.getDenominator()) ;
        p.setDenominator(p1.getDenominator() *  p2.getNumerator()) ;
        return p;
    }

    /*---------------------------------------
     * Rút gọn phân số
     * Created by Hieu 02/08/2020
     * ------------------------------------------
     * */
    public Fraction reduce( Fraction p){
        Math a = new Math();
        int gcd = a.gcd(p.getNumerator(),p.getDenominator());
        p.setNumerator(p.getNumerator() / gcd) ;
        p.setDenominator(p.getDenominator() / gcd);
        return p;
    }

    /*---------------------------------------
     * so sánh 2 phân số
     * Created by Hieu 02/08/2020
     * ------------------------------------------
     * */
    public boolean equals(Fraction p1, Fraction p2){
        if(p1.getNumerator() * p2.getDenominator() == p2.getNumerator() * p1.getDenominator()) return true;
        else return false;
    }
}
