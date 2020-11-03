package fianltest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends Frame{
	public ButtonTest() {
		super("��ư �׽�Ʈ");
		setLayout(new FlowLayout());
		
		Button btn1 = new Button("������");
		Button btn2 = new Button("Ŭ��");
		
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("x: "+e.getX());
				System.out.println("y: "+e.getY());
			}
		});
		
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		setBounds(1000,200,500,500);
		add(btn2);
		add(btn1);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				dispose();	���ϴ� â �ݱ�
				System.exit(0);	// ���� �� �ݱ�(���� ����)
			}
			
		});
		setVisible(true);
	}
}
