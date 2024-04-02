
@Controller
public class MyController{ 
	
public @ResponseBody Author getAuthor(){ 
	Author author = new Author(); 
	author.setName("Jayshri"); 
	author.setAge(20); 
	return author; 
} 
} 
