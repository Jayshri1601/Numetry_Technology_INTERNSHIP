
@RestController
public class MyController1
{ 
	
@GetMapping("/author") 
public void printAuthor(@RequestBody Author author)
{ 
	System.out.println("Jayshri");
} 
} 
