import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class processImage {
    public static void addName(String name) throws IOException {
        File template=new File("src/birthdayTemp.jpg");
        BufferedImage bufferTemplate= ImageIO.read(template);
        Graphics2D graphicTemplate=bufferTemplate.createGraphics();

        Font font=new Font("Agency FB",Font.BOLD,210);
        Color color=Color.BLACK;
        graphicTemplate.setFont(font);
        graphicTemplate.setColor(color);

        FontMetrics fontMetrics = graphicTemplate.getFontMetrics();
        int textWidth = fontMetrics.stringWidth(name.toUpperCase());
        int y=3000;
        int x = (bufferTemplate.getWidth() - textWidth) / 2;

        graphicTemplate.drawString(name.toUpperCase(),x,y);
        graphicTemplate.dispose();

        File bWish=new File("nameAdded.jpg");
        ImageIO.write(bufferTemplate,"jpg",bWish);
    }
}

