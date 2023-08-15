package ex08_1_exercise;

public class Item {

    char color;

    // declare and code the setColor method
    
    public boolean setColor (char colorCode) {

        if (colorCode == ' ') {
            return false;
        }
        else {
            color = colorCode;
            return true;
        }
    }

}
