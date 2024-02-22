import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {


    public static List<List<Integer>> FindEffectedCells(char[][] grid, int x, int y) {
        List<List<Integer>> myList = new ArrayList<>();
        if(grid[y][x] == 'b') {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    int newX = x + i;
                    int newY = y + j;
                    if (newY >= 0 && newY < grid.length && newX >= 0 && newX < grid[0].length) {
                        List<Integer> coordinate = new ArrayList<>();
                        coordinate.add(newY);
                        coordinate.add(newX);
                        if (!myList.contains(coordinate)) {
                            myList.add(coordinate);
                        }
                    }
                }
            }
        } else if(grid[y][x] == 'h') {
            for (int i = 0; i < grid.length; i++) {
                if (i != x) {
                    List<Integer> coordinate = new ArrayList<>();
                    coordinate.add(y);
                    coordinate.add(i);
                    if (!myList.contains(coordinate)) {
                        myList.add(coordinate);
                    }
                }
            }
        } else if(grid[y][x] == 'v') {
            for (int i = 0; i < grid.length; i++) {
                if (i != y) {
                    List<Integer> coordinate = new ArrayList<>();
                    coordinate.add(i);
                    coordinate.add(x);
                    if (!myList.contains(coordinate)) {
                        myList.add(coordinate);
                    }
                }
            }
        }

        return myList;
    }

}
class Result {
    /* Complete the 'PerformActions' function below.
     *
     * The function is expected to return a 2D_INTEGER_LIST (cells of the snake from tail to head after actions).
     * The function accepts following parameters:
     *  1. width - INTEGER (width of the grid)
     *  2. height - INTEGER (height of the grid)
     *  3. snake - 2D_INTEGER_LIST (cells of the snake from tail to head)
     *  4. foods - 2D_INTEGER_LIST (cells of the snake from tail to head)
     *  5. actions - CHAR_LIST (cells of the snake from tail to head)
     */

    public static List<List<Integer>> PerformActions(int width, int height, List<List<Integer>> snake, List<List<Integer>> foods, List<Character> actions) {
        List<List<Integer>> newSnake = new ArrayList<>(snake);

        for (char action : actions) {
            int dx = 0, dy = 0;
            switch (action) {
                case 'L':
                    dx = -1;
                    break;
                case 'R':
                    dx = 1;
                    break;
                case 'U':
                    dy = -1;
                    break;
                case 'D':
                    dy = 1;
                    break;
            }

            List<Integer> head = newSnake.get(0);
            int newX = head.get(0) + dx;
            int newY = head.get(1) + dy;

            if (newX < 0 || newX >= width || newY < 0 || newY >= height) {
                return new ArrayList<>();
            }

            for (int i = 1; i < newSnake.size(); i++) {
                List<Integer> segment = newSnake.get(i);
                if (segment.get(0) == newX && segment.get(1) == newY) {
                    return new ArrayList<>();
                }
            }
            boolean ateFood = false;
            Iterator<List<Integer>> iter = foods.iterator();
            while (iter.hasNext()) {
                List<Integer> food = iter.next();
                if (food.get(0) == newX && food.get(1) == newY) {
                    iter.remove();
                    ateFood = true;
                    break;
                }
            }

            List<Integer> newHead = new ArrayList<>();
            newHead.add(newX);
            newHead.add(newY);
            newSnake.add(0, newHead);

            if (!ateFood) {
                newSnake.remove(newSnake.size() - 1);
            }
        }

        return newSnake;
    }
}

