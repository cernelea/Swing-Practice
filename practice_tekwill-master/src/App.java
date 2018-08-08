
import com.tekwill.services.ShoeService;
import com.tekwill.services.Modifiable;
import com.tekwill.model.Product;
import com.tekwill.model.Shoe;
import com.tekwill.services.ShoeService;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ShoeService service = new ShoeService();
        service.create(100, 1, "nike", 43.0, "Sport");
        service.create(101, 4, "adidas", 44, "casual");
        service.create(102, 20, "Geox", 44.5, "Outdoor");

//service.delete("adidas");
//service.delete("Geox");
//service.delete("nike");

service.delete(4);
        System.out.println(service.showShoeList());
       
//        service.showShoeList();
////
//        System.out.println("");
//        Product findByKey = service.find(103);|
//        System.out.println(findByKey);
//        System.out.println("");
//        
//        

       
//        Product findByProduct = service.find(findByKey);
//
//        System.out.println(findByProduct);
//        
//        Product finById=service.find(1.0);
//        System.out.println(finById);
//        System.out.println("");
//        
//        Product findByName=service.find("adidas");
//        System.out.println(findByName);
//        
//        Product updateById=service.update(101, 60, "Reebok",50.0 , "Football");
//     service.showShoeList();
//     service.delete(102);
//        System.out.println("");
//        service.showShoeList();
        

CreateMenu createMenu=new CreateMenu();

        
        
        

//        Product findByKey = service.find(101);
//        System.out.println(findByKey);
//        Product findById=service.find(100, 1);
//        System.out.println(findById);
//        Product geox = new Shoe(20, "Geox", 44.5, "Outdoor");
//        Product findByProduct = service.find(geox);
//        System.out.println(findByProduct);
//        Product findById = service.find(geox, 20);
//        System.out.println(findById);
//        
//        service.showShoeList();
//
//        System.out.println(" "); 
//        Product findById = service.find(20);
//        System.out.println(findById);
//        System.out.println(" ");
//        Product findByName = service.find("nike");
//        System.out.println(findByName);
//        System.out.println(" ");
//        Product productUpdate = service.update(4, 2, "Reebook", 46.0, "La moda");
//        service.showShoeList();
//        System.out.println("");
//        service.delete(2);
//        service.showShoeList();
//
//        Product nike = new Shoe(1, "nike", 43.0, "Sport");
//
//        Product findNike = service.find(nike);
//        System.out.println(findNike);
//
//        System.out.println(nike.hashCode());
//    service.create(0, "Nike", 49, " sport");
//    service.create(1, "Reebok", 48, "casual");
//    service.create(2, "Adidas", 48, "running");
////  service.create(3, "Adidas", 48, "running");
////    service.showShoeList();
////
////    System.out.println("");
//System.out.println(service.shoeList[1].getName());
//
//    Product findObject2 = service.find(1);
//    System.out.println(findObject2 + "\t find operation by ID");
//    System.out.println("");
//
//    Product findByName = service.find("Nike");
//    System.out.println(findByName + " Overloaded find operation by Name" + "\n ");
//
// //
//
//    service.delete(2);
//    service.showShoeList();
//    service.delete(1);
//    service.showShoeList();
////    service.delete(0);
//    service.showShoeList();
//    System.out.println("Delete operation");
    }

}
