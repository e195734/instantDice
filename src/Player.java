class Player {
    static int genCount = 0;

    int id;
    String name;
    int STR;
    int CON;
    int POW;
    int DEX;
    int APP;
    int SIZ;
    int INT;
    int EDU;
    int HP;
    int MP;
    int SAN;
    int IDEA;
    int LUCK;
    int KNOWLEDGE;

    Player(String name, int STR, int CON, int POW, int DEX, int APP, int SIZ, int INT, int EDU, int HP, int MP) {
        this.id = genCount;
        genCount++;
        this.name = name;
        this.STR = STR;
        this.CON = CON;
        this.POW = POW;
        this.DEX = DEX;
        this.APP = APP;
        this.SIZ = SIZ;
        this.INT = INT;
        this.EDU = EDU;
        this.HP = HP;
        this.MP = MP;
        this.SAN = POW * 5;
        this.IDEA = INT * 5;
        this.LUCK = POW * 5;
        this.KNOWLEDGE = EDU * 5;
    }

    public static int getGenCount() {
        return genCount;
    }

    public static void setGenCount(int genCount) {
        Player.genCount = genCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getCON() {
        return CON;
    }

    public void setCON(int CON) {
        this.CON = CON;
    }

    public int getPOW() {
        return POW;
    }

    public void setPOW(int POW) {
        this.POW = POW;
    }

    public int getDEX() {
        return DEX;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public int getAPP() {
        return APP;
    }

    public void setAPP(int APP) {
        this.APP = APP;
    }

    public int getSIZ() {
        return SIZ;
    }

    public void setSIZ(int SIZ) {
        this.SIZ = SIZ;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getEDU() {
        return EDU;
    }

    public void setEDU(int EDU) {
        this.EDU = EDU;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getSAN() {
        return SAN;
    }

    public void setSAN(int SAN) {
        this.SAN = SAN;
    }

    public int getIDEA() {
        return IDEA;
    }

    public void setIDEA(int IDEA) {
        this.IDEA = IDEA;
    }

    public int getLUCK() {
        return LUCK;
    }

    public void setLUCK(int LUCK) {
        this.LUCK = LUCK;
    }

    public int getKNOWLEDGE() {
        return KNOWLEDGE;
    }

    public void setKNOWLEDGE(int KNOWLEDGE) {
        this.KNOWLEDGE = KNOWLEDGE;
    }
}