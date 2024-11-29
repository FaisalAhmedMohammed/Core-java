package in.ashokit.co;

import java.time.LocalDate;

public class Policy {

    private long id;
    private String serviceCategory;
    private String serviceProvider;
    private boolean isActive;
    private LocalDate createdOn;
    private LocalDate ExpiresOn;

    public Policy(long id, String serviceCategory, String serviceProvider, boolean isActive, LocalDate createdOn,
                  LocalDate expiresOn) {
        super();
        this.id = id;
        this.serviceCategory = serviceCategory;
        this.serviceProvider = serviceProvider;
        this.isActive = isActive;
        this.createdOn = createdOn;
        ExpiresOn = expiresOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDate getExpiresOn() {
        return ExpiresOn;
    }

    public void setExpiresOn(LocalDate expiresOn) {
        ExpiresOn = expiresOn;
    }

    @Override
    public String toString() {
        return "Policy [id=" + id + ", serviceCategory=" + serviceCategory + ", serviceProvider=" + serviceProvider
                + ", isActive=" + isActive + ", createdOn=" + createdOn + ", ExpiresOn=" + ExpiresOn + "]";
    }

    public static void main(String[] args) {
        // Corrected LocalDate object creation
        Policy po = new Policy(
                3212212,
                "Health",
                "HDFC",
                true,
                LocalDate.of(2023, 5, 2), // Corrected date format
                LocalDate.of(2025, 5, 2)  // Corrected date format
        );

        // Print the Policy object
        System.out.println(po);
    }
}