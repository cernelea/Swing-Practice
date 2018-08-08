//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.tekwill.services;

import com.tekwill.model.Product;

/**
 *
 * @author sscerbatiuc
 */
public interface Modifiable {

    void create(Integer key, Integer id, String name, double size, String type);

    Product find(int key);

    Product find(Product product);

    Product find(Product product, String name);

    Product find(Product product, int id);

    Product find(int key, int id);

    Product find(Double id);

    Product find(String name);

    // void create();
    Product update(Double id, String name, double size, String type);

    Product update(int key, int id, String name, double size, String type);

    void delete(Integer id);

    void delete(String name);

    String showShoeList();

}
