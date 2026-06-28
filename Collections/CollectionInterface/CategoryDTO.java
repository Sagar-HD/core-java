package CollectionInterface;

public class CategoryDTO {
    private int categoryId;
    private String name;
    private String description;
    private Integer parentId;
    private String status;

    public CategoryDTO() {
    }

    public CategoryDTO(int categoryId, String name, String description, Integer parentId, String status) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.parentId = parentId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", parentId=" + parentId +
                ", status='" + status + '\'' +
                '}';
    }
}

