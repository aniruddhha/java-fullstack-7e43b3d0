interface CardSwipable {
    
    double balance() ;

    int withdraw();

    int deposit();

    int transfer();
}

class XyzCard implements CardSwipable {
    @Override
    public double balance() {
        return 0;
    }

    @Override
    public int withdraw() {
        return 0;
    }

    @Override
    public int deposit() {
        return 0;
    }

    @Override
    public int transfer() {
        return 0;
    }
}

class AbcCard implements CardSwipable {
    @Override
    public double balance() {
        return 0;
    }

    @Override
    public int withdraw() {
        return 0;
    }

    @Override
    public int deposit() {
        return 0;
    }

    @Override
    public int transfer() {
        return 0;
    }
}

class PqrCard implements CardSwipable {
    @Override
    public double balance() {
        return 0;
    }

    @Override
    public int withdraw() {
        return 0;
    }

    @Override
    public int deposit() {
        return 0;
    }

    @Override
    public int transfer() {
        return 0;
    }
}

class Atm {
    public void swipe(CardSwipable card) {
        card.balance();
        card.deposit();
        card.transfer();
        card.withdraw();
    }
}

public class AtmMain {
    public static void main(String[] args) {
        // the code is 70% complete
        // you need to add rest of the details
        
        PqrCard card1 = new PqrCard();

        XyzCard card2 = new XyzCard();

        AbcCard card3 = new AbcCard();

        Atm atm = new Atm();
        atm.swipe(card1);
        atm.swipe(card2);
        atm.swipe(card3);
    }
}
