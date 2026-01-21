public class Feld {
    private final int size = 4;
    private char[][] feld = new char[4][4];

    public Feld() {
    }

    public boolean istFrei(int r, int s) {
        return this.feld[r][s] == 0;
    }

    public void setzeSymbol(int r, int s, char symbol) {
        if (this.istFrei(r, s)) {
            this.feld[r][s] = symbol;
        }

    }

    public boolean istVoll() {
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                if (this.feld[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean hatVerloren(char symbol) {
        return this.checkReihen(symbol) || this.checkSpalten(symbol);
    }

    public char getFeld(int r, int s) {
        return this.feld[r][s];
    }

    private boolean checkReihen(char symbol) {
        for(int reihe = 0; reihe < 4; ++reihe) {
            for(int spalte = 0; spalte < 1; ++spalte) {
                if (this.feld[reihe][spalte] == symbol && this.feld[reihe][spalte + 1] == symbol && this.feld[reihe][spalte + 2] == symbol) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean checkSpalten(char symbol) {
        for(int spalte = 0; spalte < 4; ++spalte) {
            for(int reihe = 0; reihe < 1; ++reihe) {
                if (this.feld[reihe][spalte] == symbol && this.feld[reihe + 1][spalte] == symbol && this.feld[reihe + 2][spalte] == symbol) {
                    return true;
                }
            }
        }

        return false;
    }
}
