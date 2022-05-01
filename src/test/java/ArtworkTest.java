import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtworkTest {

    Artwork artwork;

    @BeforeEach

    //set up method
    public void setUp() {artwork = new Artwork("LifeOfAna", "Ana Paula", 35, 100);
    }

    @Test

    //Test method
    public void artworkHasTitle() {  assertThat(artwork.getTitle()).isEqualTo("LifeOfAna");
    }

    @Test

    public void artworkHasArtist()
    { assertThat(artwork.getArtist()).isEqualTo("Ana Paula");
    }

    @Test

    public void artworkHasPrice()
    { assertThat(artwork.getPrice()).isEqualTo(35);
    }

    @Test

    public void artworkHasNFT()
    { assertThat(artwork.getNft()).isEqualTo(100);
    }
}
