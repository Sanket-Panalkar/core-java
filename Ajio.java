class Ajio{

public static double iteminfo(String item){
 if(item == "shirt"){
	 return 700.0;
 }
 if(item == "tshirt"){
	 return 599.0;
 }
 if(item == "pant"){
	 return 1200.0;
 }
 if(item == "jacket"){
	 return 2200.0;
 }
 if(item == "formalshoes"){
	 return 3000.0;
 }
 if(item == "sneakers"){
	 return 2500.0;
 }
 if(item == "casulShoes"){
	 return 1500.0;
 }
 if(item == "boots"){
	 return 962.0;
 }
 if(item == "bag"){
	 return 200.0;
 }
 if(item == "samrtWatch"){
	 return 4500.0;
 }
 else{
	 System.out.println("item is not avilable");
 }
  System.out.println("end of iteminfo()");
  return 0.0;
}
}