package it.eng.storemanager.repository;

import it.eng.storemanager.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {
    private List<Product> list;

    {
        list = new ArrayList<>();
        list.add(new Product(1, "product 1", 10, 1000));
        list.add(new Product(2, "product 2", 20, 2000));
        list.add(new Product(3, "product 3", 30, 3000));
    }

    public List<Product> getAllProducts() {
        return list;
    }

    public Product findById(int id){

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<Product> search(String name) {
        return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
    }

    public Product save(Product p) {

        if(findById(p.getId())!= null) throw new RuntimeException("ID already used");

        Product product = new Product();
        product.setId(p.getId());
        product.setName(p.getName());
        product.setQuantity(p.getQuantity());
        product.setPrice(p.getPrice());
        list.add(product);
        return product;
    }

    public String delete(Integer id) {
        if( findById(id) == null) throw new RuntimeException("ID not found");
        list.removeIf(x -> x.getId() == (id));
        return null;
    }

    public Product update(Product productUpdate) {

        int listId = 0;
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (productUpdate.getId())) {
                listId = i;
                found = true;
                break;
            }
        }

        if(!found){
           throw new RuntimeException("Product not found");
        }

        list.set(listId, productUpdate);
        return list.get(listId);

    }
}
