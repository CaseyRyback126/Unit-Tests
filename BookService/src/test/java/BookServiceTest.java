import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookServiceTest {
    @Test
    public void testGetNumberOfBooks() {
        // Создаем мок-объект BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Подготавливаем данные для возврата из мок-объекта
        List<Book> books = Arrays.asList(new Book("Book1"), new Book("Book2"));
        when(bookRepository.getAllBooks()).thenReturn(books);

        // Создаем объект BookService с использованием мок-объекта
        BookService bookService = new BookService(bookRepository);

        // Вызываем метод, который мы хотим протестировать
        int result = bookService.getNumberOfBooks();

        // Проверяем, что результат соответствует ожиданиям
        assertEquals(2, result);
    }
}
