public class Laptop {
    private int RAMgb;
    private String name;
    private int HDD;
    private int SSD;
    private String OS;
    private String color;

    public Laptop(int RAMgb,String name, int HDD, int SSD, String OS ,String color){
        this.color = color;
        this.SSD = SSD;
        this.HDD = HDD;
        this.name = name;
        this.OS = OS;
        this.RAMgb = RAMgb;
    }

    public int getRAMgb() {
        return RAMgb;
    }
    public void setRAMgb(int RAMgb){
        this.RAMgb = RAMgb;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getHDD(){
        return HDD;
    }
    public void setHDD(int HDD){
        this.HDD = HDD;
    }

    public int getSSD(){
        return SSD;
    }
    public void setSSD(int SSD){
        this.SSD = SSD;
    }

    public String getOS(){
        return OS;
    }
    public void setOS(String OS){
        this.OS = OS;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}