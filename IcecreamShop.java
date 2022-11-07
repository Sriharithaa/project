package flyweight;
import java.util.ArrayList;
import java.util.List;
public class IcecreamShop {
	
	
	  private final List<IcecreamOrder> icecreamOrders = new ArrayList<IcecreamOrder>();
	  private final IcecreamMenu icecreamMenu = new IcecreamMenu();
	  private void getIcecreamOrder(String flavourName, int tableNumber) {
	    IcecreamFlavour flavour = icecreamMenu.lookup(flavourName);
	    IcecreamOrder order = new IcecreamOrder(tableNumber, flavour);
	    icecreamOrders.add(order);
	  }
	  private void icecreamService() {
	    for (IcecreamOrder icecreamOrder : icecreamOrders) {
	      icecreamOrder.serveIcecream();
	    }
	  }
	  private String report() {
	    return "Total number of Icecream flavour served : " + icecreamMenu.totalIcecreamFlavours();
	  }

	public static void main(String[] args) {
		/**
		   * @param args
		   */
		  
		    IcecreamShop icecreamShop = new IcecreamShop();
		    icecreamShop.getIcecreamOrder("Vanilla", 2);
		    icecreamShop.getIcecreamOrder("Butter Scotch", 15);
		    icecreamShop.getIcecreamOrder("Cone", 7);
		    icecreamShop.getIcecreamOrder("Mango", 3);
		    icecreamShop.getIcecreamOrder("Apple", 5);
		    icecreamShop.getIcecreamOrder("Pineapple", 4);
		    icecreamShop.getIcecreamOrder("Two in One", 10);
		    icecreamShop.getIcecreamOrder("Butter Milk", 12);
		    icecreamShop.getIcecreamOrder("Lemon", 9);
		    icecreamShop.getIcecreamOrder("Chocolate", 13);
		    icecreamShop.icecreamService();
		    System.out.println(icecreamShop.report());
		  }
		
		

	}


