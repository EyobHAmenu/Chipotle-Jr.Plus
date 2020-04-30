import java.util.ArrayList;
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
        int numberOfNoItemSelected;
        double oneOrderPrice = 0;
        double totalOrderPrice = 0;


        ArrayList<String> selectedIteams = new ArrayList<>();

        int whiteRice = 0, brownRice = 0, chicken = 0, steak = 0, carnidas = 0, chorizo = 0, sofritas = 0, veggieMeat = 0,
                pintoBeans = 0, blackBeans = 0, mildSauce = 0, mediumSauce = 0, hotSouce = 0, lettuce = 0, fajitaVeggies = 0,
                cheesein = 0, guacumole = 0, quesoin = 0, sourCreamin = 0;

        String randomRice, randomMeat, randomBean, randomSalsa, randomVeggies, randomCheese,
                randomGuac, randomQueso, randomSourCream;


        
        String rice [] ={"White-rice", "Brown-rice", "no-rice", "All-rice"};
        String meat[] = {"Chicken", "Steak", "Carnidas", "Chorizo", "Sofritas", "Veggie-Meat", "no-meat", "All-meat"};
        String beans[] = {"Pinto-beans", "Black-beans", "no-bean", "All-beans"};
        String salsa[] = {"Mild-sauce", "Medium-sauce", "Hot-sauce", "no-salsa", "All-salsa"};
        String veggies[] = {"Lettuce", "Fajita-Veggies", "no-veggies", "All-veggies"};
        String cheese[] = {"Cheese", "no-cheese"};
        String guac[] = {"Guacumole", "no-guac"};
        String queso[] = {"Queso", "no-queso"};
        String sourCream[] = {"Sour-Cream", "no-sour-cream"};

        Random run = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("List of 25 burrito combination.");
        while (count < 25) {

            count++;
            numberOfNoItemSelected = 0;
            oneOrderPrice = 3;

            randomNo = run.nextInt(9); // generate random number 0 - 8

            randomRice = checkIndex(randomNo, rice);   // store the item selected using the random number
            selectedIteams.add(randomRice);
            numberOfNoItemSelected = countNoItemSelected(randomRice, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomRice, oneOrderPrice); // calculate the total price based on the item selected.


            randomMeat = checkIndex(randomNo, meat);
            selectedIteams.add(randomMeat);
            numberOfNoItemSelected = countNoItemSelected(randomMeat, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomMeat, oneOrderPrice);


            randomBean = checkIndex(randomNo, beans);
            selectedIteams.add(randomBean);
            numberOfNoItemSelected = countNoItemSelected(randomBean, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomBean, oneOrderPrice);


            randomSalsa = checkIndex(randomNo, salsa);
            selectedIteams.add(randomSalsa);
            numberOfNoItemSelected = countNoItemSelected(randomSalsa, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomSalsa, oneOrderPrice);


            randomVeggies = checkIndex(randomNo, veggies);
            selectedIteams.add(randomVeggies);
            numberOfNoItemSelected = countNoItemSelected(randomVeggies, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomVeggies, oneOrderPrice);


            randomCheese = checkIndex(randomNo, cheese);
            selectedIteams.add(randomCheese);
            numberOfNoItemSelected = countNoItemSelected(randomCheese, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomCheese, oneOrderPrice);


            randomGuac = checkIndex(randomNo, guac);
            selectedIteams.add(randomGuac);
            numberOfNoItemSelected = countNoItemSelected(randomGuac, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomGuac, oneOrderPrice);


            randomQueso = checkIndex(randomNo, queso);
            selectedIteams.add(randomQueso);
            numberOfNoItemSelected = countNoItemSelected(randomQueso, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomQueso, oneOrderPrice);


            randomSourCream = checkIndex(randomNo, sourCream);
            selectedIteams.add(randomSourCream);
            numberOfNoItemSelected = countNoItemSelected(randomSourCream, numberOfNoItemSelected);
            oneOrderPrice = priceCalculator(randomSourCream, oneOrderPrice);

            if (numberOfNoItemSelected < 5) {
                // print all selected item from the arrays and the total price
                System.out.println("Burrito " + count + ":" + randomRice + " " + randomMeat + " " +
                        randomBean + " " + randomSalsa + " " + randomVeggies + " " + randomCheese +
                        " " + randomGuac + " " + randomQueso + " " + randomSourCream);

                System.out.println("$" + oneOrderPrice);

                totalOrderPrice += oneOrderPrice;
            } else {
                count--;
            }
        }

        // count each selected ingredients.
        for (int i = 0; i < selectedIteams.size(); i++) {
            if (selectedIteams.get(i).equalsIgnoreCase("White-rice")) {
                whiteRice++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Brown-rice")) {
                brownRice++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Chicken")) {
                chicken++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Steak")) {
                steak++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Carnidas")) {
                carnidas++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Chorizo")) {
                chorizo++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Sofritas")) {
                sofritas++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Veggie-Meat")) {
                veggieMeat++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Pinto-beans")) {
                pintoBeans++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Black-beans")) {
                blackBeans++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Mild-sauce")) {
                mildSauce++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Medium-sauce")) {
                mediumSauce++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Hot-sauce")) {
                hotSouce++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Lettuce")) {
                lettuce++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Fajita-Veggies")) {
                fajitaVeggies++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Cheese")) {
                cheesein++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Guacumole")) {
                guacumole++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Queso")) {
                quesoin++;
            } else if (selectedIteams.get(i).equalsIgnoreCase("Sour-Cream")) {
                sourCreamin++;
            }
        }


        System.out.println("This order has " + whiteRice + " white rice, " + brownRice + " brown rice, " + chicken +
                " chicken, " + steak + " steak, " + carnidas + " carnitas, " + chorizo + " chorizo, " + sofritas + " sofritas, " +
                veggieMeat + " veggies(as meat option), " + blackBeans + " black beans," + pintoBeans + " pinto beans, "
                + mildSauce + " mild salsa, " + mediumSauce + " med salsa," + hotSouce + " hot salsa, " + fajitaVeggies +
                " fajitas, " + lettuce + " lettuce, " + cheesein + " cheese, " + guacumole + " guac, " + quesoin + " queso, " +
                sourCreamin + " sour cream and total price is $" + totalOrderPrice);
    }


    // calculate the total price based on the item selected based random number generated.
    public static double priceCalculator(String item, double currentPrice){
        // if the string start with 'n' that mean no item is selected so we add 0 to the total price.
        if (item.charAt(0) == 'n' || item.equalsIgnoreCase(" "))
        {
            currentPrice += 0;
        } else{ // if not we add 0.5 to the total price.
            currentPrice += 0.50;
        }
        return currentPrice;
    }
    public static int countNoItemSelected(String item, int count){
        if (item.equalsIgnoreCase(" ")){
            count++;
        }
        return count;
    }

    public static String checkIndex(int generate , String [] arr){
        String out = " ";
        if(generate < arr.length){
            out = arr[generate];

        }
        return out;
    }
}
