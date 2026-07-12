import com.library.Repository.BookService;

public class LibraryManagementApplication {
public static void main(String[] args) {
        
        // Load the Spring context (Exercise 1)
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the bean and test the configuration/injection (Exercises 1 & 2)
        BookService bookService = (BookService) context.getBean("bookService");
        
        // If the injection is successful, this will successfully call the repository method
        bookService.performService();
    }

}
