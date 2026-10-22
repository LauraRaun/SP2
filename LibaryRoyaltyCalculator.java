public class LibaryRoyaltyCalculator {

    public static void main (String[] args){

        Author author= new Author("Olga Ravn");

        PrintedBook book1 = new PrintedBook("Celestine", "SKØN", 140, 166);
        AudioBook book2 = new AudioBook("Celestine", "SKØN", 140, 192);
        PrintedBook book3 = new PrintedBook("De ansatte", "FAG", 100, 50);

        author.addTitle(book1);
        author.addTitle(book2);
        author.addTitle(book3);



        System.out.println("Author name: " + author.getName());
        System.out.println("Royalties: " + author.calculateRoyalties() + " Kr." );

        }
    }

