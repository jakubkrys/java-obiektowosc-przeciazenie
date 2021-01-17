public class CalculatorMAIN {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a, b, c, d, e;
        a = 44;
        b = 2;
        c = 5;
        d = 6;
        e = 1;

        System.out.println("Suma "+a+" + "+b+" = "+calculator.add(a, b));
        System.out.println("Suma "+a+" + "+b+" + "+c+" = "+calculator.add(a, b, c));
        System.out.println("Suma "+a+" + "+b+" + "+c+" + "+d+" = "+calculator.add(a, b, c, d));
        System.out.println("Suma "+a+" + "+b+" + "+c+" + "+d+" + "+e+" = "+calculator.add(a, b, c, d, e));
        System.out.println();
        System.out.println("Różnica "+a+" - "+b+" = "+calculator.sub(a, b));
        System.out.println("Różnica "+a+" - "+b+" - "+c+" = "+calculator.sub(a, b, c));
        System.out.println("Różnica "+a+" - "+b+" - "+c+" - "+d+" = "+calculator.sub(a, b, c, d));
        System.out.println("Różnica "+a+" - "+b+" - "+c+" - "+d+" - "+e+" = "+calculator.sub(a, b, c, d, e));
        System.out.println();
        System.out.println("Iloraz "+a+" / "+b+" = "+calculator.div(a, b));
        System.out.println("Iloraz "+a+" / "+b+" / "+c+" = "+calculator.div(a, b, c));
        System.out.println("Iloraz "+a+" / "+b+" / "+c+" / "+d+" = "+calculator.div(a, b, c, d));
        System.out.println("Iloraz "+a+" / "+b+" / "+c+" / "+d+" / "+e+" = "+calculator.div(a, b, c, d, e));
        System.out.println();
        System.out.println("Iloczyn "+a+" * "+b+" = "+calculator.multi(a, b));
        System.out.println("Iloczyn "+a+" * "+b+" * "+c+" = "+calculator.multi(a, b, c));
        System.out.println("Iloczyn "+a+" * "+b+" * "+c+" * "+d+" = "+calculator.multi(a, b, c, d));
        System.out.println("Iloczyn "+a+" * "+b+" * "+c+" * "+d+" * "+e+" = "+calculator.multi(a, b, c, d, e));
    }
}
