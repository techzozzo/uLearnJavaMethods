public class methodOverloadChallenge {
    public static void main(String[] args){
        int inches = 8;
        int foots = 10;
        System.out.println(inches + " inches to cm = "+convertToCentimeters(inches)+" cm.");
        System.out.println(foots + " feet and "+inches + " inches = " +
                 convertToCentimeters(foots, inches)+" cm.");
    }

    public static double convertToCentimeters(int in){
        double cm = (double)(in) * 2.54;
        return cm;
    }

    public static double convertToCentimeters(int feet, int remIn){
        double cm = ((double)(feet * 12) + (double)(remIn)) * 2.54;
        return cm;
    }
}
