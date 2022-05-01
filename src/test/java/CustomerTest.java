import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest {

    Customer customer;
    Artist artist1;
    Artwork artwork1;
    Artist artist2;
    Artwork artwork2;

    @BeforeEach

    public void setUp() {

        customer= new Customer("Linda Palmer", 76_000);

        artist1 =new Artist("Henry Hull");
        artwork1= new Artwork("SpitefulSeas", "HenryHull", 1_000, 846);

        artist2 =new Artist("George Smith");
        artwork2= new Artwork("FlowerBeds", "George Smith", 22_000_000, 1869);


    }

    @Test

    public void customerHasName() { assertThat(customer.getName()).isEqualTo("Linda Palmer");

    }

    @Test

    public void customerHasWallet() { assertThat(customer.getWallet()).isEqualTo(76_000);

    }

    @Test

    public void canAffordArtwork() { assertThat(customer.canBuy(artwork1)).isEqualTo(true);

    }

    @Test
    public void cannotAffordArtwork() { assertThat(customer.canBuy(artwork2)).isEqualTo(false);

    }


    @Test

    public void customerCanBuyArtwork(){
        customer.buyArtwork(artwork1);

        //asserting that amount in wallet has decreased after purchasing artwork 1
        //after purchasing artwork 1- wallet = 76,000- 1,000= 75,000
        assertThat(customer.getWallet()).isEqualTo(75_000);

        //after purchasing the artwork ,the customer artwork count increases to 1
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void customerArtworkCountStartsEmpty(){
        assertThat(customer.getArtworkCount()).isEqualTo(0);
    }

}
