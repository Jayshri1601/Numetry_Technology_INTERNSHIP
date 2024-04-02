
@RestController
public class MyController{ 
	
@GetMapping("/authors") 
public String getAuthors(@RequestParam(name="authorName") String name)
{ 
	System.out.println("Numetry Technologies");
} 
}
