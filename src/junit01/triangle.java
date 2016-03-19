package junit01;

public class triangle {
	public String s(int a,int b,int c){
		if(a + b <= c||b + c <= a||a + c <= b||a*b*c <= 0) return("不是三角形");
		else if(a==b && b==c) return("等边三角形");
		else if((a==b && b!=c)||(b==c && c!=a)||(a==c && c!=b)) return("等腰三角形");
		else return("一般三角形");
	}
}
