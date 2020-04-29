import java.util.Random;
import java.util.Scanner;

public class Chipotle {
    public static void main(String[] args) {
        /*
           Pseudocode
                Declare variables int, double and string
                Declare and initialize string array

                Open while loop until counter reaches 25
                    increase counter by 1.
                    int variable send values to the randomGenerator method.
                    string variable store the value from the array based on the in variable generated.
                    int variable to store the calculated price that we get from priceCalculator method.

                    Display the item generated from all arrays and the total price
                Finally when count reach 25 while loop stop.

                Create randomGenerator method
                    That accept array variable, Random variable
                    Generate random number and return the number generated.

                Create priceCalculator  method
                    That accept String variable and double variable
                    if the string starts with n add 0 to the double variable
                    else it add 0.5 to the double variable and return the double variable.
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

            randomNo = randomGenerator(rice,run); // generate number based on the length of the array.
            randomRice = rice[randomNo];   // store the item selected using the random number
            totalPrice = priceCalculator(randomRice,totalPrice); // calculate the total price based on the item selected.

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

            // print all selected item from the arrays and the total price
            System.out.println("Burrito " + count + ":" + randomRice + ", " + randomMeat + ", " +
                    randomBean + ", " + randomSalsa + "," + randomVeggies + ", " + randomCheese +
                    ", " + randomGuac + "," + randomQueso + ", " + randomSourCream + "\t\t $" + totalPrice);
        }

    }

    // This method generate random number based on the array length and return the number selected.
    public static int randomGenerator(String arr[], Random r){
        int randomNumber;
        // generate number 1 to array length
        randomNumber = r.nextInt(arr.length);
        return randomNumber;
    }

    // calculate the total price based on the item selected based random number generated.
    public static double priceCalculator(String item, double currentPrice){
        // if the string start with 'n' that mean no item is selected so we add 0 to the total price.
        if (item.charAt(0) == 'n')
        {
            currentPrice += 0;
        } else{ // if not we add 0.5 to the total price.
            currentPrice += 0.50;
        }
        return currentPrice;
    }
}
