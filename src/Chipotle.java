import java.util.Random;
import java.util.Scanner;

public class Chipotle {
    public static void main(String[] args) {
        /*
            Rice: white, brown, none, all
            Meat: chicken, steak, carnidas, chorizo, sofritas, veggie meat, none, all
            Beans: pinto, black, none, all
            Salsa: mild, medium, hot, none, all
            Veggies: lettuce, fajita veggies, none, all
            Cheese: yes/no
            Guac: yes/no
            Queso: yes/no
            Sour cream: yes/no
         */

        int count = 0;
        int randomNo;
        double totalPrice = 0;
        String randomRice, randomMeat,randomBean, randomSalsa, randomVeggies, randomCheese,
                randomGuac, randomQueso, randomSourCream;

        String rice [] = {"White", "Brown", "no rice", "All"};
        String meat [] = {"Chicken", "Steak", "Carnidas", "Chorizo", "Sofritas", "Veggie Meat", "no meat", "All"};
        String beans [] = {"Pinto", "Black", "no bean", "All"};
        String salsa [] = {"Mild", "Medium", "Hot", "no salsa", "All"};
        String veggies [] = {"Lettuce", "Fajita Veggies", "no veggies", "All"};
        String cheese [] = {"Cheese", "no cheese"};
        String guac [] = {"Guacumole", "no guac"};
        String queso [] = {"Queso", "no queso"};
        String sourCream [] = {"Sour Cream", "no sour cream"};

        Random run = new Random();
        Scanner in = new Scanner(System.in);

        while(count < 25){
            count++;
            totalPrice = 3;

            randomNo = randomGenerator(rice, run);
            randomRice = rice[randomNo];
            totalPrice = priceCalculator(randomRice,totalPrice);

            randomNo = randomGenerator(meat, run);
            randomMeat = meat[randomNo];
            totalPrice =priceCalculator(randomMeat,totalPrice);

            randomNo = randomGenerator(beans, run);
            randomBean = beans[randomNo];
            totalPrice =priceCalculator(randomBean,totalPrice);

            randomNo = randomGenerator(salsa, run);
            randomSalsa = salsa[randomNo];
            totalPrice =priceCalculator(randomSalsa,totalPrice);

            randomNo = randomGenerator(veggies, run);
            randomVeggies = veggies[randomNo];
            totalPrice =priceCalculator(randomVeggies,totalPrice);

            randomNo = randomGenerator(cheese, run);
            randomCheese = cheese[randomNo];
            totalPrice =priceCalculator(randomCheese,totalPrice);

            randomNo = randomGenerator(guac, run);
            randomGuac = guac[randomNo];
            totalPrice =priceCalculator(randomGuac,totalPrice);

            randomNo = randomGenerator(queso, run);
            randomQueso = queso[randomNo];
            totalPrice =priceCalculator(randomQueso,totalPrice);

            randomNo = randomGenerator(sourCream, run);
            randomSourCream = sourCream[randomNo];
            totalPrice =priceCalculator(randomSourCream,totalPrice);


            System.out.println("Burrito " + count + ":" + randomRice + ", " + randomMeat + ", " +
                    randomBean + ", " + randomSalsa + "," + randomVeggies + ", " + randomCheese +
                    ", " + randomGuac + "," + randomQueso + ", " + randomSourCream + "\t\t $" + totalPrice);
        }

    }

    public static int randomGenerator(String arr[], Random r){
        int randomNumber;
        randomNumber = r.nextInt(arr.length);
        return randomNumber;
    }

    public static double priceCalculator(String item, double currentPrice){
        if (item.charAt(0) == 'n')
        {
            currentPrice += 0;
        } else{
            currentPrice += 0.50;
        }
        return currentPrice;
    }
}
