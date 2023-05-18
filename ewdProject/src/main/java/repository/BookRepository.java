package repository;

import entiteit.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // voeg eventuele aangepaste query-methoden toe indien nodig
}

