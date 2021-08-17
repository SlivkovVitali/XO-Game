package io.game.XO.controllers;

import io.game.XO.model.Field;
import io.game.XO.model.Figure;
import io.game.XO.model.exceptions.AlreadyOccupiedException;
import io.game.XO.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {
    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }

        field.setFigure(point, figure);
    }
}
