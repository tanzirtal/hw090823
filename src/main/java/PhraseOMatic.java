public class PhraseOMatic {
    public static void main(String[] args) {
        String [] wordListOne = {"platypus", "rhapsody", "helix", "candelabra", "froth", "whimsical", "tectonic", "glimmer", "juxtapose", "verdant", "obfuscate", "quasar"};
        String [] wordListTwo = {"Sydney", "Mumbai", "Reykjavik", "Nairobi", "Lima", "Oslo", "Jakarta", "Budapest", "Cape Town", "Montreal", "Manila", "Helsinki", "Ulaanbaatar", "Rio de Janeiro", "Cairo", "Dhaka", "Marrakech", "Busan"};
        String [] wordListThree = {"turqoise", "saffron", "magenta", "purple", "amber", "teal", "indigo", "maroon", "ochre", "lavender", "sienna", "orange"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
