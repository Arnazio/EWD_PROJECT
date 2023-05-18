package entiteit;

import javax.persistence.*;

@Entity
public class BookLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String placeCode1;
    private String placeCode2;
    private String placeName;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;
    
    // Constructors, getters, and setters
    
    public BookLocation() {
    }
    
    public BookLocation(String placeCode1, String placeCode2, String placeName) {
        this.placeCode1 = placeCode1;
        this.placeCode2 = placeCode2;
        this.placeName = placeName;
    }
    
    // Getters and setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getPlaceCode1() {
        return placeCode1;
    }
    
    public void setPlaceCode1(String placeCode1) {
        this.placeCode1 = placeCode1;
    }
    
    public String getPlaceCode2() {
        return placeCode2;
    }
    
    public void setPlaceCode2(String placeCode2) {
        this.placeCode2 = placeCode2;
    }
    
    public String getPlaceName() {
        return placeName;
    }
    
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    
    public Book getBook() {
        return book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
}
