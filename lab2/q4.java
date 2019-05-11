import java.util.*;	

class q4{
	public static float util(char op,float x1,float x2){
		if(op=='+') return x1+x2;
		if(op=='-') return x1-x2;
		if(op=='/') return (float)x1/x2;
		if(op=='*') return x1*x2;
		return 0;
	}

	public static int util2(char op){
	
		if(op=='+' || op == '-') return 1;
		else return 2;
	
	}
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Stack<Float> s1 = new Stack<Float>();
		Stack<Character> s2 = new Stack<Character>();
		for(int i=0;i<str.length();i++){
			char x = str.charAt(i);
			if(x>='0' && x<='9'){
				int num = x - '0';
				i++;
				while(i<str.length() && str.charAt(i)>= '0' && str.charAt(i)<='9'){
					num = num*10 + (str.charAt(i)-'0');
					i++;
				}
				i--;
				s1.push((float)num);
				
			}
			else if(x == '('){
				s1.push(Float.MAX_VALUE);
			}
			else if(x == ')'){
				while(s1.peek()!=Float.MAX_VALUE){
					s1.push(util(s2.pop(),s1.pop(),s1.pop()));
				}
				s1.pop();
			}
			else{
				while(!s2.isEmpty() && util2(s2.peek())>=util2(x)){
					s1.push(util(s2.pop(),s1.pop(),s1.pop()));
				}
				s2.push(x);
			}
		
		}
		
		
		while(!s2.isEmpty()){
			s1.push(util(s2.pop(),s1.pop(),s1.pop()));
		
		}
		
		System.out.println(s1.pop());
	
	}


}
