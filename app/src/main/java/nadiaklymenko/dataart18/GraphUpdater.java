package nadiaklymenko.dataart18;

        import java.util.TimerTask;

/**
 * Created by Nadia on 15/07/2015.
 */


        import java.util.TimerTask;

        import android.graphics.Canvas;
        import android.graphics.Color;

public class GraphUpdater extends TimerTask {

    GameSurface surf;

    GraphUpdater(GameSurface surf){
        this.surf = surf;
    }

    @Override
    public void run() {
        Canvas c = surf.getHolder().lockCanvas();
        if (c!=null){
            c.drawColor(Color.BLACK);
            surf.drawSnake(c);
            surf.getHolder().unlockCanvasAndPost(c);
        }
    }
}


