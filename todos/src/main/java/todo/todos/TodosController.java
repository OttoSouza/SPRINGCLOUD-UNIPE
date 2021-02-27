package todo.todos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;
@RestController
@RequestMapping("/todos")
public class TodosController {

	private static final Map<Long, String> TODOS = ImmutableMap.of(
            1L, "Run at park",
            2L, "Clean my rrom",
            3L, "Study more"
            	);

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(TODOS.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return TODOS.get(id);
    }
}
