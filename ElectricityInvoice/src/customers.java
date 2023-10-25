public class customers {
    private String name;
    private String address;
    private int kwConsumed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getKwConsumed() {
        return kwConsumed;
    }
    public void setKwConsumed(int kwConsumed) {
        this.kwConsumed = kwConsumed;
    }

    public customers(String name , String address , int kwConsumed) {
        this.name=name;
        this.address=address;
        this.kwConsumed=kwConsumed;
        setName(name);
        setAddress(address);
        setKwConsumed(kwConsumed);
    }
}
