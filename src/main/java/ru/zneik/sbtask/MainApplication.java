package ru.zneik.sbtask;

import ru.zneik.sbtask.model.Element;
import ru.zneik.sbtask.util.ConsoleUtil;
import ru.zneik.sbtask.util.MatrixUtil;

import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.print(Messages.ENTER_MESSAGE_ROW_COUNT);
        int rowCount = ConsoleUtil.readInt();
        System.out.print(Messages.ENTER_MESSAGE_COL_COUNT);
        int colCount = ConsoleUtil.readInt();
        Element[][] elements = MatrixUtil.getNewMatrix(rowCount, colCount);
        System.out.println(Messages.MATRIX);
        MatrixUtil.print(elements);

        System.out.print(Messages.ENTER_MESSAGE_X);
        int x = ConsoleUtil.readInt();
        System.out.print(Messages.ENTER_MESSAGE_Y);
        int y = ConsoleUtil.readInt();
        Element element = Element.newInstance(x, y);

        List<Element> neighbor = MatrixUtil.getNeighbors(elements, element);
        System.out.println(neighbor);
    }

    private static class Messages {
        public static final String ENTER_MESSAGE_ROW_COUNT = "Enter row count = ";
        public static final String ENTER_MESSAGE_COL_COUNT = "Enter col count = ";
        public static final String MATRIX = "Matrix:";
        public static final String ENTER_MESSAGE_X = "Enter x = ";
        public static final String ENTER_MESSAGE_Y = "Enter y = ";
    }

}
