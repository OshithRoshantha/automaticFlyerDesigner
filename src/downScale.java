import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class downScale {
    public static void reScale() throws IOException {
        File profilePic=new File("src/dp.jpg");
        BufferedImage bufferTProfilePic= ImageIO.read(profilePic);

        int Width = 1397;
        int Height = 1397;

        BufferedImage resizedPic = new BufferedImage(Width, Height, bufferTProfilePic.getType());
        Graphics2D g2d = resizedPic.createGraphics();
        Image scaledImage = bufferTProfilePic.getScaledInstance(Width,Height, Image.SCALE_SMOOTH);
        g2d.drawImage(scaledImage, 0, 0, null);
        g2d.dispose();

        File resizedDp=new File("resizedDp.jpg");
        ImageIO.write(resizedPic,"jpg",resizedDp);
    }
}