import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {
    private List<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public List<T> getAllItems() {
        return items;
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> removeItem(T item) {
        items.remove(item);
        return items;
    }

    public int getItemCount() {
        return items.size();
    }
}
