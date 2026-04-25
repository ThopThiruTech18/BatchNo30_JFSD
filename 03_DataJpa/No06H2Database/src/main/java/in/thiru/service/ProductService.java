package in.thiru.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Product;
import in.thiru.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	
	public void insertProducts()
	{
		List<Product> products = new ArrayList<>();

		Product p1 = new Product();
		p1.setProductName("Laptop");
		p1.setProductPrice(55000.0);
		products.add(p1);

		Product p2 = new Product();
		p2.setProductName("Mouse");
		p2.setProductPrice(499.0);
		products.add(p2);

		Product p3 = new Product();
		p3.setProductName("Keyboard");
		p3.setProductPrice(899.0);
		products.add(p3);

		Product p4 = new Product();
		p4.setProductName("Monitor");
		p4.setProductPrice(12000.0);
		products.add(p4);

		Product p5 = new Product();
		p5.setProductName("Printer");
		p5.setProductPrice(8500.0);
		products.add(p5);

		Product p6 = new Product();
		p6.setProductName("Scanner");
		p6.setProductPrice(6500.0);
		products.add(p6);

		Product p7 = new Product();
		p7.setProductName("Tablet");
		p7.setProductPrice(18000.0);
		products.add(p7);

		Product p8 = new Product();
		p8.setProductName("Smartphone");
		p8.setProductPrice(25000.0);
		products.add(p8);

		Product p9 = new Product();
		p9.setProductName("Speaker");
		p9.setProductPrice(2200.0);
		products.add(p9);

		Product p10 = new Product();
		p10.setProductName("Headphones");
		p10.setProductPrice(1500.0);
		products.add(p10);

		Product p11 = new Product();
		p11.setProductName("Charger");
		p11.setProductPrice(799.0);
		products.add(p11);

		Product p12 = new Product();
		p12.setProductName("Power Bank");
		p12.setProductPrice(1200.0);
		products.add(p12);

		Product p13 = new Product();
		p13.setProductName("USB Cable");
		p13.setProductPrice(199.0);
		products.add(p13);

		Product p14 = new Product();
		p14.setProductName("External Hard Disk");
		p14.setProductPrice(4500.0);
		products.add(p14);

		Product p15 = new Product();
		p15.setProductName("Pendrive");
		p15.setProductPrice(699.0);
		products.add(p15);

		Product p16 = new Product();
		p16.setProductName("Router");
		p16.setProductPrice(2300.0);
		products.add(p16);

		Product p17 = new Product();
		p17.setProductName("Webcam");
		p17.setProductPrice(1800.0);
		products.add(p17);

		Product p18 = new Product();
		p18.setProductName("Microphone");
		p18.setProductPrice(2700.0);
		products.add(p18);

		Product p19 = new Product();
		p19.setProductName("Graphics Card");
		p19.setProductPrice(45000.0);
		products.add(p19);

		Product p20 = new Product();
		p20.setProductName("RAM 8GB");
		p20.setProductPrice(3200.0);
		products.add(p20);

		Product p21 = new Product();
		p21.setProductName("RAM 16GB");
		p21.setProductPrice(6200.0);
		products.add(p21);

		Product p22 = new Product();
		p22.setProductName("SSD 256GB");
		p22.setProductPrice(2800.0);
		products.add(p22);

		Product p23 = new Product();
		p23.setProductName("SSD 512GB");
		p23.setProductPrice(5200.0);
		products.add(p23);

		Product p24 = new Product();
		p24.setProductName("HDD 1TB");
		p24.setProductPrice(3500.0);
		products.add(p24);

		Product p25 = new Product();
		p25.setProductName("HDD 2TB");
		p25.setProductPrice(5500.0);
		products.add(p25);

		Product p26 = new Product();
		p26.setProductName("Gaming Mouse");
		p26.setProductPrice(1500.0);
		products.add(p26);

		Product p27 = new Product();
		p27.setProductName("Gaming Keyboard");
		p27.setProductPrice(3500.0);
		products.add(p27);

		Product p28 = new Product();
		p28.setProductName("Gaming Chair");
		p28.setProductPrice(12000.0);
		products.add(p28);

		Product p29 = new Product();
		p29.setProductName("Desk Lamp");
		p29.setProductPrice(899.0);
		products.add(p29);

		Product p30 = new Product();
		p30.setProductName("Extension Board");
		p30.setProductPrice(499.0);
		products.add(p30);

		Product p31 = new Product();
		p31.setProductName("Projector");
		p31.setProductPrice(30000.0);
		products.add(p31);

		Product p32 = new Product();
		p32.setProductName("Smart TV");
		p32.setProductPrice(45000.0);
		products.add(p32);

		Product p33 = new Product();
		p33.setProductName("Bluetooth Adapter");
		p33.setProductPrice(599.0);
		products.add(p33);

		Product p34 = new Product();
		p34.setProductName("Cooling Pad");
		p34.setProductPrice(1200.0);
		products.add(p34);

		Product p35 = new Product();
		p35.setProductName("Laptop Stand");
		p35.setProductPrice(999.0);
		products.add(p35);

		Product p36 = new Product();
		p36.setProductName("Stylus Pen");
		p36.setProductPrice(1500.0);
		products.add(p36);

		Product p37 = new Product();
		p37.setProductName("Smart Watch");
		p37.setProductPrice(5000.0);
		products.add(p37);

		Product p38 = new Product();
		p38.setProductName("Fitness Band");
		p38.setProductPrice(2500.0);
		products.add(p38);

		Product p39 = new Product();
		p39.setProductName("VR Headset");
		p39.setProductPrice(22000.0);
		products.add(p39);

		Product p40 = new Product();
		p40.setProductName("Drone");
		p40.setProductPrice(60000.0);
		products.add(p40);

		Product p41 = new Product();
		p41.setProductName("Camera");
		p41.setProductPrice(40000.0);
		products.add(p41);

		Product p42 = new Product();
		p42.setProductName("Tripod");
		p42.setProductPrice(1800.0);
		products.add(p42);

		Product p43 = new Product();
		p43.setProductName("Memory Card");
		p43.setProductPrice(900.0);
		products.add(p43);

		Product p44 = new Product();
		p44.setProductName("LED Light");
		p44.setProductPrice(2200.0);
		products.add(p44);

		Product p45 = new Product();
		p45.setProductName("Electric Kettle");
		p45.setProductPrice(1500.0);
		products.add(p45);

		Product p46 = new Product();
		p46.setProductName("Mixer Grinder");
		p46.setProductPrice(3500.0);
		products.add(p46);

		Product p47 = new Product();
		p47.setProductName("Induction Stove");
		p47.setProductPrice(2800.0);
		products.add(p47);

		Product p48 = new Product();
		p48.setProductName("Air Purifier");
		p48.setProductPrice(12000.0);
		products.add(p48);

		Product p49 = new Product();
		p49.setProductName("Water Heater");
		p49.setProductPrice(7000.0);
		products.add(p49);

		Product p50 = new Product();
		p50.setProductName("Ceiling Fan");
		p50.setProductPrice(2500.0);
		products.add(p50);
		
		
		
		productRepo.saveAll(products);
	}
	
	

}
