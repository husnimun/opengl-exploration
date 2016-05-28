import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;
import renderEngine.*;

/**
 * Created by Husni on 27/05/2016.
 */
public class MainGameLoop {
    public static void main(String[] args) {
        DisplayManager.createDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();

        float[] vertices = {
                -0.5f, 0.5f, 0f,
                -0.5f, -0.5f, 0f,
                0.5f, -0.5f, 0f,

                0.5f, -0.5f, 0f,
                0.5f, 0.5f, 0f,
                -0.5f, 0.5f, 0f,

        };

        RawModel model = loader.loadToVAO(vertices);
        while(!Display.isCloseRequested()) {
            renderer.prepare();
            renderer.render(model);
            DisplayManager.updateDisplay();
        }


        loader.cleanUp();
        DisplayManager.closeDisplay();
    }
}
