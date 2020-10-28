package entitiesNew;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "sales")
public class Sale extends BaseEntity{


    private Product product;
    private Customer customer;
    private StoreLocation storeLocation;
    private LocalDate local_date;

    public Sale() {

    }

    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne(targetEntity = StoreLocation.class)
    @JoinColumn(name = "store_location_id", referencedColumnName = "id")
    public StoreLocation getStoreLocation() {
        return this.storeLocation;
    }

    public void setStoreLocation(StoreLocation storeLocation) {
        this.storeLocation = storeLocation;
    }

    @Column(name = "local_date")
    public LocalDate getLocalDate() {
        return local_date;
    }

    public void setLocalDate(LocalDate local_date) {
        this.local_date = local_date;
    }
}
