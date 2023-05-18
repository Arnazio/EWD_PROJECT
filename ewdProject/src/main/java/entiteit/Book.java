package entiteit;

import javax.persistence.*;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String authors;
    private String isbn;
    private BigDecimal purchasePrice;

    @ManyToMany(mappedBy = "favoriteBooks")
    private Set<User> users = new HashSet<>();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BookLocation> locations = new HashSet<>();

    // getters and setters

    // optional: additional constructors, methods, etc.
}
