package ru.zneik.sbtask.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Element {
    private int x;
    private int y;

    public static Element newInstance(int x, int y) {
        Element element = new Element();
        element.setX(x);
        element.setY(y);
        return element;
    }
}
