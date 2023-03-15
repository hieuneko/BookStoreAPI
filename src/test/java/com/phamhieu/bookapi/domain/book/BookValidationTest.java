package com.phamhieu.bookapi.domain.book;

import com.phamhieu.bookapi.error.BadRequestException;
import org.junit.jupiter.api.Test;

import static com.phamhieu.bookapi.fakes.BookFakes.buildBook;
import static com.phamhieu.bookapi.domain.book.BookValidation.*;
import static org.junit.jupiter.api.Assertions.*;

class BookValidationTest {

    @Test
    void shouldValidateBookInformation() {
        final var book = buildBook();

        validateBookInformation(book);
    }

    @Test
    void shouldValidateBookInformation_TitleOrAuthorIsNull() {
        final var book = buildBook()
                .withTitle(null);

        assertThrows(BadRequestException.class, () -> validateBookInformation(book));
    }
}