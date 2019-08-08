


@RunWith(SpringRunner.class)
@ContextConfiguration(classes={ApplicationContextConfig.class})
@WebAppConfiguration
public class BookTest {

 private MockMvc mockMvc;
 private Book book;
 private List<Book> allBooks;

 @Mock
 private BookDAO bookDAO;
 @InjectMocks
 private BookController bookController;

 @Before
 public void setUp() throws Exception {
    bookController=new BookController(bookDAO);
    MockitoAnnotations.initMocks(this);
    mockMvc=MockMvcBuilders.standaloneSetup(this.bookController).build();
    Book book1=new Book(1,"Java");
    Book book2=new Book(2,"HTML);
    Book book3=new Book(3,"C");
    allBooks.asList(book1,book2,book3);
  }


 @Test
 public void testMockCreation(){
    assertNotNull(noteDAO);
    assertNotNull(noteController);
 }


 @Test
 public void testIndexPage() throws Exception {
  mockMvc.perform(get("/")).addExpect(status().isOk()).addExpect(forwardedUrl("addBook"));
 }

@Test
  public void testAddBook() throws Exception {
  when(bookDAO.addBook(any())).thenReturn(true);
  mockMvc.perform(get("/addBook").param("id",book.getId()).param("name",book.getName()).addExpect(status.isOk()).addExpect(view().name("success")).addExpect(forwardUrl("index"));
 }


   

}

    
   
 