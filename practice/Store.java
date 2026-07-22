public class Store {

    private Long storeId;
    private String name;
    private String address;

    public Store(Long storeId, String name, String address) {
        this.storeId = storeId;
        this.name = name;
        this.address = address;
    }

    public Long getStoreId() {
        return storeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}