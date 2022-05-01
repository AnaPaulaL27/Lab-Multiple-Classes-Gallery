import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtistTest {

    Artist artist;

    @BeforeEach

    //set up method
    public void setUp() {artist = new Artist("Ana Paula"); }

    @Test

    public void artistHasName()
    { assertThat(artist.getName()).isEqualTo("Ana Paula");

    }

}
