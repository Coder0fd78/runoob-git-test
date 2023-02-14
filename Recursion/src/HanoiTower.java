public class HanoiTower {
    /*num圆盘的数量；a塔，b塔，c塔*/
    public void move(int num,char a,char b,char c){
        if(num==1){
            //一个盘子的时候直接a->c
            System.out.print(a+"->"+c+"\t");
        }else{
            //把上面的所有看成整体，通过b移动到C
            move(num-1,a,c,b);
            System.out.print(a+"->"+c+"\t");
            //把b上的看成整体通过a移动到c
            move(num-1,b,a,c);
        }
    }
}
