import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class processImage2 {
    public static void addPic() throws IOException {
        File template=new File("nameAdded.jpg");
        BufferedImage backgroundImage= ImageIO.read(template);
        File profilePic=new File("resizedDp.jpg");
        BufferedImage overlayImage= ImageIO.read(profilePic);
        Graphics2D g2d = backgroundImage.createGraphics();

        int overlayX = 1284;
        int overlayY = 467;

        g2d.drawImage(overlayImage, overlayX, overlayY, null);
        g2d.dispose();

        File outputFile = new File("/birthDayFlyer.jpg");
        ImageIO.write(backgroundImage, "jpg", outputFile);
    }
}
