Question 1: MergeSort
public class MergeSort
{
    public static void sort(int[] a)
    { sort(a, 0, a.length - 1); }

    private static void sort(int[] a, int low, int high)
    { /* to be completed */ }

    /** Precondition: a[low]...a[mid] is sorted && a[mid+1]...a[high] is sorted
     *    *  Postcondition: a[low]...a[high] is sorted */
    private static void merge(int[] a, int low, int mid, int high)
    { /* implementation not shown */ }
}



Question 2: Inheritance
Problem description
The Parrot class represents a parrot with an age in years and the ability to learn sounds which it can repeat back when asked to speak. The declaration of the Parrot class is shown below.

public class Parrot
{

    /** Constructs a new Parrot object */
    public Parrot(String name)
    { /* implementation not shown */ }

    /** @return the age of the parrot in years */
    public int getAge()
    { /* implementation not shown */ }

    /** Adds sound to the list of sounds the parrot can make
     *  *  @param sound the sound to add */
    public void train(String sound)
    { /* implementation not shown */ }

    /** @return a random sound that the parrot can make */
    public String speak()
    { /* implementation not shown */ }

    // There may be instance variables, constructors, and methods that are not shown.
    // }
    // A pirate parrot is a type of parrot. A pirate parrot knows how to make the sound “Polly want a cracker” immediately upon birth. A pirate parrot can also steal souls whose age becomes part of the pirate parrot’s age. A pirate parrot is represented by the PirateParrot class, which you will write.
    //
    // Assume that the following code segment appears in a class other than PirateParrot. The code segment shows an example of using the PirateParrot class.
    //
    // PirateParrot polly = new PirateParrot("Polly");
    //
    // System.out.println(polly.getAge()); // prints 0
    // /* code to increase Polly's age by 5 years */
    // System.out.println(polly.getAge()); // prints 5
    //
    // polly.stealSoul(5);
    // polly.stealSoul(10);
    // System.out.println(polly.getAge()); // prints 20
    //
    // polly.train("Walk the plank");
    // polly.train("Off with his head");
    //
    // // Polly retires from his life as a pirate to a cushy life as a pet
    //
    // Parrot myPetPolly = polly;
    // System.out.println(myPetPolly.getAge()); // prints 20
    // myPetPolly.train("Time for bed");
    // System.out.println(myPetPolly.speak());
    // /* prints one of the following, chosen at random:
    //  * Polly want a cracker
    //   * Walk the plank
    //    * Off with his head
    //     * Time for bed
    //      */
    //      Write the PirateParrot class. Your code must produce the indicated results when invoked by the code given above.
    //
    //
