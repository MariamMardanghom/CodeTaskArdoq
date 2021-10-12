

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;




public class BiggestProduct {


    private List<Integer> numbers = new ArrayList<Integer>();
    private List<Integer> biggestNumbers = new ArrayList<Integer>();

    
    public BiggestProduct(ArrayList<Integer> list1){
        this.numbers = list1;
        this.ProductOfThree(this.numbers);
    }


    private Integer ProductOfThree(List numbers) {

        // Mål: Gang sammen de 3 største positive verdiene, gang sammen de to minste (max negative) verdiene og gang sammen 
        // med største positive. Sammenlign hvilken av de to verdiene som gir størst produkt.
        Collections.sort(numbers);
        int max1 = (Integer) numbers.get(numbers.size()-1);
        int max2 = (Integer) numbers.get(numbers.size()-2);
        int max3 = (Integer) numbers.get(numbers.size()-3);
        int min1 = (Integer) numbers.get(0);
        int min2 = (Integer) numbers.get(1);

        System.out.println(numbers);

        int productOfMax = max1 * max2 * max3;
        int productOfMaxAndMin = min1 * min2 * max1;
        System.out.println("Product of max: " + Integer.toString(productOfMax));
        System.out.println("Product of max and min: " + Integer.toString(productOfMaxAndMin));

        if (productOfMax > productOfMaxAndMin){
            System.out.println("Max product is: " + Integer.toString(productOfMax));
            System.out.println("Factors: " + Integer.toString(max1)+ ", " + Integer.toString(max2) + ", " + Integer.toString(max3));
            return productOfMax;
        }
        else{
            System.out.println("Max product is: " + Integer.toString(productOfMaxAndMin));
            System.out.println("Factors: " + Integer.toString(min1)+ ", " + Integer.toString(min2) + ", " + Integer.toString(max1));
            return productOfMaxAndMin;
        }

}


    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(-1000, 2, -3, 4, -5, 6, 100));
        BiggestProduct list1 = new BiggestProduct(test);
    }


}