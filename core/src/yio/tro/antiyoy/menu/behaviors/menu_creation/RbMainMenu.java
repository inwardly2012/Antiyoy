package yio.tro.antiyoy.menu.behaviors.menu_creation;

import yio.tro.antiyoy.menu.ButtonYio;
import yio.tro.antiyoy.menu.behaviors.ReactBehavior;
import yio.tro.antiyoy.menu.scenes.Scenes;

/**
 * Created by ivan on 05.08.14.
 */
public class RbMainMenu extends ReactBehavior {

    @Override
    public void reactAction(ButtonYio buttonYio) {
        getYioGdxGame(buttonYio).setGamePaused(true);
        Scenes.sceneMainMenu.create();
    }
}