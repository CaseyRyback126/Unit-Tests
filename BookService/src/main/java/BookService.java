public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public int getNumberOfBooks() {
        return bookRepository.getAllBooks().size();
    }
}
