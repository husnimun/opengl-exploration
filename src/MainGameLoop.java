import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;
import renderEngine.*;
import shaders.StaticShader;

/**
 * Created by Husni on 27/05/2016.
 */
public class MainGameLoop {
    public static void main(String[] args) {
        DisplayManager.createDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();
        StaticShader shader = new StaticShader();

        float[] vertices = { -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0.5f, 0f };
        int[] indices = { 0,1,3, 3,1,2 };

        RawModel model = loader.loadToVAO(vertices, indices);
        while(!Display.isCloseRequested()) {
            renderer.prepare();
            shader.start();
            renderer.render(model);
            shader.stop();
            DisplayManager.updateDisplay();
        }


        loader.cleanUp();
        shader.cleanUp();
        DisplayManager.closeDisplay();
    }
}
