package ch.logixisland.anuto.game;

import android.content.Context;

import ch.logixisland.anuto.game.business.GameManager;
import ch.logixisland.anuto.game.render.Renderer;
import ch.logixisland.anuto.game.render.sprite.SpriteFactory;
import ch.logixisland.anuto.game.render.Viewport;
import ch.logixisland.anuto.game.render.theme.ThemeManager;

public class GameFactory {

    private final SpriteFactory mSpriteFactory;
    private final ThemeManager mThemeManager;
    private final Viewport mViewport;
    private final Renderer mRenderer;

    private final GameEngine mGameEngine;
    private final GameManager mGameManager;

    public GameFactory(Context context) {
        mThemeManager = new ThemeManager();
        mSpriteFactory = new SpriteFactory(context.getResources(), mThemeManager);
        mViewport = new Viewport();
        mRenderer = new Renderer(mViewport, mThemeManager);
        mGameEngine = new GameEngine(mRenderer);
        mGameManager = new GameManager(mGameEngine, mViewport);
    }

    public SpriteFactory getSpriteFactory() {
        return mSpriteFactory;
    }

    public ThemeManager getThemeManager() {
        return mThemeManager;
    }

    public GameEngine getGameEngine() {
        return mGameEngine;
    }

    public GameManager getGameManager() {
        return mGameManager;
    }

    public Viewport getViewport() {
        return mViewport;
    }

    public Renderer getRenderer() {
        return mRenderer;
    }
}