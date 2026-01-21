public class Spiel {
    public Spieler s1 = new Spieler('X');
    public Spieler s2 = new Spieler('O');
    public Spieler sAmZug;
    private Feld feld = new Feld();
    private boolean spielBeendet;

    public Spiel() {
        this.sAmZug = this.s1;
        this.spielBeendet = false;
    }

    public void starteSpiel() {
    }

    public void wechsleSpieler() {
        if (this.sAmZug == this.s1) {
            this.sAmZug = this.s2;
        } else {
            this.sAmZug = this.s1;
        }

    }

    public String macheZug(int r, int s) {
        if (this.spielBeendet) {
            return "Das Spiel ist bereits beendet.";
        } else if (!this.feld.istFrei(r, s)) {
            return "Dieses Feld ist bereits belegt.";
        } else {
            char symbol = this.sAmZug.getSymbol();
            this.feld.setzeSymbol(r, s, symbol);
            if (this.feld.hatVerloren(symbol)) {
                this.spielBeendet = true;
                return "Spieler " + symbol + " hat verloren!";
            } else if (this.feld.istVoll()) {
                this.spielBeendet = true;
                return "Unentschieden!";
            } else {
                this.wechsleSpieler();
                return "Spieler " + this.sAmZug.getSymbol() + " ist am Zug.";
            }
        }
    }

    public Spieler getSamZug() {
        return this.sAmZug;
    }

    public Feld getFeld() {
        return this.feld;
    }

    public boolean isSpielBeendet() {
        return this.spielBeendet;
    }
}
