package operators;

import java.math.BigDecimal;

public class StorePaint {

    static final int SMALL = 25;
    static final int BIG = 80;
    static final double YIELD_S = 3.6;
    static final double YIELD_B = 18;

    /* return how much liters of paint will be
     * necessary to given area considering that
     * each liters of paint cover 6m2 of area
     */
    double calculateLitersOfPaint(double area){
        return Math.ceil(area / 6) ;
    }

    //calculate how much cans SMALL will be necessary given the area
    double calcCanBig(double litres){
        return litres / YIELD_B;
    }

    //calculate how much cans SMALL will be necessary given the area
    double calcCanSmall(double litres){
        return Math.ceil(litres / YIELD_S);
    }

    double calcPrice(double can, char size){
        double price;

        if(size == 'S'){
           price = can * SMALL;
        }
        else {
            price = can * BIG;
        }
        return price;
    }

    //1 scenario: buy only small cans
    //2 scenario: buy only big cans
    //3 scenario: buy mixing big cans and small
    // To finish check the most advantageous price
    double optimizeSpend(double area){
        double bestPrice;
        double litres = calculateLitersOfPaint(area);

        double cansS = calcCanSmall(litres);
        double priceSTemp = calcPrice(cansS, 'S');

        double cansB = calcCanBig(litres);
        double priceBTemp = calcPrice(Math.ceil(cansB) , 'B');

        bestPrice = Math.min(priceSTemp, priceBTemp);

        BigDecimal bigDecimal = BigDecimal.valueOf(cansB);
        BigDecimal cansInt = new BigDecimal(bigDecimal.intValue());
        double cansDecimal = bigDecimal.subtract(cansInt).doubleValue();
        cansS = Math.ceil(cansDecimal * YIELD_B / YIELD_S) ;

        double priceB = calcPrice(cansInt.intValue(), 'B');
        double priceS = calcPrice(cansS , 'S');

        return Math.min(priceB + priceS, bestPrice);
    }
}
