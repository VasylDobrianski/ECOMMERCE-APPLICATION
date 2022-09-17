package Category;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Category {

    private UUID id;
    private String name;

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract LocalDate findDeliveryDueDate();

}
