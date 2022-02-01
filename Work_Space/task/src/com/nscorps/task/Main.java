package com.nscorps.task;
import java.util.*;
public class Main {
	static int dp[][] = new int[1001][1001]; 
	public static int isPal(String s, int i, int j)	{
		if (i > j)
			return 1;
		if (dp[i][j] != -1)
			return dp[i][j];
		if (s.charAt(i) != s.charAt(j))
			return dp[i][j] = 0;
		return dp[i][j] = isPal(s, i + 1, j - 1);
	}
	public static int countSubstrings(String s)	{
		for (int[] row : dp){
			Arrays.fill(row, -1);
		}
		int n = s.length();
		int count = 0;
		for (int i = 0; i < n; i++)		{
			for (int j = i + 1; j < n; j++)			{
				if (isPal(s, i, j) != 0)
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String s = "abbaeae";
		System.out.println(countSubstrings(s));
	}
}
