package book.store.onlinebookstore.repository.book.spec;

import book.store.onlinebookstore.model.Book;
import book.store.onlinebookstore.repository.SpecificationProvider;
import java.util.Arrays;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class AuthorSpecificationProvider implements SpecificationProvider<Book> {
    @Override
    public String getKey() {
        return "author";
    }

    public Specification<Book> getSpecification(String[] params) {
        return (root, query, criteriaBuilder) -> root.get("author")
                .in(Arrays.stream(params).toList());
    }
}