/*
*Ethan Chang
*echang28@u.rochester.edu
*
*07/07/2024: Implementing a print array and get maximum function
*/

public class Lab01 
{
    public static void main(String[] args) 
    {
        /*problems 1-3*/
        Integer [] intArry = {1, 2, 3, 4, 5 };
        Double [] doubArry = {1.1, 2.2, 3.3, 4.4};
        Character [] charArry = {'H','E','L', 'L', 'O' };
        String [] strArry = {"once", "upon", "a", "time" };
        printArray(intArry);
        printArray(doubArry);
        printArray(charArry);
        printArray(strArry);
        /*problems 4-6*/
        System.out.println("max Integer is: " + getMax(intArry));
        System.out.println("max Double is: " + getMax(doubArry));
        System.out.println("max Character is: " + getMax(charArry));
        System.out.println("max String is: " + getMax(strArry)) ;
    }

    /*
    *Implementation of the getMax function, which iterates through an input array and returns the max value
    */
    /*SECOND IMPLEMENTATION OF getMas WITH GENERICS */
    public static <T extends Comparable<T>> T getMax(T[] anArray)
    {
        T maxval = anArray[0];
        for (int i = 1; i < anArray.length; i++)
        {
            if (anArray[i].compareTo(maxval)>0)
            {
                maxval = anArray[i];
            }
        }
        return maxval;
    }

    /*FIRST IMPLEMENTATION OF getMax WITHOUT GENERICS
    *Errors: Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        charArry cannot be resolved to a variable
        strArry cannot be resolved to a variable
    public static Comparable getMax(Comparable[] anArray)
    {
        Comparable maxval = anArray[0];
        for (int i = 1; i < anArray.length; i++)
        {
            if (anArray[i].compareTo(maxval)>0)
            {
                maxval = anArray[i];
            }
        }
        return maxval;
    }
    */

    /*
    *Implementation of the print array function, which iterates through an input array and prints each element
    */
    /*THIRD IMPLEMENTATION OF printArray USING GENERICS*/
    public static <T> void printArray(T[] array) 
    {
        for (T element : array) //go through each element in the array
        {
            System.out.print(element + " "); //print out that element, seperated by spaces
        }
        System.out.println(); //new line for next time it is called
    }
    
    /*SECOND IMPLEMENTATION OF printArray USING MEHTOD OVERLOADING
    public static void printArray(Integer[] array) 
    {
        for (int element : array) //go through each element in the array
        {
            System.out.print(element + " "); //print out that element, seperated by spaces
        }
        System.out.println(); //new line for next time it is called
    }
    public static void printArray(Double[] array) 
    {
        for (double element : array) //go through each element in the array
        {
            System.out.print(element + " "); //print out that element, seperated by spaces
        }
        System.out.println(); //new line for next time it is called
    }
    public static void printArray(Character[] array) 
    {
        for (char element : array) //go through each element in the array
        {
            System.out.print(element + " "); //print out that element, seperated by spaces
        }
        System.out.println(); //new line for next time it is called
    }
    public static void printArray(String[] array) 
    {
        for (str element : array) //go through each element in the array
        {
            System.out.print(element + " "); //print out that element, seperated by spaces
        }
        System.out.println(); //new line for next time it is called
    }
    */
    
    /*FIRST IMPLEMENTATION USING OBJECT
    public static void printArray(Object[] array)
    {
        for (Object element : array) //go through each element in the array
        {
            System.out.print(element + " "); //print out that element, seperated by spaces
        }
        System.out.println(); //new line for next time it is called
    }
    */
}
