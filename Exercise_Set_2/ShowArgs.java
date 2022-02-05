public class ShowArgs {
    public static void main(String args[]) {
        System.out.println("You have provided " + args.length + " args");
        System.out.println("Here are your args:");
        for (String arg : args) {
            System.out.println(arg + ", ");
        }
    }
}
