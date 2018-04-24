class ProductService {

	public static void ProductService() {
	
		Product p1 = new Product();
		p1.setId(101);
		p1.setName("Cell phone");
		p1.setPrice(234.56);
		System.out.println(p1);
		
		Product p2 = new Product(202, "TV", 678.90);
		System.out.println(p2);
	}

}