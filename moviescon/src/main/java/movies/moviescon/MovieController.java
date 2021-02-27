package movies.moviescon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@RestController
@RequestMapping("/movies")
public class MovieController {

	private static final Map<Long, String> MOVIES = ImmutableMap.of(
            1L, "Lord of rings",
            2L, "Harry Potter",
            3L, "Hobbit"
            	);

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(MOVIES.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return MOVIES.get(id);
    }
    
}
