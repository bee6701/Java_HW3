import java.util.Scanner;

class HW3_1{
	public static void main(String [] args){
		double x1, y1, x2, y2; //�� ���� x,y ��ǥ��
		double width, height;  //����, ����
		Scanner s = new Scanner(System.in);
		
		System.out.print("��1�� x��ǥ: ");
		x1 = s.nextDouble();
		System.out.print("��1�� y��ǥ: ");
		y1 = s.nextDouble();
		
		System.out.print("��2�� x��ǥ: ");
		x2 = s.nextDouble();
		System.out.print("��2�� y��ǥ: ");
		y2 = s.nextDouble();
		
		
		width = x1-x2;
		height = y1-y2;
		
		if(x1<x2){//���� ���̰� ����
			width *= -1; //����� ��ȯ
		}
		
		if(y1<y2){
			width *= -1; 
		}
		
		if((width==0)||(height==0))	System.out.println("���簢���� �ƴմϴ�.");//���γ� ���ΰ� 0�̸� ���簢���� �ƴ϶�� ���
		else{
			System.out.format("�ѷ��� ����: %.2f\n", 2*(width+height));
			System.out.format("�밢���� ����: %.2f\n", Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));
			System.out.format("����: %.2f\n",width*height);
		}
	}
}