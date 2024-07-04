/*
*Ethan Chang
*echang28@u.rochester.edu
*
*07/07/2024: Implementing a print array and get maximum function
*/

public class Main 
{
    public static void main(String[] args) 
    {
        Integer [] intArry = {1, 2, 3, 4, 5 };
        Double [] doubArry = {1.1, 2.2, 3.3, 4.4};
        Character [] charArray = {'H','E','L', 'L', 'O' };
        String [] strArray = {"once", "upon", "a", "time" };
        printArray(intArry);
        printArray(doubArry);
        printArray(charArray);
        printArray(strArray);
    }

    /*
    *Implementation of the print array function, which iterates through an input array and prints each element
    */
    /*FIRST IMPLEMENTATION
    public static void printArray(Object[] array) 
    {
        for (Object element : array) //go through each element in the array
        {
            System.out.print(element + ", "); //print out that element, seperated by ,
        }
        System.out.println(); //new line for next time it is called
    }
    */
}
