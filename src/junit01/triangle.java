package junit01;

public class triangle {
	public String s(int a,int b,int c){
		if(a + b <= c||b + c <= a||a + c <= b||a*b*c <= 0) return("����������");
		else if(a==b && b==c) return("�ȱ�������");
		else if((a==b && b!=c)||(b==c && c!=a)||(a==c && c!=b)) return("����������");
		else return("һ��������");
	}
}
