public class Waiter extends Thread {
    private House house;

    public Waiter(House house) {
        this.house = house;
    }

    public void fillTray() {
            if((0<house.getBoreks() && house.getBoreks() <= 5) && (house.borekTray == 0 || house.borekTray == 1)){
                house.borekTray = house.getBoreks();
                house.setBoreks(0);
                System.out.println(ThreadColor.Green+"Garson tepsiye "+ house.borekTray +" börek koydu. Kalan börek: " + house.getBoreks());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if((0<house.getDrinks() && house.getDrinks() <= 5) && (house.drinkTray == 0 || house.drinkTray == 1)){
                house.drinkTray = house.getDrinks();
                house.setDrinks(0);
                System.out.println(ThreadColor.Green+"Garson tepsiye "+house.drinkTray+" içecek koydu. Kalan içecek: " + house.getDrinks());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if((0<house.getCakes() && house.getCakes() <= 5) && (house.cakeTray == 0 || house.cakeTray == 1)){
                house.cakeTray = house.getCakes();
                house.setCakes(0);
                System.out.println(ThreadColor.Green+"Garson tepsiye "+house.cakeTray+" kek koydu. Kalan kek: " + house.getCakes());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if ((house.borekTray == 1 && house.getBoreks() >= 4) || (house.borekTray == 0 && house.getBoreks() >= 5)) {

                if (house.borekTray == 1) {
                    house.setBoreks(house.getBoreks() - 4);
                    System.out.println(ThreadColor.Green+"Garson tepsiye 4 börek koydu. Kalan börek: " + house.getBoreks());
                    house.borekTray = 5;
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    house.setBoreks(house.getBoreks() - 5);
                    System.out.println(ThreadColor.Green+"Garson tepsiye 5 börek koydu. Kalan börek: " + house.getBoreks());
                    house.borekTray = 5;
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            } else if ((house.drinkTray == 1 && house.getDrinks() >= 4) || (house.drinkTray == 0 && house.getDrinks() >= 5)) {
                if (house.drinkTray == 1) {
                    house.setDrinks(house.getDrinks() - 4);
                    System.out.println(ThreadColor.Green+"Garson tepsiye 4 içecek koydu. Kalan içecek: " + house.getDrinks());
                    house.drinkTray = 5;
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    house.setDrinks(house.getDrinks() - 5);
                    System.out.println(ThreadColor.Green+"Garson tepsiye 5 içecek koydu. Kalan içecek: " + house.getDrinks());
                    house.drinkTray = 5;
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            } else if ((house.cakeTray == 1 && house.getCakes() >= 4) || (house.cakeTray == 0 && house.getCakes() >= 5)) {
                if (house.cakeTray == 1) {
                    house.setCakes(house.getCakes() - 4);
                    System.out.println(ThreadColor.Green+"Garson tepsiye 4 kek koydu. Kalan kek: " + house.getCakes());
                    house.cakeTray = 5;
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    house.setCakes(house.getCakes() - 5);
                    System.out.println(ThreadColor.Green+"Garson tepsiye 5 kek koydu. Kalan kek: " + house.getCakes());
                    house.cakeTray = 5;
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
    }


    @Override
    public synchronized void run() {
        while (house.getCakes() != 0 || house.getBoreks() != 0 || house.getDrinks() != 0){
            fillTray();
        }
    }
}
