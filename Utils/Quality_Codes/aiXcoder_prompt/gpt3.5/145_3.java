import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID145{
	/**
	* 判断两个数组的内容是否相等 用于equals的比较
	*/
	public static boolean equals(Object[] array, Object[] other){
			if(array == other){
             return true;
         }

         if(array == null || other == null){
             return false;
         }

         if(array.length != other.length){
             return false;
         }

         for(int i=0; i<array.length; i++){
             if(!Objects.equals(array[i], other[i])){
                 return false;
             }
         }

         return true;
     }
    
    /**
     * 计算结果并输出
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //输入人数
        int[][] team = new int[n][5]; //记录每个人的比赛成绩
        int[] maxScore = new int[5]; //记录每个比赛项目的最高分
        int[] maxTeam = new int[5]; //记录每个比赛项目最高分的团队编号

        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                team[i][j] = scanner.nextInt(); //输入成绩
                if(team[i][j] > maxScore[j]){ //更新最高分和团队编号
                    maxScore[j] = team[i][j];
                    maxTeam[j] = i + 1;
                }
            }
        }

        for(int i=0; i<n; i++){ //循环比较每个团队的最高分是否相等，相等则输出
            if(equals(maxTeam, getTeam(team, i))){
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println("0"); //没有团队的最高分相等，输出0
    }

    /**
     * 获取团队的比赛成绩，并返回一个一维数组
     */
    public static int[] getTeam(int[][] team, int index){
        int[] result = new int[5];
        for(int i=0; i<5; i++){
            result[i] = team[index][i];
        }
        return result;
    }
}