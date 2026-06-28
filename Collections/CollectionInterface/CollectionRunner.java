package CollectionInterface;


import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;


public class CollectionRunner {
    public static void main(String[] args) {


  

        // OrderDTO group
        Collection<OrderDTO> orders = new HashSet<>();
        orders.add(new OrderDTO(101, 1, LocalDate.now(), "NEW", 2500.0));
        orders.add(new OrderDTO(102, 2, LocalDate.now(), "PAID", 1200.5));
        System.out.println(orders);

        // EmployeeDTO group
        Collection<EmployeeDTO> employees = new LinkedList<>();
        employees.add(new EmployeeDTO(1, "A", "IT", "Developer", 80000));
        employees.add(new EmployeeDTO(2, "B", "HR", "Manager", 90000));
        System.out.println(employees);

     
        // SupplierDTO group
        Collection<SupplierDTO> suppliers = new ArrayList<>();
        suppliers.add(new SupplierDTO(1, "ABC Traders", "Pune", "John", "77777"));
        System.out.println(suppliers);

        // CategoryDTO group
        Collection<CategoryDTO> categories = new TreeSet<>();
        categories.add(new CategoryDTO(1, "Electronics", "Devices", null, "ACTIVE"));
        System.out.println(categories);

        // InvoiceDTO group
    Collection<InvoiceDTO> invoices = new Stack<>();
        invoices.add(new InvoiceDTO(5001, 101, 2500.0, LocalDate.now().plusDays(10), "UNPAID"));
        System.out.println(invoices);

        // ShipmentDTO group
        Collection<ShipmentDTO> shipments = new Vector<>();
        shipments.add(new ShipmentDTO(9001, 101, "DHL", "TRK123", LocalDate.now().plusDays(2)));
        System.out.println(shipments);

        // ReviewDTO group
        Collection<ReviewDTO> reviews = new CopyOnWriteArrayList<>();
        reviews.add(new ReviewDTO(301, 10, 1, 5, "Great"));
        System.out.println(reviews);

        // DiscountDTO group
        Collection<DiscountDTO> discounts = new LinkedHashSet<>();
        discounts.add(new DiscountDTO(701, "SAVE10", "10% off", 10.0, LocalDate.now().plusDays(30)));
        System.out.println(discounts);
    }
}

