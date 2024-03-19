    public class WaterTank {
    private String brand,color;
    private float capacity, level;

    public WaterTank(){
        capacity=1000.0f;
        level=0.0f;
    }

    public WaterTank(float capacity){
        this.capacity=capacity;
        level=0.00f;
    }

    public WaterTank(String brand, float capacity){
        this.brand=brand;
        this.capacity=capacity;
        level=0.00f;
    }


public void setBrand(String brand) {this.brand = brand; }
public void setColor(String color) {this.color = color; }
public void setCapacity(float capacity) {this.capacity = capacity; }

public String getBrand() {return brand; }
public String getColor() {return color; }
public double getCapacity() {return capacity; }

public void addWater(float amount){
    if (amount>=0) {
        level+=amount;
    } else {
        System.err.print("Negative value found. CANNOT add water");
    }
}

public void removeWater(float amount){
    if (amount >=0) {
        level-=amount;
    } else {
        System.err.println("Negative value found. CANNOT remove water");
    }
}

public float currentWater(){ return level; }
public boolean isEmpty(){ return (level==0); }
public boolean isFull() { return (level>=capacity); }
public boolean overCap() { return (level>capacity); }

public float drain(){
    float wastage=level;
    level=0.00f;
    return wastage;
}

public void showWTInfo(){
    System.out.println("Brand\t\t: "+brand);
    System.out.println("Color\t\t: "+color);
    System.out.println("Capacity\t: "+capacity+"L");
    System.out.println("Water Level\t: "+level+"L"); 
    System.out.println("isEmpty\t\t: "+isEmpty());
    System.out.println("isFull\t\t: "+isFull());
    System.out.println("isOverCapacity\t: "+overCap());
}

public String displayWTInfo(){
    String hold="Brand\t\t: " + brand
                +"\nColor\t\t: " + color
                +"\nCapacity\t\t: " + capacity +"L"
                +"\nWater Level\t\t: " + level +"L"
                +"\nisEmpty\t\t: " + isEmpty()
                +"\nisFull\t\t: " +isFull()
                +"\nisOverCapacity: "+overCap();
                return hold;
}

public String viewWTInfo(){
    String hold="Brand\t: "+brand+
                "\tColor\t: "+color+
                "\nCapacrity\t: " +capacity+ "L" +
                "\tWater Level\t: " +level+ "L" +
                "\nisEmpty\t: " +isEmpty()+
                "\tisFull\t: " +isFull()+
                "\nRemaining Capacity : " +remainingCapacity()+"L" +
                "\nisOverCapacity: "+overCap();
                return hold;
}

public float remainingCapacity(){ return capacity-level;}

public String drawTank(String ch) {
    String display="";
    int tankHeight=0, liter=0;
    if(capacity<=100) {
        liter=10;
        tankHeight=(int)capacity/liter;
    } else if(capacity<=1000){
        liter=100;
        tankHeight=(int)capacity/liter;
    } else if (capacity<=10000){
        liter=1000;
        tankHeight=(int)capacity/1000;
    } else {
        liter=10000;
        tankHeight=(int)capacity/10000;
    }

    String get="<-"+(level+"L");
    for(int i=tankHeight;i>0;i--){
        display+=liter*i+"L|";

        if(i<=level/liter){
            display+=ch.repeat(20)+"|"+get;
            get="";
        } else {
            display+="\t\t  |";
        }
        display+="\n";
    }
    display+="    0L(______________________)";
    return "               ^^^^^^^^^^^^^^^^^^^^^\n"+display;
}

}




