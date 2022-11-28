class SuperMarket1 {

static String fruits[] ={"apple","graypes","pinepalle","guva","dragon","papaya","orange","water melon","plum","rasberi"};
 
static String vegetabel[]={"potato","tomato","beans","chilli","onion","ginger","garlic","cabage","sweet potato","cucumber"};

static String chocolates[]={"Diry Milk","kit kat","alpenlibe","strawberry","5 star","Amul","nestle","mars","Parle","Dark"};

static String biscuits[]={"dark fantasy","parle G","sunfist","marie light","Delicious","Seenkes","butter milk","Butter Cookies","Brandy Span","Marie gold"};

static String perfumes[]={"Dolce and Gabbana","Mont Blanc","wild stone","tommy Hilfiger","BRUT","AD Issey Miyake","fogg","Dio","villan","SKINN"};

static String clothes []={"Sweather","Shirt","Jeans","T shirt","Suit","Gloves","Cap","Hawaiian shirt","Singlet","Shorts"};

static String groceries[]={"Meat","Pasta","oil","Bakery","bread","Fronze Food","Dairy","chees","Egg","Rice"};

static String kitchenSet[]={"Drinking Glass","Spoons","Mugs","Pans","pots","Bowls","Plates","Fork","baking sheet","kinfes"};

static String shampoo []={"Head and shoulder","Dove","Karthika","clinic puls","Wow","Sunsilk","Vatik","Himalayan","patanjali","loreal"};

static String shoes []={"Ankel Boots","Aathelet Shoes","Ballet","Boat Shoes","Casual shoes","Beach shoes","Brogues","formal shoes","derby"};

static String dryFruits []={"Pista","Apricot","Dates","Kaju","Badam","Kismis","Akhrot","Makhan","Beej","Dry Flags"};

static String cosmetics []={"White Exacited","Skinopad","Glow and go","TruNext","Gold star","GoodBlush","Flyzzy","skinAce","superDots","RyteFeel"};

static int i;
public static void main(String a[]){
 
 getFruits();
 getvegetabel();
 getchocolates();
 getbiscuits();
 getperfumes();
 getkitchenSet();
 getkitchenSet();
 getshoes();
 


}

  public static void getFruits(){
     System.out.println("getFruits method started......");
  for(int i=0;i<fruits.length; i++)
	{
	 System.out.println(fruits[i]);
	}
     System.out.println("getFruits method ended.....");
  }
  public static void getvegetabel(){
	  System.out.println("getvegitable method started......");
  for (int i=0;i<vegetabel.length;i++){
	  System.out.println("getvegitables method ended");
    }
  }
  public static void getchocolates(){
	  System.out.println("getchocolates method started");
  for(int i=0; i<chocolates.length; i++){
		System.out.println(chocolates[i]);
	}
  }
  public static void getbiscuits(){
	  System.out.println("getbiscuits method started");
  for(int i=0;i<biscuits.length;i++){
	  System.out.println(biscuits[i]);
  }
  }
  public static void getperfumes(){
	  System.out.println("getperfumes method started");
  for(int i=0; i<perfumes.length; i++);{
	    System.out.println(perfumes[i]);
	}
  }
  public static void getgroceries(){
	  System.out.println("getgroceries mettod started");
  for(int i=0; i<groceries.length; i++);
	{
		System.out.println(groceries[i]);
	}
  }
  public static void getkitchenSet(){
	  System.out.println("get method started");
  for(int i=0; i<kitchenSet.length; i++);
	{
        System.out.println(kitchenSet[i]);
	}
  }
  public static void getshoes(){
	  System.out.println("getshoes method started");
  for(int i=0; i<shoes.length; i++);
	{
		System.out.println(shoes[i]);
	}
  }
  
} 