import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class GalleryTest {

    Gallery gallery;
    Artist artist1;
    Artist artist2;
    Artwork artwork1;
    Artwork artwork2;
    Customer customer;


@BeforeEach

    public void setUp(){

    gallery = new Gallery("Unique Visuals");

    artist1 = new Artist("Ana Paula Lima");
    artwork1 = new Artwork("Peaceful Troubles", "Ana Paula Lima", 16_000, 135);


    artist2 = new Artist("Gustavo da Sousa");
    artwork2 = new Artwork("Praia do Paraiso ", "Gustavo da Sousa",24_000, 325 );

    gallery.addArtwork(artwork1);
    gallery.addArtwork(artwork2);

    customer = new Customer("Susan Monet",80_000 );

}

@Test

//can sell artwork
public void galleryCanSellArtwork(){

    gallery.sellArtwork(customer, artwork1 );

    //check number of artwork has reduced by 1
    assertThat(gallery.artworkCount()).isEqualTo(1);

    //asserting that the amount in till increases by the amount of price of artwork1 when sold
    assertThat(gallery.getTill()).isEqualTo(16_000);

    //checking that when artwork is sold to customer their wallet has reduced: 80-16= 64
    assertThat(customer.getWallet()).isEqualTo(64_000);

    //checking that the customer artwork count increases by 1 when item sold to them
    assertThat(customer.getArtworkCount()).isEqualTo(1);

}

@Test

    //test to assert that we can calculate the art value i.e., sum of all artworks
    //price( artwork1 + artwork2)

public void canCalculateArtValue(){

    double result = gallery.calculateArtworkValue();
    assertThat(result).isEqualTo(40_000);

}

@Test
//asserting that gallery has a name

public void galleryHasName(){
    assertThat(gallery.getName()).isEqualTo("Unique Visuals");
}
@Test

//asserting that gallery till starts at 0

public void galleryTillStartsAtZero(){
    assertThat(gallery.getTill()).isEqualTo(0);

}

}