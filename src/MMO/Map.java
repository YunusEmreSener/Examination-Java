package MMO;

import java.util.ArrayList;

public class Map {
    public int XCoordinates;
    public int YCoordinates;


    public Map(int XCoordinates, int YCoordinates) {
        this.XCoordinates = XCoordinates;
        this.YCoordinates = YCoordinates;
    }

    public int getXCoordinates() {
        return XCoordinates;
    }

    public void setXCoordinates(int XCoordinates) {
        this.XCoordinates = XCoordinates;
    }

    public int getYCoordinates() {
        return YCoordinates;
    }

    public void setYCoordinates(int YCoordinates) {
        this.YCoordinates = YCoordinates;
    }
}


