public class switchChallenge {
    public static void main(String[] args){
        char letter = 'B';
        switch (letter){
            case 'A' :
                System.out.println("letter " + letter + " to NATO alphabet means Able");
                break;
            case 'B' :
                System.out.println("letter " + letter + " to NATO alphabet means Baker");
                break;
            case 'C' :
                System.out.println("letter " + letter + " to NATO alphabet means Charlie");
                break;
            case 'D' :
                System.out.println("letter " + letter + " to NATO alphabet means Dog");
                break;
            case 'E' :
              System.out.println("letter " + letter + " to NATO alphabet means Easy");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
