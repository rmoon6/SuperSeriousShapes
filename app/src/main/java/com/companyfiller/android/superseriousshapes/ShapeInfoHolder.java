package com.companyfiller.android.superseriousshapes;

/**
 * Created by Chase on 8/3/2017.
 */

public class ShapeInfoHolder {

    private static ShapeInfoHolder shapeInfoHolder;

    private int shapecode;
    private int colorCode;

    public static ShapeInfoHolder getInstance() {
        if (shapeInfoHolder == null) {
            shapeInfoHolder = new ShapeInfoHolder();
        }

        return shapeInfoHolder;
    }

    public void setShapeCode(int i) {
        shapecode = i;
    }

    public void setColorCode(int i) {
        colorCode = i;
    }

    public int getShapeCode() {
        return shapecode;
    }

    public int getColorCode() {
        return colorCode;
    }

}





























