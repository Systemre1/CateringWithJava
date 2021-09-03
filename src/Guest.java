public class Guest extends Thread {
    private House house;
    private int maxBoreks=0,maxCakes=0,maxDrinks=0;
    private int whatEat;
    private int whatActivity;

    public Guest(House house){
        this.house=house;
    }

    @Override
    public synchronized void run() {
        while ((house.getCakes() != 0 ||  house.getDrinks() != 0 || house.getBoreks() != 0)
                || (house.cakeTray !=0 || house.drinkTray !=0 || house.borekTray !=0)) {
            whatActivity = (int) (Math.random() * 3);
            if (whatActivity == 0) {
                eat();
            } else if (whatActivity == 1) {
                dance();
            } else if (whatActivity == 2) {
                sleep1();
            }

        }

        System.out.println("\n"+ThreadColor.Cyan+getName()+"'in Yediği Börek sayısı: " +maxBoreks
                +"  Yediği Kek sayısı: "+maxCakes+"  İçtiği içecek sayısı: "+maxDrinks);

    }

    public void dance(){
        System.out.print(ThreadColor.Red+getName()+" Dans ediyor. ");
        try {
            sleep((int)(Math.random()*5001));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sleep1(){
        System.out.print(ThreadColor.Blue+getName()+" Uyuyor. ");
        try {
            sleep((int)(Math.random()*5001));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eat() {
        whatEat = (int) (Math.random() * 3);
        if (maxCakes==0 || maxDrinks==0 || maxBoreks==0){
            if (whatEat == 0 && house.borekTray != 0 && maxBoreks == 0) {
                house.borekTray = house.borekTray - 1;
                maxBoreks++;
                System.out.print(ThreadColor.Yellow+getName()+" 1 tane börek yedi. ");
                try {
                    sleep((int)(Math.random()*5001));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (whatEat == 1 && house.drinkTray != 0 && maxDrinks == 0) {
                house.drinkTray = house.drinkTray - 1;
                maxDrinks++;
                System.out.print(ThreadColor.Yellow+getName()+" 1 tane içecek içti. ");
                try {
                    sleep((int)(Math.random()*5001));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (whatEat == 2 && house.cakeTray != 0 && maxCakes == 0) {
                house.cakeTray = house.cakeTray - 1;
                maxCakes++;
                System.out.print(ThreadColor.Yellow+getName()+" 1 tane kek yedi. ");
                try {
                    sleep((int)(Math.random()*5001));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else{
            if (whatEat == 0 && maxBoreks != 5 && house.borekTray != 0) {
                house.borekTray = house.borekTray - 1;
                maxBoreks++;
                System.out.print(ThreadColor.Yellow+getName()+" 1 tane börek yedi. ");
                try {
                    sleep((int)(Math.random()*5001));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (whatEat == 1 && maxDrinks != 5 && house.drinkTray != 0) {
                house.drinkTray = house.drinkTray - 1;
                maxDrinks++;
                System.out.print(ThreadColor.Yellow+getName()+" 1 tane içecek içti. ");
                try {
                    sleep((int)(Math.random()*5001));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (whatEat == 2 && maxCakes != 2 && house.cakeTray != 0) {
                house.cakeTray = house.cakeTray - 1;
                maxCakes++;
                System.out.print(ThreadColor.Yellow+getName()+" 1 tane kek yedi. ");
                try {
                    sleep((int)(Math.random()*5001));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
