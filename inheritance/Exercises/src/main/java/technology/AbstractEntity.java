package technology;

public abstract class AbstractEntity {
    private int id;
    private static int nextId = 1;

    AbstractEntity() {
        this.id = generateUniqueId();
    }

    private int generateUniqueId() {
        return nextId++;
    }
}
