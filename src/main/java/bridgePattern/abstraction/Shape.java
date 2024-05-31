package bridgePattern.abstraction;

import bridgePattern.bridgeImplementer.DrawAPI;

//Create an abstract class Shape using the DrawAPI interface.
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
