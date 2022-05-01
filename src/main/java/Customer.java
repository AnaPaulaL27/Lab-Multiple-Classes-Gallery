import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> customerArtwork;

    public Customer(String name, double wallet){
        this.name=name;
        this.wallet= wallet;
        this.customerArtwork = new ArrayList<>();
    }
    //method to check whether customer has enough to buy
    public boolean canBuy(Artwork artwork){
        //if the price of the artwork is less than or equal to money in wallet,
        //customer canBuy
        if (artwork.getPrice() <=this.wallet){
            return true;
        }
        //...otherwise return false
        return false;
    }

    //method for customer to buy artwork
    public void buyArtwork(Artwork artwork) {
        //getting price of artwork and removing it from wallet
        this.wallet -= artwork.getPrice();

        //When an Artwork is purchased, it should transfer from the Gallery collection to the Customer collection.
        //adding purchased artwork to customer collection
        this.customerArtwork.add(artwork);

    }
    public int getArtworkCount(){
        return this.customerArtwork.size();
    }




    //Getters + Setters

    public String getName() {return name;
    }

    public void setName(String name) {this.name = name;
    }

    public double getWallet() {return wallet;
    }

    public void setWallet(double wallet) {this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerArtwork() {return customerArtwork;
    }

    public void setCustomerArtwork(ArrayList<Artwork> customerArtwork) {this.customerArtwork = customerArtwork;
    }
}
