package in.thiru.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Orders {
	
	   @Id
	    @GeneratedValue(generator = "order-id-generator")
	    @GenericGenerator(
	        name = "order-id-generator",
	        strategy = "in.thiru.service.CustomGenerator"
	    )
	    private String orderId;

	    private String productName;

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Orders(String productName) {
			
			this.productName = productName;
		}
		public Orders() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Orders [orderId=" + orderId + ", productName=" + productName + "]";
		}
		
		
		
	    
	    

}
