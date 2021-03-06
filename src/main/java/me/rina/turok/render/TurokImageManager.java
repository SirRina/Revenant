package me.rina.turok.render;

// Minecraft.
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.Minecraft;

// OpenGL.
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL32;

// Java.
import java.awt.Color;

// Image.
import me.rina.turok.render.image.TurokImage;

/**
 *
 * @author Rina.
 * @since 28/09/2020.
 *
 **/
public class TurokImageManager {
    public static void renderIMAGE(TurokImage turokImage, int x, int y, int w, int h, int r, int g, int b, int alpha) {
        Color color = new Color(r, g, b, alpha);

        TurokRenderGL.prepareImage2D();

        GL11.glColor4f(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f, color.getAlpha() / 255f);

        Minecraft.getMinecraft().renderEngine.bindTexture(turokImage.getResourceLocation());

        TurokRenderGL.drawTexture(x, y, w, h);

        TurokRenderGL.releaseImage2D();
    }
}