package Puzzles;

public final class MistakenRedeclare {

    public static void main(String... aArguments ) {
        MistakenRedeclare mistake = new MistakenRedeclare("blah");
        //Throws NullPointerException, since the return value of
        //getName is null.
        System.out.println("Length of name: " + mistake.getName().length());
    }

    public MistakenRedeclare(String aName) {
        //Oops! Setting a local variable, not the field!
        String fName = aName;
        //this style may help to eliminate such errors:
        //this.fName = aName;
    }

    public String getName(){
        return fName;
    }

    //..elided

    // PRIVATE
    private String fName;
}