public class CountNames {
    public static void main(String args[]) {

        String[] names = { "Tommy Lee Jones", "William Hurt", "Nicole Kidman",
                "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy",
                "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };

        int numJones = 0;
        String suffix = "jones";
        for (String name : names) {
            if (name.toLowerCase().endsWith(suffix)) {
                numJones++;
            }
        }
        System.out.println("There are " + numJones + " actors with the last name Jones");
    }
}
