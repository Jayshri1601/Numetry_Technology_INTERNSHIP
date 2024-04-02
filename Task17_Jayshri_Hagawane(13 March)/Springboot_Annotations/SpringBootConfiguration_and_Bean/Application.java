@SpringBootConfiguration
public class Application { 

	public static void main(String[] args) { 
		SpringApplication.run(Application.class, args); 
	} 

	@Bean             //Method level annotation
	public StudentService studentService() { 
		return new StudentServiceImpl(); 
	} 
}
