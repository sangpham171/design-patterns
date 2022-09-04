import view.LongFormView;
import view.ShortFormView;
import view.View;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Design Patterns",
                             "Gamma et al.",
                             "A book about patterns",
                             "http://wikipedia.org/Design_Patterns");
        Artist artist = new Artist("Mickael Jackson", "The king of pop", "http://mickaeljackson.com");

        IResource bookResource = new BookResource(book);
        IResource artistResource = new ArtistResource(artist);

        View longFormView = new LongFormView();
        longFormView.addResource(bookResource);
        longFormView.addResource(artistResource);

        View shortFormView = new ShortFormView();
        shortFormView.addResource(bookResource);
        shortFormView.addResource(artistResource);

        System.out.println(longFormView.show());
        System.out.println(shortFormView.show());
    }
}