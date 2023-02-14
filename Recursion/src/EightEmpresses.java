public class EightEmpresses {
   public void show(){
       //棋盘
       int QueenNum=8;
       int[] [] checkerboard=new int[QueenNum][QueenNum];
       int count=0;
       System.out.println("第"+(++count)+"次摆法");
       for(int i=0;i<QueenNum;i++){
           for(int j;j<QueenNum;j++){
               System.out.print(checkerboard[i][j]);
           }
           System.out.println();
       }
   }
    public static boolean check(int row,int col){
       for(int i=row-1;i>=0;i--){
           if()
       }
    }
}
