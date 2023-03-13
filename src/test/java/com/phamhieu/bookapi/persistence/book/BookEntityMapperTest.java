package com.phamhieu.bookapi.persistence.book;

import org.junit.jupiter.api.Test;

import static com.phamhieu.bookapi.fakes.BookFakes.buildBookEntities;
import static com.phamhieu.bookapi.fakes.BookFakes.buildBookEntity;
import static com.phamhieu.bookapi.persistence.book.BookEntityMapper.toBook;
import static com.phamhieu.bookapi.persistence.book.BookEntityMapper.toBooks;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookEntityMapperTest {

    @Test
    void shouldToBook_OK() {
        final var bookEntity = buildBookEntity();
        final var book = toBook(bookEntity);

        assertEquals(bookEntity.getId(), book.getId());
        assertEquals(bookEntity.getTitle(), book.getTitle());
        assertEquals(bookEntity.getAuthor(), book.getAuthor());
        assertEquals(bookEntity.getDescription(), book.getDescription());
        assertEquals(bookEntity.getCreatedAt(), book.getCreatedAt());
        assertEquals(bookEntity.getUpdatedAt(), book.getUpdatedAt());
        assertEquals(bookEntity.getImage(), book.getImage());
        assertEquals(bookEntity.getUserId(), book.getUserId());
    }

    @Test
    void shouldToBooks_OK() {
        final var bookEntities = buildBookEntities();
        final var book = toBooks(bookEntities);

        assertEquals(bookEntities.size(), book.size());
    }

    @Test
    void shouldToBookEntity_OK() {
        final var bookEntity = buildBookEntity();
        final var book = toBook(bookEntity);

        assertEquals(bookEntity.getId(), book.getId());
        assertEquals(bookEntity.getTitle(), book.getTitle());
        assertEquals(bookEntity.getAuthor(), book.getAuthor());
        assertEquals(bookEntity.getDescription(), book.getDescription());
        assertEquals(bookEntity.getCreatedAt(), book.getCreatedAt());
        assertEquals(bookEntity.getUpdatedAt(), book.getUpdatedAt());
        assertEquals(bookEntity.getImage(), book.getImage());
        assertEquals(bookEntity.getUserId(), book.getUserId());
    }
}