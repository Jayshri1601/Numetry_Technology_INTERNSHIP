import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringbootCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCrudApplication.class, args);
    }
}

@RestController
@RequestMapping("/api")
class CrudController {

    private List<String> items = new ArrayList<>();

    // Create
    @PostMapping("/items")
    public String addItem(@RequestBody String item) {
        items.add(item);
        return "Item added successfully";
    }

    // Read
    @GetMapping("/items")
    public List<String> getItems() {
        return items;
    }

    // Update
    @PutMapping("/items/{index}")
    public String updateItem(@PathVariable int index, @RequestBody String newItem) {
        if (index >= 0 && index < items.size()) {
            items.set(index, newItem);
            return "Item updated successfully";
        } else {
            return "Invalid index";
        }
    }

    // Delete
    @DeleteMapping("/items/{index}")
    public String deleteItem(@PathVariable int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return "Item deleted successfully";
        } else {
            return "Invalid index";
        }
    }
}
