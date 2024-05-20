package IOfile;

import java.io.Serializable;

public class Product implements Serializable {
	private String tool;
	private int  price;
	private static final long serialVersionUID=1L;
	public Product(String tool,int price) {
		// TODO Auto-generated constructor stub
		this.tool=tool;
		this.price=price;
	}
	@Override
	public String toString() {return price+":"+tool;}
}
