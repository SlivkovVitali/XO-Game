package io.game.XO.model;

import io.game.XO.model.exceptions.AlreadyOccupiedException;
import io.game.XO.model.exceptions.InvalidPointException;

import java.awt.*;

public class Field {

    private static final int FIELDSIZE = 3;
    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = FIELDSIZE;

    private final Figure[][] field = new Figure[FIELDSIZE][FIELDSIZE];

    public int getSize() {
        return FIELDSIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }

        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException {
        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < MAX_COORDINATE;
    }
}
