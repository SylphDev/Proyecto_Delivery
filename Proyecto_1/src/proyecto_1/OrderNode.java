package proyecto_1;

public class OrderNode {
    
    private String origin;
    private String destiny;
    private FoodList order;
    private OrderNode next;
    
    public OrderNode(){
        this.origin = null;
        this.destiny = null;
        this.order = null;
        this.next = null;
    }
    
    public OrderNode(String origin, String destiny){
        this.origin = origin;
        this.destiny = destiny;
        this.order = null;
        this.next = null;
    }
    
    public OrderNode(String origin, String destiny, FoodList order){
        this.origin = origin;
        this.destiny = destiny;
        this.order = order;
        this.next = null;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public FoodList getOrder() {
        return order;
    }

    public void setOrder(FoodList order) {
        this.order = order;
    }

    public OrderNode getNext() {
        return next;
    }

    public void setNext(OrderNode next) {
        this.next = next;
    }
    
    public String displayOrder(){
        String result = "ID Origen: " + this.origin + " ID Destino: " 
                + this.destiny + "\n";
        if (this.order != null){
            FoodNode aux = this.order.getFirst();
            for (int i = 0; i < this.order.getSize(); i++){
                result += "Plato: " + aux.getFoodName();
                result += " Cantidad: " + aux.getQuantity() + "\n";
                aux = aux.getNext();
            }
        }
        return result;
    }
    
}
