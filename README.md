# Make Change Project

## Description
This program takes two inputs, an item's value and the amount of money tendered by the customer. It then prints the total amount of change due and how many of each type of denomination is owed to the customer.

The class contains three methods: main, userPrompt and makeChange.
    - main method calls the userPrompt method, then prints one of two statements in the event the customer does not need any change, or it calls the makeChange method if change is due to the customer.
    - userPrompt method uses a scanner to gather the item total and amount of money tendered, and returns the amount of change due to the customer in cents. Cents were used to prevent rounding issues with floating point numbers.
    - makeChange method uses two arrays which represent the denominations available, and a for loop to iterate through the values from highest to lowest. The quantity of a given denomination needed is determined and then the change remaining is calculated using the modulus (%) operator. The amount of that denomination is then printed to the console, unless there are none needed.

## What I Learned
The first working version of this program contained a lot of repeated code in the makeChange method. I learned a lot about using arrays and how to condense code using arrays and loops to prevent repetitionsin the code.

## Technologies Used
Java, Eclipse, Git

