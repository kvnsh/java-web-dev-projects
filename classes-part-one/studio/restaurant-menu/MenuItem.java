public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date lastUpdated;

    // Constructor
    public MenuItem(String name, double price, String description, String category, boolean isNew, Date lastUpdated) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.lastUpdated = lastUpdated;
    }

    // Getters and Setters for all fields
    public String getName() {...}
    public void setName(String name) {...}

    public double getPrice() {...}
    public void setPrice(double price) {...}

    public String getDescription() {...}
    public void setDescription(String description) {...}

    public String getCategory() {...}
    public void setCategory(String category) {...}

    public boolean isNew() {...}
    public void setNew(boolean isNew) {...}

    public Date getLastUpdated() {...}
    public void setLastUpdated(Date lastUpdated) {...}
}
