public class mouseMove {
    public boolean findWay(int[][] map, int i, int j) {

        if (map[5][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                }else if(findWay(map,i-1,j)){
                    return true;
                }else if(findWay(map,i,j-1)){
                    return true;
                }else{
                    map[i][j]=3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
