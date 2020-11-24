package ru.zneik.sbtask.util;

import ru.zneik.sbtask.model.Element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixUtil {

    public static Element[][] getNewMatrix(int m, int n) {
        Element[][] elements = new Element[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                elements[i][j] = Element.newInstance(i, j);
            }
        }
        return elements;
    }

    public static void print(Element[][] elements) {
        Arrays.stream(elements)
                .forEach(it -> {
                    Arrays.stream(it)
                            .forEach(iit -> System.out.print(iit + " "));
                    System.out.println();
                });
    }

    public static List<Element> getNeighbors(Element[][] elements, Element element) {
        ArrayList<Element> list = new ArrayList<>();
        int startX = element.getX() > 0 ? -1 : 0;
        int endX = element.getX() < elements.length - 1 ? 1 : 0;
        int startY = element.getY() > 0 ? -1 : 0;
        int endY = element.getY() < elements[0].length - 1 ? 1 : 0;
        for (int dx = startX; dx <= endX; dx++) {
            for (int dy = startY; dy <= endY; dy++) {
                if (dx != 0 || dy != 0) {
                    list.add(elements[element.getX() + dx][element.getY() + dy]);
                }
            }
        }
        return list;
    }

}
