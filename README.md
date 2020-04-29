# Different 25 Burrito combination making app.
##Pseudocode
#####Declare variables int, double and string
Declare and initialize string array

Open while loop until counter reaches 25
	increase counter by 1.
	
	int variable send values to the randomGenerator method.
	string variable store the value from the array based on 	the in variable generated.
	int variable to store the calculated price that we get from 	priceCalculator method.
	
	Display the item generated from all arrays and the total 	price
Finally when count reach 25 while loop stop.

Create randomGenerator method 
	That accept array variable, Random variable
	Generate random number and return the number 		generated.

Create priceCalculator  method
	That accept String variable and double variable
	if the string starts with n add 0 to the double variable
	else it add 0.5 to the double variable and return the 		double variable.

