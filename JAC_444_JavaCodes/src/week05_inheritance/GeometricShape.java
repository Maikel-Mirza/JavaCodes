package week05_inheritance;

import java.util.Date;

public class GeometricShape extends Object {
    // data fields
    private String colour = "white";
    private boolean filled = false;
    private Date dateCreated = new Date();


    // constructors
    public GeometricShape() { // no-arg constructor
    }

    public GeometricShape(String colour, boolean filled) {
        this.setColour(colour);
        this.setFilled(filled);
    }


    // methods
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "colour: " + this.getColour() + "\nfilled: " + this.isFilled() + "\ndateCreated: " + this.getDateCreated();
    }
}
