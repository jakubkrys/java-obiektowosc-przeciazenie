public class Calculator {

    // dodawanie
    int add (int ... values){
        int sum = 0;
        for (int v : values){
            sum += v;
        }
        return sum;
    }

    // odejmowanie
    int sub (int ... values){
        int sub = values[0];
        for (int v = 1; v < values.length; v++){
            sub -= values[v];
        }
        return sub;
    }

    // mnożenie
    int multi (int ... values){
        int multi = values[0];
        for (int v = 1; v < values.length; v++){
            multi *= values[v];
        }
        return multi;
    }

    // dzielenie
    double div (double ... values){
        double div = values[0];
        for (int v = 1; v < values.length; v++){
            div /= values[v];
        }
        return div;
    }
}
