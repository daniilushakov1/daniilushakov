import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class JavaIntensive {
    public static void main(String[] args) throws IOException, AWTException {
        System.out.println("Кофе-машина");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int moneyAmount = Integer.parseInt(reader.readLine());

        int[] drinkPrices = {150, 80, 20};
        String[] drinkNames = {"капучино", "эспрессо", "воду"};

        boolean  canBuyAnything = false;
        for(int i = 0; i < drinkPrices.length; i++)
        {
            if(moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuyAnything = true;
            }
        }

        if(!canBuyAnything) {
            System.out.println("Недостаточно средств.");
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date currentDate = new Date();

        Robot robot = new Robot();
        BufferedImage screenCapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(screenCapture, "JPG", new File("C:\\JavaScreenCaptures\\" + formatter.format(currentDate) + ".jpg"));
        System.out.println("\n" + screenCapture.getWidth() + "x" + screenCapture.getHeight());
    }
}
