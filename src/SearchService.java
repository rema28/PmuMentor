import java.util.ArrayList;
import java.util.List;

public class SearchService {

    private List<String> resources = new ArrayList<>();

    public SearchService() {
        resources.add("Study guide for Math 101");
        resources.add("Internship opportunity at Aramco for CS majors");
        resources.add("Web development tutorial for beginners");
        resources.add("Scholarship details for PMU students");
        resources.add("Workshop on Time Management");
    }

    public List<String> search(String keyword) {
        List<String> results = new ArrayList<>();

        for (String item : resources) {
            if (item.toLowerCase().contains(keyword.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }
}
