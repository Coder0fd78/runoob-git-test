public class maze {
    public void MapMaze() {
        int[][] map = new int[7][7];
        for (int i = 0; i <=6; i++) {
            map[0][i] = 1;
            map[6][i] = 1;
        }
        for (int j = 0; j <= 6; j++) {
            map[j][0] = 1;
            map[j][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        System.out.println("====当前地图情况=====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        mouseMove mousemove = new mouseMove();
        mousemove.findWay(map, 1, 1);

        System.out.println("====找路的情况====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
