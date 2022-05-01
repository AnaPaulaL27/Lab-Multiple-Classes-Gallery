public class Artwork {

    //properties
    private String title;
    private String artist;
    private int price;
    private int nft;

    // the constructor

    public Artwork(String title, String artist, int price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }


//getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getPrice() {return price;
    }

    public void setPrice(int price) {this.price = price;
    }

    public int getNft() {return nft;
    }

    public void setNft(int nft) {this.nft = nft;
    }

    public String getArtist() {return artist;
    }

    public void setArtist(String artist) {this.artist = artist;
    }
}
