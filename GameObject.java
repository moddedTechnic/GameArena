package game_arena;

import java.awt.*;
import java.util.HashMap;

public abstract class GameObject {

    private static final HashMap<String, Color> colours = new HashMap<>();
    static {
        colours.put("BLACK", Color.BLACK);
        colours.put("BLUE", Color.BLUE);
        colours.put("CYAN", Color.CYAN);
        colours.put("DARKGREY", Color.DARK_GRAY);
        colours.put("GREY", Color.GRAY);
        colours.put("GREEN", Color.GREEN);
        colours.put("LIGHTGREY", Color.LIGHT_GRAY);
        colours.put("MAGENTA", Color.MAGENTA);
        colours.put("ORANGE", Color.ORANGE);
        colours.put("PINK", Color.PINK);
        colours.put("RED", Color.RED);
        colours.put("WHITE", Color.WHITE);
        colours.put("YELLOW", Color.YELLOW);
    }

    abstract void paint(Graphics2D graphics);

    //
    // Shouldn't really handle colour this way, but the student's haven't been introduced
    // to constants properly yet
    //
    protected Color getColourFromString(String colour) {
        Color c = colours.get(colour.toUpperCase());

        if (c == null && colour.startsWith("#")) {
            int r = Integer.valueOf(colour.substring(1, 3), 16);
            int g = Integer.valueOf(colour.substring(3, 5), 16);
            int b = Integer.valueOf(colour.substring(5, 7), 16);

            c = new Color(r, g, b);
            colours.put(colour.toUpperCase(), c);
        }

        if (c == null)
            c = Color.WHITE;

        return c;
    }

}
