public class Main {
    public static void main(String[] args) {
        House house=new House();
        Waiter waiter=new Waiter(house);
        Guest guest1=new Guest(house);
        Guest guest2=new Guest(house);
        Guest guest3=new Guest(house);
        Guest guest4=new Guest(house);
        Guest guest5=new Guest(house);
        Guest guest6=new Guest(house);
        Guest guest7=new Guest(house);
        Guest guest8=new Guest(house);
        Guest guest9=new Guest(house);
        Guest guest10=new Guest(house);
        guest1.setName("Ayşe");
        guest2.setName("Fatma");
        guest3.setName("Emre");
        guest4.setName("Melih");
        guest5.setName("Zeynep");
        guest6.setName("Ekrem");
        guest7.setName("Gözde");
        guest8.setName("Ali");
        guest9.setName("Hasan");
        guest10.setName("Mert");
        waiter.start();
        guest1.start();
        guest2.start();
        guest3.start();
        guest4.start();
        guest5.start();
        guest6.start();
        guest7.start();
        guest8.start();
        guest9.start();
        guest10.start();

    }
}

class House{
    private int boreks=25;
    private int cakes=10;
    private int drinks=25;
    public int borekTray=5;
    public int cakeTray=5;
    public int drinkTray=5;

    public int getBoreks() {
        return boreks;
    }

    public void setBoreks(int boreks) {
        this.boreks = boreks;
    }

    public int getCakes() {
        return cakes;
    }

    public void setCakes(int cakes) {
        this.cakes = cakes;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

}
