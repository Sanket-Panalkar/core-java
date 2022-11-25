class Flipkart{
static String mobile = ("12 GB RAM | 256 GB ROM--17.09 cm (6.73 inch) Full HD+ AMOLED Display50MP--Rear Camera4600 mAh Battery Snapdragon@ 8 Gen 1 Processor");

public static String productInformation(String product){
 System.out.println("invoking product Information");
 if(product == "Xiaomi12Pro"){
	 return mobile;
 }
 else{ 
	 System.out.println("product is not avilable");
 }
  System.out.println("end of productInformation()");
  return "";
}
}