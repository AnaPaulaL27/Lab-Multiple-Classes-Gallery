import java.util.ArrayList;


public class Gallery {

    //properties

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;

    //Constructor

    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<>();
    }

    // Gallery sells artwork

    public void sellArtwork(Customer customer, Artwork artwork) {
        //if the customer can buy the artwork
        if (customer.canBuy(artwork) == true) {
            //the artwork will be bought
            customer.buyArtwork(artwork);
            //the price of the artwork will be added to the till.
            setTill(this.till + artwork.getPrice());

            //When an Artwork is purchased, it should transfer from the Gallery collection to the Customer collection.
            // the artwork will be removed from the gallery + added to customer colelction
            this.artworks.remove(artwork);

        }
    }

        //Give the Gallery the ability to calculate the value of its collection with a stock_take() method

    public double calculateArtworkValue() {
        double total = 0;
        for (Artwork artwork : this.artworks) {
            total += artwork.getPrice();
        }
        return total;

    }

    //artworkcount

    public int artworkCount() {return this.artworks.size();}

    //add artwork
    public  void addArtwork(Artwork artwork){this.artworks.add(artwork);}


   //Getters + Setters


    public String getName() {return name;
    }

    public void setName(String name) {this.name = name;
    }

    public double getTill() {return till;
    }

    public void setTill(double till) {this.till = till;
    }

    public ArrayList<Artwork> getArtworks() {return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {this.artworks = artworks;
    }
}





