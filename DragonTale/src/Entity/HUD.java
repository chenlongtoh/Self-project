package Entity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class HUD {
	private Player player;
	private BufferedImage image;
	private Font font;
	
	public HUD(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/HUD/hud.gif"));
			font = new Font("Arial", Font.PLAIN, 14);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics2D g) {
		g.drawImage(image, 0, 10, null);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString(player.getHealth() + "/" + player.getMaxHealth(), 30, 25);
		g.drawString(player.getFire() + "/" + player.getMaxFire(), 30, 45);
	}
}
